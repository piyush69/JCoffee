


class c17292849 {
public static MyHelperClass toHexString(byte[] o0){ return null; }
//public MyHelperClass toHexString(byte[] o0){ return null; }

    public static String toHash(String pw) throws Exception {
        MyHelperClass MessageDigest = new MyHelperClass();
        final MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("md5");
        md5.update(pw.getBytes("utf-8"));
        final byte[] result =(byte[])(Object) md5.digest();
        return(String)(Object) toHexString(result);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
