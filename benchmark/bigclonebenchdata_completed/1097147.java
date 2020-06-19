
import java.io.UncheckedIOException;


class c1097147 {

    public static String getMessageDigest(String[] inputs) {
        if (inputs.length == 0) return null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest sha =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            for (String input : inputs) sha.update(input.getBytes());
            byte[] hash =(byte[])(Object) sha.digest();
            String CPass = "";
            int h = 0;
            String s = "";
            for (int i = 0; i < 20; i++) {
                h = hash[i];
                if (h < 0) h += 256;
                s = Integer.toHexString(h);
                if (s.length() < 2) CPass = CPass.concat("0");
                CPass = CPass.concat(s);
            }
            CPass = CPass.toUpperCase();
            return CPass;
        } catch (UncheckedIOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
