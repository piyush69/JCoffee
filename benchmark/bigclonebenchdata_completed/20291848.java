
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20291848 {
public MyHelperClass TimeZone;

            public void run() {
                MyHelperClass shouldLogin = new MyHelperClass();
                if (!(Boolean)(Object)shouldLogin) {
                    MyHelperClass u = new MyHelperClass();
                    u.p("skipping the auto-login");
                    return;
                }
                try {
                    MyHelperClass u = new MyHelperClass();
                    u.p("logging in to the server");
                    MyHelperClass URLEncoder = new MyHelperClass();
                    String query = "hostname=blahfoo2.com" + "&osname=" + URLEncoder.encode(System.getProperty("os.name"), "UTF-8") + "&javaver=" + URLEncoder.encode(System.getProperty("java.runtime.version"), "UTF-8") + "&timezone=" + URLEncoder.encode((String)(Object)TimeZone.getDefault().getID(), "UTF-8");
//                    MyHelperClass u = new MyHelperClass();
                    u.p("unencoded query: \n" + query);
                    String login_url = "http://joshy.org:8088/org.glossitopeTracker/login.jsp?";
                    String url = login_url + query;
//                    MyHelperClass u = new MyHelperClass();
                    u.p("final encoded url = \n" + url);
                    InputStream in =(InputStream)(Object) (new URL(url).openStream());
                    byte[] buf = new byte[256];
                    while (true) {
                        int n =(int)(Object) in.read(buf);
                        if (n == -1) break;
                        for (int i = 0; i < n; i++) {
                        }
                    }
                } catch (UncheckedIOException ex) {
                    ex.printStackTrace();
                } catch (ArithmeticException ex) {
                    ex.printStackTrace();
                }
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(String o0, String o1){ return null; }
	public MyHelperClass getID(){ return null; }
	public MyHelperClass p(String o0){ return null; }
	public MyHelperClass getDefault(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
