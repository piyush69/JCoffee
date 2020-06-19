


class c8446876 {

    public static byte[] ComputeForBinary(String ThisString) throws Exception {
        byte[] Result;
        MessageDigest MD5Hasher;
        MyHelperClass MessageDigest = new MyHelperClass();
        MD5Hasher =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        MD5Hasher.update(ThisString.getBytes("iso-8859-1"));
        Result =(byte[])(Object) MD5Hasher.digest();
        return Result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
