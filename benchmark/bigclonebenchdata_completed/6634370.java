


class c6634370 {
public static MyHelperClass disconnect(HttpURLConnection o0){ return null; }
//public MyHelperClass disconnect(HttpURLConnection o0){ return null; }

    public static final void connectExecuteDisconnect(String url, HttpProcess process) throws IOException {
        URL urlObj = null;
        HttpURLConnection urlCon = null;
        try {
            urlObj = new URL(url);
            urlCon = (HttpURLConnection)(HttpURLConnection)(Object) urlObj.openConnection();
            process.apply(urlCon);
        } finally {
            disconnect(urlCon);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HttpProcess {

public MyHelperClass apply(HttpURLConnection o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

}
