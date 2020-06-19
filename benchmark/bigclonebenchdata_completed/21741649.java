


class c21741649 {

    private InputStream getInputStream() throws URISyntaxException, MalformedURLException, IOException {
        InputStream inStream = null;
        try {
            MyHelperClass wsdlFile = new MyHelperClass();
            URL url =(URL)(Object) (new URI(wsdlFile).toURL());
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            connection.connect();
            inStream =(InputStream)(Object) connection.getInputStream();
        } catch (IllegalArgumentException ex) {
            MyHelperClass wsdlFile = new MyHelperClass();
            inStream =(InputStream)(Object) new FileInputStream(wsdlFile);
        }
        return inStream;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InputStream {

}

class URISyntaxException extends Exception{
	public URISyntaxException(String errorMessage) { super(errorMessage); }
}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openConnection(){ return null; }}

class URI {

URI(){}
	URI(MyHelperClass o0){}
	public MyHelperClass toURL(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(MyHelperClass o0){}}
