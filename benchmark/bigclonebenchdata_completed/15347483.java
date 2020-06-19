


class c15347483 {
public MyHelperClass assertEquals(MyHelperClass o0, int o1){ return null; }

    private void testURL(String urlStr) throws MalformedURLException, IOException {
        HttpURLConnection conn = null;
        try {
            URL url = new URL(urlStr);
            conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            int code =(int)(Object) conn.getResponseCode();
            MyHelperClass HttpURLConnection = new MyHelperClass();
            assertEquals(HttpURLConnection.HTTP_OK, code);
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_OK;
}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpURLConnection {

public MyHelperClass disconnect(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}
