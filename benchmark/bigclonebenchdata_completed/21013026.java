


class c21013026 {

    private InputStream getPageStream(String query) throws MalformedURLException, IOException {
        MyHelperClass baseUrl = new MyHelperClass();
        URL url = new URL(baseUrl + query + "&rhtml=no");
        URLConnection connection =(URLConnection)(Object) url.openConnection();
        connection.connect();
        InputStream in =(InputStream)(Object) connection.getInputStream();
        BufferedInputStream bis = new BufferedInputStream(in);
        return (InputStream)(Object)bis;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InputStream {

}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class BufferedInputStream {

BufferedInputStream(InputStream o0){}
	BufferedInputStream(){}}
