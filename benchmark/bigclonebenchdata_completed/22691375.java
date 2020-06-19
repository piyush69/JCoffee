import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22691375 {

//    @Override
    protected String getRawPage(String url) throws Throwable, IOException {
        HttpClient httpClient = new HttpClient();
        MyHelperClass config = new MyHelperClass();
        String proxyHost =(String)(Object) config.getString("proxy.host"), proxyPortString =(String)(Object) config.getString("proxy.port");
        if (proxyHost != null && proxyPortString != null) {
            int proxyPort = -1;
            try {
                proxyPort = Integer.parseInt(proxyPortString);
            } catch (NumberFormatException e) {
            }
            if (proxyPort != -1) {
                httpClient.getHostConfiguration().setProxy(proxyHost, proxyPort);
            }
        }
        GetMethod urlGet = new GetMethod(url);
        urlGet.setRequestHeader("Accept-Encoding", "");
        urlGet.setRequestHeader("User-Agent", "Mozilla/5.0");
        int retCode;
        MyHelperClass HttpStatus = new MyHelperClass();
        if ((retCode =(int)(Object) httpClient.executeMethod(urlGet)) != (int)(Object)HttpStatus.SC_OK) {
            throw new RuntimeException("Unexpected HTTP code: " + retCode);
        }
        String encoding = null;
        Header contentType =(Header)(Object) urlGet.getResponseHeader("Content-Type");
        if (contentType != null) {
            String contentTypeString = contentType.toString();
            int i = contentTypeString.indexOf("charset=");
            if (i != -1) {
                encoding = contentTypeString.substring(i + "charset=".length()).trim();
            }
        }
        boolean gzipped = false;
        Header contentEncoding =(Header)(Object) urlGet.getResponseHeader("Content-Encoding");
        if (contentEncoding != null && (boolean)(Object)contentEncoding.getValue().equalsIgnoreCase("gzip")) {
            gzipped = true;
        }
        byte[] htmlData;
        try {
            InputStream in = gzipped ? new GZIPInputStream(urlGet.getResponseBodyAsStream()) : urlGet.getResponseBodyAsStream();
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(in, out);
            htmlData = out.toByteArray();
            in.close();
        } finally {
            urlGet.releaseConnection();
        }
        if (encoding == null) {
            MyHelperClass Pattern = new MyHelperClass();
            Matcher m =(Matcher)(Object) Pattern.compile("(?i)<meta[^>]*charset=(([^\"]+\")|(\"[^\"]+\"))").matcher(new String(htmlData));
            if ((boolean)(Object)m.find()) {
                encoding =(String)(Object) m.group(1).trim().replace("\"", "");
            }
        }
        if (encoding == null) {
            encoding = "UTF-8";
        }
        return new String(htmlData, encoding);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
public MyHelperClass replace(String o0, String o1){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass equalsIgnoreCase(String o0){ return null; }
	public MyHelperClass trim(){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass compile(String o0){ return null; }
	public MyHelperClass setProxy(String o0, int o1){ return null; }
	public MyHelperClass matcher(String o0){ return null; }}

class HttpClient {

public MyHelperClass executeMethod(GetMethod o0){ return null; }
	public MyHelperClass getHostConfiguration(){ return null; }}

class GetMethod {

GetMethod(){}
	GetMethod(String o0){}
	public MyHelperClass releaseConnection(){ return null; }
	public MyHelperClass getResponseBodyAsStream(){ return null; }
	public MyHelperClass getResponseHeader(String o0){ return null; }
	public MyHelperClass setRequestHeader(String o0, String o1){ return null; }}

class Header {

public MyHelperClass getValue(){ return null; }}

class GZIPInputStream {

GZIPInputStream(MyHelperClass o0){}
	GZIPInputStream(){}}

class Matcher {

public MyHelperClass group(int o0){ return null; }
	public MyHelperClass find(){ return null; }}
