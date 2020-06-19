


class c5371059 {

    public static String digest(String value, String algorithm) throws Exception {
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest algo =(MessageDigest)(Object) MessageDigest.getInstance(algorithm);
        algo.reset();
        algo.update(value.getBytes("UTF-8"));
        MyHelperClass StringTool = new MyHelperClass();
        return(String)(Object) StringTool.byteArrayToString(algo.digest());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass byteArrayToString(MyHelperClass o0){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
