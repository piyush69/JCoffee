


class c9594116 {

    public static String hash(String arg) throws NoSuchAlgorithmException {
        String input = arg;
        String output;
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
        md.update(input.getBytes());
        MyHelperClass Hex = new MyHelperClass();
        output =(String)(Object) Hex.encodeHexString(md.digest());
        return output;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass encodeHexString(MyHelperClass o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
