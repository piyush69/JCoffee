


class c13981689 {
public static MyHelperClass bytesArrayToHexString(MyHelperClass o0){ return null; }
//public MyHelperClass bytesArrayToHexString(MyHelperClass o0){ return null; }

    public static String md5Hash(String src) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(src.getBytes());
            return(String)(Object) bytesArrayToHexString(md.digest());
        } catch (Exception e) {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
