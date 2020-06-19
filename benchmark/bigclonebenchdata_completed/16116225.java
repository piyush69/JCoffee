


class c16116225 {
public MyHelperClass digestToHexString(MyHelperClass o0){ return null; }

    public void process(String t) {
        try {
            MyHelperClass MD5_DIGEST = new MyHelperClass();
            MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance(MD5_DIGEST);
            md5.reset();
            md5.update(t.getBytes());
            MyHelperClass callback = new MyHelperClass();
            callback.display(null,(String)(Object) digestToHexString(md5.digest()));
        } catch (Exception ex) {
            MyHelperClass callback = new MyHelperClass();
            callback.display(null, "[failed]");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass display(Object o0, String o1){ return null; }}

class MessageDigest {

public static MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass reset(){ return null; }}
