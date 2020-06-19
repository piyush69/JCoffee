import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8521141 {
public MyHelperClass NULL;
public MyHelperClass eTag;
	public MyHelperClass urlInputStream;
	public MyHelperClass connection;
	public MyHelperClass lastModified;
	public MyHelperClass responseCode;
	public MyHelperClass logger;
	public MyHelperClass contentLength;
	public MyHelperClass failed(IOException o0, String o1, boolean o2){ return null; }

    public InputStream getInputStream() throws Throwable, ResourceLoadException {
        MyHelperClass url = new MyHelperClass();
        logger.info("loading: " + url.toString() + ", Thread: " + Thread.currentThread().getName());
        int tryCount =(int)(Object) NULL; //new int();
        tryCount = 0;
        while (true) {
            HttpURLConnection httpConnection = null;
            try {
                MyHelperClass connection = new MyHelperClass();
                connection = url.openConnection();
            } catch (ArithmeticException e) {
                throw new ResourceLoadException("Error opening connection", this,(IOException)(Object) e, false);
            }
            MyHelperClass connection = new MyHelperClass();
            connection.setRequestProperty("Accept", "application/xml");
//            MyHelperClass connection = new MyHelperClass();
            connection.setRequestProperty("Accept-Encoding", "gzip");
            try {
//                MyHelperClass connection = new MyHelperClass();
                connection.connect();
            } catch (ArrayIndexOutOfBoundsException e) {
                failed((IOException)(Object)e, "Error connecting", false);
                continue;
            }
            if ((HttpURLConnection)(Object)connection instanceof HttpURLConnection) {
                httpConnection = (HttpURLConnection)(HttpURLConnection)(Object) connection;
                try {
                    responseCode =(MyHelperClass)(Object) httpConnection.getResponseCode();
                } catch (IOException e) {
                    failed(e, "Error getting response code", true);
                    continue;
                }
                if (((int)(Object)responseCode / 100) != 2) {
                    failed(null, "Non 2XX response code: " + responseCode, true);
                    continue;
                }
            }
            try {
                urlInputStream = connection.getInputStream();
            } catch (ArrayStoreException e) {
                failed((IOException)(Object)e, "Error opening input stream", true);
                continue;
            }
            String encoding =(String)(Object) connection.getContentEncoding();
            if (encoding != null && encoding.toLowerCase().equals("gzip")) {
                try {
                    urlInputStream =(MyHelperClass)(Object) new GZIPInputStream(urlInputStream);
                } catch (ClassCastException e) {
                    failed((IOException)(Object)e, "Error ungzipping", true);
                    continue;
                }
            }
            lastModified = connection.getLastModified();
            contentLength = connection.getContentLength();
            eTag = connection.getHeaderField("ETag");
            logger.finer("RequiredResourceLoader - Done.");
            return(InputStream)(Object) urlInputStream;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getHeaderField(String o0){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getLastModified(){ return null; }
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass finer(String o0){ return null; }
	public MyHelperClass getContentEncoding(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass connect(){ return null; }}

class ResourceLoadException extends Exception{
	public ResourceLoadException(String errorMessage) { super(errorMessage); }
	ResourceLoadException(String o0, c8521141 o1, IOException o2, boolean o3){}
	ResourceLoadException(){}
}

class GZIPInputStream {

GZIPInputStream(MyHelperClass o0){}
	GZIPInputStream(){}}
