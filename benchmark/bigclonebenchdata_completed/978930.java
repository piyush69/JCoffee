


class c978930 {
public static MyHelperClass toHex(MyHelperClass o0){ return null; }
//public MyHelperClass toHex(MyHelperClass o0){ return null; }

    public static String encode(String arg) {
        if (arg == null) {
            arg = "";
        }
        MessageDigest md5 = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            MyHelperClass JavaCenterHome = new MyHelperClass();
            md5.update(arg.getBytes((String)(Object)JavaCenterHome.JCH_CHARSET));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return(String)(Object) toHex(md5.digest());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass JCH_CHARSET;
public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
