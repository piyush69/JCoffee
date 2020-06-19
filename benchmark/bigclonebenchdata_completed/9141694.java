


class c9141694 {

    public static String calcHA1(String algorithm, String username, String realm, String password, String nonce, String cnonce) throws FatalException, MD5DigestException {
        MD5Encoder encoder = new MD5Encoder();
        MessageDigest md5 = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            throw new FatalException((String)(Object)e);
        }
        if (username == null || realm == null) {
            MyHelperClass WebdavStatus = new MyHelperClass();
            throw new MD5DigestException(WebdavStatus.SC_BAD_REQUEST, "username or realm");
        }
        if (password == null) {
            System.err.println("No password has been provided");
            throw new IllegalStateException();
        }
        if (algorithm != null && algorithm.equals("MD5-sess") && (nonce == null || cnonce == null)) {
            MyHelperClass WebdavStatus = new MyHelperClass();
            throw new MD5DigestException(WebdavStatus.SC_BAD_REQUEST, "nonce or cnonce");
        }
        md5.update((username + ":" + realm + ":" + password).getBytes());
        if (algorithm != null && algorithm.equals("MD5-sess")) {
            md5.update((":" + nonce + ":" + cnonce).getBytes());
        }
        return(String)(Object) encoder.encode(md5.digest());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_BAD_REQUEST;
public MyHelperClass getInstance(String o0){ return null; }}

class FatalException extends Exception{
	public FatalException(String errorMessage) { super(errorMessage); }
}

class MD5DigestException extends Exception{
	public MD5DigestException(String errorMessage) { super(errorMessage); }
	MD5DigestException(){}
	MD5DigestException(MyHelperClass o0, String o1){}
}

class MD5Encoder {

public MyHelperClass encode(MyHelperClass o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
