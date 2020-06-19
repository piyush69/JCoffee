


class c5942289 {

    private byte[] digestPassword(byte[] salt, String password) throws AuthenticationException {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(salt);
            md.update(password.getBytes("UTF8"));
            return(byte[])(Object) md.digest();
        } catch (Exception e) {
            MyHelperClass MESSAGE_CONFIGURATION_ERROR_KEY = new MyHelperClass();
            throw new AuthenticationException(MESSAGE_CONFIGURATION_ERROR_KEY, e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class AuthenticationException extends Exception{
	public AuthenticationException(String errorMessage) { super(errorMessage); }
	AuthenticationException(){}
	AuthenticationException(MyHelperClass o0, Exception o1){}
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
