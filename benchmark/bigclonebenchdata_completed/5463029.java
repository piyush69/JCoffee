import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5463029 {
public MyHelperClass NULL;

    private InputStream getInputStream(final String pUrlStr) throws Throwable, IOException {
        URL url;
        int responseCode;
        String encoding;
        url = new URL(pUrlStr);
        HttpURLConnection myActiveConnection =(HttpURLConnection)(Object) NULL; //new HttpURLConnection();
        myActiveConnection = (HttpURLConnection) url.openConnection();
//        MyHelperClass myActiveConnection = new MyHelperClass();
        myActiveConnection.setRequestProperty("Accept-Encoding", "gzip, deflate");
//        MyHelperClass myActiveConnection = new MyHelperClass();
        responseCode = myActiveConnection.getResponseCode();
        MyHelperClass RESPONSECODE_OK = new MyHelperClass();
        if (responseCode != (int)(Object)RESPONSECODE_OK) {
            String message;
            String apiErrorMessage;
//            MyHelperClass myActiveConnection = new MyHelperClass();
            apiErrorMessage = myActiveConnection.getHeaderField("Error");
            if (apiErrorMessage != null) {
                message = "Received API HTTP response code " + responseCode + " with message \"" + apiErrorMessage + "\" for URL \"" + pUrlStr + "\".";
            } else {
                message = "Received API HTTP response code " + responseCode + " for URL \"" + pUrlStr + "\".";
            }
            throw new OsmosisRuntimeException(message);
        }
        MyHelperClass TIMEOUT = new MyHelperClass();
        myActiveConnection.setConnectTimeout((int)(Object)TIMEOUT);
//        MyHelperClass myActiveConnection = new MyHelperClass();
        encoding = myActiveConnection.getContentEncoding();
        InputStream responseStream =(InputStream)(Object) NULL; //new InputStream();
        responseStream = myActiveConnection.getInputStream();
        if (encoding != null && encoding.equalsIgnoreCase("gzip")) {
//            MyHelperClass responseStream = new MyHelperClass();
            responseStream =(InputStream)(Object) new GZIPInputStream((MyHelperClass)(Object)responseStream);
        } else if (encoding != null && encoding.equalsIgnoreCase("deflate")) {
//            MyHelperClass responseStream = new MyHelperClass();
            responseStream =(InputStream)(Object) new InflaterInputStream(responseStream, new Inflater(true));
        }
//        MyHelperClass responseStream = new MyHelperClass();
        return(InputStream)(Object) responseStream;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass getHeaderField(String o0){ return null; }
	public MyHelperClass setConnectTimeout(MyHelperClass o0){ return null; }
	public MyHelperClass getContentEncoding(){ return null; }}

class OsmosisRuntimeException extends Exception{
	public OsmosisRuntimeException(String errorMessage) { super(errorMessage); }
}

class GZIPInputStream {

GZIPInputStream(){}
	GZIPInputStream(MyHelperClass o0){}}

class InflaterInputStream {

InflaterInputStream(InputStream o0, Inflater o1){}
	InflaterInputStream(){}}

class Inflater {

Inflater(boolean o0){}
	Inflater(){}}
