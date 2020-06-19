


class c17638226 {
public static MyHelperClass convertToHex(MyHelperClass o0){ return null; }
//public MyHelperClass convertToHex(MyHelperClass o0){ return null; }

    public static String hash(final String s) {
        if (s == null || s.length() == 0) return null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            final MessageDigest hashEngine =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            hashEngine.update(s.getBytes("iso-8859-1"), 0, s.length());
            return(String)(Object) convertToHex(hashEngine.digest());
        } catch (final Exception e) {
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
