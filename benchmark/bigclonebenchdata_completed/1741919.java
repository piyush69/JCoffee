


class c1741919 {

    public static String hash(String text) throws Exception {
        StringBuffer hexString;
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest mdAlgorithm =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        mdAlgorithm.update(text.getBytes());
        byte[] digest =(byte[])(Object) mdAlgorithm.digest();
        hexString = new StringBuffer();
        for (int i = 0; i < digest.length; i++) {
            text = Integer.toHexString(0xFF & digest[i]);
            if (text.length() < 2) {
                text = "0" + text;
            }
            hexString.append(text);
        }
        return hexString.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
