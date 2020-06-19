


class c886783 {
public static MyHelperClass die(int o0, String o1){ return null; }
public static MyHelperClass copyStream(InputStream o0, OutputStream o1){ return null; }
	public static MyHelperClass doLookup(LNISoapServlet o0, String o1, Object o2){ return null; }
	public static MyHelperClass fixBasicAuth(URL o0, HttpURLConnection o1){ return null; }
//	public MyHelperClass die(int o0, String o1){ return null; }
//public MyHelperClass doLookup(LNISoapServlet o0, String o1, Object o2){ return null; }
//	public MyHelperClass copyStream(InputStream o0, OutputStream o1){ return null; }
//	public MyHelperClass fixBasicAuth(URL o0, HttpURLConnection o1){ return null; }

    private static void doGet(LNISoapServlet lni, String itemHandle, String packager, String output, String endpoint) throws java.rmi.RemoteException, ProtocolException, IOException, FileNotFoundException {
        String itemURI =(String)(Object) doLookup(lni, itemHandle, null);
        MyHelperClass LNIClientUtils = new MyHelperClass();
        URL url =(URL)(Object) LNIClientUtils.makeDAVURL(endpoint, itemURI, packager);
        System.err.println("DEBUG: GET from URL: " + url.toString());
        HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setDoInput(true);
        fixBasicAuth(url, conn);
        conn.connect();
        int status =(int)(Object) conn.getResponseCode();
        if (status < 200 || status >= 300) {
            die(status, "HTTP error, status=" + String.valueOf(status) + ", message=" + conn.getResponseMessage());
        }
        InputStream in =(InputStream)(Object) conn.getInputStream();
        OutputStream out =(OutputStream)(Object) new FileOutputStream(output);
        copyStream(in, out);
        in.close();
        out.close();
        System.err.println("DEBUG: Created local file " + output);
        System.err.println("RESULT: Status=" + String.valueOf(conn.getResponseCode()) + " " + conn.getResponseMessage());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass makeDAVURL(String o0, String o1, String o2){ return null; }}

class LNISoapServlet {

}

class ProtocolException extends Exception{
	public ProtocolException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass getResponseMessage(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(String o0){}}
