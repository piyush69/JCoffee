import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c23050895 {
public MyHelperClass createFile(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass chooseExtension(MyHelperClass o0){ return null; }
	public MyHelperClass nameValueListToJsMap(MyHelperClass o0){ return null; }
public MyHelperClass LOG;
	public MyHelperClass FormEncodingType;
public MyHelperClass IOUtils;
	public MyHelperClass escapeJSString(String o0){ return null; }
	public MyHelperClass appendToJSFile(String o0){ return null; }

    protected void saveResponse(final WebResponse response, final WebRequest request) throws Throwable, IOException {
        MyHelperClass counter_ = new MyHelperClass();
        counter_++;
        final String extension =(String)(Object) chooseExtension(response.getContentType());
        final File f =(File)(Object) createFile(request.getUrl(), extension);
        final InputStream input =(InputStream)(Object) response.getContentAsStream();
        final OutputStream output = new FileOutputStream(f);
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(response.getContentAsStream(), output);
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(input);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(output);
        }
        final URL url =(URL)(Object) response.getWebRequest().getUrl();
//        MyHelperClass counter_ = new MyHelperClass();
        LOG.info("Created file " + f.getAbsolutePath() + " for response " + counter_ + ": " + url);
        final StringBuilder buffer = new StringBuilder();
        buffer.append("tab[tab.length] = {code: " + response.getStatusCode() + ", ");
        buffer.append("fileName: '" + f.getName() + "', ");
        buffer.append("contentType: '" + response.getContentType() + "', ");
        buffer.append("method: '" + request.getHttpMethod().name() + "', ");
        MyHelperClass HttpMethod = new MyHelperClass();
        if (request.getHttpMethod() == HttpMethod.POST && request.getEncodingType() == FormEncodingType.URL_ENCODED) {
            buffer.append("postParameters: " + nameValueListToJsMap(request.getRequestParameters()) + ", ");
        }
        buffer.append("url: '" + escapeJSString(url.toString()) + "', ");
        buffer.append("loadTime: " + response.getLoadTime() + ", ");
        final byte[] bytes =(byte[])(Object) IOUtils.toByteArray(response.getContentAsStream());
        buffer.append("responseSize: " + ((bytes == null) ? 0 : bytes.length) + ", ");
        buffer.append("responseHeaders: " + nameValueListToJsMap(response.getResponseHeaders()));
        buffer.append("};\n");
        appendToJSFile(buffer.toString());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass URL_ENCODED;
	public int counter_;
	public MyHelperClass POST;
public MyHelperClass name(){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getUrl(){ return null; }
	public MyHelperClass copy(MyHelperClass o0, OutputStream o1){ return null; }
	public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass toByteArray(MyHelperClass o0){ return null; }}

class WebResponse {

public MyHelperClass getWebRequest(){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass getContentAsStream(){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass getLoadTime(){ return null; }
	public MyHelperClass getResponseHeaders(){ return null; }}

class WebRequest {

public MyHelperClass getUrl(){ return null; }
	public MyHelperClass getRequestParameters(){ return null; }
	public MyHelperClass getHttpMethod(){ return null; }
	public MyHelperClass getEncodingType(){ return null; }}
