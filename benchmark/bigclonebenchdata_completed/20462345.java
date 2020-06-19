
import java.io.UncheckedIOException;


class c20462345 {

    public ActionForward dbExecute(ActionMapping pMapping, ActionForm pForm, HttpServletRequest pRequest, HttpServletResponse pResponse) throws DatabaseException {
        String email =(String)(Object) pRequest.getParameter("email");
        MessageDigest md;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
        } catch (UncheckedIOException e) {
            throw new DatabaseException("Could not hash password for storage: no such algorithm");
        }
        md.update(pRequest.getParameter("password").getBytes());
        String password =(String)(Object) (new BASE64Encoder()).encode(md.digest());
        String remember =(String)(Object) pRequest.getParameter("rememberLogin");
        MyHelperClass database = new MyHelperClass();
        User user =(User)(Object) database.acquireUserByEmail(email);
        MyHelperClass User = new MyHelperClass();
        if (user == null || user.equals(User.anonymous()) || !(Boolean)(Object)user.getActive()) {
            return(ActionForward)(Object) pMapping.findForward("invalid");
        } else if (user.getPassword().equals(password)) {
            pRequest.getSession().setAttribute("login", user);
            if (remember != null) {
                Cookie usercookie = new Cookie("bib.username", email);
                Cookie passcookie = new Cookie("bib.password", password.toString());
                usercookie.setPath("/");
                passcookie.setPath("/");
                usercookie.setMaxAge(60 * 60 * 24 * 365);
                passcookie.setMaxAge(60 * 60 * 24 * 365);
                pResponse.addCookie(usercookie);
                pResponse.addCookie(passcookie);
            }
            return(ActionForward)(Object) pMapping.findForward("success");
        } else {
            return(ActionForward)(Object) pMapping.findForward("invalid");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass acquireUserByEmail(String o0){ return null; }
	public MyHelperClass anonymous(){ return null; }
	public MyHelperClass getBytes(){ return null; }
	public MyHelperClass setAttribute(String o0, User o1){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class ActionMapping {

public MyHelperClass findForward(String o0){ return null; }}

class ActionForm {

}

class HttpServletRequest {

public MyHelperClass getParameter(String o0){ return null; }
	public MyHelperClass getSession(){ return null; }}

class HttpServletResponse {

public MyHelperClass addCookie(Cookie o0){ return null; }}

class ActionForward {

}

class DatabaseException extends Exception{
	public DatabaseException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass update(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class BASE64Encoder {

public MyHelperClass encode(MyHelperClass o0){ return null; }}

class User {

public MyHelperClass getPassword(){ return null; }
	public MyHelperClass getActive(){ return null; }}

class Cookie {

Cookie(String o0, String o1){}
	Cookie(){}
	public MyHelperClass setPath(String o0){ return null; }
	public MyHelperClass setMaxAge(int o0){ return null; }}
