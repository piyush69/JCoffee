


class c739728 {

    private static String saveCookie(String username, String password) {
        TrustManager[] trustAllCerts = new TrustManager[] {(TrustManager)(Object) new X509TrustManager() {

            public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                return null;
            }

            public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType) {
            }

            public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType) {
            }
        } };
        try {
            MyHelperClass SSLContext = new MyHelperClass();
            SSLContext sc =(SSLContext)(Object) SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts,(SecureRandom)(Object) new java.security.SecureRandom());
            MyHelperClass HttpsURLConnection = new MyHelperClass();
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
            URL url = new URL("https://ssl.rapidshare.com/cgi-bin/premiumzone.cgi");
            HttpsURLConnection conn = (HttpsURLConnection)(HttpsURLConnection)(Object) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());
            out.write("login=" + username + "&password=" + password);
            out.flush();
            String cookie =(String)(Object) conn.getHeaderField("Set-Cookie");
            cookie = cookie.substring(0, cookie.indexOf(";"));
            out.close();
            conn.disconnect();
            return cookie;
        } catch (Exception e) {
            return "";
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass setDefaultSSLSocketFactory(MyHelperClass o0){ return null; }}

class TrustManager {

}

class X509TrustManager {

}

class SSLContext {

public MyHelperClass init(Object o0, TrustManager[] o1, SecureRandom o2){ return null; }
	public MyHelperClass getSocketFactory(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpsURLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getHeaderField(String o0){ return null; }
	public MyHelperClass disconnect(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(String o0){ return null; }}

class SecureRandom {

}
