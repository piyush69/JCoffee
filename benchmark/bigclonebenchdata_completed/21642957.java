


class c21642957 {

    public void connectUrl(String url) throws MalformedURLException, IOException {
        URLConnection connection =(URLConnection)(Object) (new URL(url).openConnection());
        connection.connect();
        connection.getInputStream().close();
        connection.getOutputStream().close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass close(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}
