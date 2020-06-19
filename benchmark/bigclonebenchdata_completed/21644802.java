


class c21644802 {

    private URLConnection openGetConnection(StringBuffer sb) throws IOException, IOException, MalformedURLException {
        MyHelperClass m_gatewayAddress = new MyHelperClass();
        URL url = new URL(m_gatewayAddress + "?" + sb.toString());
        URLConnection connection =(URLConnection)(Object) url.openConnection();
        connection.setUseCaches(false);
        return connection;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URLConnection {

public MyHelperClass setUseCaches(boolean o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}
