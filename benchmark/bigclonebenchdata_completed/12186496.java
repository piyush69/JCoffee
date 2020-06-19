import java.io.*;
import java.lang.*;
import java.util.*;



class c12186496 {
public MyHelperClass SecureRandom;
	public MyHelperClass DIGEST_TYPE_SSHA;

    public String digest(String password, String digestType, String inputEncoding) throws CmsPasswordEncryptionException {
        MessageDigest md;
        String result;
        try {
            MyHelperClass DIGEST_TYPE_PLAIN = new MyHelperClass();
            if (DIGEST_TYPE_PLAIN.equals(digestType.toLowerCase())) {
                result = password;
            MyHelperClass DIGEST_TYPE_SSHA = new MyHelperClass();
            } else if (DIGEST_TYPE_SSHA.equals(digestType.toLowerCase())) {
                byte[] salt = new byte[4];
                byte[] digest;
                byte[] total;
                MyHelperClass m_secureRandom = new MyHelperClass();
                if (m_secureRandom == null) {
//                    MyHelperClass m_secureRandom = new MyHelperClass();
                    m_secureRandom = SecureRandom.getInstance("SHA1PRNG");
                }
//                MyHelperClass m_secureRandom = new MyHelperClass();
                m_secureRandom.nextBytes(salt);
                MyHelperClass DIGEST_TYPE_SHA = new MyHelperClass();
                md =(MessageDigest)(Object) MessageDigest.getInstance(DIGEST_TYPE_SHA);
                md.reset();
                md.update(password.getBytes(inputEncoding));
                md.update(salt);
                digest =(byte[])(Object) md.digest();
                total = new byte[digest.length + salt.length];
                System.arraycopy(digest, 0, total, 0, digest.length);
                System.arraycopy(salt, 0, total, digest.length, salt.length);
                result = new String((String)(Object)Base64.encodeBase64(total));
            } else {
                MyHelperClass MessageDigest = new MyHelperClass();
                md =(MessageDigest)(Object) MessageDigest.getInstance(digestType);
                md.reset();
                md.update(password.getBytes(inputEncoding));
                result = new String((String)(Object)Base64.encodeBase64((byte[])(Object)md.digest()));
            }
        } catch (UncheckedIOException e) {
            MyHelperClass Messages = new MyHelperClass();
            CmsMessageContainer message =(CmsMessageContainer)(Object) Messages.get().container(Messages.ERR_UNSUPPORTED_ALGORITHM_1, digestType);
            MyHelperClass LOG = new MyHelperClass();
            if ((boolean)(Object)LOG.isErrorEnabled()) {
//                MyHelperClass LOG = new MyHelperClass();
                LOG.error(message.key(),(UnsupportedEncodingException)(Object) e);
            }
            throw new CmsPasswordEncryptionException(message,(UnsupportedEncodingException)(Object) e);
        } catch (UnsupportedEncodingException e) {
            MyHelperClass Messages = new MyHelperClass();
            CmsMessageContainer message =(CmsMessageContainer)(Object) Messages.get().container(Messages.ERR_UNSUPPORTED_PASSWORD_ENCODING_1, inputEncoding);
            MyHelperClass LOG = new MyHelperClass();
            if ((boolean)(Object)LOG.isErrorEnabled()) {
//                MyHelperClass LOG = new MyHelperClass();
                LOG.error(message.key(), e);
            }
            throw new CmsPasswordEncryptionException(message, e);
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERR_UNSUPPORTED_PASSWORD_ENCODING_1;
	public MyHelperClass ERR_UNSUPPORTED_ALGORITHM_1;
public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass error(MyHelperClass o0, UnsupportedEncodingException o1){ return null; }
	public MyHelperClass container(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass isErrorEnabled(){ return null; }
	public MyHelperClass error(MyHelperClass o0, NoSuchAlgorithmException o1){ return null; }
	public MyHelperClass nextBytes(byte[] o0){ return null; }
	public MyHelperClass get(){ return null; }}

class CmsPasswordEncryptionException extends Exception{
	public CmsPasswordEncryptionException(String errorMessage) { super(errorMessage); }
	CmsPasswordEncryptionException(CmsMessageContainer o0, UnsupportedEncodingException o1){}
	CmsPasswordEncryptionException(CmsMessageContainer o0, NoSuchAlgorithmException o1){}
	CmsPasswordEncryptionException(){}
}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }
	public static MyHelperClass getInstance(MyHelperClass o0){ return null; }}

class Base64 {

public static MyHelperClass encodeBase64(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class CmsMessageContainer {

public MyHelperClass key(){ return null; }}
