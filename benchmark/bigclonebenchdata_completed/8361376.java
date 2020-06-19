import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8361376 {
public MyHelperClass IOUtils;
	public MyHelperClass Cipher;
	public MyHelperClass getPublicKey(String o0){ return null; }

    protected String encrypt(final String data, final String key) throws Throwable, CryptographicFailureException {
        MyHelperClass Validate = new MyHelperClass();
        Validate.notNull(data, "Provided data cannot be null.");
//        MyHelperClass Validate = new MyHelperClass();
        Validate.notNull(key, "Provided key name cannot be null.");
        final PublicKey pk =(PublicKey)(Object) getPublicKey(key);
        if (pk == null) {
            throw new CryptographicFailureException("PublicKeyNotFound", String.format("Cannot find public key '%s'", key));
        }
        try {
            final Cipher cipher =(Cipher)(Object) Cipher.getInstance(pk.getAlgorithm());
            cipher.init(Cipher.ENCRYPT_MODE, pk);
            final ByteArrayInputStream bin = new ByteArrayInputStream(data.getBytes());
            final CipherInputStream cin = new CipherInputStream(bin, cipher);
            final ByteArrayOutputStream bout = new ByteArrayOutputStream();
            IOUtils.copy(cin, bout);
            return new String((String)(Object)Base64.encodeBase64(bout.toByteArray()));
        } catch (ArithmeticException e) {
            throw new IllegalStateException(String.format("Cannot find instance of algorithm '%s'", pk.getAlgorithm()), e);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalStateException(String.format("Cannot build instance of algorithm '%s'", pk.getAlgorithm()), e);
        } catch (ArrayStoreException e) {
            throw new IllegalStateException(String.format("Cannot build instance of algorithm '%s'", pk.getAlgorithm()), e);
        } catch (ClassCastException e) {
            throw new IllegalStateException("Cannot build in-memory cipher copy", e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ENCRYPT_MODE;
public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass notNull(String o0, String o1){ return null; }
	public MyHelperClass copy(CipherInputStream o0, ByteArrayOutputStream o1){ return null; }}

class CryptographicFailureException extends Exception{
	public CryptographicFailureException(String errorMessage) { super(errorMessage); }
	CryptographicFailureException(){}
	CryptographicFailureException(String o0, String o1){}
}

class Cipher {

public MyHelperClass init(MyHelperClass o0, PublicKey o1){ return null; }}

class CipherInputStream {

CipherInputStream(ByteArrayInputStream o0, Cipher o1){}
	CipherInputStream(){}}

class Base64 {

public static MyHelperClass encodeBase64(byte[] o0){ return null; }}

class NoSuchPaddingException extends Exception{
	public NoSuchPaddingException(String errorMessage) { super(errorMessage); }
}
