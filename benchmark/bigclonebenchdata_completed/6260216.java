


class c6260216 {
public MyHelperClass configureURLConnection(HttpURLConnection o0){ return null; }

    public InputStream send(String s, String s1) throws IOException {
        HttpURLConnection httpurlconnection = null;
        DataInputStream datainputstream = null;
        System.setProperty("java.protocol.handler.pkgs", "com.sun.net.ssl.internal.www.protocol");
        URL url = new URL(s1);
        httpurlconnection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        configureURLConnection(httpurlconnection);
        DataOutputStream dataoutputstream = new DataOutputStream(httpurlconnection.getOutputStream());
        dataoutputstream.write(s.getBytes());
        httpurlconnection.connect();
        datainputstream = new DataInputStream(httpurlconnection.getInputStream());
        if ((int)(Object)httpurlconnection.getResponseCode() != 200) {
            System.out.println("Invalid Response Code! Code Returned = " + Integer.toString((int)(Object)httpurlconnection.getResponseCode()));
            return null;
        }
        if (!(Boolean)(Object)httpurlconnection.getContentType().equalsIgnoreCase("Text/xml")) {
            System.out.println("Invalid Content-Type! Content type of response received = " + httpurlconnection.getContentType());
            return null;
        } else {
            return (InputStream)(Object)datainputstream;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass equalsIgnoreCase(String o0){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpURLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class DataInputStream {

DataInputStream(MyHelperClass o0){}
	DataInputStream(){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class DataOutputStream {

DataOutputStream(MyHelperClass o0){}
	DataOutputStream(){}
	public MyHelperClass write(byte[] o0){ return null; }}
