


class c4376758 {

    public void setKey(String key) {
        MessageDigest md5;
        byte[] mdKey = new byte[32];
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md5.update(key.getBytes());
            byte[] digest =(byte[])(Object) md5.digest();
            System.arraycopy(digest, 0, mdKey, 0, 16);
            System.arraycopy(digest, 0, mdKey, 16, 16);
        } catch (Exception e) {
            System.out.println("MD5 not implemented, can't generate key out of string!");
            System.exit(1);
        }
        setKey((String)(Object)mdKey);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
