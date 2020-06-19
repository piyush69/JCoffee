


class c9945506 {

    public synchronized String decrypt(String plaintext) throws Exception {
        MessageDigest md = null;
        String strhash = new String((String)(Object)(new BASE64Decoder()).decodeBuffer(plaintext));
        System.out.println("strhash1122  " + strhash);
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            e.printStackTrace();
        }
        byte raw[] =(byte[])(Object) md.digest();
        try {
            md.update(new String(raw).getBytes("UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("plain text  " + strhash);
        String strcode = new String(raw);
        System.out.println("strcode.." + strcode);
        return strcode;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class BASE64Decoder {

public MyHelperClass decodeBuffer(String o0){ return null; }}
