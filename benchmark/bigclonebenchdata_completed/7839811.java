


class c7839811 {

    public static String md5(String input) {
        byte[] temp;
        try {
            MessageDigest messageDigest;
            MyHelperClass MessageDigest = new MyHelperClass();
            messageDigest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            messageDigest.update(input.getBytes());
            temp =(byte[])(Object) messageDigest.digest();
        } catch (Exception e) {
            return null;
        }
        MyHelperClass MyUtils = new MyHelperClass();
        return(String)(Object) MyUtils.byte2HexStr(temp);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass byte2HexStr(byte[] o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
