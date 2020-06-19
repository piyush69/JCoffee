


class c2396214 {
public static MyHelperClass toHexString(MyHelperClass o0){ return null; }
//public MyHelperClass toHexString(MyHelperClass o0){ return null; }

    public static String toMD5Sum(String arg0) {
        String ret;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(arg0.getBytes());
            ret =(String)(Object) toHexString(md.digest());
        } catch (Exception e) {
            ret = arg0;
        }
        return ret;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
