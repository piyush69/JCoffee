


class c5675397 {
public MyHelperClass fail(String o0){ return null; }

    private void delete(String location) throws Exception {
        URL url = new URL(location);
        HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        conn.setRequestMethod("DELETE");
        conn.connect();
        int responseCode =(int)(Object) conn.getResponseCode();
        MyHelperClass HttpURLConnection = new MyHelperClass();
        if (responseCode != (int)(Object)HttpURLConnection.HTTP_OK && responseCode != (int)(Object)HttpURLConnection.HTTP_NO_CONTENT) {
            String response = "location " + location + " responded: " + conn.getResponseMessage() + " (" + responseCode + ")";
            fail(response);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_NO_CONTENT;
	public MyHelperClass HTTP_OK;
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass getResponseMessage(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass connect(){ return null; }}
