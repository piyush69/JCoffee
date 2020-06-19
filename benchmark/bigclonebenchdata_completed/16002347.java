import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16002347 {
public MyHelperClass ixmlDescriptions;
	public MyHelperClass[] strCompression;
	public MyHelperClass state;
	public MyHelperClass STATE_IDENTIFIED;
	public MyHelperClass ixmlRequest;
	public MyHelperClass strResponseDate;
public MyHelperClass[] strAdminEmail;
//	public MyHelperClass strCompression;
	public MyHelperClass strEarliestDatestamp;
	public MyHelperClass strDeletedRecord;
	public MyHelperClass strGranularity;
public MyHelperClass VALIDATION_LOOSE;
	public MyHelperClass XMLNS_ID_2_0;
	public MyHelperClass strRepositoryName;
	public MyHelperClass strBaseURL;
//	public MyHelperClass strAdminEmail;
	public MyHelperClass ixmlErrors;
	public MyHelperClass XPath;
	public MyHelperClass descrNamespaceNode;
	public MyHelperClass XMLNS_OAI_1_0;
	public MyHelperClass XMLNS_ID_1_0;
	public MyHelperClass XMLNS_OAI_2_0;
	public MyHelperClass XMLNS_OAI;
	public MyHelperClass DocumentBuilderFactory;
	public MyHelperClass XMLNS_EPR_1_0;
	public MyHelperClass validation;
	public MyHelperClass OAIException;
	public MyHelperClass strProtocolVersion;
	public MyHelperClass VALIDATION_VERY_STRICT;
	public MyHelperClass XMLNS_EPR;
	public MyHelperClass XMLNS_ID;
	public MyHelperClass getLastOAIError(){ return null; }
	public MyHelperClass getLastOAIErrorCount(){ return null; }
	public MyHelperClass priCreateDummyIdentify(InputStream o0){ return null; }
	public MyHelperClass frndTrySend(HttpURLConnection o0){ return null; }
	public MyHelperClass priCheckBaseURL(){ return null; }

    public String identify(String baseURL) throws Throwable, OAIException {
        PrefixResolverDefault prefixResolver;
        XPath xpath;
        XPathContext xpathSupport;
        int ctxtNode;
        XObject list;
        Node node;
        boolean v2 = false;
        priCheckBaseURL();
        try {
            URL url = new URL(baseURL + "?verb=Identify");
            HttpURLConnection http = (HttpURLConnection) url.openConnection();
            http =(HttpURLConnection)(Object) frndTrySend(http);
            DocumentBuilderFactory docFactory =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
            docFactory.setNamespaceAware(true);
            if (validation == VALIDATION_VERY_STRICT) {
                docFactory.setValidating(true);
            } else {
                docFactory.setValidating(false);
            }
            DocumentBuilder docBuilder =(DocumentBuilder)(Object) docFactory.newDocumentBuilder();
            Document xml = null;
            try {
                xml =(Document)(Object) docBuilder.parse(http.getInputStream());
            } catch (IllegalArgumentException iae) {
                throw new OAIException(OAIException.CRITICAL_ERR, iae.getMessage());
            } catch (SAXException se) {
                if (validation != VALIDATION_LOOSE) {
                    throw new OAIException(OAIException.XML_PARSE_ERR, se.getMessage());
                } else {
                    try {
                        url = new URL(baseURL + "?verb=Identify");
                        http.disconnect();
                        http = (HttpURLConnection) url.openConnection();
                        http =(HttpURLConnection)(Object) frndTrySend(http);
                        xml =(Document)(Object) docBuilder.parse(priCreateDummyIdentify(http.getInputStream()));
                    } catch (SAXException se2) {
                        throw new OAIException(OAIException.XML_PARSE_ERR, se2.getMessage());
                    }
                }
            }
            try {
                descrNamespaceNode = xml.createElement("Identify");
                descrNamespaceNode.setAttribute("xmlns:oai_id", XMLNS_OAI + "Identify");
                descrNamespaceNode.setAttribute("xmlns:id", XMLNS_ID);
                descrNamespaceNode.setAttribute("xmlns:epr", XMLNS_EPR);
                prefixResolver = new PrefixResolverDefault(descrNamespaceNode);
                xpathSupport = new XPathContext();
                ctxtNode =(int)(Object) xpathSupport.getDTMHandleFromNode(xml);
                xpath = new XPath("/oai_id:Identify", null, prefixResolver, XPath.SELECT, null);
                list =(XObject)(Object) xpath.execute(xpathSupport, ctxtNode, prefixResolver);
                node =(Node)(Object) list.nodeset().nextNode();
                if (node == null) {
                    descrNamespaceNode.setAttribute("xmlns:oai_id", XMLNS_OAI_2_0);
                    descrNamespaceNode.setAttribute("xmlns:id", XMLNS_ID_2_0);
                    descrNamespaceNode.setAttribute("xmlns:epr", XMLNS_EPR);
                    prefixResolver = new PrefixResolverDefault(descrNamespaceNode);
                    xpath = new XPath("/oai_id:OAI-PMH", null, prefixResolver, XPath.SELECT, null);
                    list =(XObject)(Object) xpath.execute(xpathSupport, ctxtNode, prefixResolver);
                    node =(Node)(Object) list.nodeset().nextNode();
                    if (node == null) {
                        descrNamespaceNode.setAttribute("xmlns:oai_id", XMLNS_OAI_1_0 + "Identify");
                        descrNamespaceNode.setAttribute("xmlns:id", XMLNS_ID_1_0);
                        descrNamespaceNode.setAttribute("xmlns:epr", XMLNS_EPR_1_0);
                        prefixResolver = new PrefixResolverDefault(descrNamespaceNode);
                    } else {
                        xpath = new XPath("oai_id:OAI-PMH/oai_id:error", null, prefixResolver, XPath.SELECT, null);
                        list =(XObject)(Object) xpath.execute(xpathSupport, ctxtNode, prefixResolver);
                        ixmlErrors = list.nodelist();
                        if ((int)(Object)getLastOAIErrorCount() > 0) {
                            strProtocolVersion =(MyHelperClass)(Object) "2";
                            throw new OAIException(OAIException.OAI_ERR, getLastOAIError().getCode() + ": " + getLastOAIError().getReason());
                        }
                        v2 = true;
                    }
                }
                xpath = new XPath("//oai_id:repositoryName", null, prefixResolver, XPath.SELECT, null);
                list =(XObject)(Object) xpath.execute(xpathSupport, ctxtNode, prefixResolver);
                node =(Node)(Object) list.nodeset().nextNode();
                if (node != null) {
                    strRepositoryName = node.getFirstChild().getNodeValue();
                } else {
                    if (validation == VALIDATION_LOOSE) {
                        strRepositoryName =(MyHelperClass)(Object) "UNKNOWN";
                    } else {
                        throw new OAIException(OAIException.INVALID_RESPONSE_ERR, "Identify missing repositoryName");
                    }
                }
                xpath = new XPath("//oai_id:baseURL", null, prefixResolver, XPath.SELECT, null);
                list =(XObject)(Object) xpath.execute(xpathSupport, ctxtNode, prefixResolver);
                node =(Node)(Object) list.nodeset().nextNode();
                if (node != null) {
                    strBaseURL = node.getFirstChild().getNodeValue();
                } else {
                    if (validation != VALIDATION_LOOSE) {
                        throw new OAIException(OAIException.INVALID_RESPONSE_ERR, "Identify missing baseURL");
                    }
                }
                xpath = new XPath("//oai_id:protocolVersion", null, prefixResolver, XPath.SELECT, null);
                list =(XObject)(Object) xpath.execute(xpathSupport, ctxtNode, prefixResolver);
                node =(Node)(Object) list.nodeset().nextNode();
                if (node != null) {
                    strProtocolVersion = node.getFirstChild().getNodeValue();
                } else {
                    if (validation == VALIDATION_LOOSE) {
                        strProtocolVersion =(MyHelperClass)(Object) "UNKNOWN";
                    } else {
                        throw new OAIException(OAIException.INVALID_RESPONSE_ERR, "Identify missing protocolVersion");
                    }
                }
                xpath = new XPath("//oai_id:adminEmail", null, prefixResolver, XPath.SELECT, null);
                list =(XObject)(Object) xpath.execute(xpathSupport, ctxtNode, prefixResolver);
                NodeList nl =(NodeList)(Object) list.nodelist();
                if ((int)(Object)nl.getLength() > 0) {
                    strAdminEmail =(MyHelperClass[])(Object)(MyHelperClass)(Object) new String[(int)(Object)nl.getLength()];
                    for (int i = 0; i < (int)(Object)nl.getLength(); i++) {
                        strAdminEmail[i] = nl.item(i).getFirstChild().getNodeValue();
                    }
                } else {
                    if (validation == VALIDATION_LOOSE) {
                        strAdminEmail =(MyHelperClass[])(Object)(MyHelperClass)(Object) new String[1];
                        strAdminEmail[0] =(MyHelperClass)(Object) "mailto:UNKNOWN";
                    } else {
                        throw new OAIException(OAIException.INVALID_RESPONSE_ERR, "Identify missing adminEmail");
                    }
                }
                if (v2) {
                    xpath = new XPath("//oai_id:earliestDatestamp", null, prefixResolver, XPath.SELECT, null);
                    list =(XObject)(Object) xpath.execute(xpathSupport, ctxtNode, prefixResolver);
                    node =(Node)(Object) list.nodeset().nextNode();
                    if (node != null) {
                        strEarliestDatestamp = node.getFirstChild().getNodeValue();
                    } else {
                        if (validation == VALIDATION_LOOSE) {
                            strEarliestDatestamp =(MyHelperClass)(Object) "UNKNOWN";
                        } else {
                            throw new OAIException(OAIException.INVALID_RESPONSE_ERR, "Identify missing earliestDatestamp");
                        }
                    }
                    xpath = new XPath("//oai_id:deletedRecord", null, prefixResolver, XPath.SELECT, null);
                    list =(XObject)(Object) xpath.execute(xpathSupport, ctxtNode, prefixResolver);
                    node =(Node)(Object) list.nodeset().nextNode();
                    if (node != null) {
                        strDeletedRecord = node.getFirstChild().getNodeValue();
                    } else {
                        if (validation == VALIDATION_LOOSE) {
                            strDeletedRecord =(MyHelperClass)(Object) "UNKNOWN";
                        } else {
                            throw new OAIException(OAIException.INVALID_RESPONSE_ERR, "Identify missing deletedRecordp");
                        }
                    }
                    xpath = new XPath("//oai_id:granularity", null, prefixResolver, XPath.SELECT, null);
                    list =(XObject)(Object) xpath.execute(xpathSupport, ctxtNode, prefixResolver);
                    node =(Node)(Object) list.nodeset().nextNode();
                    if (node != null) {
                        strGranularity = node.getFirstChild().getNodeValue();
                    } else {
                        if (validation == VALIDATION_LOOSE) {
                            strGranularity =(MyHelperClass)(Object) "UNKNOWN";
                        } else {
                            throw new OAIException(OAIException.INVALID_RESPONSE_ERR, "Identify missing granularity");
                        }
                    }
                    xpath = new XPath("//oai_id:compression", null, prefixResolver, XPath.SELECT, null);
                    list =(XObject)(Object) xpath.execute(xpathSupport, ctxtNode, prefixResolver);
                    nl =(NodeList)(Object) list.nodelist();
                    if ((int)(Object)nl.getLength() > 0) {
                        strCompression =(MyHelperClass[])(Object) new String[(int)(Object)nl.getLength()];
                        for (int i = 0; i < (int)(Object)nl.getLength(); i++) {
                            strCompression[i] = nl.item(i).getFirstChild().getNodeValue();
                        }
                    }
                }
                xpath = new XPath("//oai_id:description", null, prefixResolver, XPath.SELECT, null);
                list =(XObject)(Object) xpath.execute(xpathSupport, ctxtNode, prefixResolver);
                ixmlDescriptions = list.nodelist();
                xpath = new XPath("//oai_id:responseDate", null, prefixResolver, XPath.SELECT, null);
                list =(XObject)(Object) xpath.execute(xpathSupport, ctxtNode, prefixResolver);
                node =(Node)(Object) list.nodeset().nextNode();
                if (node != null) {
                    strResponseDate = node.getFirstChild().getNodeValue();
                } else {
                    if (validation == VALIDATION_LOOSE) {
                        strResponseDate =(MyHelperClass)(Object) "";
                    } else {
                        throw new OAIException(OAIException.INVALID_RESPONSE_ERR, "GetRecord missing responseDate");
                    }
                }
                xpath = new XPath("//oai_id:requestURL | //oai_id:request", null, prefixResolver, XPath.SELECT, null);
                list =(XObject)(Object) xpath.execute(xpathSupport, ctxtNode, prefixResolver);
                node =(Node)(Object) list.nodeset().nextNode();
                if (node != null) {
                    ixmlRequest =(MyHelperClass)(Object) node;
                } else {
                    if (validation == VALIDATION_LOOSE) {
                        ixmlRequest = null;
                    } else {
                        throw new OAIException(OAIException.INVALID_RESPONSE_ERR, "GetRecord missing requestURL");
                    }
                }
                state = STATE_IDENTIFIED;
                xpath = null;
                prefixResolver = null;
                xpathSupport = null;
                list = null;
            } catch (TransformerException te) {
                throw new OAIException(OAIException.CRITICAL_ERR, te.getMessage());
            }
            url = null;
            docFactory = null;
            docBuilder = null;
        } catch (IOException ie) {
            throw new OAIException(OAIException.CRITICAL_ERR, ie.getMessage());
        } catch (FactoryConfigurationError(Throwable)(Object) fce) {
            throw new OAIException(OAIException.CRITICAL_ERR, fce.getMessage());
        } catch (ParserConfigurationException pce) {
            throw new OAIException(OAIException.CRITICAL_ERR, pce.getMessage());
        }
        return(String)(Object) strRepositoryName;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SELECT;
	public MyHelperClass OAI_ERR;
	public MyHelperClass CRITICAL_ERR;
	public MyHelperClass INVALID_RESPONSE_ERR;
	public MyHelperClass XML_PARSE_ERR;
public MyHelperClass getFirstChild(){ return null; }
	public MyHelperClass getReason(){ return null; }
	public MyHelperClass nextNode(){ return null; }
	public MyHelperClass setAttribute(String o0, String o1){ return null; }
	public MyHelperClass getCode(){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass getNodeValue(){ return null; }
	public MyHelperClass setAttribute(String o0, MyHelperClass o1){ return null; }}

class OAIException extends Exception{
	public OAIException(String errorMessage) { super(errorMessage); }
	OAIException(MyHelperClass o0, String o1){}
	OAIException(){}
}

class PrefixResolverDefault {

PrefixResolverDefault(MyHelperClass o0){}
	PrefixResolverDefault(){}}

class XPath {

XPath(String o0, Object o1, PrefixResolverDefault o2, MyHelperClass o3, Object o4){}
	XPath(){}
	public MyHelperClass execute(XPathContext o0, int o1, PrefixResolverDefault o2){ return null; }}

class XPathContext {

public MyHelperClass getDTMHandleFromNode(Document o0){ return null; }}

class XObject {

public MyHelperClass nodelist(){ return null; }
	public MyHelperClass nodeset(){ return null; }}

class Node {

public MyHelperClass getFirstChild(){ return null; }}

class DocumentBuilderFactory {

public MyHelperClass setNamespaceAware(boolean o0){ return null; }
	public MyHelperClass newDocumentBuilder(){ return null; }
	public MyHelperClass setValidating(boolean o0){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(InputStream o0){ return null; }
	public MyHelperClass parse(MyHelperClass o0){ return null; }}

class Document {

public MyHelperClass createElement(String o0){ return null; }}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class NodeList {

public MyHelperClass item(int o0){ return null; }
	public MyHelperClass getLength(){ return null; }}

class TransformerException extends Exception{
	public TransformerException(String errorMessage) { super(errorMessage); }
}

class FactoryConfigurationError {

public MyHelperClass getMessage(){ return null; }}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}
