package com.company.rk.service.robert;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2016-09-22T16:00:05.456+02:00
 * Generated source version: 2.7.6
 * 
 */
@WebServiceClient(name = "Robert", 
                  wsdlLocation = "file:/D:/JBOSS_FUSE/pluralsight/apache-cxf-camel-soap-to-rest/src/main/resources/wsdl/Robert.wsdl",
                  targetNamespace = "http://www.rk.company.com/service/Robert/") 
public class Robert_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.rk.company.com/service/Robert/", "Robert");
    public final static QName RobertSOAP = new QName("http://www.rk.company.com/service/Robert/", "RobertSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/JBOSS_FUSE/pluralsight/apache-cxf-camel-soap-to-rest/src/main/resources/wsdl/Robert.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Robert_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/JBOSS_FUSE/pluralsight/apache-cxf-camel-soap-to-rest/src/main/resources/wsdl/Robert.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Robert_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Robert_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Robert_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Robert_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Robert_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Robert_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns Robert
     */
    @WebEndpoint(name = "RobertSOAP")
    public Robert getRobertSOAP() {
        return super.getPort(RobertSOAP, Robert.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Robert
     */
    @WebEndpoint(name = "RobertSOAP")
    public Robert getRobertSOAP(WebServiceFeature... features) {
        return super.getPort(RobertSOAP, Robert.class, features);
    }

}
