module com.yelstream.topp.jaxb.binding {
    requires static lombok;

    requires transitive java.xml;
    requires transitive java.xml.bind;

    exports com.yelstream.topp.xml.bind;
    exports com.yelstream.topp.xml.validation;
}
