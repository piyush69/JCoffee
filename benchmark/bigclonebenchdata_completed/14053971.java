import java.io.*;
import java.lang.*;
import java.util.*;



class c14053971 {

    private static String fetchUrl(String url, boolean keepLineEnds) throws IOException, MalformedURLException {
        URLConnection destConnection =(URLConnection)(Object) (new URL(url)).openConnection();
        BufferedReader br;
        String inputLine;
        StringBuffer doc = new StringBuffer();
        String contentEncoding;
        destConnection.setRequestProperty("Accept-Encoding", "gzip");
        MyHelperClass proxyAuth = new MyHelperClass();
        if (proxyAuth != null) destConnection.setRequestProperty("Proxy-Authorization", proxyAuth);
        destConnection.connect();
        contentEncoding =(String)(Object) destConnection.getContentEncoding();
        if ((contentEncoding != null) && contentEncoding.equals("gzip")) {
            br = new BufferedReader(new InputStreamReader((InputStream)(Object)new GZIPInputStream(destConnection.getInputStream())));
        } else {
            br = new BufferedReader(new InputStreamReader((InputStream)(Object)destConnection.getInputStream()));
        }
        while ((inputLine = br.readLine()) != null) {
            if (keepLineEnds) doc.append(inputLine + "\n"); else doc.append(inputLine);
        }
        br.close();
        return doc.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getContentEncoding(){ return null; }
	public MyHelperClass setRequestProperty(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass connect(){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }}

class GZIPInputStream {

GZIPInputStream(){}
	GZIPInputStream(MyHelperClass o0){}}
