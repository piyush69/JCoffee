
import java.io.UncheckedIOException;


class c11892341 {

    private static byte[] getHashValue(INewEntryDescriptor descriptor) {
        MyHelperClass Calendar = new MyHelperClass();
        String timeStamp = Calendar.getInstance().getTime().toString();
        MessageDigest sha1;
        byte[] digest = { 0 };
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            sha1 =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            sha1.update(descriptor.getContactName().getBytes());
            sha1.update(descriptor.getAlgorithmName().getBytes());
            sha1.update(descriptor.getProvider().getBytes());
            return digest =(byte[])(Object) sha1.digest(timeStamp.getBytes());
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("NoSuchAlgorithmException while digesting",(NoSuchAlgorithmException)(Object) e);
        }
        return digest;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getTime(){ return null; }
	public MyHelperClass error(String o0, NoSuchAlgorithmException o1){ return null; }
	public MyHelperClass getBytes(){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class INewEntryDescriptor {

public MyHelperClass getAlgorithmName(){ return null; }
	public MyHelperClass getContactName(){ return null; }
	public MyHelperClass getProvider(){ return null; }}

class MessageDigest {

public MyHelperClass update(MyHelperClass o0){ return null; }
	public MyHelperClass digest(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
