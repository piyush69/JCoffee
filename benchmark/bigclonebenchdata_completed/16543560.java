
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c16543560 {
public MyHelperClass sqlManager;
	public MyHelperClass utils;
	public MyHelperClass session;

    public String login() {
        String authSuccess = "false";
        try {
            String errorMesg = "";
            int error;
            MyHelperClass passwd = new MyHelperClass();
            if ((error =(int)(Object) utils.stringIsNull(passwd)) != -1) {
                MyHelperClass rb = new MyHelperClass();
                errorMesg += rb.getString("passwdField") + ": " + utils.errors[error] + " ";
//            MyHelperClass passwd = new MyHelperClass();
            } else if ((error =(int)(Object) utils.stringIsEmpty(passwd)) != -1) {
                MyHelperClass rb = new MyHelperClass();
                errorMesg += rb.getString("passwdField") + ": " + utils.errors[error] + " ";
            }
            MyHelperClass login = new MyHelperClass();
            if ((error =(int)(Object) utils.stringIsNull(login)) != -1) {
                MyHelperClass rb = new MyHelperClass();
                errorMesg += rb.getString("loginField") + ": " + utils.errors[error] + " ";
//            MyHelperClass login = new MyHelperClass();
            } else if ((error =(int)(Object) utils.stringIsEmpty(login)) != -1) {
                MyHelperClass rb = new MyHelperClass();
                errorMesg += rb.getString("loginField") + ": " + utils.errors[error] + " ";
            }
            MyHelperClass conf = new MyHelperClass();
            String[] admins =(String[])(Object) conf.getProperty("admin").split("\\s");
            boolean admin = false;
            for (int i = 0; i < admins.length; i++) {
//                MyHelperClass login = new MyHelperClass();
                if (admins[i].equals(login)) {
                    admin = true;
                }
            }
            if (!admin) {
                MyHelperClass rb = new MyHelperClass();
                errorMesg += rb.getString("noAdmin");
                MyHelperClass session = new MyHelperClass();
                session.invalidate();
            } else {
//                MyHelperClass conf = new MyHelperClass();
                session.setAttribute("conf", conf);
            }
            if (errorMesg.length() > 0) {
                String status;// = new String();
                status = errorMesg;
//                MyHelperClass status = new MyHelperClass();
                System.out.println(status);
                MyHelperClass FacesContext = new MyHelperClass();
                FacesContext context =(FacesContext)(Object) FacesContext.getCurrentInstance();
                context.renderResponse();
            } else {
                MyHelperClass MessageDigest = new MyHelperClass();
                MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
                md5.reset();
//                MyHelperClass passwd = new MyHelperClass();
                md5.update(passwd.getBytes());
                byte[] result =(byte[])(Object) md5.digest();
                StringBuffer hexString = new StringBuffer();
                for (int i = 0; i < result.length; i++) {
                    String hex = Integer.toHexString(0xFF & result[i]);
                    if (hex.length() == 1) {
                        hexString.append('0');
                    }
                    hexString.append(hex);
                }
//                MyHelperClass login = new MyHelperClass();
                authSuccess = (sqlManager.getPassword(login).equals(hexString.toString())) ? "true" : "false";
                MyHelperClass session = new MyHelperClass();
                if (authSuccess.equals("false")) session.invalidate();
            }
        } catch (UncheckedIOException nsae) {
            MyHelperClass utils = new MyHelperClass();
            utils.catchExp((NoSuchAlgorithmException)(Object)nsae);
            MyHelperClass status = new MyHelperClass();
            status = utils.getStatus();
            MyHelperClass stacktrace = new MyHelperClass();
            if ((boolean)(Object)stacktrace) {
                MyHelperClass stackTrace = new MyHelperClass();
                stackTrace = utils.getStackTrace();
            }
            MyHelperClass FacesContext = new MyHelperClass();
            FacesContext.getCurrentInstance().renderResponse();
        } catch (ArithmeticException sqle) {
            MyHelperClass utils = new MyHelperClass();
            utils.catchExp((NoSuchAlgorithmException)(Object)sqle);
            MyHelperClass status = new MyHelperClass();
            status = utils.getStatus();
            MyHelperClass stacktrace = new MyHelperClass();
            if ((boolean)(Object)stacktrace) {
                MyHelperClass stackTrace = new MyHelperClass();
                stackTrace = utils.getStackTrace();
            }
            MyHelperClass FacesContext = new MyHelperClass();
            FacesContext.getCurrentInstance().renderResponse();
        }
        return authSuccess;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass[] errors;
public MyHelperClass getCurrentInstance(){ return null; }
	public MyHelperClass getPassword(MyHelperClass o0){ return null; }
	public MyHelperClass renderResponse(){ return null; }
	public MyHelperClass catchExp(NoSuchAlgorithmException o0){ return null; }
	public MyHelperClass getProperty(String o0){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass stringIsNull(MyHelperClass o0){ return null; }
	public MyHelperClass invalidate(){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass stringIsEmpty(MyHelperClass o0){ return null; }
	public MyHelperClass getBytes(){ return null; }
	public MyHelperClass getStackTrace(){ return null; }
	public MyHelperClass split(String o0){ return null; }
	public MyHelperClass catchExp(SQLException o0){ return null; }
	public MyHelperClass getStatus(){ return null; }
	public MyHelperClass setAttribute(String o0, MyHelperClass o1){ return null; }}

class FacesContext {

public MyHelperClass renderResponse(){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(MyHelperClass o0){ return null; }
	public MyHelperClass reset(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
