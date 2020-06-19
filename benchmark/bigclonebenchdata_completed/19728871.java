


class c19728871 {
public static MyHelperClass toHexString(byte o0){ return null; }
//public MyHelperClass toHexString(byte o0){ return null; }

    public static String getEncodedPassword(String buff) {
        if (buff == null) return null;
        String t = new String();
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(buff.getBytes());
            byte[] r =(byte[])(Object) md.digest();
            for (int i = 0; i < r.length; i++) {
                t += toHexString(r[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
