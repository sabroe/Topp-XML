/**
 * Topp IO is an open-source Java library which implements utilities related to the input/output of XML.
 */
module com.yelstream.topp.jaxb.binding {
    requires static lombok;

    requires transitive java.xml;

    exports com.yelstream.topp.xml.io;
}
