


class c10654982 {
public static MyHelperClass convertToString(MyHelperClass o0){ return null; }
//public MyHelperClass convertToString(MyHelperClass o0){ return null; }

    public static String getEncryptedPassword(String password) throws PasswordException {
        MessageDigest md = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
            md.update(password.getBytes("UTF-8"));
        } catch (Exception e) {
            throw new PasswordException((String)(Object)e);
        }
        return(String)(Object) convertToString(md.digest());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class PasswordException extends Exception{
	public PasswordException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
