
import java.io.UncheckedIOException;


class c2965996 {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: HashCalculator <Algorithm> <Input>");
            System.out.println("The preferred algorithm is SHA.");
        } else {
            MessageDigest md;
            try {
                MyHelperClass MessageDigest = new MyHelperClass();
                md =(MessageDigest)(Object) MessageDigest.getInstance(args[0]);
                md.update(args[1].getBytes());
                System.out.print("Hashed value of " + args[1] + " is: ");
                System.out.println((new BASE64Encoder()).encode(md.digest()));
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(MyHelperClass o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
