


class c8200307 {

    public static String encryptPassword(String password) {
        String hash = null;
        try {
            MessageDigest md = null;
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
            md.update(password.getBytes("UTF-8"));
            byte raw[] =(byte[])(Object) md.digest();
            MyHelperClass Base64 = new MyHelperClass();
            hash =(String)(Object) Base64.encode(raw, false);
        } catch (Exception e) {
        }
        return hash;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass encode(byte[] o0, boolean o1){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
