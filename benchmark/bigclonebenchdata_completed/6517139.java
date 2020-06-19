


class c6517139 {
public MyHelperClass MessageDigest;
public MyHelperClass toHexString(byte[] o0){ return null; }

    private String getPrefsKey(String key) {
        try {
            MyHelperClass MD5 = new MyHelperClass();
            if (MD5 == null) MD5 = MessageDigest.getInstance("MD5");
//            MyHelperClass MD5 = new MyHelperClass();
            MD5.reset();
//            MyHelperClass MD5 = new MyHelperClass();
            MD5.update(key.getBytes("UTF-8"));
//            MyHelperClass MD5 = new MyHelperClass();
            byte[] resultBytes =(byte[])(Object) MD5.digest();
            return(String)(Object) toHexString(resultBytes);
        } catch (Exception nsae) {
            return key;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass reset(){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
