


class c21644801 {

    private URLConnection openPostConnection(StringBuffer sb) throws IOException, IOException, MalformedURLException {
        MyHelperClass m_gatewayAddress = new MyHelperClass();
        URL url = new URL(m_gatewayAddress);
        URLConnection connection =(URLConnection)(Object) url.openConnection();
        connection.setDoOutput(true);
        connection.setUseCaches(false);
        OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());
        wr.write(sb.toString());
        wr.flush();
        wr.close();
        return connection;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(String o0){ return null; }}
