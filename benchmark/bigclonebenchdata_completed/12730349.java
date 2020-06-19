


class c12730349 {
public static MyHelperClass toHexString(byte o0){ return null; }
//public MyHelperClass toHexString(byte o0){ return null; }

    public static String do_checksum(String data) throws NoSuchAlgorithmException {
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        StringBuffer strbuf = new StringBuffer();
        md5.update(data.getBytes(), 0, data.length());
        byte[] digest =(byte[])(Object) md5.digest();
        for (int i = 0; i < digest.length; i++) {
            strbuf.append(toHexString(digest[i]));
        }
        return strbuf.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }}
