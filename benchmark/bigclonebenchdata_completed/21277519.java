


class c21277519 {

    public static String getMD5(String s) throws Exception {
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest complete =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        complete.update(s.getBytes());
        byte[] b =(byte[])(Object) complete.digest();
        String result = "";
        for (int i = 0; i < b.length; i++) {
            result += Integer.toString((b[i] & 0xff) + 0x100, 16).substring(1);
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
