


class c15982225 {
public static MyHelperClass byte2hex(byte[] o0){ return null; }
//public MyHelperClass byte2hex(byte[] o0){ return null; }

    private static String getDigest(String srcStr, String alg) {
        MyHelperClass Assert = new MyHelperClass();
        Assert.notNull(srcStr);
//        MyHelperClass Assert = new MyHelperClass();
        Assert.notNull(alg);
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest alga =(MessageDigest)(Object) MessageDigest.getInstance(alg);
            alga.update(srcStr.getBytes());
            byte[] digesta =(byte[])(Object) alga.digest();
            return(String)(Object) byte2hex(digesta);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass notNull(String o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
