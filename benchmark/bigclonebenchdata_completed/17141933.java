import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17141933 {

    public static InputSource getInputSource(URL url) throws Throwable, IOException {
        String proto = url.getProtocol().toLowerCase();
        if (!("http".equals(proto) || "https".equals(proto))) throw new IllegalArgumentException("OAI-PMH only allows HTTP(S) as network protocol!");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        StringBuilder ua = new StringBuilder("Java/");
        ua.append(System.getProperty("java.version"));
        ua.append(" (");
        ua.append(OAIHarvester.class.getName());
        ua.append(')');
        conn.setRequestProperty("User-Agent", ua.toString());
        conn.setRequestProperty("Accept-Encoding", "gzip, deflate, identity;q=0.3, *;q=0");
        conn.setRequestProperty("Accept-Charset", "utf-8, *;q=0.1");
        conn.setRequestProperty("Accept", "text/xml, application/xml, *;q=0.1");
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
        String encoding = conn.getContentEncoding();
        if (encoding == null) encoding = "identity";
        encoding = encoding.toLowerCase();
//        MyHelperClass log = new MyHelperClass();
        log.debug("HTTP server uses " + encoding + " content encoding.");
        if ("gzip".equals(encoding)) in =(InputStream)(Object) new GZIPInputStream(in); else if ("deflate".equals(encoding)) in =(InputStream)(Object) new InflaterInputStream(in); else if (!"identity".equals(encoding)) throw new IOException("Server uses an invalid content encoding: " + encoding);
        String contentType = conn.getContentType();
        String charset = null;
        if (contentType != null) {
            contentType = contentType.toLowerCase();
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

public MyHelperClass debug(String o0){ return null; }}

class InputSource {

InputSource(){}
	InputSource(InputStream o0){}
	public MyHelperClass setEncoding(String o0){ return null; }
	public MyHelperClass setSystemId(String o0){ return null; }}

class OAIHarvester {

}

class RetryAfterIOException extends Exception{
	public RetryAfterIOException(String errorMessage) { super(errorMessage); }
	RetryAfterIOException(){}
	RetryAfterIOException(int o0, IOException o1){}
}

class GZIPInputStream {

GZIPInputStream(){}
	GZIPInputStream(InputStream o0){}}

class InflaterInputStream {

InflaterInputStream(){}
	InflaterInputStream(InputStream o0){}}
