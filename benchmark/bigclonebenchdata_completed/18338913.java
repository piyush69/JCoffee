


class c18338913 {

    public static String encodeMD5(String param) throws Exception {
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        digest.update(param.getBytes());
        byte[] hash =(byte[])(Object) digest.digest();
        char buf[] = new char[hash.length * 2];
        for (int i = 0, x = 0; i < hash.length; i++) {
MyHelperClass[] HEX_CHARS = new MyHelperClass[5];
            buf[x++] =(char)(Object) HEX_CHARS[(hash[i] >>> 4) & 0xf];
//            MyHelperClass HEX_CHARS = new MyHelperClass();
            buf[x++] =(char)(Object) HEX_CHARS[hash[i] & 0xf];
        }
        return String.valueOf(buf);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass[] HEX_CHARS;
public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
