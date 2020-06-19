


class c4056446 {
public MyHelperClass toHex(byte[] o0, int o1){ return null; }

        public final String hashRealmPassword(String username, String realm, String password) throws GeneralSecurityException {
            MessageDigest md = null;
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(username.getBytes());
            md.update(":".getBytes());
            md.update(realm.getBytes());
            md.update(":".getBytes());
            md.update(password.getBytes());
            byte[] hash =(byte[])(Object) md.digest();
            return(String)(Object) toHex(hash, hash.length);
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class GeneralSecurityException extends Exception{
	public GeneralSecurityException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
