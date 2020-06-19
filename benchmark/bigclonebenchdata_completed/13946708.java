


class c13946708 {

//    @Override
    public String encryptPassword(String password) throws JetspeedSecurityException {
        MyHelperClass securePasswords = new MyHelperClass();
        if ((boolean)(Object)securePasswords == false) {
            return password;
        }
        if (password == null) {
            return null;
        }
        try {
            MyHelperClass passwordsAlgorithm = new MyHelperClass();
            if ("SHA-512".equals(passwordsAlgorithm)) {
                MyHelperClass JetspeedResources = new MyHelperClass();
                password = password + JetspeedResources.getString("aipo.encrypt_key");
//                MyHelperClass passwordsAlgorithm = new MyHelperClass();
                MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance(passwordsAlgorithm);
                md.reset();
                md.update(password.getBytes());
                byte[] hash =(byte[])(Object) md.digest();
                StringBuffer sb = new StringBuffer();
                for (int i = 0; i < hash.length; i++) {
                    sb.append(Integer.toHexString((hash[i] >> 4) & 0x0F));
                    sb.append(Integer.toHexString(hash[i] & 0x0F));
                }
                return sb.toString();
            } else {
//                MyHelperClass passwordsAlgorithm = new MyHelperClass();
                MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance(passwordsAlgorithm);
                MyHelperClass ALEipConstants = new MyHelperClass();
                byte[] digest =(byte[])(Object) md.digest(password.getBytes((String)(Object)ALEipConstants.DEF_CONTENT_ENCODING));
                ByteArrayOutputStream bas = new ByteArrayOutputStream(digest.length + digest.length / 3 + 1);
                MyHelperClass MimeUtility = new MyHelperClass();
                OutputStream encodedStream =(OutputStream)(Object) MimeUtility.encode(bas, "base64");
                encodedStream.write(digest);
                encodedStream.flush();
                encodedStream.close();
                return bas.toString();
            }
        } catch (Exception e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Unable to encrypt password." + e.getMessage(), e);
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DEF_CONTENT_ENCODING;
public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass encode(ByteArrayOutputStream o0, String o1){ return null; }}

class JetspeedSecurityException extends Exception{
	public JetspeedSecurityException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public static MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(byte[] o0){ return null; }
	public MyHelperClass reset(){ return null; }}

class ByteArrayOutputStream {

ByteArrayOutputStream(int o0){}
	ByteArrayOutputStream(){}}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass flush(){ return null; }}
