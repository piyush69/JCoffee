


class c20325581 {

    public static byte[] generateHash(String strPassword, byte[] salt) {
        try {
            MyHelperClass HASH_ALGORITHM = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance(HASH_ALGORITHM);
            MyHelperClass CHAR_ENCODING = new MyHelperClass();
            md.update(strPassword.getBytes((String)(Object)CHAR_ENCODING));
            md.update(salt);
            return(byte[])(Object) md.digest();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class MessageDigest {

public static MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
