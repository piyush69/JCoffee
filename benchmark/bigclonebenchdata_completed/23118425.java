


class c23118425 {

    public synchronized String encrypt(String plaintext) throws Exception {
        MessageDigest md = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (Exception e) {
        }
        try {
            md.update(plaintext.getBytes("UTF-8"));
        } catch (Exception e) {
        }
        byte raw[] =(byte[])(Object) md.digest();
        String hash =(String)(Object) (new BASE64Encoder()).encode(raw);
        return hash;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}
