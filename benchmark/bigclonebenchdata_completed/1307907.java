


class c1307907 {

    public void testHttpsConnection() {
        try {
            URL url = new URL("https://addons.mozilla.org/zh-CN/firefox/");
            HttpsURLConnection connection = (HttpsURLConnection)(HttpsURLConnection)(Object) url.openConnection();
            connection.setDoOutput(true);
            connection.getOutputStream().write("hello".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass write(byte[] o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpsURLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }}
