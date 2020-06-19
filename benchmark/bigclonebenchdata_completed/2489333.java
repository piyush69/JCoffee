


class c2489333 {

//    @Override
    public String encodePassword(final String password, final Object salt) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            digest.reset();
            digest.update(salt.toString().getBytes());
            byte[] passwordHash =(byte[])(Object) digest.digest(password.getBytes());
            Base64 encoder = new Base64();
            byte[] encoded =(byte[])(Object) encoder.encode(passwordHash);
            return new String(encoded);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(byte[] o0){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class Base64 {

public MyHelperClass encode(byte[] o0){ return null; }}
