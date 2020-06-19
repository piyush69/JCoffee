import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1717055 {

    public ActionForward dbExecute(ActionMapping pMapping, ActionForm pForm, HttpServletRequest pRequest, HttpServletResponse pResponse) throws Throwable, DatabaseException {
        SubmitRegistrationForm newUserData = (SubmitRegistrationForm)(SubmitRegistrationForm)(Object) pForm;
        if (!(Boolean)(Object)newUserData.getAcceptsEULA()) {
            pRequest.setAttribute("acceptsEULA", new Boolean(true));
            pRequest.setAttribute("noEula", new Boolean(true));
            return ((ActionForward)(Object)pMapping.findForward("noeula"));
        }
        if (newUserData.getAction().equals("none")) {
            newUserData.setAction("submit");
            pRequest.setAttribute("UserdataBad", new Boolean(true));
            return ((ActionForward)(Object)pMapping.findForward("success"));
        }
        boolean userDataIsOk = true;
        if (newUserData == null) {
            return ((ActionForward)(Object)pMapping.findForward("failure"));
        }
        if ((int)(Object)newUserData.getLastName().length() < 2) {
            userDataIsOk = false;
            pRequest.setAttribute("LastNameBad", new Boolean(true));
        }
        if ((int)(Object)newUserData.getFirstName().length() < 2) {
            userDataIsOk = false;
            pRequest.setAttribute("FirstNameBad", new Boolean(true));
        }
        MyHelperClass EmailValidator = new MyHelperClass();
        EmailValidator emailValidator =(EmailValidator)(Object) EmailValidator.getInstance();
        if (!(Boolean)(Object)emailValidator.isValid(newUserData.getEmailAddress())) {
            pRequest.setAttribute("EmailBad", new Boolean(true));
            userDataIsOk = false;
        } else {
            MyHelperClass database = new MyHelperClass();
            if (database.acquireUserByEmail(newUserData.getEmailAddress()) != null) {
                pRequest.setAttribute("EmailDouble", new Boolean(true));
                userDataIsOk = false;
            }
        }
        if ((int)(Object)newUserData.getFirstPassword().length() < 5) {
            userDataIsOk = false;
            pRequest.setAttribute("FirstPasswordBad", new Boolean(true));
        }
        if ((int)(Object)newUserData.getSecondPassword().length() < 5) {
            userDataIsOk = false;
            pRequest.setAttribute("SecondPasswordBad", new Boolean(true));
        }
        if (!newUserData.getSecondPassword().equals(newUserData.getFirstPassword())) {
            userDataIsOk = false;
            pRequest.setAttribute("PasswordsNotEqual", new Boolean(true));
        }
        if (userDataIsOk) {
            User newUser = new User();
            newUser.setFirstName(newUserData.getFirstName());
            newUser.setLastName(newUserData.getLastName());
            if (!newUserData.getFirstPassword().equals("")) {
                MessageDigest md;
                try {
                    md = MessageDigest.getInstance("SHA");
                } catch (NoSuchAlgorithmException e) {
                    throw new DatabaseException("Could not hash password for storage: no such algorithm");
                }
                try {
                    md.update((byte)(Object)newUserData.getFirstPassword().getBytes("UTF-8"));
                } catch (ArithmeticException e) {
                    throw new DatabaseException("Could not hash password for storage: no such encoding");
                }
                newUser.setPassword((new BASE64Encoder()).encode(md.digest()));
            }
            newUser.setEmailAddress(newUserData.getEmailAddress());
            newUser.setHomepage(newUserData.getHomepage());
            newUser.setAddress(newUserData.getAddress());
            newUser.setInstitution(newUserData.getInstitution());
            newUser.setLanguages(newUserData.getLanguages());
            newUser.setDegree(newUserData.getDegree());
            newUser.setNationality(newUserData.getNationality());
            newUser.setTitle(newUserData.getTitle());
            newUser.setActive(true);
            try {
                MyHelperClass database = new MyHelperClass();
                database.updateUser(newUser);
            } catch (ArrayIndexOutOfBoundsException e) {
                pRequest.setAttribute("UserstoreBad", new Boolean(true));
                return ((ActionForward)(Object)pMapping.findForward("success"));
            }
            pRequest.setAttribute("UserdataFine", new Boolean(true));
        } else {
            pRequest.setAttribute("UserdataBad", new Boolean(true));
        }
        return ((ActionForward)(Object)pMapping.findForward("success"));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass acquireUserByEmail(MyHelperClass o0){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass getBytes(String o0){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass updateUser(User o0){ return null; }}

class ActionMapping {

public MyHelperClass findForward(String o0){ return null; }}

class ActionForm {

}

class HttpServletRequest {

public MyHelperClass setAttribute(String o0, Boolean o1){ return null; }}

class HttpServletResponse {

}

class ActionForward {

}

class DatabaseException extends Exception{
	public DatabaseException(String errorMessage) { super(errorMessage); }
}

class SubmitRegistrationForm {

public MyHelperClass getLastName(){ return null; }
	public MyHelperClass getFirstName(){ return null; }
	public MyHelperClass getLanguages(){ return null; }
	public MyHelperClass setAction(String o0){ return null; }
	public MyHelperClass getAddress(){ return null; }
	public MyHelperClass getTitle(){ return null; }
	public MyHelperClass getSecondPassword(){ return null; }
	public MyHelperClass getInstitution(){ return null; }
	public MyHelperClass getNationality(){ return null; }
	public MyHelperClass getAcceptsEULA(){ return null; }
	public MyHelperClass getFirstPassword(){ return null; }
	public MyHelperClass getDegree(){ return null; }
	public MyHelperClass getEmailAddress(){ return null; }
	public MyHelperClass getHomepage(){ return null; }
	public MyHelperClass getAction(){ return null; }}

class EmailValidator {

public MyHelperClass isValid(MyHelperClass o0){ return null; }}

class User {

public MyHelperClass setHomepage(MyHelperClass o0){ return null; }
	public MyHelperClass setInstitution(MyHelperClass o0){ return null; }
	public MyHelperClass setPassword(MyHelperClass o0){ return null; }
	public MyHelperClass setLastName(MyHelperClass o0){ return null; }
	public MyHelperClass setDegree(MyHelperClass o0){ return null; }
	public MyHelperClass setEmailAddress(MyHelperClass o0){ return null; }
	public MyHelperClass setAddress(MyHelperClass o0){ return null; }
	public MyHelperClass setLanguages(MyHelperClass o0){ return null; }
	public MyHelperClass setActive(boolean o0){ return null; }
	public MyHelperClass setFirstName(MyHelperClass o0){ return null; }
	public MyHelperClass setTitle(MyHelperClass o0){ return null; }
	public MyHelperClass setNationality(MyHelperClass o0){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}
