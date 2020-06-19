


class c22370348 {

    private boolean doesURLExists(String programURIStr) throws Exception {
        boolean retVal = true;
        TrustManager[] trustAllCerts = new TrustManager[] {(TrustManager)(Object) new X509TrustManager() {

            public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                return null;
            }

            public void checkClientTrusted(X509Certificate[] certs, String authType) {
            }

            public void checkServerTrusted(X509Certificate[] certs, String authType) {
            }
        } };
        MyHelperClass SSLContext = new MyHelperClass();
        SSLContext sc =(SSLContext)(Object) SSLContext.getInstance("SSL");
        sc.init(null, trustAllCerts,(SecureRandom)(Object) new java.security.SecureRandom());
        MyHelperClass HttpsURLConnection = new MyHelperClass();
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        HostnameVerifier allHostsValid = new HostnameVerifier() {

            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        };
//        MyHelperClass HttpsURLConnection = new MyHelperClass();
        HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
        URL url = new URL(programURIStr);
        HttpURLConnection urlConn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        urlConn.setConnectTimeout(30000);
        urlConn.connect();
        MyHelperClass log = new MyHelperClass();
        log.debug("HTTP Status code: " + urlConn.getResponseCode() + " for URL: " + programURIStr);
        MyHelperClass HttpURLConnection = new MyHelperClass();
        if (HttpURLConnection.HTTP_OK != urlConn.getResponseCode()) {
            urlConn.disconnect();
            throw new Exception("HTTP status code " + urlConn.getResponseCode() + " for " + programURIStr);
        }
        urlConn.disconnect();
        return retVal;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_OK;
public MyHelperClass setDefaultHostnameVerifier(HostnameVerifier o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass setDefaultSSLSocketFactory(MyHelperClass o0){ return null; }}

class TrustManager {

}

class X509TrustManager {

}

class SSLContext {

public MyHelperClass init(Object o0, TrustManager[] o1, SecureRandom o2){ return null; }
	public MyHelperClass getSocketFactory(){ return null; }}

class HostnameVerifier {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass connect(){ return null; }}

class X509Certificate {

}

class SSLSession {

}

class SecureRandom {

}
