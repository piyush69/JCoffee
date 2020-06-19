


class c2278820 {

    public String md5sum(String toCompute) throws Exception {
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        md.update(toCompute.getBytes());
        java.math.BigInteger hash = new java.math.BigInteger(1,(byte[])(Object) md.digest());
        return hash.toString(16);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
