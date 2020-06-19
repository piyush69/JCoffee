


class c7044685 {

    static String encrypt(String plaintext) {
        MessageDigest d = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            d =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            d.update(plaintext.getBytes("UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        MyHelperClass Base64 = new MyHelperClass();
        return new String((String)(Object)Base64.encodeBase64(d.digest()));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass encodeBase64(MyHelperClass o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
