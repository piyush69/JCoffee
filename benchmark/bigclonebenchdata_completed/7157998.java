


class c7157998 {
public static MyHelperClass byteArrayToHexString(MyHelperClass o0){ return null; }
//public MyHelperClass byteArrayToHexString(MyHelperClass o0){ return null; }

    public static synchronized String encrypt(String x) throws Exception {
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest d =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
        d.reset();
        d.update(String.valueOf(x).getBytes());
        return(String)(Object) byteArrayToHexString(d.digest());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
