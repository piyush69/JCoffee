
import java.io.UncheckedIOException;


class c10379908 {

    public void setContentMD5() {
        MessageDigest messagedigest = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            messagedigest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            MyHelperClass contentMD5 = new MyHelperClass();
            contentMD5 = null;
        }
        MyHelperClass content = new MyHelperClass();
        messagedigest.update(content.getBytes());
        byte digest[] =(byte[])(Object) messagedigest.digest();
        String chk = "";
        for (int i = 0; i < digest.length; i++) {
            String s = Integer.toHexString(digest[i] & 0xFF);
            chk += ((s.length() == 1) ? "0" + s : s);
        }
        String contentMD5;// = new String();
        contentMD5 = chk;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getBytes(){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
