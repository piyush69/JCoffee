


class c1516551 {

    public static HttpURLConnection getHttpConn(String urlStr, String Method) throws IOException {
        URL url = null;
        HttpURLConnection connection = null;
        url = new URL(urlStr);
        connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        connection.setDoOutput(true);
        connection.setDoInput(true);
        connection.setRequestMethod(Method);
        connection.setUseCaches(false);
        connection.connect();
        return connection;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}
