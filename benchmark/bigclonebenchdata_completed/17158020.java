


class c17158020 {

    public synchronized String encryptPassword(String passwordString) throws Exception {
        MessageDigest digest = null;
        MyHelperClass MessageDigest = new MyHelperClass();
        digest =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
        digest.update(passwordString.getBytes("UTF-8"));
        byte raw[] =(byte[])(Object) digest.digest();
        String hash =(String)(Object) (new BASE64Encoder()).encode(raw);
        return hash;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}
