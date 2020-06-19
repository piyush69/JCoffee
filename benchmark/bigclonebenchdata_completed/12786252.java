import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12786252 {

    private OSD downloadList() throws Throwable, IOException, IllegalStateException, ParseException, URISyntaxException {
        OSD osd = null;
        HttpClient client =(HttpClient)(Object) new DefaultHttpClient();
        MyHelperClass listUri = new MyHelperClass();
        HttpGet getMethod = new HttpGet(new URI((String)(Object)listUri));
        try {
            HttpResponse response =(HttpResponse)(Object) client.execute(getMethod);
            MyHelperClass HttpStatus = new MyHelperClass();
            if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
                throw new HttpResponseException(response.getStatusLine().getStatusCode(), response.getStatusLine().getReasonPhrase());
            }
            HttpEntity entity =(HttpEntity)(Object) response.getEntity();
            if (entity != null) {
                InputStream stream =(InputStream)(Object) entity.getContent();
                String charset = null;
                if (entity.getContentType() != null) {
                    HeaderElement values[] =(HeaderElement[])(Object) entity.getContentType().getElements();
                    if (values.length > 0) {
                        NameValuePair param =(NameValuePair)(Object) values[0].getParameterByName("charset");
                        if (param != null) {
                            charset =(String)(Object) param.getValue();
                        }
                    }
                }
                if (charset == null) {
                    MyHelperClass HTTP = new MyHelperClass();
                    charset =(String)(Object) HTTP.DEFAULT_CONTENT_CHARSET;
                }
                MyHelperClass OSD = new MyHelperClass();
                osd =(OSD)(Object) OSD.parse(stream, charset);
            }
        } finally {
            getMethod.abort();
        }
        return osd;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
	public MyHelperClass DEFAULT_CONTENT_CHARSET;
public MyHelperClass parse(InputStream o0, String o1){ return null; }
	public MyHelperClass getElements(){ return null; }
	public MyHelperClass getReasonPhrase(){ return null; }
	public MyHelperClass getStatusCode(){ return null; }}

class OSD {

}

class ParseException extends Exception{
	public ParseException(String errorMessage) { super(errorMessage); }
}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class HttpGet {

HttpGet(){}
	HttpGet(URI o0){}
	public MyHelperClass abort(){ return null; }}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class HttpResponseException extends Exception{
	public HttpResponseException(String errorMessage) { super(errorMessage); }
	HttpResponseException(){}
	HttpResponseException(MyHelperClass o0, MyHelperClass o1){}
}

class HttpEntity {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass getContentType(){ return null; }}

class HeaderElement {

public MyHelperClass getParameterByName(String o0){ return null; }}

class NameValuePair {

public MyHelperClass getValue(){ return null; }}
