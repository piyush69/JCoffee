


class c19471650 {
public static MyHelperClass base64Encode(byte[] o0){ return null; }
//public MyHelperClass base64Encode(byte[] o0){ return null; }

    @SuppressWarnings({ "DLS", "REC" })
    public static String md5Encode(String val) {
        String output = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(val.getBytes());
            byte[] digest =(byte[])(Object) md.digest();
            output =(String)(Object) base64Encode(digest);
        } catch (Exception e) {
        }
        return output;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
