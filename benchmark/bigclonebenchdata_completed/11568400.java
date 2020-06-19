


class c11568400 {
public MyHelperClass LOG;
	public MyHelperClass Level;

    private InputStream getInputStream(URI uri) throws IOException {
        MyHelperClass Logging = new MyHelperClass();
        if ((Boolean)(Object)Logging.SHOW_FINE && (Boolean)(Object)LOG.isLoggable(Level.FINE)) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.fine("Loading ACL : " + uri.toString());
        }
        URL url =(URL)(Object) uri.toURL();
        URLConnection connection =(URLConnection)(Object) url.openConnection();
        connection.setDoInput(true);
        return(InputStream)(Object) connection.getInputStream();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FINE;
	public MyHelperClass SHOW_FINE;
public MyHelperClass isLoggable(MyHelperClass o0){ return null; }
	public MyHelperClass fine(String o0){ return null; }}

class URI {

public MyHelperClass toURL(){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }}
