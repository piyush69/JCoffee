


class c9496557 {

    public static HttpURLConnection create(URL url, String id, String action, HTTPRequestInfo info) throws IOException {
        HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        connection.setRequestMethod("POST");
        if (id != null) {
            connection.setRequestProperty("id", id);
        }
        connection.setRequestProperty("action", action);
        connection.setUseCaches(false);
        if (info.getProxyUser() != null && info.getProxyPassword() != null) {
            String pwd = info.getProxyUser() + ":" + info.getProxyPassword();
            MyHelperClass Base64 = new MyHelperClass();
            String encoded = new String((String)(Object)Base64.encodeBase64(pwd.getBytes()));
            connection.setRequestProperty("Proxy-Authorization", "Basic " + encoded);
        }
        return connection;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encodeBase64(byte[] o0){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class HTTPRequestInfo {

public MyHelperClass getProxyPassword(){ return null; }
	public MyHelperClass getProxyUser(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
