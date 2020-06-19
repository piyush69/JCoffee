


class c12493156 {
public static MyHelperClass logger;
//public MyHelperClass logger;

    public static String hashPassword(String plaintext) {
        if (plaintext == null) {
            return "";
        }
        MessageDigest md = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA1");
            md.update(plaintext.getBytes("UTF-8"));
        } catch (Exception e) {
            MyHelperClass Level = new MyHelperClass();
            logger.log(Level.SEVERE, "Problem hashing password.", e);
        }
        MyHelperClass Base64 = new MyHelperClass();
        return new String((String)(Object)Base64.encodeBase64(md.digest()));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, Exception o2){ return null; }
	public MyHelperClass encodeBase64(MyHelperClass o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
