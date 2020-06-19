


class c4531653 {
public static MyHelperClass encodeHex(MyHelperClass o0){ return null; }
//public MyHelperClass encodeHex(MyHelperClass o0){ return null; }

    public static String md5(String data) {
        try {
            MyHelperClass MD = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance(MD);
            MyHelperClass UTF8 = new MyHelperClass();
            md.update(data.getBytes((String)(Object)UTF8));
            return(String)(Object) encodeHex(md.digest());
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
