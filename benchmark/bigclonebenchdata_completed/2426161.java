


class c2426161 {
public MyHelperClass readInputStream(InputStream o0){ return null; }

    public void readURL(URL url) throws IOException, ParserConfigurationException, SAXException {
        URLConnection connection;
        MyHelperClass proxy = new MyHelperClass();
        if (proxy == null) {
            connection =(URLConnection)(Object) url.openConnection();
        } else {
//            MyHelperClass proxy = new MyHelperClass();
            connection =(URLConnection)(Object) url.openConnection(proxy);
        }
        MyHelperClass connectTimeout = new MyHelperClass();
        connection.setConnectTimeout(connectTimeout);
        MyHelperClass readTimeout = new MyHelperClass();
        connection.setReadTimeout(readTimeout);
        connection.connect();
        InputStream in =(InputStream)(Object) connection.getInputStream();
        readInputStream(in);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openConnection(MyHelperClass o0){ return null; }
	public MyHelperClass openConnection(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass setConnectTimeout(MyHelperClass o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass setReadTimeout(MyHelperClass o0){ return null; }}

class InputStream {

}
