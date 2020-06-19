import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c14423006 {
public MyHelperClass Logger;
	public MyHelperClass Level;
	public MyHelperClass url;
	public MyHelperClass conn;

    public void SessionManager(String username) {
        try {
            url =(MyHelperClass)(Object) new URL("http://" + username + ".bebo.com");
            conn = url.openConnection();
        } catch (UncheckedIOException ex) {
            Logger.getLogger(SessionManager.class.getName()).log(Level.SEVERE,(Object)(Object) null,(IOException)(Object) ex);
        } catch (ArithmeticException ex) {
            Logger.getLogger(SessionManager.class.getName()).log(Level.SEVERE,(Object)(Object) null,(IOException)(Object) ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, Object o1, IOException o2){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, MalformedURLException o2){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }
	public MyHelperClass openConnection(){ return null; }}

class URL {

URL(){}
	URL(String o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class SessionManager {

}
