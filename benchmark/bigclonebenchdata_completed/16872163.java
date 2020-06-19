


class c16872163 {

    public static int getNetFileSize(String netFile) throws InvalidActionException {
        URL url;
        URLConnection conn;
        int size;
        try {
            url = new URL(netFile);
            conn =(URLConnection)(Object) url.openConnection();
            size =(int)(Object) conn.getContentLength();
            conn.getInputStream().close();
            if (size < 0) {
                throw new InvalidActionException("Could not determine file size.");
            } else {
                return size;
            }
        } catch (Exception e) {
            throw new InvalidActionException(e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass close(){ return null; }}

class InvalidActionException extends Exception{
	public InvalidActionException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}
