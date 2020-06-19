import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1618640 {
public MyHelperClass NULL;
public MyHelperClass xml;
	public MyHelperClass priGetMainNodeName(){ return null; }
	public MyHelperClass priCreateDummyResponse(InputStream o0){ return null; }
public MyHelperClass oParent;
	public MyHelperClass getResponseDate(){ return null; }

    private void initialize(OAIRepository repo, String u, String v, String params) throws Throwable, OAIException {
        OAIRepository oParent = NULL; //new OAIRepository();
        oParent = repo;
        String strVerb = NULL; //new String();
        strVerb = v;
        String strBaseURL = NULL; //new String();
        strBaseURL = u;
        String strParams = NULL; //new String();
        strParams = params;
        String strResumptionToken = NULL; //new String();
        strResumptionToken = "";
        int iResumptionCount = NULL; //new int();
        iResumptionCount = 0;
        boolean boolInitialized = NULL; //new boolean();
        boolInitialized = false;
        boolean boolValidResponse = NULL; //new boolean();
        boolValidResponse = false;
        int iIndex = NULL; //new int();
        iIndex = 1;
        int iCount = NULL; //new int();
        iCount = -1;
        int iCursor = NULL; //new int();
        iCursor = -1;
        int iRealCursor = NULL; //new int();
        iRealCursor = -1;
        int iCompleteListSize = NULL; //new int();
        iCompleteListSize = -1;
//        MyHelperClass strVerb = new MyHelperClass();
        if (!strVerb.equals("ListIdentifiers") && !strVerb.equals("ListMetadataFormats") && !strVerb.equals("ListRecords") && !strVerb.equals("ListSets")) {
            MyHelperClass OAIException = new MyHelperClass();
            throw new OAIException(OAIException.INVALID_VERB_ERR, "Invalid verb");
        }
//        MyHelperClass strBaseURL = new MyHelperClass();
        if (strBaseURL.length() == 0) {
            MyHelperClass OAIException = new MyHelperClass();
            throw new OAIException(OAIException.NO_BASE_URL_ERR, "No baseURL");
        }
        if (params.length() > 0) {
            if (params.charAt(0) != '&') {
                params = "&" + params;
            }
        }
        try {
//            MyHelperClass strBaseURL = new MyHelperClass();
            URL url = new URL(strBaseURL + "?verb=" + strVerb + params);
            HttpURLConnection http = (HttpURLConnection) url.openConnection();
//            MyHelperClass oParent = new MyHelperClass();
            http = oParent.frndTrySend(http);
            MyHelperClass DocumentBuilderFactory = new MyHelperClass();
            DocumentBuilderFactory docFactory =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
            docFactory.setNamespaceAware(true);
//            MyHelperClass oParent = new MyHelperClass();
            if (oParent.getValidation() == OAIRepository.VALIDATION_VERY_STRICT) {
                docFactory.setValidating(true);
            } else {
                docFactory.setValidating(false);
            }
            DocumentBuilder docBuilder =(DocumentBuilder)(Object) docFactory.newDocumentBuilder();
            try {
                MyHelperClass xml = new MyHelperClass();
                xml = docBuilder.parse(http.getInputStream());
//                MyHelperClass boolValidResponse = new MyHelperClass();
                boolValidResponse =(boolean)(Object)(MyHelperClass)(Object) true;
            } catch (IllegalArgumentException iae) {
                MyHelperClass OAIException = new MyHelperClass();
                throw new OAIException(OAIException.CRITICAL_ERR, iae.getMessage());
            } catch (SAXException se) {
//                MyHelperClass oParent = new MyHelperClass();
                if (oParent.getValidation() != OAIRepository.VALIDATION_LOOSE) {
                    MyHelperClass OAIException = new MyHelperClass();
                    throw new OAIException(OAIException.XML_PARSE_ERR, se.getMessage() + " Try loose validation.");
                } else {
                    try {
                        http.disconnect();
//                        MyHelperClass strBaseURL = new MyHelperClass();
                        url = new URL(strBaseURL + "?verb=" + strVerb + params);
                        http = (HttpURLConnection) url.openConnection();
//                        MyHelperClass oParent = new MyHelperClass();
                        http = oParent.frndTrySend(http);
                        MyHelperClass xml = new MyHelperClass();
                        xml = docBuilder.parse((InputStream)(Object)priCreateDummyResponse(http.getInputStream()));
                    } catch (SAXException se2) {
                        MyHelperClass OAIException = new MyHelperClass();
                        throw new OAIException(OAIException.XML_PARSE_ERR, se2.getMessage());
                    }
                }
            }
            MyHelperClass namespaceNode = new MyHelperClass();
            namespaceNode = xml.createElement(strVerb);
            MyHelperClass OAIRepository = new MyHelperClass();
            namespaceNode.setAttribute("xmlns:oai", OAIRepository.XMLNS_OAI + strVerb);
//            MyHelperClass OAIRepository = new MyHelperClass();
            namespaceNode.setAttribute("xmlns:dc", OAIRepository.XMLNS_DC);
//            MyHelperClass namespaceNode = new MyHelperClass();
            PrefixResolverDefault prefixResolver = new PrefixResolverDefault(namespaceNode);
//            MyHelperClass strVerb = new MyHelperClass();
            XPath xpath = new XPath("//oai:" + strVerb + "/oai:" + priGetMainNodeName(), null, prefixResolver, XPath.SELECT, null);
            XPathContext xpathSupport = new XPathContext();
            MyHelperClass xml = new MyHelperClass();
            int ctxtNode =(int)(Object) xpathSupport.getDTMHandleFromNode(xml);
            XObject list =(XObject)(Object) xpath.execute(xpathSupport, ctxtNode, prefixResolver);
            Node node = list.nodeset().nextNode();
            if (node == null) {
//                MyHelperClass OAIRepository = new MyHelperClass();
                namespaceNode.setAttribute("xmlns:oai", OAIRepository.XMLNS_OAI_2_0);
//                MyHelperClass namespaceNode = new MyHelperClass();
                prefixResolver = new PrefixResolverDefault(namespaceNode);
                MyHelperClass XPath = new MyHelperClass();
                xpath = new XPath("/oai:OAI-PMH", null, prefixResolver, XPath.SELECT, null);
                list =(XObject)(Object) xpath.execute(xpathSupport, ctxtNode, prefixResolver);
                node = list.nodeset().nextNode();
                if (node == null) {
//                    MyHelperClass OAIRepository = new MyHelperClass();
                    namespaceNode.setAttribute("xmlns:oai", OAIRepository.XMLNS_OAI_1_0 + strVerb);
                } else {
//                    MyHelperClass XPath = new MyHelperClass();
                    xpath = new XPath("oai:OAI-PMH/oai:error", null, prefixResolver, XPath.SELECT, null);
                    list =(XObject)(Object) xpath.execute(xpathSupport, ctxtNode, prefixResolver);
                    NodeList nl =(NodeList)(Object) list.nodelist();
                    if ((int)(Object)nl.getLength() > 0) {
//                        MyHelperClass oParent = new MyHelperClass();
                        oParent.frndSetErrors(nl);
                        MyHelperClass OAIException = new MyHelperClass();
                        throw new OAIException(OAIException.OAI_ERR, oParent.getLastOAIError().getCode() + ": " + oParent.getLastOAIError().getReason());
                    }
                }
            }
//            MyHelperClass strVerb = new MyHelperClass();
            xpath = new XPath("//oai:" + strVerb + "/oai:" + priGetMainNodeName(), null, prefixResolver, XPath.SELECT, null);
            list =(XObject)(Object) xpath.execute(xpathSupport, ctxtNode, prefixResolver);
            MyHelperClass nodeList = new MyHelperClass();
            nodeList = list.nodelist();
//            MyHelperClass boolInitialized = new MyHelperClass();
            boolInitialized =(boolean)(Object)(MyHelperClass)(Object) true;
//            MyHelperClass namespaceNode = new MyHelperClass();
            oParent.frndSetNamespaceNode(namespaceNode);
            MyHelperClass XPath = new MyHelperClass();
            xpath = new XPath("//oai:requestURL | //oai:request", null, prefixResolver, XPath.SELECT, null);
            node = xpath.execute(xpathSupport, ctxtNode, prefixResolver).nodeset().nextNode();
            if (node != null) {
//                MyHelperClass oParent = new MyHelperClass();
                oParent.frndSetRequest(node);
            }
            oParent.frndSetResponseDate(getResponseDate());
            docFactory = null;
            docBuilder = null;
            url = null;
            prefixResolver = null;
            xpathSupport = null;
            xpath = null;
        } catch (TransformerException te) {
            throw new OAIException(OAIException.CRITICAL_ERR, te.getMessage());
        } catch (MalformedURLException mue) {
            throw new OAIException(OAIException.CRITICAL_ERR, mue.getMessage());
        } catch (FactoryConfigurationError(Throwable)(Object) fce) {
            throw new OAIException(OAIException.CRITICAL_ERR, fce.getMessage());
        } catch (ParserConfigurationException pce) {
            throw new OAIException(OAIException.CRITICAL_ERR, pce.getMessage());
        } catch (IOException ie) {
            throw new OAIException(OAIException.CRITICAL_ERR, ie.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass XMLNS_DC;
	public MyHelperClass XML_PARSE_ERR;
	public MyHelperClass XMLNS_OAI_1_0;
	public MyHelperClass XMLNS_OAI_2_0;
	public MyHelperClass XMLNS_OAI;
	public MyHelperClass NO_BASE_URL_ERR;
	public MyHelperClass OAI_ERR;
	public MyHelperClass INVALID_VERB_ERR;
	public MyHelperClass CRITICAL_ERR;
	public static MyHelperClass SELECT;
public MyHelperClass frndSetErrors(NodeList o0){ return null; }
	public MyHelperClass frndSetRequest(Node o0){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass nodeset(){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass getLastOAIError(){ return null; }
	public MyHelperClass setAttribute(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass createElement(String o0){ return null; }
	public MyHelperClass nextNode(){ return null; }
	public MyHelperClass frndSetNamespaceNode(MyHelperClass o0){ return null; }
	public MyHelperClass frndSetResponseDate(MyHelperClass o0){ return null; }
	public MyHelperClass setAttribute(String o0, String o1){ return null; }
	public MyHelperClass getValidation(){ return null; }
	public MyHelperClass frndTrySend(HttpURLConnection o0){ return null; }}

class OAIRepository {
public static MyHelperClass VALIDATION_VERY_STRICT;
	public static MyHelperClass VALIDATION_LOOSE;
public MyHelperClass frndSetResponseDate(MyHelperClass o0){ return null; }
	public MyHelperClass frndSetErrors(NodeList o0){ return null; }
	public MyHelperClass getValidation(){ return null; }
	public MyHelperClass frndTrySend(HttpURLConnection o0){ return null; }
	public MyHelperClass frndSetNamespaceNode(MyHelperClass o0){ return null; }
	public MyHelperClass getLastOAIError(){ return null; }
	public MyHelperClass frndSetRequest(Node o0){ return null; }}

class OAIException extends Exception{
	public OAIException(String errorMessage) { super(errorMessage); }
	OAIException(MyHelperClass o0, String o1){}
	OAIException(){}
}

class DocumentBuilderFactory {

public MyHelperClass setNamespaceAware(boolean o0){ return null; }
	public MyHelperClass newDocumentBuilder(){ return null; }
	public MyHelperClass setValidating(boolean o0){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(InputStream o0){ return null; }}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class PrefixResolverDefault {

PrefixResolverDefault(MyHelperClass o0){}
	PrefixResolverDefault(){}}

class XPath {
public MyHelperClass SELECT;
XPath(){}
	XPath(String o0, Object o1, PrefixResolverDefault o2, MyHelperClass o3, Object o4){}
	public MyHelperClass execute(XPathContext o0, int o1, PrefixResolverDefault o2){ return null; }}

class XPathContext {

public MyHelperClass getDTMHandleFromNode(MyHelperClass o0){ return null; }}

class XObject {

public MyHelperClass nodelist(){ return null; }
	public MyHelperClass nodeset(){ return null; }}

class Node {

}

class NodeList {

public MyHelperClass getLength(){ return null; }}

class TransformerException extends Exception{
	public TransformerException(String errorMessage) { super(errorMessage); }
}

class FactoryConfigurationError {

public MyHelperClass getMessage(){ return null; }}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}
