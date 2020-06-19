
import java.io.UncheckedIOException;


class c7194282 {
public static MyHelperClass createNormalizedDescriptor(JarFile2 o0){ return null; }
//public MyHelperClass createNormalizedDescriptor(JarFile2 o0){ return null; }

    public static String createNormalizedJarDescriptorDigest(String path) throws Exception {
        String descriptor =(String)(Object) createNormalizedDescriptor(new JarFile2(path));
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            digest.update(descriptor.getBytes());
            byte[] messageDigest =(byte[])(Object) digest.digest();
            StringBuffer hexString = new StringBuffer();
            for (int i = 0; i < messageDigest.length; i++) {
                hexString.append(Integer.toHexString(0xFF & messageDigest[i]));
            }
            return hexString.toString();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return "";
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class JarFile2 {

JarFile2(String o0){}
	JarFile2(){}}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
