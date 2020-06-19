


class c16116214 {
public static MyHelperClass displayResult(Object o0, MyHelperClass o1){ return null; }
//public MyHelperClass displayResult(Object o0, MyHelperClass o1){ return null; }

    public static void processString(String text) throws Exception {
        MyHelperClass MD5_DIGEST = new MyHelperClass();
        MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance(MD5_DIGEST);
        md5.reset();
        md5.update(text.getBytes());
        displayResult(null, md5.digest());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass reset(){ return null; }
	public static MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
