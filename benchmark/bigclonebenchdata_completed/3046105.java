import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3046105 {
public MyHelperClass errorCheck(HttpResponse o0, int o1){ return null; }
public MyHelperClass key;
	public MyHelperClass JAXB;
	public MyHelperClass REST_URL;
	public MyHelperClass URLEncodedUtils;
	public MyHelperClass httpClient;

    public GGLicenses getLicensesInfo() throws Throwable, IllegalStateException, GGException, Exception {
        List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        qparams.add(new BasicNameValuePair("method", "gg.photos.licenses.getInfo"));
        qparams.add(new BasicNameValuePair("key", this.key));
        String url = REST_URL + "?" + URLEncodedUtils.format(qparams, "UTF-8");
        URI uri = new URI(url);
        HttpGet httpget = new HttpGet(uri);
        HttpResponse response = httpClient.execute(httpget);
        int status = response.getStatusLine().getStatusCode();
        errorCheck(response, status);
        InputStream content = response.getEntity().getContent();
        GGLicenses licenses = JAXB.unmarshal(content, GGLicenses.class);
        return licenses;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass format(List<NameValuePair o0, String o1){ return null; }
	public MyHelperClass unmarshal(InputStream o0, Class<GGLicenses o1){ return null; }}

class GGLicenses {

}

class GGException extends Exception{
	public GGException(String errorMessage) { super(errorMessage); }
}

class NameValuePair {

}

class BasicNameValuePair {

BasicNameValuePair(String o0, String o1){}
	BasicNameValuePair(String o0, MyHelperClass o1){}
	BasicNameValuePair(){}}

class HttpGet {

HttpGet(){}
	HttpGet(URI o0){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}
