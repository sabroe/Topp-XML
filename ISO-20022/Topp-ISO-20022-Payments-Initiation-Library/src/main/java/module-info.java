/**
 * Topp ISO 20022 "Payment Initiation" is an open-source Java library which exemplifies the integration of Jakarta JAXB generates objects.
 */
module com.yelstream.topp.iso._20022_.payment {
    requires static lombok;

    requires jakarta.annotation;
    requires jakarta.activation;
    requires com.sun.activation.registries;
    requires jakarta.xml.bind;
    requires com.sun.xml.bind.core;
    requires com.sun.xml.bind;
//    requires com.sun.tools.jxc;

    exports urn.iso.std.iso._20022.tech.pain_001_001_02;
}
