


class c14537899 {

    private HttpsURLConnection setUpConnection(URL url) throws NoSuchAlgorithmException, KeyManagementException, IOException {
        HttpsURLConnection openConnection = (HttpsURLConnection)(HttpsURLConnection)(Object) url.openConnection();
        openConnection.setAllowUserInteraction(true);
        openConnection.setUseCaches(false);
        openConnection.setDoInput(true);
        openConnection.setDoOutput(true);
        MyHelperClass SSL_PROTOCOL = new MyHelperClass();
        SSLContext sc =(SSLContext)(Object) SSLContext.getInstance(SSL_PROTOCOL);
        sc.init(new KeyManager[] {(KeyManager)(Object) new MyKeyManager() }, new TrustManager[] {(TrustManager)(Object) new BypassTrustManager() }, null);
        openConnection.setSSLSocketFactory(sc.getSocketFactory());
        return openConnection;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openConnection(){ return null; }}

class HttpsURLConnection {

public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass setSSLSocketFactory(MyHelperClass o0){ return null; }
	public MyHelperClass setAllowUserInteraction(boolean o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class KeyManagementException extends Exception{
	public KeyManagementException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class SSLContext {

public static MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass getSocketFactory(){ return null; }
	public MyHelperClass init(KeyManager[] o0, TrustManager[] o1, Object o2){ return null; }}

class KeyManager {

}

class MyKeyManager {

}

class TrustManager {

}

class BypassTrustManager {

}
