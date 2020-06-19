
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c10598290 {
public MyHelperClass getPassword(){ return null; }

    public String encryptLdapPassword(String algorithm) {
        MyHelperClass _password = new MyHelperClass();
        String sEncrypted =(String)(Object) _password;
//        MyHelperClass _password = new MyHelperClass();
        if ((_password != null) && ((int)(Object)_password.length() > 0)) {
            MyHelperClass Val = new MyHelperClass();
            algorithm =(String)(Object) Val.chkStr(algorithm);
            boolean bMD5 = algorithm.equalsIgnoreCase("MD5");
            boolean bSHA = algorithm.equalsIgnoreCase("SHA") || algorithm.equalsIgnoreCase("SHA1") || algorithm.equalsIgnoreCase("SHA-1");
            if (bSHA || bMD5) {
                String sAlgorithm = "MD5";
                if (bSHA) {
                    sAlgorithm = "SHA";
                }
                try {
                    MyHelperClass MessageDigest = new MyHelperClass();
                    MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance(sAlgorithm);
                    md.update(getPassword().getBytes("UTF-8"));
                    sEncrypted = "{" + sAlgorithm + "}" + (new BASE64Encoder()).encode(md.digest());
                } catch (UncheckedIOException e) {
                    sEncrypted = null;
                    e.printStackTrace(System.err);
                } catch (ArithmeticException e) {
                    sEncrypted = null;
                    e.printStackTrace(System.err);
                }
            }
        }
        return sEncrypted;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass length(){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getBytes(String o0){ return null; }
	public MyHelperClass chkStr(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(MyHelperClass o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class UnsupportedEncodingException extends Exception{
	public UnsupportedEncodingException(String errorMessage) { super(errorMessage); }
}
