


class c5621074 {

    public static void upper() throws Exception {
        TrustManager[] trustAllCerts = new TrustManager[] {(TrustManager)(Object) new X509TrustManager() {

            public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                return null;
            }

            public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType) {
            }

            public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType) {
            }
        } };
        MyHelperClass SSLContext = new MyHelperClass();
        SSLContext sc =(SSLContext)(Object) SSLContext.getInstance("SSL");
        sc.init(null, trustAllCerts,(SecureRandom)(Object) new java.security.SecureRandom());
        MyHelperClass HttpsURLConnection = new MyHelperClass();
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        HostnameVerifier hv = new HostnameVerifier() {

            public boolean verify(String urlHostName, SSLSession session) {
                System.out.println("Warning: URL Host: " + urlHostName + " vs. " + session.getPeerHost());
                return true;
            }
        };
//        MyHelperClass HttpsURLConnection = new MyHelperClass();
        HttpsURLConnection.setDefaultHostnameVerifier(hv);
        URL url = new URL("https://test.ctpe.net/payment/query");
        URLConnection conn =(URLConnection)(Object) url.openConnection();
        String data = "<Request version='1.0'> " + "<Header>  " + "  <Security sender='ff80808109c5bcc00109c5bce9f1003a'/>  " + "</Header>  " + "<Query entity='ff80808109c5bcc00109c5bce9f50056' level='CHANNEL' mode='INTEGRATOR_TEST'> " + "  <User login='ff80808109c5bcc00109c5bce9f20042' pwd='geheim'/>  " + "  <Period from='2006-03-04' to='2006-03-04'/>  " + "  <Types>  " + "    <Type code='RF'/> " + "    <Type code='PA'/>  " + "    <Type code='RV'/>  " + "  </Types>  " + "</Query>  " + "</Request>  ";
        conn.setDoOutput(true);
        OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
        wr.write("load=" + data);
        wr.flush();
        wr.close();
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        while ((line =(String)(Object) rd.readLine()) != null) {
            System.out.println(line);
        }
        rd.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setDefaultHostnameVerifier(HostnameVerifier o0){ return null; }
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

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(String o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class SSLSession {

public MyHelperClass getPeerHost(){ return null; }}

class SecureRandom {

}
