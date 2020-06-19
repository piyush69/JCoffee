


class c13617295 {
public static MyHelperClass byte2hex(byte[] o0){ return null; }
//public MyHelperClass byte2hex(byte[] o0){ return null; }

    private static String digest(String myinfo) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest alga =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
            alga.update(myinfo.getBytes());
            byte[] digesta =(byte[])(Object) alga.digest();
            return(String)(Object) byte2hex(digesta);
        } catch (Exception ex) {
            return myinfo;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
