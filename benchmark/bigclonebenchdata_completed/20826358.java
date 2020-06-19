


class c20826358 {
public MyHelperClass Base64;
	public MyHelperClass concatenate(byte[] o0, byte[] o1){ return null; }
	public MyHelperClass fromHex(String o0){ return null; }

    public String generateDigest(String password, String saltHex, String algorithm) throws NoSuchAlgorithmException {
        if (algorithm.equalsIgnoreCase("crypt")) {
            MyHelperClass UnixCrypt = new MyHelperClass();
            return "{CRYPT}" + UnixCrypt.crypt(password);
        } else if (algorithm.equalsIgnoreCase("sha")) {
            algorithm = "SHA-1";
        } else if (algorithm.equalsIgnoreCase("md5")) {
            algorithm = "MD5";
        }
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest msgDigest =(MessageDigest)(Object) MessageDigest.getInstance(algorithm);
        byte[] salt = {};
        if (saltHex != null) {
            salt =(byte[])(Object) fromHex(saltHex);
        }
        String label = null;
        if (algorithm.startsWith("SHA")) {
            label = (salt.length > 0) ? "{SSHA}" : "{SHA}";
        } else if (algorithm.startsWith("MD5")) {
            label = (salt.length > 0) ? "{SMD5}" : "{MD5}";
        }
        msgDigest.reset();
        msgDigest.update(password.getBytes());
        msgDigest.update(salt);
        byte[] pwhash =(byte[])(Object) msgDigest.digest();
        StringBuffer digest = new StringBuffer(label);
        digest.append(Base64.encode(concatenate(pwhash, salt)));
        return digest.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass encode(MyHelperClass o0){ return null; }
	public MyHelperClass crypt(String o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
