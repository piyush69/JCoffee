


class c9680172 {
public MyHelperClass userAgent;
	public MyHelperClass proxy;
	public MyHelperClass isDebugMode(){ return null; }

    public HttpURLConnection openConnection(String url) throws IOException {
        if ((boolean)(Object)isDebugMode()) System.out.println("open: " + url);
        URL u = new URL(url);
        HttpURLConnection urlConnection;
        if (proxy != null) urlConnection = (HttpURLConnection)(HttpURLConnection)(Object) u.openConnection(proxy); else urlConnection = (HttpURLConnection)(HttpURLConnection)(Object) u.openConnection();
        urlConnection.setRequestProperty("User-Agent", userAgent);
        return urlConnection;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, MyHelperClass o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(MyHelperClass o0){ return null; }
	public MyHelperClass openConnection(){ return null; }}
