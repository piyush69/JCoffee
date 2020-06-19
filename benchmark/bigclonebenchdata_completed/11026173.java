


class c11026173 {
public static MyHelperClass HttpsURLConnection;
	public static MyHelperClass SSLSocketFactory;
	public static MyHelperClass getAllTrustingTrustManager(){ return null; }
//public MyHelperClass HttpsURLConnection;
//	public MyHelperClass SSLSocketFactory;
//	public MyHelperClass getAllTrustingTrustManager(){ return null; }

    public static URLConnection getURLConnection(URL url, boolean ignoreBadCertificates) throws KeyManagementException, NoSuchAlgorithmException, UnknownHostException, IOException {
        SSLSocketFactory sslSocketFactory = null;
        if (ignoreBadCertificates) {
            MyHelperClass SSLContext = new MyHelperClass();
            SSLContext sslContext =(SSLContext)(Object) SSLContext.getInstance("SSL");
            sslContext.init(null, getAllTrustingTrustManager(),(SecureRandom)(Object) new java.security.SecureRandom());
            sslSocketFactory =(SSLSocketFactory)(Object) sslContext.getSocketFactory();
        } else {
            sslSocketFactory = (SSLSocketFactory)(SSLSocketFactory)(Object) SSLSocketFactory.getDefault();
        }
        HttpsURLConnection.setDefaultSSLSocketFactory(sslSocketFactory);
        return(URLConnection)(Object) url.openConnection();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setDefaultSSLSocketFactory(SSLSocketFactory o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getDefault(){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class URLConnection {

}

class KeyManagementException extends Exception{
	public KeyManagementException(String errorMessage) { super(errorMessage); }
}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class UnknownHostException extends Exception{
	public UnknownHostException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class SSLSocketFactory {

}

class SSLContext {

public MyHelperClass init(Object o0, MyHelperClass o1, SecureRandom o2){ return null; }
	public MyHelperClass getSocketFactory(){ return null; }}

class SecureRandom {

}
