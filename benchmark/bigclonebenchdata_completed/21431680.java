
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c21431680 {

    public static Vector getVectorForm(String u, String usr, String pwd) {
        Vector response = new Vector();
        MyHelperClass logger = new MyHelperClass();
        logger.debug("Attempting to call: " + u);
//        MyHelperClass logger = new MyHelperClass();
        logger.debug("Creating Authenticator: usr=" + usr + ", pwd=" + pwd);
        MyHelperClass Authenticator = new MyHelperClass();
        Authenticator.setDefault(new CustomAuthenticator(usr, pwd));
        try {
            URL url = new URL(u);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String str;
            while ((str =(String)(Object) in.readLine()) != null) {
                response.add(str);
            }
            in.close();
//            MyHelperClass logger = new MyHelperClass();
            logger.debug("Response: " + response.toString());
        } catch (UncheckedIOException e) {
//            MyHelperClass logger = new MyHelperClass();
            logger.error((IOException)(Object)e);
//            MyHelperClass logger = new MyHelperClass();
            logger.trace((IOException)(Object)e,(IOException)(Object) e);
        } catch (ArithmeticException e) {
//            MyHelperClass logger = new MyHelperClass();
            logger.error((IOException)(Object)e);
//            MyHelperClass logger = new MyHelperClass();
            logger.trace((IOException)(Object)e,(IOException)(Object) e);
        }
        return response;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setDefault(CustomAuthenticator o0){ return null; }
	public MyHelperClass error(IOException o0){ return null; }
	public MyHelperClass error(MalformedURLException o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass trace(IOException o0, IOException o1){ return null; }
	public MyHelperClass trace(MalformedURLException o0, MalformedURLException o1){ return null; }}

class Vector {

public MyHelperClass add(String o0){ return null; }}

class CustomAuthenticator {

CustomAuthenticator(){}
	CustomAuthenticator(String o0, String o1){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
