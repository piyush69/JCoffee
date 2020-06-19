import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16002345 {
public MyHelperClass VALIDATION_LOOSE;
	public MyHelperClass XMLNS_DC;
	public MyHelperClass ixmlRequest;
	public MyHelperClass strResponseDate;
	public MyHelperClass strBaseURL;
	public MyHelperClass ixmlErrors;
	public MyHelperClass XPath;
	public MyHelperClass XMLNS_OAI_1_0;
	public MyHelperClass XMLNS_OAI_2_0;
	public MyHelperClass XMLNS_OAI;
	public MyHelperClass DocumentBuilderFactory;
	public MyHelperClass validation;
	public MyHelperClass OAIException;
	public MyHelperClass strProtocolVersion;
	public MyHelperClass VALIDATION_VERY_STRICT;
	public MyHelperClass namespaceNode;
	public MyHelperClass priCreateDummyGetRecord(String o0, InputStream o1){ return null; }
	public MyHelperClass getLastOAIError(){ return null; }
	public MyHelperClass priBuildParamString(String o0, String o1, String o2, String o3, String o4){ return null; }
	public MyHelperClass frndTrySend(HttpURLConnection o0){ return null; }
	public MyHelperClass priCheckBaseURL(){ return null; }

    public OAIRecord getRecord(String identifier, String metadataPrefix) throws Throwable, OAIException {
        PrefixResolverDefault prefixResolver;
        XPath xpath;
        XPathContext xpathSupport;
        int ctxtNode;
        XObject list;
        Node node;
        OAIRecord rec = new OAIRecord();
        priCheckBaseURL();
        String params =(String)(Object) priBuildParamString("", "", "", identifier, metadataPrefix);
        try {
            URL url = new URL(strBaseURL + "?verb=GetRecord" + params);
            HttpURLConnection http = (HttpURLConnection) url.openConnection();
            http =(HttpURLConnection)(Object) frndTrySend(http);
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            docFactory.setNamespaceAware(true);
            if (validation == VALIDATION_VERY_STRICT) {
                docFactory.setValidating(true);
            } else {
                docFactory.setValidating(false);
            }
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document xml = null;
            try {
                xml = docBuilder.parse(http.getInputStream());
                rec.frndSetValid(true);
            } catch (IllegalArgumentException iae) {
                throw new OAIException(OAIException.CRITICAL_ERR, iae.getMessage());
            } catch (SAXException se) {
                if (validation != VALIDATION_LOOSE) {
                    throw new OAIException(OAIException.XML_PARSE_ERR, se.getMessage());
                } else {
                    try {
                        url = new URL(strBaseURL + "?verb=GetRecord" + params);
                        http.disconnect();
                        http = (HttpURLConnection) url.openConnection();
                        http =(HttpURLConnection)(Object) frndTrySend(http);
                        xml = docBuilder.parse(priCreateDummyGetRecord(identifier, http.getInputStream()));
                        rec.frndSetValid(false);
                    } catch (SAXException se2) {
                        throw new OAIException(OAIException.XML_PARSE_ERR, se2.getMessage());
                    }
                }
            }
            try {
                namespaceNode = xml.createElement("GetRecord");
                namespaceNode.setAttribute("xmlns:oai", XMLNS_OAI + "GetRecord");
                namespaceNode.setAttribute("xmlns:dc", XMLNS_DC);
                prefixResolver = new PrefixResolverDefault(namespaceNode);
                xpath = new XPath("/oai:GetRecord/oai:record", null, prefixResolver, XPath.SELECT, null);
                xpathSupport = new XPathContext();
                ctxtNode = xpathSupport.getDTMHandleFromNode(xml);
                list = xpath.execute(xpathSupport, ctxtNode, prefixResolver);
                node = list.nodeset().nextNode();
                if (node == null) {
                    namespaceNode.setAttribute("xmlns:oai", XMLNS_OAI_2_0);
                    prefixResolver = new PrefixResolverDefault(namespaceNode);
                    xpath = new XPath("/oai:OAI-PMH/oai:GetRecord/oai:record", null, prefixResolver, XPath.SELECT, null);
                    list = xpath.execute(xpathSupport, ctxtNode, prefixResolver);
                    node = list.nodeset().nextNode();
                    if (node == null) {
                        namespaceNode.setAttribute("xmlns:oai", XMLNS_OAI_1_0 + "GetRecord");
                        prefixResolver = new PrefixResolverDefault(namespaceNode);
                        xpath = new XPath("/oai:GetRecord/oai:record", null, prefixResolver, XPath.SELECT, null);
                        list = xpath.execute(xpathSupport, ctxtNode, prefixResolver);
                        node = list.nodeset().nextNode();
                    } else {
                        xpath = new XPath("oai:OAI-PMH/oai:error", null, prefixResolver, XPath.SELECT, null);
                        list = xpath.execute(xpathSupport, ctxtNode, prefixResolver);
                        ixmlErrors = list.nodelist();
                        if (ixmlErrors.getLength() > 0) {
                            strProtocolVersion =(MyHelperClass)(Object) "2";
                            throw new OAIException(OAIException.OAI_ERR, getLastOAIError().getCode() + ": " + getLastOAIError().getReason());
                        }
                    }
                }
                if (node != null) {
                    rec.frndSetRepository(this);
                    rec.frndSetMetadataPrefix(metadataPrefix);
                    rec.frndSetIdOnly(false);
                    ctxtNode = xpathSupport.getDTMHandleFromNode(node);
                    xpath = new XPath("//oai:header/oai:identifier", null, prefixResolver, XPath.SELECT, null);
                    list = xpath.execute(xpathSupport, ctxtNode, prefixResolver);
                    rec.frndSetIdentifier(list.nodeset().nextNode().getFirstChild().getNodeValue());
                    xpath = new XPath("//oai:header/oai:datestamp", null, prefixResolver, XPath.SELECT, null);
                    list = xpath.execute(xpathSupport, ctxtNode, prefixResolver);
                    rec.frndSetDatestamp(list.nodeset().nextNode().getFirstChild().getNodeValue());
                    rec.frndSetRecord(node);
                    NamedNodeMap nmap = node.getAttributes();
                    if (nmap != null) {
                        if (nmap.getNamedItem("status") != null) {
                            rec.frndSetStatus(nmap.getNamedItem("status").getFirstChild().getNodeValue());
                        }
                    }
                } else {
                    rec = null;
                }
                xpath = new XPath("//oai:responseDate", null, prefixResolver, XPath.SELECT, null);
                list = xpath.execute(xpathSupport, ctxtNode, prefixResolver);
                node = list.nodeset().nextNode();
                if (node != null) {
                    strResponseDate = node.getFirstChild().getNodeValue();
                } else {
                    if (validation == VALIDATION_LOOSE) {
                        strResponseDate =(MyHelperClass)(Object) "";
                    } else {
                        throw new OAIException(OAIException.INVALID_RESPONSE_ERR, "GetRecord missing responseDate");
                    }
                }
                xpath = new XPath("//oai:requestURL | //oai:request", null, prefixResolver, XPath.SELECT, null);
                list = xpath.execute(xpathSupport, ctxtNode, prefixResolver);
                node = list.nodeset().nextNode();
                if (node != null) {
                    ixmlRequest =(MyHelperClass)(Object) node;
                } else {
                    if (validation == VALIDATION_LOOSE) {
                        ixmlRequest = null;
                    } else {
                        throw new OAIException(OAIException.INVALID_RESPONSE_ERR, "GetRecord missing requestURL");
                    }
                }
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
        } catch (MalformedURLException mue) {
            throw new OAIException(OAIException.CRITICAL_ERR, mue.getMessage());
        } catch (FactoryConfigurationError(Throwable)(Object) fce) {
            throw new OAIException(OAIException.CRITICAL_ERR, fce.getMessage());
        } catch (ParserConfigurationException pce) {
            throw new OAIException(OAIException.CRITICAL_ERR, pce.getMessage());
        } catch (IOException ie) {
            throw new OAIException(OAIException.CRITICAL_ERR, ie.getMessage());
        }
        return rec;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SELECT;
	public MyHelperClass OAI_ERR;
	public MyHelperClass CRITICAL_ERR;
	public MyHelperClass INVALID_RESPONSE_ERR;
	public MyHelperClass XML_PARSE_ERR;
public MyHelperClass getReason(){ return null; }
	public MyHelperClass setAttribute(String o0, String o1){ return null; }
	public MyHelperClass getCode(){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass getLength(){ return null; }
	public MyHelperClass setAttribute(String o0, MyHelperClass o1){ return null; }}

class OAIRecord {

public MyHelperClass frndSetRecord(Node o0){ return null; }
	public MyHelperClass frndSetIdOnly(boolean o0){ return null; }
	public MyHelperClass frndSetValid(boolean o0){ return null; }
	public MyHelperClass frndSetRepository(c16002345 o0){ return null; }
	public MyHelperClass frndSetMetadataPrefix(String o0){ return null; }}

class OAIException extends Exception{
	public OAIException(String errorMessage) { super(errorMessage); }
}

class PrefixResolverDefault {

PrefixResolverDefault(MyHelperClass o0){}
	PrefixResolverDefault(){}}

class XPath {

public MyHelperClass execute(XPathContext o0, int o1, PrefixResolverDefault o2){ return null; }}

class XPathContext {

public MyHelperClass getDTMHandleFromNode(Document o0){ return null; }
	public MyHelperClass getDTMHandleFromNode(Node o0){ return null; }}

class XObject {

public MyHelperClass nodelist(){ return null; }
	public MyHelperClass nodeset(){ return null; }}

class Node {

public MyHelperClass getAttributes(){ return null; }
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

class NamedNodeMap {

public MyHelperClass getNamedItem(String o0){ return null; }}

class TransformerException extends Exception{
	public TransformerException(String errorMessage) { super(errorMessage); }
}

class FactoryConfigurationError {

public MyHelperClass getMessage(){ return null; }}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}
