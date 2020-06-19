


class c22281203 {
public static MyHelperClass toHexString(byte[] o0){ return null; }
//public MyHelperClass toHexString(byte[] o0){ return null; }

    public static final synchronized String md5(final String data) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            final MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(data.getBytes());
            final byte[] b =(byte[])(Object) md.digest();
            return(String)(Object) toHexString(b);
        } catch (final Exception e) {
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
