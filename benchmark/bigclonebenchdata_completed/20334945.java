
import java.io.UncheckedIOException;


class c20334945 {

    public static String doGet(String http_url, String get_data) {
        URL url;
        try {
            if ((get_data != "") && (get_data != null)) {
                url = new URL(http_url + "?" + get_data);
            } else {
                url = new URL(http_url);
            }
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            InputStream stream =(InputStream)(Object) new BufferedInputStream(conn.getInputStream());
            try {
                StringBuffer b = new StringBuffer();
                int ch;
                while ((ch =(int)(Object) stream.read()) != -1) b.append((char) ch);
                return b.toString();
            } finally {
                stream.close();
            }
        } catch (UncheckedIOException e) {
            ;
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
