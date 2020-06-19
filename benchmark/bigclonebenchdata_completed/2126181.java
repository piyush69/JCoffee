
import java.io.UncheckedIOException;


class c2126181 {
public MyHelperClass assertTrue(String o0, MyHelperClass o1){ return null; }
public MyHelperClass assertNotNull(MessageDigest o0){ return null; }
	public MyHelperClass testSerializationSHA_DATA_1(MessageDigest o0){ return null; }
	public MyHelperClass testSerializationSHA_DATA_2(MessageDigest o0){ return null; }
public MyHelperClass MESSAGE_DIGEST_64_As;
	public MyHelperClass MESSAGE_DIGEST_65_As;
	public MyHelperClass MESSAGE;
	public MyHelperClass MESSAGE_DIGEST;
	public MyHelperClass MESSAGE_DIGEST_63_As;
	public MyHelperClass MessageDigest;
	public MyHelperClass fail(String o0){ return null; }

    public void test_digest() throws UnsupportedEncodingException {
        MessageDigest sha = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            sha =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
            assertNotNull(sha);
        } catch (UncheckedIOException e) {
            fail("getInstance did not find algorithm");
        }
        sha.update((byte)(Object)MESSAGE.getBytes("UTF-8"));
        byte[] digest =(byte[])(Object) sha.digest();
        assertTrue("bug in SHA", MessageDigest.isEqual(digest, MESSAGE_DIGEST));
        sha.reset();
        for (int i = 0; i < 63; i++) {
            sha.update((byte) 'a');
        }
        digest =(byte[])(Object) sha.digest();
        assertTrue("bug in SHA", MessageDigest.isEqual(digest, MESSAGE_DIGEST_63_As));
        sha.reset();
        for (int i = 0; i < 64; i++) {
            sha.update((byte) 'a');
        }
        digest =(byte[])(Object) sha.digest();
        assertTrue("bug in SHA", MessageDigest.isEqual(digest, MESSAGE_DIGEST_64_As));
        sha.reset();
        for (int i = 0; i < 65; i++) {
            sha.update((byte) 'a');
        }
        digest =(byte[])(Object) sha.digest();
        assertTrue("bug in SHA", MessageDigest.isEqual(digest, MESSAGE_DIGEST_65_As));
        testSerializationSHA_DATA_1(sha);
        testSerializationSHA_DATA_2(sha);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass isEqual(byte[] o0, MyHelperClass o1){ return null; }
	public MyHelperClass getBytes(String o0){ return null; }}

class UnsupportedEncodingException extends Exception{
	public UnsupportedEncodingException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
