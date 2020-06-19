


class c6506273 {

    public static byte[] hash(String plainTextValue) {
        MessageDigest msgDigest;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            msgDigest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            msgDigest.update(plainTextValue.getBytes("UTF-8"));
            byte[] digest =(byte[])(Object) msgDigest.digest();
            return digest;
        } catch (Exception e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
