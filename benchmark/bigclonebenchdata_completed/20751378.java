


class c20751378 {

    private String hashPassword(String password) throws NoSuchAlgorithmException {
        String hash = null;
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
        MyHelperClass log = new MyHelperClass();
        log.debug("secure hash on password " + password);
        md.update(password.getBytes());
        MyHelperClass Base64 = new MyHelperClass();
        hash = new String((String)(Object)Base64.encodeBase64(md.digest()));
//        MyHelperClass log = new MyHelperClass();
        log.debug("returning hash " + hash);
        return hash;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass encodeBase64(MyHelperClass o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
