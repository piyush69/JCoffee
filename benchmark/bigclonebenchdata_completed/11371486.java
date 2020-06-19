


class c11371486 {

    private static List getContent(URL url) throws IOException {
        final HttpURLConnection http = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        try {
            http.connect();
            final int code =(int)(Object) http.getResponseCode();
            if (code != 200) throw new IOException("IP Locator failed to get the location. Http Status code : " + code + " [" + url + "]");
            return getContent((URL)(Object)http);
        } finally {
            http.disconnect();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openConnection(){ return null; }}

class List {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpURLConnection {

public MyHelperClass disconnect(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass connect(){ return null; }}
