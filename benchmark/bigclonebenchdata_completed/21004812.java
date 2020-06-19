import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21004812 {
public MyHelperClass BuiltinExceptionFactory;
	public MyHelperClass BODY;
public MyHelperClass LoggingContext;
	public MyHelperClass WS_INVOKER_ERROR_CODE;
	public MyHelperClass XMLOutputter;
	public MyHelperClass Level;
	public MyHelperClass raiseExceptionOnError;
	public MyHelperClass returnPath;
	public MyHelperClass createSOAPBody(){ return null; }

//    @Override
    public void run(ProcedureRunner runner) throws Throwable, Exception {
        MyHelperClass url = new MyHelperClass();
        if (url == null) {
            MyHelperClass BuiltinExceptionFactory = new MyHelperClass();
            throw(Throwable)(Object) BuiltinExceptionFactory.createAttributeMissing(this, "url");
        }
        MyHelperClass inputPath = new MyHelperClass();
        if (inputPath == null) {
            MyHelperClass BuiltinExceptionFactory = new MyHelperClass();
            throw(Throwable)(Object) BuiltinExceptionFactory.createAttributeMissing(this, "inputPath");
        }
        CompositeMap context =(CompositeMap)(Object) runner.getContext();
//        MyHelperClass inputPath = new MyHelperClass();
        Object inputObject = context.getObject(inputPath);
//        MyHelperClass inputPath = new MyHelperClass();
        if (inputObject == null) throw BuiltinExceptionFactory.createDataFromXPathIsNull(this, inputPath);
//        MyHelperClass inputPath = new MyHelperClass();
        if (!(inputObject instanceof CompositeMap)) throw BuiltinExceptionFactory.createInstanceTypeWrongException(inputPath, CompositeMap.class, inputObject.getClass());
//        MyHelperClass url = new MyHelperClass();
        URI uri = new URI((String)(Object)url);
//        URL url = uri.toURL();
        PrintWriter out = null;
        BufferedReader br = null;
        CompositeMap soapBody =(CompositeMap)(Object) createSOAPBody();
        soapBody.addChild((CompositeMap) inputObject);
        String content = XMLOutputter.defaultInstance().toXML(soapBody.getRoot(), true);
        LoggingContext.getLogger(context, this.getClass().getCanonicalName()).config("request:\r\n" + content);
        HttpURLConnection httpUrlConnection = null;
        try {
            httpUrlConnection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            httpUrlConnection.setDoInput(true);
            httpUrlConnection.setDoOutput(true);
            httpUrlConnection.setRequestMethod("POST");
            httpUrlConnection.setRequestProperty("SOAPAction", "urn:anonOutInOp");
            httpUrlConnection.setRequestProperty("Content-Type", "text/xml; charset=UTF-8");
            httpUrlConnection.connect();
            OutputStream os = httpUrlConnection.getOutputStream();
            out = new PrintWriter(os);
            out.println("<?xml version='1.0' encoding='UTF-8'?>");
            out.println(new String(content.getBytes("UTF-8")));
            out.flush();
            out.close();
            String soapResponse = null;
            CompositeMap soap = null;
            CompositeLoader cl = new CompositeLoader();
            if (HttpURLConnection.HTTP_OK == httpUrlConnection.getResponseCode()) {
                soap =(CompositeMap)(Object) cl.loadFromStream(httpUrlConnection.getInputStream());
                soapResponse =(String)(Object) soap.toXML();
                LoggingContext.getLogger(context, this.getClass().getCanonicalName()).config("correct response:" + soapResponse);
            } else {
                soap =(CompositeMap)(Object) cl.loadFromStream(httpUrlConnection.getErrorStream());
                soapResponse =(String)(Object) soap.toXML();
                LoggingContext.getLogger(context, this.getClass().getCanonicalName()).config("error response:" + soapResponse);
                if ((boolean)(Object)raiseExceptionOnError) {
                    throw new ConfigurationFileException(WS_INVOKER_ERROR_CODE, new Object[] { url, soapResponse }, this);
                }
            }
            httpUrlConnection.disconnect();
            CompositeMap result = (CompositeMap) soap.getChild(BODY.getLocalName()).getChilds().get(0);
            if (returnPath != null) runner.getContext().putObject(returnPath, result, true);
        } catch (Exception e) {
            LoggingContext.getLogger(context, this.getClass().getCanonicalName()).log(Level.SEVERE, "", e);
            throw new RuntimeException(e);
        } finally {
            if (out != null) {
                out.close();
            }
            if (br != null) {
                br.close();
            }
            if (httpUrlConnection != null) {
                httpUrlConnection.disconnect();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass putObject(MyHelperClass o0, CompositeMap o1, boolean o2){ return null; }
	public MyHelperClass createAttributeMissing(c21004812 o0, String o1){ return null; }
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getLogger(CompositeMap o0, String o1){ return null; }
	public MyHelperClass getLocalName(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, Exception o2){ return null; }
	public MyHelperClass toXML(MyHelperClass o0, boolean o1){ return null; }
	public MyHelperClass defaultInstance(){ return null; }
	public MyHelperClass createDataFromXPathIsNull(c21004812 o0, MyHelperClass o1){ return null; }
	public MyHelperClass createInstanceTypeWrongException(MyHelperClass o0, Class<CompositeMap o1, Class o2){ return null; }
	public MyHelperClass config(String o0){ return null; }}

class ProcedureRunner {

public MyHelperClass getContext(){ return null; }}

class CompositeMap {

public MyHelperClass toXML(){ return null; }
	public MyHelperClass getRoot(){ return null; }
	public MyHelperClass addChild(CompositeMap o0){ return null; }
	public MyHelperClass getObject(MyHelperClass o0){ return null; }}

class CompositeLoader {

public MyHelperClass loadFromStream(InputStream o0){ return null; }}

class ConfigurationFileException extends Exception{
	public ConfigurationFileException(String errorMessage) { super(errorMessage); }
	ConfigurationFileException(MyHelperClass o0, Object[] o1, c21004812 o2){}
	ConfigurationFileException(){}
}
