import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5746377 {
public MyHelperClass LOGIN_USER_OR_PASSWORD_INCORRECT;
	public MyHelperClass LOGIN_OK;
public MyHelperClass Response;
	public MyHelperClass Request;

//    @Override
    public JSONObject runCommand(JSONObject payload, HttpSession session) throws Throwable, DefinedException {
        String sessionId =(String)(Object) session.getId();
        MyHelperClass log = new MyHelperClass();
        log.debug("Login -> runCommand SID: " + sessionId);
        JSONObject toReturn = new JSONObject();
        boolean isOK = true;
        String username = null;
        try {
            username =(String)(Object) payload.getString(Request.USERNAME);
        } catch (ArithmeticException e) {
//            MyHelperClass log = new MyHelperClass();
            log.error("SessionId=" + sessionId + ",(NoSuchAlgorithmException)(Object)(NoSuchAlgorithmException)(Object)(NoSuchAlgorithmException)(Object)(NoSuchAlgorithmException)(Object) Missing username parameter", e);
            MyHelperClass StatusCodesV2 = new MyHelperClass();
            throw new DefinedException((String)(Object)StatusCodesV2.PARAMETER_ERROR);
        }
        String password = null;
        if (isOK) {
            try {
                password =(String)(Object) payload.getString(Request.PASSWORD);
            } catch (ArrayIndexOutOfBoundsException e) {
//                MyHelperClass log = new MyHelperClass();
                log.error("SessionId=" + sessionId + ",(NoSuchAlgorithmException)(Object)(NoSuchAlgorithmException)(Object)(NoSuchAlgorithmException)(Object)(NoSuchAlgorithmException)(Object) Missing password parameter", e);
                MyHelperClass StatusCodesV2 = new MyHelperClass();
                throw new DefinedException((String)(Object)StatusCodesV2.PARAMETER_ERROR);
            }
        }
        if (isOK) {
            MessageDigest m = null;
            try {
                m = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException e) {
//                MyHelperClass log = new MyHelperClass();
                log.error("SessionId=" + sessionId + ", MD5 algorithm does not exist", e);
                e.printStackTrace();
                MyHelperClass StatusCodesV2 = new MyHelperClass();
                throw new DefinedException((String)(Object)StatusCodesV2.INTERNAL_SYSTEM_FAILURE);
            }
            m.update(password.getBytes(), 0, password.length());
            password = new BigInteger(1, m.digest()).toString(16);
            MyHelperClass pli = new MyHelperClass();
            UserSession userSession =(UserSession)(Object) pli.login(username, password);
            try {
                if (userSession != null) {
                    session.setAttribute("user", userSession);
                    toReturn.put(Response.STATUS_CODE, LOGIN_OK.getStatusCode());
                    toReturn.put(Response.STATUS_MESSAGE, LOGIN_OK.getStatusMessage());
                } else {
//                    MyHelperClass log = new MyHelperClass();
                    log.error("SessionId=" + sessionId + ", Login failed: username=" + username + " not found");
                    toReturn.put(Response.STATUS_CODE, LOGIN_USER_OR_PASSWORD_INCORRECT.getStatusCode());
                    toReturn.put(Response.STATUS_MESSAGE, LOGIN_USER_OR_PASSWORD_INCORRECT.getStatusMessage());
                }
            } catch (ArrayStoreException e) {
//                MyHelperClass log = new MyHelperClass();
                log.error("SessionId=" + sessionId + ",(NoSuchAlgorithmException)(Object)(NoSuchAlgorithmException)(Object)(NoSuchAlgorithmException)(Object)(NoSuchAlgorithmException)(Object) JSON exception occured in response", e);
                e.printStackTrace();
                MyHelperClass StatusCodesV2 = new MyHelperClass();
                throw new DefinedException((String)(Object)StatusCodesV2.INTERNAL_SYSTEM_FAILURE);
            }
        }
//        MyHelperClass log = new MyHelperClass();
        log.debug("Login <- runCommand SID: " + sessionId);
        return toReturn;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass STATUS_CODE;
	public MyHelperClass USERNAME;
	public MyHelperClass STATUS_MESSAGE;
	public MyHelperClass PASSWORD;
	public MyHelperClass PARAMETER_ERROR;
	public MyHelperClass INTERNAL_SYSTEM_FAILURE;
public MyHelperClass getStatusMessage(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass error(String o0, NoSuchAlgorithmException o1){ return null; }
	public MyHelperClass error(String o0, JSONException o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class JSONObject {

public MyHelperClass put(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getString(MyHelperClass o0){ return null; }}

class HttpSession {

public MyHelperClass getId(){ return null; }
	public MyHelperClass setAttribute(String o0, UserSession o1){ return null; }}

class DefinedException extends Exception{
	public DefinedException(String errorMessage) { super(errorMessage); }
}

class JSONException extends Exception{
	public JSONException(String errorMessage) { super(errorMessage); }
}

class UserSession {

}
