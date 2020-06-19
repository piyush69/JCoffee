


class c21648497 {

    public byte[] scramblePassword(String password, String seed) throws NoSuchAlgorithmException {
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
        byte[] stage1 =(byte[])(Object) md.digest(password.getBytes());
        md.reset();
        byte[] stage2 =(byte[])(Object) md.digest(stage1);
        md.reset();
        md.update(seed.getBytes());
        md.update(stage2);
        byte[] result =(byte[])(Object) md.digest();
        for (int i = 0; i < result.length; i++) {
            result[i] ^= stage1[i];
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass digest(byte[] o0){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
