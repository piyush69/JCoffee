


class c16288270 {

    protected synchronized String encryptThis(String seed, String text) throws EncryptionException {
        String encryptedValue = null;
        String textToEncrypt = text;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
            md.update(textToEncrypt.getBytes("UTF-8"));
            encryptedValue =(String)(Object) (new BASE64Encoder()).encode(md.digest());
        } catch (Exception e) {
            throw new EncryptionException((String)(Object)e);
        }
        return encryptedValue;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class EncryptionException extends Exception{
	public EncryptionException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(MyHelperClass o0){ return null; }}
