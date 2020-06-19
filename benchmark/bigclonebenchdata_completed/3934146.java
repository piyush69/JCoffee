


class c3934146 {

    public static String digest(String algorithm, String text) {
        MessageDigest mDigest = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            mDigest =(MessageDigest)(Object) MessageDigest.getInstance(algorithm);
            MyHelperClass ENCODING = new MyHelperClass();
            mDigest.update(text.getBytes((String)(Object)ENCODING));
        } catch (Exception e) {
            e.printStackTrace();
            mDigest = null;
        }
        if (mDigest == null) return null;
        byte[] raw =(byte[])(Object) mDigest.digest();
        BASE64Encoder encoder = new BASE64Encoder();
        return(String)(Object) encoder.encode(raw);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}
