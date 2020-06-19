


class c7008364 {

    private String getBytes(String in) throws NoSuchAlgorithmException {
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest md5 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        md5.update(in.getBytes());
        byte[] passWordBytes =(byte[])(Object) md5.digest();
        String s = "[";
        for (int i = 0; i < passWordBytes.length; i++) s += passWordBytes[i] + ", ";
        s = s.substring(0, s.length() - 2);
        s += "]";
        return s;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
