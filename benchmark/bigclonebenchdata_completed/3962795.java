


class c3962795 {
public static MyHelperClass toHex(byte[] o0){ return null; }
//public MyHelperClass toHex(byte[] o0){ return null; }

    public static String Sha1(String s) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            byte[] hash = new byte[40];
            md.update(s.getBytes("iso-8859-1"), 0, s.length());
            hash =(byte[])(Object) md.digest();
            return(String)(Object) toHex(hash);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }}
