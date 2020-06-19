
import java.io.UncheckedIOException;


class c23186853 {

    public BigInteger generateHashing(String value, int lengthBits) {
        try {
            MyHelperClass algorithm = new MyHelperClass();
//            MessageDigest algorithm = MessageDigest.getInstance(this.algorithm);
            algorithm.update(value.getBytes());
            byte[] digest =(byte[])(Object) algorithm.digest();
            BigInteger hashing = new BigInteger(+1, digest);
            if (lengthBits != digest.length * 8) {
                BigInteger length = new BigInteger("2");
                length =(BigInteger)(Object) length.pow(lengthBits);
                hashing =(BigInteger)(Object) hashing.mod(length);
            }
            return hashing;
        } catch (UncheckedIOException e) {
            throw new IllegalArgumentException("Error with algorithm", e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class BigInteger {

BigInteger(){}
	BigInteger(String o0){}
	BigInteger(int o0, byte[] o1){}
	public MyHelperClass mod(BigInteger o0){ return null; }
	public MyHelperClass pow(int o0){ return null; }}

class MessageDigest {

}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
