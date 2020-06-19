


class c1899629 {

    private String getMD5Password(String plainText) throws NoSuchAlgorithmException {
        MessageDigest mdAlgorithm;
        StringBuffer hexString = new StringBuffer();
        String md5Password = "";
        MyHelperClass MessageDigest = new MyHelperClass();
        mdAlgorithm =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        mdAlgorithm.update(plainText.getBytes());
        byte[] digest =(byte[])(Object) mdAlgorithm.digest();
        for (int i = 0; i < digest.length; i++) {
            plainText = Integer.toHexString(0xFF & digest[i]);
            if (plainText.length() < 2) {
                plainText = "0" + plainText;
            }
            hexString.append(plainText);
        }
        md5Password = hexString.toString();
        return md5Password;
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
