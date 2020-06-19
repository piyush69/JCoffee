


class c9895196 {

    public static String md5(String plain) {
        MessageDigest md5 = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            MyHelperClass PApplet = new MyHelperClass();
            PApplet.println("[ERROR]: md5()   " + e);
            return "";
        }
        md5.reset();
        md5.update(plain.getBytes());
        byte[] result =(byte[])(Object) md5.digest();
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < result.length; i += 1) {
            hexString.append(Integer.toHexString(0xFF & result[i]));
        }
        return hexString.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass println(String o0){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
