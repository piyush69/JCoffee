


class c4531654 {

    public static byte[] md5raw(String data) {
        try {
            MyHelperClass MD = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance(MD);
            MyHelperClass UTF8 = new MyHelperClass();
            md.update(data.getBytes((String)(Object)UTF8));
            return(byte[])(Object) md.digest();
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
