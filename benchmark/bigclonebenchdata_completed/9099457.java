


class c9099457 {

    public static String hash(String value) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            byte[] md5hash = new byte[32];
            md.update(value.getBytes("iso-8859-1"), 0, value.length());
            md5hash =(byte[])(Object) md.digest();
            MyHelperClass Hex = new MyHelperClass();
            return(String)(Object) Hex.encodeHexString(md5hash);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass encodeHexString(byte[] o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }}
