


class c13683865 {

    public URL getResource(String path) throws MalformedURLException {
        if (!path.startsWith("/")) throw new MalformedURLException("Path '" + path + "' does not start with '/'");
        MyHelperClass myResourceBaseURL = new MyHelperClass();
        URL url = new URL(myResourceBaseURL, path.substring(1));
        InputStream is = null;
        try {
            is =(InputStream)(Object) url.openStream();
        } catch (Throwable t) {
            url = null;
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (Throwable t2) {
                }
            }
        }
        return url;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(){}
	URL(MyHelperClass o0, String o1){}
	public MyHelperClass openStream(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}
