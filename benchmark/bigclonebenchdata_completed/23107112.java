
import java.io.UncheckedIOException;


class c23107112 {
public static MyHelperClass getParams(Map o0){ return null; }
//public MyHelperClass getParams(Map o0){ return null; }

    public static String doPost(String url, Map mapa) {
        try {
            HttpClient httpclient =(HttpClient)(Object) new DefaultHttpClient();
            HttpPost httpPost = new HttpPost(url);
            List params =(List)(Object) getParams(mapa);
            MyHelperClass HTTP = new MyHelperClass();
            httpPost.setEntity(new UrlEncodedFormEntity(params, HTTP.UTF_8));
            HttpResponse httpresponse =(HttpResponse)(Object) httpclient.execute(httpPost);
            HttpEntity httpentity =(HttpEntity)(Object) httpresponse.getEntity();
            if (httpentity != null) {
                InputStream is =(InputStream)(Object) httpentity.getContent();
                MyHelperClass Funcoes = new MyHelperClass();
                return(String)(Object) Funcoes.readString(is);
            }
        } catch (UncheckedIOException e) {
            MyHelperClass Log = new MyHelperClass();
            Log.e("HttpClientImpl.doPost", e.getMessage());
        }
        return url;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass UTF_8;
public MyHelperClass e(String o0, String o1){ return null; }
	public MyHelperClass readString(InputStream o0){ return null; }}

class Map {

}

class HttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class DefaultHttpClient {

}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }}

class List {

}

class NameValuePair {

}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(){}
	UrlEncodedFormEntity(List o0, MyHelperClass o1){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
