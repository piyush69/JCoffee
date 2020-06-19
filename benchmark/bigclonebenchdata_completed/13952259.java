


class c13952259 {
public static MyHelperClass asHexString(MyHelperClass o0){ return null; }
//public MyHelperClass asHexString(MyHelperClass o0){ return null; }

    private static String getMD5(String phrase) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(phrase.getBytes());
            return(String)(Object) asHexString(md.digest());
        } catch (Exception e) {
        }
        return "";
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
