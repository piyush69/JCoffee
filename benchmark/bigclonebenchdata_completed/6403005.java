import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6403005 {
public MyHelperClass configuration;
	public MyHelperClass Config;

//    @SuppressWarnings("unchecked")
    protected void processTransformAction(HttpServletRequest request, HttpServletResponse response, String action) throws Throwable, Exception {
        File transformationFile = null;
        MyHelperClass Definitions = new MyHelperClass();
        String tr = request.getParameter(Definitions.REQUEST_PARAMNAME_XSLT);
        MyHelperClass StringUtils = new MyHelperClass();
        if (StringUtils.isNotBlank(tr)) {
            MyHelperClass xslBase = new MyHelperClass();
            transformationFile = new File((String)(Object)xslBase, tr);
            if (!transformationFile.isFile()) {
                MyHelperClass HttpServletResponse = new MyHelperClass();
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Parameter \"" + Definitions.REQUEST_PARAMNAME_XSLT + "\" " + "with value \"" + tr + "\" refers to non existing file");
                return;
            }
        }
        StreamResult result;
        ByteArrayOutputStream baos = null;
        MyHelperClass isDevelopmentMode = new MyHelperClass();
        if ((boolean)(Object)isDevelopmentMode) {
            baos = new ByteArrayOutputStream();
//            MyHelperClass StringUtils = new MyHelperClass();
            if (StringUtils.equals(action, "get")) {
                MyHelperClass DECODE = new MyHelperClass();
                MyHelperClass DECODE = new MyHelperClass();
                result = new StreamResult(new Base64.OutputStream(baos, Base64.DECODE));
            } else {
                result = new StreamResult(baos);
            }
        } else {
//            MyHelperClass StringUtils = new MyHelperClass();
            if (StringUtils.equals(action, "get")) {
                MyHelperClass DECODE = new MyHelperClass();
                MyHelperClass DECODE = new MyHelperClass();
                result = new StreamResult(new Base64.OutputStream(response.getOutputStream(), Base64.DECODE));
            } else {
                result = new StreamResult(response.getOutputStream());
            }
        }
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.putAll(request.getParameterMap());
//        MyHelperClass Definitions = new MyHelperClass();
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
        MyHelperClass OutputKeys = new MyHelperClass();
        String method = transformer.getOutputProperties().getProperty(OutputKeys.METHOD, "xml");
        String contentType;
        if (method.endsWith("html")) {
//            MyHelperClass Definitions = new MyHelperClass();
            contentType = Definitions.MIMETYPE_HTML;
        } else if (method.equals("xml")) {
//            MyHelperClass Definitions = new MyHelperClass();
            contentType = Definitions.MIMETYPE_XML;
        } else {
//            MyHelperClass Definitions = new MyHelperClass();
            contentType = Definitions.MIMETYPE_TEXTPLAIN;
        }
//        MyHelperClass OutputKeys = new MyHelperClass();
        String encoding = transformer.getOutputProperties().getProperty(OutputKeys.ENCODING, "UTF-8");
        response.setContentType(contentType + ";charset=" + encoding);
        DataSourceIf dataSource =(DataSourceIf)(Object) new NullSource();
        transformer.transform((Source)(Source)(Object) dataSource, result);
//        MyHelperClass isDevelopmentMode = new MyHelperClass();
        if ((boolean)(Object)isDevelopmentMode) {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(new ByteArrayInputStream(baos.toByteArray()), response.getOutputStream());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass METHOD;
	public MyHelperClass MIMETYPE_TEXTPLAIN;
	public MyHelperClass REQUEST_NAMESPACE;
	public MyHelperClass MIMETYPE_XML;
	public MyHelperClass ENCODING;
	public MyHelperClass NORMAL;
	public MyHelperClass CONFIGURATION_NAMESPACE;
	public MyHelperClass SESSION_NAMESPACE;
	public MyHelperClass INFOFUZE_NAMESPACE;
	public MyHelperClass REQUEST_PARAMNAME_XSLT;
	public MyHelperClass MIMETYPE_HTML;
	public MyHelperClass SC_BAD_REQUEST;
	public MyHelperClass RESPONSE_NAMESPACE;
public MyHelperClass isNotBlank(String o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getSession(){ return null; }
	public MyHelperClass getParameterMap(){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }}

class StreamResult {

StreamResult(ByteArrayOutputStream o0){}
	StreamResult(){}}

class OutputStream {

}

class Transformer {

public MyHelperClass setParams(HashMap<String o0, Object o1){ return null; }
	public MyHelperClass setLogInfo(boolean o0){ return null; }
	public MyHelperClass getOutputProperties(){ return null; }
	public MyHelperClass setTransformationFile(File o0){ return null; }
	public MyHelperClass setConfiguration(MyHelperClass o0){ return null; }}

class TransformationErrorListener {

TransformationErrorListener(HttpServletResponse o0){}
	TransformationErrorListener(){}}

class DataSourceIf {

}

class NullSource {

}

class Source {

}

class Object {

public MyHelperClass equals(String o0, String o1){ return null; }}
