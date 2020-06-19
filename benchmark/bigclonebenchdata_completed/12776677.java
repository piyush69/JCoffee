import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12776677 {
public MyHelperClass PortableRemoteObject;
	public MyHelperClass pageContext;
	public MyHelperClass hexDigit(byte o0){ return null; }

    private void checkLogin(String email, String password) throws Throwable, JspTagException {
        String cryptedPassword;
        try {
            MessageDigest crypt = MessageDigest.getInstance("MD5");
            crypt.update(password.getBytes());
            byte digest[] = crypt.digest();
            StringBuffer hexString = new StringBuffer();
            for (int i = 0; i < digest.length; i++) {
                hexString.append(hexDigit(digest[i]));
            }
            cryptedPassword = hexString.toString();
            crypt.reset();
            InitialContext context = new InitialContext();
            java.lang.Object homeRef = context.lookup("java:comp/env/ejb/Value");
            ValueHome valueHome = (ValueHome)(ValueHome)(Object) PortableRemoteObject.narrow(homeRef,(ValueHome)(Object) ValueHome.class);
            Value value =(Value)(Object) valueHome.findByPasswordCheck(email, cryptedPassword);
            pageContext.setAttribute("validLogin", new Boolean(true));
            HttpSession session =(HttpSession)(Object) pageContext.getSession();
            session.setAttribute("jspShop.userID", value.getObjectID());
        } catch (NoSuchAlgorithmException e) {
            System.err.println("jspShop: Could not get instance of MD5 algorithm. Please fix this!" + e.getMessage());
            e.printStackTrace();
            throw new JspTagException("Error crypting password!: " + e.getMessage());
        } catch (ArithmeticException e) {
            pageContext.setAttribute("validLogin", new Boolean(false));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("jspShop: Could not initialise context in LoginTag");
            e.printStackTrace();
        } catch (ArrayStoreException e) {
            System.err.println("jspShop: Could not connect to container in LoginTag");
        } catch (ClassCastException e) {
            System.err.println("jspShop: Error using finderQuery in LoginTag");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getSession(){ return null; }
	public MyHelperClass narrow(Object o0, ValueHome o1){ return null; }
	public MyHelperClass setAttribute(String o0, Boolean o1){ return null; }}

class JspTagException extends Exception{
	public JspTagException(String errorMessage) { super(errorMessage); }
}

class InitialContext {

public MyHelperClass lookup(String o0){ return null; }}

class ValueHome {

public MyHelperClass findByPasswordCheck(String o0, String o1){ return null; }}

class Value {

public MyHelperClass getObjectID(){ return null; }}

class HttpSession {

public MyHelperClass setAttribute(String o0, MyHelperClass o1){ return null; }}

class ObjectNotFoundException extends Exception{
	public ObjectNotFoundException(String errorMessage) { super(errorMessage); }
}

class NamingException extends Exception{
	public NamingException(String errorMessage) { super(errorMessage); }
}

class RemoteException extends Exception{
	public RemoteException(String errorMessage) { super(errorMessage); }
}

class FinderException extends Exception{
	public FinderException(String errorMessage) { super(errorMessage); }
}
