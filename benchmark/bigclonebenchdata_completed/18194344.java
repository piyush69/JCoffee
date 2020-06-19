


class c18194344 {
public MyHelperClass setEncryptedPassword(String o0){ return null; }
	public MyHelperClass byte2hex(byte o0){ return null; }

    public void setPassword(String plaintext) throws java.security.NoSuchAlgorithmException {
        StringBuffer encrypted = new StringBuffer();
        java.security.MessageDigest digest = java.security.MessageDigest.getInstance("MD5");
        digest.update(plaintext.getBytes());
        byte[] digestArray = digest.digest();
        for (int i = 0; i < digestArray.length; i++) {
            encrypted.append(byte2hex(digestArray[i]));
        }
        setEncryptedPassword(encrypted.toString());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
