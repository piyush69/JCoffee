import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18366943 {

    protected InputSource getInputSource(URL url, AtomicReference checkModifiedDate) throws Throwable, IOException {
        String proto = url.getProtocol().toLowerCase(Locale.ENGLISH);
        if (!("http".equals(proto) || "https".equals(proto))) throw new IllegalArgumentException("OAI only allows HTTP(S) as network protocol!");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        MyHelperClass timeout = new MyHelperClass();
        conn.setConnectTimeout((int)(Object)timeout * 1000);
//        MyHelperClass timeout = new MyHelperClass();
        conn.setReadTimeout((int)(Object)timeout * 1000);
        StringBuilder ua = new StringBuilder("Java/").append(System.getProperty("java.version")).append(" (").append(Package.getProductName()).append('/').append(Package.getVersion()).append("; OAI downloader)");
        conn.setRequestProperty("User-Agent", ua.toString());
        conn.setRequestProperty("Accept-Encoding", "gzip, deflate, identity;q=0.3, *;q=0");
        conn.setRequestProperty("Accept-Charset", "utf-8, *;q=0.1");
        conn.setRequestProperty("Accept", "text/xml, application/xml, *;q=0.1");
        if (checkModifiedDate != null && checkModifiedDate.get() != null) conn.setIfModifiedSince((long)(Object)checkModifiedDate.get().getTime());
        conn.setUseCaches(false);
        conn.setFollowRedirects(true);
        MyHelperClass log = new MyHelperClass();
        log.debug("Opening connection...");
        InputStream in = null;
        try {
            conn.connect();
            in = conn.getInputStream();
        } catch (IOException ioe) {
            int after, code;
            try {
                after = conn.getHeaderFieldInt("Retry-After", -1);
                code = conn.getResponseCode();
            } catch (IOException ioe2) {
                after = -1;
                code = -1;
            }
            if (code == HttpURLConnection.HTTP_UNAVAILABLE && after > 0) throw new RetryAfterIOException(after, ioe);
            throw ioe;
        }
        if (checkModifiedDate != null) {
            if (conn.getResponseCode() == HttpURLConnection.HTTP_NOT_MODIFIED) {
//                MyHelperClass log = new MyHelperClass();
                log.debug("File not modified since " + checkModifiedDate.get());
                if (in != null) in.close();
                return null;
            }
            long d = conn.getLastModified();
            checkModifiedDate.set((d == 0L) ? null : new Date(d));
        }
        String encoding = conn.getContentEncoding();
        if (encoding == null) encoding = "identity";
        encoding = encoding.toLowerCase(Locale.ENGLISH);
//        MyHelperClass log = new MyHelperClass();
        log.debug("HTTP server uses " + encoding + " content encoding.");
        if ("gzip".equals(encoding)) in =(InputStream)(Object) new GZIPInputStream(in); else if ("deflate".equals(encoding)) in =(InputStream)(Object) new InflaterInputStream(in); else if (!"identity".equals(encoding)) throw new IOException("Server uses an invalid content encoding: " + encoding);
        String contentType = conn.getContentType();
        String charset = null;
        if (contentType != null) {
            contentType = contentType.toLowerCase(Locale.ENGLISH);
            int charsetStart = contentType.indexOf("charset=");
            if (charsetStart >= 0) {
                int charsetEnd = contentType.indexOf(";", charsetStart);
                if (charsetEnd == -1) charsetEnd = contentType.length();
                charsetStart += "charset=".length();
                charset = contentType.substring(charsetStart, charsetEnd).trim();
            }
        }
//        MyHelperClass log = new MyHelperClass();
        log.debug("Charset from Content-Type: '" + charset + "'");
        InputSource src = new InputSource(in);
        src.setSystemId(url.toString());
        src.setEncoding(charset);
        return src;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getTime(){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class AtomicReference {

public MyHelperClass get(){ return null; }}

class InputSource {

InputSource(InputStream o0){}
	InputSource(){}
	public MyHelperClass setEncoding(String o0){ return null; }
	public MyHelperClass setSystemId(String o0){ return null; }}

class RetryAfterIOException extends Exception{
	public RetryAfterIOException(String errorMessage) { super(errorMessage); }
	RetryAfterIOException(int o0, IOException o1){}
	RetryAfterIOException(){}
}

class GZIPInputStream {

GZIPInputStream(InputStream o0){}
	GZIPInputStream(){}}

class InflaterInputStream {

InflaterInputStream(InputStream o0){}
	InflaterInputStream(){}}

class Package {

public static MyHelperClass getVersion(){ return null; }
	public static MyHelperClass getProductName(){ return null; }}
