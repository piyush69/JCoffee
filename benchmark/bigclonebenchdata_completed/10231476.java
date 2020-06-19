import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10231476 {
public MyHelperClass stampRequest(Document o0){ return null; }
public MyHelperClass getResponse(HttpURLConnection o0){ return null; }
	public MyHelperClass getXmlLoader(){ return null; }

    protected Document SendRequest(Document request) throws Throwable, WsmanException {
        HttpURLConnection conn = null;
        Document response = null;
        stampRequest(request);
        boolean printDebug = System.getProperty("intel.management.wsman.debug", "false").equals("true");
        int retry = 2;
        while (retry > 0) {
            try {
                if (conn != null) {
                    conn.disconnect();
                }
                MyHelperClass properties = new MyHelperClass();
                URL url = new URL((String)(String)(Object) properties.get("Address"));
//                MyHelperClass properties = new MyHelperClass();
                Proxy proxy = (Proxy)(Proxy)(Object) properties.get("HttpProxy");
                if (proxy != null) conn = (HttpURLConnection) url.openConnection(proxy); else conn = (HttpURLConnection) url.openConnection();
                if ((HttpsURLConnection)(Object)conn instanceof HttpsURLConnection) {
                    HttpsURLConnection sslConn = (HttpsURLConnection)(HttpsURLConnection)(Object) conn;
//                    MyHelperClass properties = new MyHelperClass();
                    SSLSocketFactory factory = (SSLSocketFactory)(SSLSocketFactory)(Object) properties.get("SSLSocketFactory");
//                    MyHelperClass properties = new MyHelperClass();
                    X509TrustManager tm = (X509TrustManager)(X509TrustManager)(Object) properties.get("X509TrustManager");
//                    MyHelperClass properties = new MyHelperClass();
                    HostnameVerifier verifier = (HostnameVerifier)(HostnameVerifier)(Object) properties.get("HostnameVerifier");
//                    MyHelperClass properties = new MyHelperClass();
                    X509KeyManager km = (X509KeyManager)(X509KeyManager)(Object) properties.get("X509KeyManager");
                    if (factory == null && (km != null || tm != null)) {
                        X509KeyManager[] keys = null;
                        X509TrustManager[] trusts = null;
                        MyHelperClass SSLContext = new MyHelperClass();
                        SSLContext sc =(SSLContext)(Object) SSLContext.getInstance("SSL");
                        if (km != null) {
                            keys = new X509KeyManager[1];
                            keys[0] = km;
                        }
                        if (tm != null) {
                            trusts = new X509TrustManager[1];
                            trusts[0] = tm;
                        }
                        sc.init(keys, trusts, null);
                        factory =(SSLSocketFactory)(Object) sc.getSocketFactory();
//                        MyHelperClass properties = new MyHelperClass();
                        properties.put("SSLSocketFactory", factory);
                    }
                    if (factory != null) sslConn.setSSLSocketFactory(factory);
                    if (verifier != null) sslConn.setHostnameVerifier(verifier);
                }
//                MyHelperClass properties = new MyHelperClass();
                Object auth = properties.get("AuthScheme");
                if (auth != null && auth.equals("kerberos")) {
                    Oid spnegoMecOid = new Oid("1.3.6.1.5.5.2");
                    GSSManager manager =(GSSManager)(Object) org.ietf.jgss.GSSManager.getInstance();
                    String spnName = "HTTP/" + url.getHost();
                    int spnPort = url.getPort();
                    if (spnPort == 16992 || spnPort == 16993 || spnPort == 623 || spnPort == 624) {
                        spnName = spnName + ":" + Integer.toString(spnPort);
                    }
                    GSSName gssName =(GSSName)(Object) manager.createName(spnName, null);
                    MyHelperClass GSSCredential = new MyHelperClass();
                    GSSContext context =(GSSContext)(Object) manager.createContext(gssName, spnegoMecOid, null, GSSCredential.DEFAULT_LIFETIME);
                    context.requestCredDeleg(true);
                    byte[] token = new byte[0];
                    token =(byte[])(Object) context.initSecContext(token, 0, token.length);
                    MyHelperClass WsmanUtils = new MyHelperClass();
                    String tokenStr =(String)(Object) WsmanUtils.getBase64String(token);
                    conn.addRequestProperty("Authorization", "Negotiate " + tokenStr);
                } else if (auth != null && auth.equals("basic")) {
                    java.net.Authenticator.requestPasswordAuthentication(url.getHost(), null, url.getPort(), url.getProtocol(), "", "basic");
                    String tokenStr = "";
                    conn.addRequestProperty("Authorization", "Basic " + tokenStr);
                }
                conn.setRequestMethod("POST");
                conn.addRequestProperty("Content-Type", "application/soap+xml;charset=UTF-8");
                conn.setDoOutput(true);
                if (printDebug) System.out.println(getXmlLoader().formatDocument(request));
                getXmlLoader().saveDocument(request, conn.getOutputStream());
                InputStream s = conn.getInputStream();
                response =(Document)(Object) getXmlLoader().loadDocument(s);
                if (printDebug) {
                    System.out.println(getXmlLoader().formatDocument(response));
                }
                conn.getResponseCode();
                retry = 0;
                conn.disconnect();
                conn = null;
            } catch (IOException ioException) {
                retry--;
                int max = conn.getHeaderFields().size();
                for (int i = 0; i < max; i++) {
                    String t = conn.getHeaderField(i);
                    t.toString();
                }
                conn.getRequestProperty("Authorization");
                conn.getHeaderField("Authorization");
                Object errObj = getResponse(conn);
                if (errObj != null && errObj instanceof Document) {
                    response = (Document) errObj;
                    retry = 0;
                    throw new WsmanException(this, response);
                } else if (errObj != null) throw new WsmanException((String)(Object)ioException);
                if (retry == 0) throw new WsmanException((String)(Object)ioException);
            } catch (Exception exception) {
                retry = 0;
                throw new WsmanException((String)(Object)exception);
            }
        }
        return response;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DEFAULT_LIFETIME;
public MyHelperClass saveDocument(Document o0, OutputStream o1){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass put(String o0, SSLSocketFactory o1){ return null; }
	public MyHelperClass formatDocument(Document o0){ return null; }
	public MyHelperClass loadDocument(InputStream o0){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass getBase64String(byte[] o0){ return null; }}

class Document {

}

class WsmanException extends Exception{
	public WsmanException(String errorMessage) { super(errorMessage); }
	WsmanException(c10231476 o0, Document o1){}
	WsmanException(){}
}

class HttpsURLConnection {

public MyHelperClass setHostnameVerifier(HostnameVerifier o0){ return null; }
	public MyHelperClass setSSLSocketFactory(SSLSocketFactory o0){ return null; }}

class SSLSocketFactory {

}

class X509TrustManager {

}

class HostnameVerifier {

}

class X509KeyManager {

}

class SSLContext {

public MyHelperClass getSocketFactory(){ return null; }
	public MyHelperClass init(X509KeyManager[] o0, X509TrustManager[] o1, Object o2){ return null; }}

class Oid {

Oid(String o0){}
	Oid(){}}

class GSSManager {

public MyHelperClass createContext(GSSName o0, Oid o1, Object o2, MyHelperClass o3){ return null; }
	public MyHelperClass createName(String o0, Object o1){ return null; }}

class GSSName {

}

class GSSContext {

public MyHelperClass requestCredDeleg(boolean o0){ return null; }
	public MyHelperClass initSecContext(byte[] o0, int o1, int o2){ return null; }}
