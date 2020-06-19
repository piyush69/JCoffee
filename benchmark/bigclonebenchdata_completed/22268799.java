


class c22268799 {
public MyHelperClass ContentUtil;
	public MyHelperClass Level;
	public MyHelperClass log;
	public MyHelperClass buildURL(String o0){ return null; }

//    @Override
    public void writeToContent(Object principal, String uniqueId, InputStream ins) throws IOException, ContentException {
        MyHelperClass writable = new MyHelperClass();
        if ((boolean)(Object)writable) {
            URL url =(URL)(Object) buildURL(uniqueId);
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            OutputStream outs =(OutputStream)(Object) connection.getOutputStream();
            try {
                ContentUtil.pipe(ins, outs);
            } finally {
                try {
                    outs.close();
                } catch (Exception ex) {
                    log.log(Level.WARNING, "unable to close " + url, ex);
                }
            }
        } else {
            throw new ContentException("not writable");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass WARNING;
public MyHelperClass pipe(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, Exception o2){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ContentException extends Exception{
	public ContentException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}
