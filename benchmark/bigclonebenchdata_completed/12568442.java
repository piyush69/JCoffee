


class c12568442 {
public static MyHelperClass convertToHex(byte[] o0){ return null; }
//public MyHelperClass convertToHex(byte[] o0){ return null; }

    public static String MD5(String text) {
        byte[] md5hash = new byte[32];
        try {
            MessageDigest md;
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(text.getBytes("iso-8859-1"), 0, text.length());
            md5hash =(byte[])(Object) md.digest();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return(String)(Object) convertToHex(md5hash);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }}
