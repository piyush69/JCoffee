


class c10539421 {
public static MyHelperClass convertToHex(MyHelperClass o0){ return null; }
//public MyHelperClass convertToHex(MyHelperClass o0){ return null; }

    public static String sha1(String clearText, String seed) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            md.update((seed + clearText).getBytes());
            return(String)(Object) convertToHex(md.digest());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
