


class c6535232 {

    public String encodePassword(String password, byte[] salt) throws Exception {
        if (salt == null) {
            salt = new byte[12];
            MyHelperClass secureRandom = new MyHelperClass();
            secureRandom.nextBytes(salt);
        }
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        md.update(salt);
        md.update(password.getBytes("UTF8"));
        byte[] digest =(byte[])(Object) md.digest();
        byte[] storedPassword = new byte[digest.length + 12];
        System.arraycopy(salt, 0, storedPassword, 0, 12);
        System.arraycopy(digest, 0, storedPassword, 12, digest.length);
        MyHelperClass Base64 = new MyHelperClass();
        return new String((String)(Object)Base64.encode(storedPassword));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass nextBytes(byte[] o0){ return null; }
	public MyHelperClass encode(byte[] o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
