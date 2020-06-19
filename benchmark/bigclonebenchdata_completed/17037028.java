


class c17037028 {
public MyHelperClass getHex(MyHelperClass o0){ return null; }

    private String md5(String value) {
        String md5Value = "1";
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            digest.update(value.getBytes());
            md5Value =(String)(Object) getHex(digest.digest());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return md5Value;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
