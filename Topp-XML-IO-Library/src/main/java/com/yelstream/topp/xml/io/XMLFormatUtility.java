package com.yelstream.topp.xml.io;

import lombok.experimental.UtilityClass;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

/**
 * Utility addressing the formatting of XML.
 * @author Morten Sabroe Mortensen
 * @version 1.0
 * @since 2022-10-30
 */
@SuppressWarnings("unused")
@UtilityClass
public class XMLFormatUtility {
    /**
     * Pretty prints an XML text.
     * @param text XML text
     * @param indentAmount Indent amount.
     * @param omitXMLDeclaration Indicates, if the XML processing declaration is to be omitted.
     * @return Indented XML text.
     * @see <a href="https://www.baeldung.com/java-pretty-print-xml">java-pretty-print-xml</a>
     */
    public static String prettyPrint(String text,
                                     int indentAmount,
                                     boolean omitXMLDeclaration) {
        try {
            DocumentBuilder documentBuilder=createDocumentBuilder();

            Transformer transformer=createTransformer();

            TransformerSpecification transformerSpecification=TransformerSpecification.of(omitXMLDeclaration);
            configureTransformer(transformer,transformerSpecification);

            IndentSpecification indentSpecification=IndentSpecification.of(indentAmount);
            configureTransformer(transformer,indentSpecification);

            return formatText(text,documentBuilder,transformer);
        } catch (IOException ex) {
            throw new IllegalStateException(String.format("Failure to pretty print XML text; XML text is -%n%s",text),ex);
        }
    }

    private static DocumentBuilder createDocumentBuilder() {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newDefaultInstance();
            return documentBuilderFactory.newDocumentBuilder();
        } catch (ParserConfigurationException ex) {
            throw new IllegalStateException(ex);
        }
    }

    private static Transformer createTransformer() {
        try {
            TransformerFactory transformerFactory = TransformerFactory.newDefaultInstance();
            //transformerFactory.setAttribute("indent-number", indent);  //https://www.tabnine.com/code/java/methods/javax.xml.transform.TransformerFactory/setAttribute
            //Transformer transformer = transformerFactory.newTransformer(new StreamSource(new StringReader(readPrettyPrintXslt())));
            return transformerFactory.newTransformer();
        } catch (TransformerConfigurationException ex) {
            throw new IllegalStateException(ex);
        }
    }

    private static void configureTransformer(Transformer transformer,
                                             TransformerSpecification specification) {
        String encoding=specification.getEncoding();
        if (encoding==null) {
            encoding= StandardCharsets.UTF_8.name();
        }

        boolean omitXMLDeclaration=specification.getOmitXMLDeclaration()==Boolean.TRUE;

        transformer.setOutputProperty(OutputKeys.ENCODING,encoding);
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION,omitXMLDeclaration?"yes":"no");
    }

    private static void configureTransformer(Transformer transformer,
                                             IndentSpecification specification) {
        boolean indent=specification.getIndent()==Boolean.TRUE;

        transformer.setOutputProperty(OutputKeys.INDENT,indent?"yes":"no");
        if (indent) {
            int indentAmount=specification.getIndentAmount();
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", String.valueOf(indentAmount));
        }
    }

    private static String formatText(String text,
                                     DocumentBuilder documentBuilder,
                                     Transformer transformer) throws IOException {
        Document document;

        try (Reader reader=new StringReader(text)) {
            InputSource inputSource=new InputSource(reader);
            document=documentBuilder.parse(inputSource);
        } catch (SAXException ex) {
            throw new IOException(String.format("Failure to parse document; XML text is -%n%s",text),ex);
        }

        return formatDocument(document,transformer);
    }

    private static String formatDocument(Document document,
                                         Transformer transformer) throws IOException {
        String result;
        try (Writer out=new StringWriter()) {
            Source source=new DOMSource(document);
            Result target=new StreamResult(out);
            transformer.transform(source,target);
            result=out.toString();
        } catch (TransformerException ex) {
            throw new IOException(String.format("Failure to transform document; document is %s!",document),ex);
        }
        return result;
    }
}
