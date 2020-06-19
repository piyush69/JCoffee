
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c14820302 {
public MyHelperClass logger;

    protected void innerProcess(ProcessorURI curi) throws InterruptedException {
        MyHelperClass STRIP_REG_EXPR = new MyHelperClass();
        Pattern regexpr =(Pattern)(Object) curi.get(this, STRIP_REG_EXPR);
        ReplayCharSequence cs = null;
        try {
            cs =(ReplayCharSequence)(Object) curi.getRecorder().getReplayCharSequence();
        } catch (Exception e) {
            curi.getNonFatalFailures().add(e);
            MyHelperClass logger = new MyHelperClass();
            logger.warning("Failed get of replay char sequence " + curi.toString() + " " + e.getMessage() + " " + Thread.currentThread().getName());
            return;
        }
        MessageDigest digest = null;
        try {
            try {
                MyHelperClass SHA1 = new MyHelperClass();
                digest =(MessageDigest)(Object) MessageDigest.getInstance(SHA1);
            } catch (UncheckedIOException e1) {
                e1.printStackTrace();
                return;
            }
            digest.reset();
            String s = null;
            if (regexpr != null) {
                s = cs.toString();
            } else {
                Matcher m =(Matcher)(Object) regexpr.matcher(cs);
                s =(String)(Object) m.replaceAll(" ");
            }
            digest.update(s.getBytes());
            byte[] newDigestValue =(byte[])(Object) digest.digest();
            MyHelperClass SHA1 = new MyHelperClass();
            curi.setContentDigest(SHA1, newDigestValue);
        } finally {
            if (cs != null) {
                try {
                    cs.close();
                } catch (UncheckedIOException ioe) {
                    MyHelperClass TextUtils = new MyHelperClass();
                    logger.warning((String)(Object)TextUtils.exceptionToString("Failed close of ReplayCharSequence.",(IOException)(Object) ioe));
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warning(String o0){ return null; }
	public MyHelperClass add(Exception o0){ return null; }
	public MyHelperClass getReplayCharSequence(){ return null; }
	public MyHelperClass exceptionToString(String o0, IOException o1){ return null; }}

class ProcessorURI {

public MyHelperClass setContentDigest(MyHelperClass o0, byte[] o1){ return null; }
	public MyHelperClass get(c14820302 o0, MyHelperClass o1){ return null; }
	public MyHelperClass getRecorder(){ return null; }
	public MyHelperClass getNonFatalFailures(){ return null; }}

class Pattern {

public MyHelperClass matcher(ReplayCharSequence o0){ return null; }}

class ReplayCharSequence {

public MyHelperClass close(){ return null; }}

class MessageDigest {

public static MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass reset(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class Matcher {

public MyHelperClass replaceAll(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
