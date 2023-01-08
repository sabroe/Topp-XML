/**
 * Topp JAXB Binding is an open-source Java library which implements utilities related to the binding of XML with JAXB.
 */
module com.yelstream.topp.jaxb.binding {
    requires static lombok;

    requires transitive java.xml;
    requires transitive jakarta.xml.bind;

    exports com.yelstream.topp.xml.bind;
    exports com.yelstream.topp.xml.validation;
}
