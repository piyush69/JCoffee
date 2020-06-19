


class c17492434 {
public MyHelperClass readInputStream(InputStream o0){ return null; }

//    @Test
    public void testProxySsl() throws Throwable {
        URL url = new URL("https://login.yahoo.co.jp/config/login");
        HttpsURLConnection httpsconnection = (HttpsURLConnection)(HttpsURLConnection)(Object) url.openConnection();
        KeyManager[] km = null;
        TrustManager[] tm = {(TrustManager)(Object) new X509TrustManager() {

            public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
            }

            public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
            }

            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }
        } };
        MyHelperClass SSLContext = new MyHelperClass();
        SSLContext sslcontext =(SSLContext)(Object) SSLContext.getInstance("SSL");
        sslcontext.init(km, tm, new SecureRandom());
        httpsconnection.setSSLSocketFactory(sslcontext.getSocketFactory());
        InputStream is =(InputStream)(Object) httpsconnection.getInputStream();
        readInputStream(is);
        is.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class Test {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpsURLConnection {

public MyHelperClass setSSLSocketFactory(MyHelperClass o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class KeyManager {

}

class TrustManager {

}

class X509TrustManager {

}

class SSLContext {

public MyHelperClass init(KeyManager[] o0, TrustManager[] o1, SecureRandom o2){ return null; }
	public MyHelperClass getSocketFactory(){ return null; }}

class SecureRandom {

}

class InputStream {

public MyHelperClass close(){ return null; }}

class X509Certificate {

}

class CertificateException extends Exception{
	public CertificateException(String errorMessage) { super(errorMessage); }
}
