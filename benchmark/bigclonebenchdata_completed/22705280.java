


class c22705280 {

    public static String encode(String str) {
        String md5Str = null;
        try {
            MessageDigest digest =(MessageDigest)(Object) java.security.MessageDigest.getInstance("MD5");
            digest.update(str.getBytes("UTF8"));
            byte[] hash =(byte[])(Object) digest.digest();
            md5Str = "";
            for (int i = 0; i < hash.length; i++) {
                md5Str += Integer.toHexString((0x000000ff & hash[i]) | 0xffffff00).substring(6);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return md5Str;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
