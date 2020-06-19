import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10176882 {
public MyHelperClass configuration;
	public MyHelperClass Config;

//    @SuppressWarnings("unchecked")
    protected void processDownloadAction(HttpServletRequest request, HttpServletResponse response) throws Throwable, Exception {
        MyHelperClass xslBase = new MyHelperClass();
        File transformationFile = new File((String)(Object)xslBase, "file-info.xsl");
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.putAll(request.getParameterMap());
        MyHelperClass Definitions = new MyHelperClass();
        params.put("{" + Definitions.CONFIGURATION_NAMESPACE + "}configuration", configuration);
//        MyHelperClass Definitions = new MyHelperClass();
        params.put("{" + Definitions.REQUEST_NAMESPACE + "}request", request);
//        MyHelperClass Definitions = new MyHelperClass();
        params.put("{" + Definitions.RESPONSE_NAMESPACE + "}response", response);
//        MyHelperClass Definitions = new MyHelperClass();
        params.put("{" + Definitions.SESSION_NAMESPACE + "}session", request.getSession());
//        MyHelperClass Definitions = new MyHelperClass();
        params.put("{" + Definitions.INFOFUZE_NAMESPACE + "}development-mode", new Boolean(Config.getInstance().isDevelopmentMode()));
        Transformer transformer = new Transformer();
        transformer.setTransformationFile(transformationFile);
        transformer.setParams(params);
        MyHelperClass TransformMode = new MyHelperClass();
        transformer.setTransformMode(TransformMode.NORMAL);
        MyHelperClass configuration = new MyHelperClass();
        transformer.setConfiguration(configuration);
        transformer.setErrorListener(new TransformationErrorListener(response));
        transformer.setLogInfo(false);
        DataSourceIf dataSource =(DataSourceIf)(Object) new NullSource();
        MyHelperClass XmlUtils = new MyHelperClass();
        Document fileInfoDoc = XmlUtils.getEmptyDOM();
        DOMResult result = new DOMResult(fileInfoDoc);
        transformer.transform((Source)(Source)(Object) dataSource, result);
        Element documentElement = fileInfoDoc.getDocumentElement();
        if (documentElement.getLocalName().equals("null")) {
            MyHelperClass HttpServletResponse = new MyHelperClass();
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
            return;
        }
        InputStream is = null;
        try {
            MyHelperClass XPathFactory = new MyHelperClass();
            XPath xpath = XPathFactory.newInstance().newXPath();
            MyHelperClass XPathUtils = new MyHelperClass();
            String sourceType = XPathUtils.getStringValue(xpath, "source-type", documentElement, null);
//            MyHelperClass XPathUtils = new MyHelperClass();
            String location = XPathUtils.getStringValue(xpath, "location", documentElement, null);
//            MyHelperClass XPathUtils = new MyHelperClass();
            String fileName = XPathUtils.getStringValue(xpath, "file-name", documentElement, null);
//            MyHelperClass XPathUtils = new MyHelperClass();
            String mimeType = XPathUtils.getStringValue(xpath, "mime-type", documentElement, null);
//            MyHelperClass XPathUtils = new MyHelperClass();
            String encoding = XPathUtils.getStringValue(xpath, "encoding", documentElement, null);
            MyHelperClass StringUtils = new MyHelperClass();
            if (StringUtils.equals(sourceType, "cifsSource")) {
//                MyHelperClass XPathUtils = new MyHelperClass();
                String domain = XPathUtils.getStringValue(xpath, "domain", documentElement, null);
//                MyHelperClass XPathUtils = new MyHelperClass();
                String userName = XPathUtils.getStringValue(xpath, "username", documentElement, null);
//                MyHelperClass XPathUtils = new MyHelperClass();
                String password = XPathUtils.getStringValue(xpath, "password", documentElement, null);
                URI uri = new URI(location);
//                MyHelperClass StringUtils = new MyHelperClass();
                if (StringUtils.isNotBlank(userName)) {
                    String userInfo = "";
//                    MyHelperClass StringUtils = new MyHelperClass();
                    if (StringUtils.isNotBlank(domain)) {
                        userInfo = userInfo + domain + ";";
                    }
                    userInfo = userInfo + userName;
//                    MyHelperClass StringUtils = new MyHelperClass();
                    if (StringUtils.isNotBlank(password)) {
                        userInfo = userInfo + ":" + password;
                    }
                    uri = new URI(uri.getScheme(), userInfo, uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
                }
                SmbFile smbFile = new SmbFile(uri.toURL());
                is = new SmbFileInputStream(smbFile);
//            MyHelperClass StringUtils = new MyHelperClass();
            } else if (StringUtils.equals(sourceType, "localFileSystemSource")) {
                File file = new File(location);
                is = new FileInputStream(file);
            } else {
                MyHelperClass logger = new MyHelperClass();
                logger.error("Source type \"" + ((sourceType != null) ? sourceType : "") + "\" not supported");
                MyHelperClass HttpServletResponse = new MyHelperClass();
                response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
                return;
            }
//            MyHelperClass StringUtils = new MyHelperClass();
            if (StringUtils.isBlank(mimeType) && StringUtils.isBlank(encoding)) {
//                MyHelperClass Definitions = new MyHelperClass();
                response.setContentType(Definitions.MIMETYPE_BINARY);
//            MyHelperClass StringUtils = new MyHelperClass();
            } else if (StringUtils.isBlank(encoding)) {
                response.setContentType(mimeType);
            } else {
                response.setContentType(mimeType + ";charset=" + encoding);
            }
//            MyHelperClass Definitions = new MyHelperClass();
            if (request.getParameterMap().containsKey(Definitions.REQUEST_PARAMNAME_DOWNLOAD)) {
                response.setHeader("Content-Disposition", "attachment; filename=" + fileName);
            }
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(new BufferedInputStream(is), response.getOutputStream());
        } finally {
            if (is != null) {
                is.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_UNAUTHORIZED;
	public MyHelperClass SC_INTERNAL_SERVER_ERROR;
	public MyHelperClass REQUEST_NAMESPACE;
	public MyHelperClass NORMAL;
	public MyHelperClass REQUEST_PARAMNAME_DOWNLOAD;
	public MyHelperClass CONFIGURATION_NAMESPACE;
	public MyHelperClass MIMETYPE_BINARY;
	public MyHelperClass SESSION_NAMESPACE;
	public MyHelperClass INFOFUZE_NAMESPACE;
	public MyHelperClass RESPONSE_NAMESPACE;
public MyHelperClass getStringValue(XPath o0, String o1, Element o2, Object o3){ return null; }
	public MyHelperClass isBlank(String o0){ return null; }
	public MyHelperClass getEmptyDOM(){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass isNotBlank(String o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getSession(){ return null; }
	public MyHelperClass getParameterMap(){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class Transformer {

public MyHelperClass setParams(HashMap<String o0, Object o1){ return null; }
	public MyHelperClass setLogInfo(boolean o0){ return null; }
	public MyHelperClass setConfiguration(MyHelperClass o0){ return null; }
	public MyHelperClass setTransformationFile(File o0){ return null; }}

class TransformationErrorListener {

TransformationErrorListener(HttpServletResponse o0){}
	TransformationErrorListener(){}}

class DataSourceIf {

}

class NullSource {

}

class Document {

public MyHelperClass getDocumentElement(){ return null; }}

class DOMResult {

DOMResult(Document o0){}
	DOMResult(){}}

class Source {

}

class Element {

public MyHelperClass getLocalName(){ return null; }}

class XPath {

}

class SmbFile {

SmbFile(URL o0){}
	SmbFile(){}}

class SmbFileInputStream {

SmbFileInputStream(SmbFile o0){}
	SmbFileInputStream(){}}

class Object {

public MyHelperClass equals(String o0, String o1){ return null; }}
