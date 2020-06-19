


class c6595223 {
public MyHelperClass assertEquals(MyHelperClass o0, MyHelperClass o1){ return null; }

    private void testConnection(String address) throws Exception {
        URL url = new URL(address);
        HttpURLConnection con = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        con.setUseCaches(false);
        try {
            con.connect();
            MyHelperClass HttpURLConnection = new MyHelperClass();
            assertEquals(HttpURLConnection.HTTP_OK, con.getResponseCode());
        } finally {
            con.disconnect();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_OK;
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass connect(){ return null; }}
