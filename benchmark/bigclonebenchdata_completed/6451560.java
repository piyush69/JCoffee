
import java.io.UncheckedIOException;


class c6451560 {

    protected static String getBiopaxId(Reaction reaction) {
        String id = null;
        MyHelperClass Reaction = new MyHelperClass();
        if ((int)(Object)reaction.getId() > (int)(Object)Reaction.NO_ID_ASSIGNED) {
            id = reaction.getId().toString();
        } else {
            try {
                MyHelperClass MessageDigest = new MyHelperClass();
                MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
                md.update(reaction.getTextualRepresentation().getBytes());
                byte[] digestBytes =(byte[])(Object) md.digest();
                StringBuilder digesterSb = new StringBuilder(32);
                for (int i = 0; i < digestBytes.length; i++) {
                    int intValue = digestBytes[i] & 0xFF;
                    if (intValue < 0x10) digesterSb.append('0');
                    digesterSb.append(Integer.toHexString(intValue));
                }
                id = digesterSb.toString();
            } catch (UncheckedIOException e) {
            }
        }
        return id;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NO_ID_ASSIGNED;
public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getBytes(){ return null; }}

class Reaction {

public MyHelperClass getId(){ return null; }
	public MyHelperClass getTextualRepresentation(){ return null; }}

class MessageDigest {

public MyHelperClass update(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
