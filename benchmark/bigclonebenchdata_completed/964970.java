
import java.io.UncheckedIOException;


class c964970 {

    private Drawable fetchImage(String iconUrl, Context ctx) {
        URL url;
        HttpClient httpClient =(HttpClient)(Object) new DefaultHttpClient();
        try {
            MyHelperClass PreferenceManager = new MyHelperClass();
            if ((boolean)(Object)PreferenceManager.getDefaultSharedPreferences(ctx).getBoolean("use.urlimg.com", true)) {
                iconUrl = iconUrl.substring(iconUrl.indexOf("//") + 2);
                iconUrl = "http://urlimg.com/width/100/" + iconUrl;
            }
            MyHelperClass Log = new MyHelperClass();
            Log.d(ImageCache.class.getName(), "Loading image from: " + iconUrl);
            HttpGet httpGet = new HttpGet(iconUrl);
            HttpResponse response =(HttpResponse)(Object) httpClient.execute(httpGet);
            InputStream content =(InputStream)(Object) response.getEntity().getContent();
            MyHelperClass Drawable = new MyHelperClass();
            Drawable d =(Drawable)(Object) Drawable.createFromStream(content, "src");
            content.close();
            httpGet.abort();
            return d;
        } catch (UncheckedIOException e) {
            MyHelperClass Log = new MyHelperClass();
            Log.e(ImageCache.class.getName(), "IOException while fetching: " + iconUrl);
            MyHelperClass TELKA = new MyHelperClass();
            return (Drawable)(Object)TELKA;
        } finally {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass e(String o0, String o1){ return null; }
	public MyHelperClass createFromStream(InputStream o0, String o1){ return null; }
	public MyHelperClass getDefaultSharedPreferences(Context o0){ return null; }
	public MyHelperClass getBoolean(String o0, boolean o1){ return null; }
	public MyHelperClass d(String o0, String o1){ return null; }}

class Context {

}

class Drawable {

}

class URL {

}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class ImageCache {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}
	public MyHelperClass abort(){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
