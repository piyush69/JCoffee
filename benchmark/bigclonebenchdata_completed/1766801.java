
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1766801 {
public MyHelperClass URLEncoder;
	public MyHelperClass handleException(MalformedURLException o0){ return null; }
	public MyHelperClass handleException(IOException o0){ return null; }

    public void update() {
        MyHelperClass Authenticator = new MyHelperClass();
        Authenticator.setDefault(new MyAuthenticator());
        URL url = null;
        try {
            url = new URL("http://trade.gigabass.de/update/update.php");
        } catch (UncheckedIOException e) {
            handleException((MalformedURLException)(Object)e);
            return;
        }
        URLConnection conn;
        try {
            conn =(URLConnection)(Object) url.openConnection();
        } catch (UncheckedIOException e) {
            handleException((MalformedURLException)(Object)e);
            return;
        }
        conn.setDoOutput(true);
        OutputStreamWriter wr = null;
        try {
            wr = new OutputStreamWriter(conn.getOutputStream());
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        try {
            MyHelperClass sql = new MyHelperClass();
            wr.write("sql=" + URLEncoder.encode(sql, "UTF-8") + "\n");
            wr.flush();
        } catch (UncheckedIOException e) {
            handleException((MalformedURLException)(Object)e);
        }
        BufferedReader rd = null;
        try {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line =(String)(Object) rd.readLine()) != null) {
            }
        } catch (UncheckedIOException e) {
            handleException((MalformedURLException)(Object)e);
        }
        try {
            wr.close();
        } catch (UncheckedIOException e) {
            handleException((MalformedURLException)(Object)e);
        }
        try {
            rd.close();
        } catch (UncheckedIOException e) {
            handleException((MalformedURLException)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setDefault(MyAuthenticator o0){ return null; }
	public MyHelperClass encode(MyHelperClass o0, String o1){ return null; }}

class MyAuthenticator {

}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0){}
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class BufferedReader {

BufferedReader(InputStreamReader o0){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}
