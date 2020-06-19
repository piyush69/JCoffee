import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c17514598 {
public MyHelperClass sendAndWait(Request o0){ return null; }
	public MyHelperClass setLoginMessage(MyHelperClass o0){ return null; }
	public MyHelperClass setID(MyHelperClass o0){ return null; }
public MyHelperClass getLoginData(){ return null; }

    private void doLogin(String password) throws LoginFailedException, IncorrectPasswordException {
        MyHelperClass Constants = new MyHelperClass();
        final long mgr =(long)(Object) Constants.MANAGER;
        Data data, response;
        try {
            response =(Data)(Object) sendAndWait(new Request(mgr)).get(0);
            MessageDigest md;
            try {
                md = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException("MD5 hash not supported.");
            }
            byte[] challenge =(byte[])(Object) response.getBytes();
            md.update(challenge);
            MyHelperClass Data = new MyHelperClass();
            md.update(password.getBytes((String)(Object)Data.STRING_ENCODING));
//            MyHelperClass Data = new MyHelperClass();
            data =(Data)(Object) Data.valueOf(md.digest());
            try {
                response =(Data)(Object) sendAndWait((Request)(Object)new Request(mgr).add(0, data)).get(0);
            } catch (UncheckedIOException ex) {
                throw new IncorrectPasswordException();
            }
            setLoginMessage(response.getString());
            response =(Data)(Object) sendAndWait((Request)(Object)new Request(mgr).add(0, getLoginData())).get(0);
            setID(response.getWord());
        } catch (UncheckedIOException ex) {
            throw new LoginFailedException((String)(Object)ex);
        } catch (ArithmeticException ex) {
            throw new LoginFailedException((String)(Object)ex);
        } catch (IOException ex) {
            throw new LoginFailedException((String)(Object)ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass MANAGER;
	public MyHelperClass STRING_ENCODING;
public MyHelperClass valueOf(byte[] o0){ return null; }
	public MyHelperClass get(int o0){ return null; }}

class LoginFailedException extends Exception{
	public LoginFailedException(String errorMessage) { super(errorMessage); }
}

class IncorrectPasswordException extends Exception{
	public IncorrectPasswordException(String errorMessage) { super(errorMessage); }
	IncorrectPasswordException(){}
}

class Data {

public MyHelperClass getWord(){ return null; }
	public MyHelperClass getBytes(){ return null; }
	public MyHelperClass getString(){ return null; }}

class Request {

Request(){}
	Request(long o0){}
	public MyHelperClass add(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass add(int o0, Data o1){ return null; }}

class ExecutionException extends Exception{
	public ExecutionException(String errorMessage) { super(errorMessage); }
}
