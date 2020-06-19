import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14650355 {
public MyHelperClass Log;

    static void xmlRpcCall(String method, String[] params) throws LastFMError(Throwable)(Object) {
        try {
            MyHelperClass XmlPullParserFactory = new MyHelperClass();
            XmlPullParserFactory fac = XmlPullParserFactory.newInstance();
            XmlSerializer serializer = fac.newSerializer();
            URL url;
            MyHelperClass XMLRPC_URL = new MyHelperClass();
            url = new URL((String)(Object)XMLRPC_URL);
            URLConnection conn;
            conn = url.openConnection();
            conn.setRequestProperty("Content-Type", "text/xml");
            conn.setDoOutput(true);
            serializer.setOutput(conn.getOutputStream(), "UTF-8");
            serializer.startDocument("UTF-8", true);
            serializer.startTag(null, "methodCall");
            serializer.startTag(null, "methodName");
            serializer.text(method);
            serializer.endTag(null, "methodName");
            serializer.startTag(null, "params");
            for (String s : params) {
                serializer.startTag(null, "param");
                serializer.startTag(null, "value");
                serializer.startTag(null, "string");
                serializer.text(s);
                serializer.endTag(null, "string");
                serializer.endTag(null, "value");
                serializer.endTag(null, "param");
            }
            serializer.endTag(null, "params");
            serializer.endTag(null, "methodCall");
            serializer.flush();
            InputStream is = conn.getInputStream();
            MyHelperClass DocumentBuilderFactory = new MyHelperClass();
            DocumentBuilderFactory dbFac = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbFac.newDocumentBuilder();
            Document doc = db.parse(is);
            try {
                MyHelperClass Utils = new MyHelperClass();
                String res = Utils.getChildElement(doc.getDocumentElement(), new String[] { "params", "param", "value", "string" });
                if (!res.equals("OK")) {
                    MyHelperClass TAG = new MyHelperClass();
                    Log.e(TAG, "while xmlrpc got " + res);
                    throw new LastFMXmlRpcError("XMLRPC Call failed: " + res);
                }
            } catch (ParseException e) {
                MyHelperClass Utils = new MyHelperClass();
                String faultString = Utils.getChildElement(doc.getDocumentElement(), new String[] { "params", "param", "value", "struct", "member[1]", "value", "string" });
                throw new LastFMXmlRpcError(faultString);
            }
        } catch (LastFMXmlRpcError(Throwable)(Object) e) {
            throw(Throwable)(Object) e;
        } catch (Exception e) {
            MyHelperClass TAG = new MyHelperClass();
            Log.e(TAG, "while xmlrpc", e);
            throw new LastFMError(e.toString());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newInstance(){ return null; }}

class LastFMError {

LastFMError(String o0){}
	LastFMError(){}}

class XmlPullParserFactory {

public MyHelperClass newSerializer(){ return null; }}

class XmlSerializer {

public MyHelperClass endTag(Object o0, String o1){ return null; }
	public MyHelperClass startDocument(String o0, boolean o1){ return null; }
	public MyHelperClass startTag(Object o0, String o1){ return null; }
	public MyHelperClass text(String o0){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass setOutput(OutputStream o0, String o1){ return null; }}

class DocumentBuilderFactory {

public MyHelperClass newDocumentBuilder(){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(InputStream o0){ return null; }}

class Document {

public MyHelperClass getDocumentElement(){ return null; }}

class LastFMXmlRpcError {

LastFMXmlRpcError(String o0){}
	LastFMXmlRpcError(){}}

class ParseException extends Exception{
	public ParseException(String errorMessage) { super(errorMessage); }
}
