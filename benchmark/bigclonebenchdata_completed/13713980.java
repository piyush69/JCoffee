import java.io.*;
import java.lang.*;
import java.util.*;



class c13713980 {

    private String sendMessage(HttpURLConnection connection, String reqMessage) throws IOException, XMLStreamException {
        MyHelperClass msgLog = new MyHelperClass();
        if ((boolean)(Object)msgLog.isTraceEnabled()) msgLog.trace("Outgoing SOAPMessage\n" + reqMessage);
        BufferedOutputStream out = new BufferedOutputStream((OutputStream)(Object)connection.getOutputStream());
        out.write(reqMessage.getBytes("UTF-8"));
        out.close();
        InputStream inputStream = null;
        if ((int)(Object)connection.getResponseCode() < 400) inputStream =(InputStream)(Object) connection.getInputStream(); else inputStream =(InputStream)(Object) connection.getErrorStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream(1024);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copyStream(baos, inputStream);
        inputStream.close();
        byte[] byteArray = baos.toByteArray();
        String resMessage = new String(byteArray, "UTF-8");
//        MyHelperClass msgLog = new MyHelperClass();
        if ((boolean)(Object)msgLog.isTraceEnabled()) msgLog.trace("Incoming Response SOAPMessage\n" + resMessage);
        return resMessage;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyStream(ByteArrayOutputStream o0, InputStream o1){ return null; }
	public MyHelperClass trace(String o0){ return null; }
	public MyHelperClass isTraceEnabled(){ return null; }}

class HttpURLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass getErrorStream(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class XMLStreamException extends Exception{
	public XMLStreamException(String errorMessage) { super(errorMessage); }
}
