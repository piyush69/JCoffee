


class c11751791 {

    private void connect(URL url) throws IOException {
        String protocol =(String)(Object) url.getProtocol();
        if (!protocol.equals("http")) throw new IllegalArgumentException("URL must use 'http:' protocol");
        int port =(int)(Object) url.getPort();
        if (port == -1) port = 80;
        MyHelperClass fileName = new MyHelperClass();
        fileName = url.getFile();
        HttpURLConnection conn;// = new HttpURLConnection();
        conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
//        MyHelperClass conn = new MyHelperClass();
        conn.setRequestMethod("POST");
//        MyHelperClass conn = new MyHelperClass();
        conn.setDoOutput(true);
//        MyHelperClass conn = new MyHelperClass();
        conn.setDoInput(true);
        OutputStreamWriter toServer;// = new OutputStreamWriter();
        toServer = new OutputStreamWriter(conn.getOutputStream());
        MyHelperClass fromServer = new MyHelperClass();
        fromServer = conn.getInputStream();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getProtocol(){ return null; }
	public MyHelperClass getFile(){ return null; }
	public MyHelperClass getPort(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0){}}
