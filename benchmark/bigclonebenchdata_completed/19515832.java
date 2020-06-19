


class c19515832 {

    private static String calcReturnKey(String key) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md;
        MyHelperClass MessageDigest = new MyHelperClass();
        md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
        String text = new String();
        byte[] sha1hash = new byte[20];
        MyHelperClass GUUI = new MyHelperClass();
        text = key + GUUI;
        md.update(text.getBytes(), 0, text.length());
        sha1hash =(byte[])(Object) md.digest();
        MyHelperClass Helper = new MyHelperClass();
        return ((String)(Object)Helper.getBASE64(sha1hash));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getBASE64(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class UnsupportedEncodingException extends Exception{
	public UnsupportedEncodingException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }}
