
import java.io.UncheckedIOException;


class c20970925 {

    public static final String convertPassword(final String srcPwd) {
        StringBuilder out;
        MessageDigest md;
        byte[] byteValues;
        byte singleChar = 0;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(srcPwd.getBytes());
            byteValues =(byte[])(Object) md.digest();
            if ((byteValues == null) || (byteValues.length <= 0)) {
                return null;
            }
            out = new StringBuilder(byteValues.length * 2);
            for (byte element : byteValues) {
                singleChar = (byte) (element & 0xF0);
                singleChar = (byte) (singleChar >>> 4);
                singleChar = (byte) (singleChar & 0x0F);
                MyHelperClass PasswordConverter = new MyHelperClass();
                out.append(PasswordConverter.ENTRIES[singleChar]);
                singleChar = (byte) (element & 0x0F);
//                MyHelperClass PasswordConverter = new MyHelperClass();
                out.append(PasswordConverter.ENTRIES[singleChar]);
            }
            return out.toString();
        } catch (final UncheckedIOException e) {
            e.printStackTrace();
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass[] ENTRIES;
public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
