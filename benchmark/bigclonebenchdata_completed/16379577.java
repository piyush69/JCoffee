


class c16379577 {
public MyHelperClass toEncodedString(Properties o0){ return null; }
	public MyHelperClass sendHeaders(URLConnection o0){ return null; }

    public InputStream sendGetMessage(Properties args) throws IOException {
        String argString = "";
        if (args != null) {
            argString = "?" + toEncodedString(args);
        }
        MyHelperClass servlet = new MyHelperClass();
        URL url = new URL(servlet.toExternalForm() + argString);
        URLConnection con =(URLConnection)(Object) url.openConnection();
        con.setUseCaches(false);
        sendHeaders(con);
        return(InputStream)(Object) con.getInputStream();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass toExternalForm(){ return null; }}

class Properties {

}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}
