


class c22755555 {

    private static HttpURLConnection _getConnection(HttpPrincipal httpPrincipal) throws IOException {
        if (httpPrincipal == null || httpPrincipal.getUrl() == null) {
            return null;
        }
        URL url = null;
        if (((int)(Object)httpPrincipal.getUserId() <= 0) || (httpPrincipal.getPassword() == null)) {
            url = new URL(httpPrincipal.getUrl() + "/tunnel-web/liferay/do");
        } else {
            url = new URL(httpPrincipal.getUrl() + "/tunnel-web/secure/liferay/do");
        }
        HttpURLConnection urlc = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        urlc.setDoInput(true);
        urlc.setDoOutput(true);
        urlc.setUseCaches(false);
        urlc.setRequestMethod("POST");
        if (((int)(Object)httpPrincipal.getUserId() > 0) && (httpPrincipal.getPassword() != null)) {
            String userNameAndPassword = httpPrincipal.getUserId() + ":" + httpPrincipal.getPassword();
            MyHelperClass Base64 = new MyHelperClass();
            urlc.setRequestProperty("Authorization", "Basic " + Base64.encode(userNameAndPassword.getBytes()));
        }
        return urlc;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(byte[] o0){ return null; }}

class HttpPrincipal {

public MyHelperClass getUserId(){ return null; }
	public MyHelperClass getUrl(){ return null; }
	public MyHelperClass getPassword(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}
