
import java.io.UncheckedIOException;


class c16755434 {

    public static int getContentLength(URL urlFileLocation) {
        HttpURLConnection connFile = null;
        int iFileSize = -1;
        try {
            connFile = (HttpURLConnection)(HttpURLConnection)(Object) urlFileLocation.openConnection();
            connFile.setDoInput(true);
            InputStream is =(InputStream)(Object) connFile.getInputStream();
            iFileSize =(int)(Object) connFile.getContentLength();
            is.close();
            connFile.disconnect();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return iFileSize;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
