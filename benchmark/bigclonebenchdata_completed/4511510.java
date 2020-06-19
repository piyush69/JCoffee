


class c4511510 {

    public static String cryptoSHA(String _strSrc) {
        try {
            BASE64Encoder encoder = new BASE64Encoder();
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest sha =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
            sha.update(_strSrc.getBytes());
            byte[] buffer =(byte[])(Object) sha.digest();
            return(String)(Object) encoder.encode(buffer);
        } catch (Exception err) {
            System.out.println(err);
        }
        return "";
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
