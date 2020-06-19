


class c3762872 {

    public String getHash(String str) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            byte[] toChapter1Digest =(byte[])(Object) md.digest();
            MyHelperClass Keystore = new MyHelperClass();
            return(String)(Object) Keystore.hexEncode(toChapter1Digest);
        } catch (Exception e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Error in creating DN hash: " + e.getMessage());
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass hexEncode(byte[] o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
