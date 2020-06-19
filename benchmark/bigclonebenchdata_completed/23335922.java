


class c23335922 {

    public String digest(String message) throws NoSuchAlgorithmException, EncoderException {
        MyHelperClass MessageDigest = new MyHelperClass();
        MessageDigest messageDigest =(MessageDigest)(Object) MessageDigest.getInstance("SHA-256");
        messageDigest.update(message.getBytes());
        byte[] raw =(byte[])(Object) messageDigest.digest();
        byte[] chars =(byte[])(Object) (new Base64().encode(raw));
        return new String(chars);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class EncoderException extends Exception{
	public EncoderException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class Base64 {

public MyHelperClass encode(byte[] o0){ return null; }}
