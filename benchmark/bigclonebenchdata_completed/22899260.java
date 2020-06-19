


class c22899260 {
public static MyHelperClass byteArrayToString(MyHelperClass o0){ return null; }
//public MyHelperClass byteArrayToString(MyHelperClass o0){ return null; }

    public static String sha1Hash(String input) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest sha1Digest =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            sha1Digest.update(input.getBytes());
            return(String)(Object) byteArrayToString(sha1Digest.digest());
        } catch (Exception e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error(e.getMessage(), e);
        }
        return "";
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
