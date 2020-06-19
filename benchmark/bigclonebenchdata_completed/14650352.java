
import java.io.UncheckedIOException;


class c14650352 {
public MyHelperClass URLEncoder;

    boolean checkIfUserExists(String username) throws IOException {
        try {
            MyHelperClass WS_URL = new MyHelperClass();
            URL url = new URL(WS_URL + "/user/" + URLEncoder.encode(username, "UTF-8") + "/profile.xml");
            HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            conn.connect();
            InputStream is =(InputStream)(Object) conn.getInputStream();
            is.close();
            return true;
        } catch (UncheckedIOException e) {
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(String o0, String o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}
