


class c14440431 {

    public static String generateHash(final String sText, final String sAlgo) throws NoSuchAlgorithmException {
        MyHelperClass MessageDigest = new MyHelperClass();
        final MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance(sAlgo);
        md.update(sText.getBytes());
        final Formatter formatter = new Formatter();
        for (final Byte curByte :(Byte[])(Object) (Object[])(Object)md.digest()) formatter.format("%x", curByte);
        return formatter.toString();
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

class Formatter {

public MyHelperClass format(String o0, Byte o1){ return null; }}
