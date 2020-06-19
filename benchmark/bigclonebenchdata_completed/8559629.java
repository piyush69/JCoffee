import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c8559629 {

    public static String httpGetJson(final List<NameValuePair> nameValuePairs) {
        HttpClient httpclient = null;
        String data = "";
        URI uri = null;
        try {
            MyHelperClass URLEncodedUtils = new MyHelperClass();
            final String paramString =(String)(Object) URLEncodedUtils.format(nameValuePairs, "utf-8");
            MyHelperClass HTTPS = new MyHelperClass();
            if ((boolean)(Object)HTTPS) {
                final SchemeRegistry schemeRegistry = new SchemeRegistry();
                MyHelperClass SSLSocketFactory = new MyHelperClass();
                schemeRegistry.register(new Scheme("https", SSLSocketFactory.getSocketFactory(), 443));
                final HttpParams params =(HttpParams)(Object) new BasicHttpParams();
                final SingleClientConnManager mgr = new SingleClientConnManager(params, schemeRegistry);
                httpclient =(HttpClient)(Object) new DefaultHttpClient(mgr, params);
                MyHelperClass DEADDROPS_SERVER_URL_HTTPS = new MyHelperClass();
                uri = new URI(DEADDROPS_SERVER_URL_HTTPS + "?" + paramString);
            } else {
                httpclient =(HttpClient)(Object) new DefaultHttpClient();
                MyHelperClass DEADDROPS_SERVER_URL = new MyHelperClass();
                uri = new URI(DEADDROPS_SERVER_URL + "?" + paramString);
            }
            final HttpGet request = new HttpGet();
            request.setURI(uri);
            final HttpResponse response =(HttpResponse)(Object) httpclient.execute(request);
            final BufferedReader in = new BufferedReader(new InputStreamReader((InputStream)(Object)response.getEntity().getContent()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) data += inputLine;
            in.close();
        } catch (final UncheckedIOException e) {
            e.printStackTrace();
            return null;
        } catch (final ArithmeticException e) {
            e.printStackTrace();
            return null;
        } catch (final IOException e) {
            e.printStackTrace();
            return null;
        }
        return data;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getSocketFactory(){ return null; }
	public MyHelperClass getContent(){ return null; }
	public MyHelperClass format(List<NameValuePair> o0, String o1){ return null; }}

class NameValuePair {

}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class URI {

URI(){}
	URI(String o0){}}

class SchemeRegistry {

public MyHelperClass register(Scheme o0){ return null; }}

class Scheme {

Scheme(String o0, MyHelperClass o1, int o2){}
	Scheme(){}}

class HttpParams {

}

class BasicHttpParams {

}

class SingleClientConnManager {

SingleClientConnManager(HttpParams o0, SchemeRegistry o1){}
	SingleClientConnManager(){}}

class DefaultHttpClient {

DefaultHttpClient(){}
	DefaultHttpClient(SingleClientConnManager o0, HttpParams o1){}}

class HttpGet {

public MyHelperClass setURI(URI o0){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class URISyntaxException extends Exception{
	public URISyntaxException(String errorMessage) { super(errorMessage); }
}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}
