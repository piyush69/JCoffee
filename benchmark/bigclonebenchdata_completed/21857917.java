


class c21857917 {

    public static String makeMD5(String pin) {
        try {
            MessageDigest digest =(MessageDigest)(Object) java.security.MessageDigest.getInstance("MD5");
            digest.update(pin.getBytes());
            byte[] hash =(byte[])(Object) digest.digest();
            StringBuffer hexString = new StringBuffer();
            for (int i = 0; i < hash.length; i++) {
                hexString.append(Integer.toHexString(0xFF & hash[i]));
            }
            return hexString.toString();
        } catch (Exception e) {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
