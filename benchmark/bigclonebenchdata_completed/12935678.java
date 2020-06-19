


class c12935678 {
public static MyHelperClass convertToHex(byte[] o0){ return null; }
//public MyHelperClass convertToHex(byte[] o0){ return null; }

    private static String makeMD5(String str) {
        byte[] bytes = new byte[32];
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(str.getBytes("iso-8859-1"), 0, str.length());
            bytes =(byte[])(Object) md.digest();
        } catch (Exception e) {
            return null;
        }
        return(String)(Object) convertToHex(bytes);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }}
