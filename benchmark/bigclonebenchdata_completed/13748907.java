


class c13748907 {

    public static String getDigest(String input) throws NoSuchAlgorithmException {
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        md5.update(input.getBytes());
        byte[] outDigest =(byte[])(Object) md5.digest();
        StringBuffer outBuf = new StringBuffer(33);
        for (int i = 0; i < outDigest.length; i++) {
            byte b = outDigest[i];
            int hi = (b >> 4) & 0x0f;
            MyHelperClass MD5Digest = new MyHelperClass();
            outBuf.append(MD5Digest.hexTab[hi]);
            int lo = b & 0x0f;
//            MyHelperClass MD5Digest = new MyHelperClass();
            outBuf.append(MD5Digest.hexTab[lo]);
        }
        return outBuf.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass[] hexTab;
public MyHelperClass getInstance(String o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
