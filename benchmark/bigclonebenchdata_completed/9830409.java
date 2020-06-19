
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c9830409 {

//    @Test
    public final void testCheckCookies() {
        URL url = null;
        try {
            url = new URL("http://localhost:8080");
        } catch (UncheckedIOException e1) {
            e1.printStackTrace();
        }
        StringBuffer content = new StringBuffer();
        try {
            HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            connection.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.5; Windows NT 5.0; H010818)");
            MyHelperClass cookie = new MyHelperClass();
            cookie = connection.getHeaderField("Set-Cookie");
//            MyHelperClass cookie = new MyHelperClass();
            if (cookie != null) System.out.println("cookie: " + cookie.toString());
            connection.setDoInput(true);
            InputStream is =(InputStream)(Object) connection.getInputStream();
            byte[] buffer = new byte[2048];
            int count;
            while (-1 != (count =(int)(Object) is.read(buffer))) {
                content.append(new String(buffer, 0, count));
            }
        } catch (UncheckedIOException e) {
            System.out.print(e.getMessage());
            return;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Test {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getHeaderField(String o0){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
