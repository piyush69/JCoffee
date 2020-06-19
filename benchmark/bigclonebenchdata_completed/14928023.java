


class c14928023 {
public MyHelperClass encodeHex(byte[] o0){ return null; }

    public String hash(String text) {
        try {
            MyHelperClass hashFunction = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance(hashFunction);
            MyHelperClass charset = new MyHelperClass();
            md.update(text.getBytes((String)(Object)charset));
            byte[] raw =(byte[])(Object) md.digest();
            return new String((String)(Object)encodeHex(raw));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class MessageDigest {

public static MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
