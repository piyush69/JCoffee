


class c22200790 {

    public String getDigest(String s) throws Exception {
        MyHelperClass hashName = new MyHelperClass();
        MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance(hashName);
        md.update(s.getBytes());
        byte[] dig =(byte[])(Object) md.digest();
        MyHelperClass Base16 = new MyHelperClass();
        return(String)(Object) Base16.toHexString(dig);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass toHexString(byte[] o0){ return null; }}

class MessageDigest {

public static MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
