


class c5645175 {
public MyHelperClass toHex(byte[] o0){ return null; }

    private String generaHashMD5(String plainText) throws Exception {
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest mdAlgorithm =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        MyHelperClass FirmaUtil = new MyHelperClass();
        mdAlgorithm.update(plainText.getBytes((String)(Object)FirmaUtil.CHARSET));
        byte[] digest =(byte[])(Object) mdAlgorithm.digest();
        return(String)(Object) toHex(digest);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CHARSET;
public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
