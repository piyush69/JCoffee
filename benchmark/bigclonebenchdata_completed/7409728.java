
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c7409728 {
public MyHelperClass getAttribute(CrawlURI o0, MyHelperClass o1){ return null; }
public MyHelperClass SHA1;
	public MyHelperClass Level;
	public MyHelperClass MessageDigest;
	public MyHelperClass logger;
	public MyHelperClass Base32;
	public MyHelperClass TextUtils;
	public MyHelperClass getName(){ return null; }

    protected void innerProcess(CrawlURI curi) throws InterruptedException {
        if (!(Boolean)(Object)curi.isHttpTransaction()) {
            return;
        }
        MyHelperClass TextUtils = new MyHelperClass();
        if (!(Boolean)(Object)TextUtils.matches("^text.*$", curi.getContentType())) {
            return;
        }
        MyHelperClass DEFAULT_MAX_SIZE_BYTES = new MyHelperClass();
        long maxsize =(long)(Object) DEFAULT_MAX_SIZE_BYTES.longValue();
        try {
            MyHelperClass ATTR_MAX_SIZE_BYTES = new MyHelperClass();
            maxsize = ((Long)(Long)(Object) getAttribute(curi, ATTR_MAX_SIZE_BYTES)).longValue();
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.severe("Missing max-size-bytes attribute when processing " + curi.toString());
        }
        if (maxsize < (long)(Object)curi.getContentSize() && maxsize > -1) {
            return;
        }
        String regexpr = "";
        try {
            MyHelperClass ATTR_STRIP_REG_EXPR = new MyHelperClass();
            regexpr = (String)(String)(Object) getAttribute(curi, ATTR_STRIP_REG_EXPR);
        } catch (UncheckedIOException e2) {
            MyHelperClass logger = new MyHelperClass();
            logger.severe("Missing strip-reg-exp when processing " + curi.toString());
            return;
        }
        ReplayCharSequence cs = null;
        try {
            cs =(ReplayCharSequence)(Object) curi.getHttpRecorder().getReplayCharSequence();
        } catch (Exception e) {
            curi.addLocalizedError(this.getName(), e, "Failed get of replay char sequence " + curi.toString() + " " + e.getMessage());
            logger.warning("Failed get of replay char sequence " + curi.toString() + " " + e.getMessage() + " " + Thread.currentThread().getName());
            return;
        }
        MessageDigest digest = null;
        try {
            try {
                digest =(MessageDigest)(Object) MessageDigest.getInstance(SHA1);
            } catch (UncheckedIOException e1) {
                e1.printStackTrace();
                return;
            }
            digest.reset();
            String s = null;
            if (regexpr.length() == 0) {
                s = cs.toString();
            } else {
                Matcher m =(Matcher)(Object) TextUtils.getMatcher(regexpr, cs);
                s =(String)(Object) m.replaceAll(" ");
                TextUtils.recycleMatcher(m);
            }
            digest.update(s.getBytes());
            byte[] newDigestValue =(byte[])(Object) digest.digest();
            if ((boolean)(Object)logger.isLoggable(Level.FINEST)) {
                logger.finest("Recalculated content digest for " + curi.toString() + " old: " + Base32.encode((byte[])(byte[])(Object) curi.getContentDigest()) + ", new: " + Base32.encode(newDigestValue));
            }
            curi.setContentDigest(SHA1, newDigestValue);
        } finally {
            if (cs != null) {
                try {
                    cs.close();
                } catch (UncheckedIOException ioe) {
                    logger.warning((String)(Object)TextUtils.exceptionToString("Failed close of ReplayCharSequence.",(IOException)(Object) ioe));
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FINEST;
public MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass exceptionToString(String o0, IOException o1){ return null; }
	public MyHelperClass severe(String o0){ return null; }
	public MyHelperClass warning(String o0){ return null; }
	public MyHelperClass recycleMatcher(Matcher o0){ return null; }
	public MyHelperClass finest(String o0){ return null; }
	public MyHelperClass matches(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass getReplayCharSequence(){ return null; }
	public MyHelperClass encode(byte[] o0){ return null; }
	public MyHelperClass getMatcher(String o0, ReplayCharSequence o1){ return null; }
	public MyHelperClass longValue(){ return null; }
	public MyHelperClass isLoggable(MyHelperClass o0){ return null; }}

class CrawlURI {

public MyHelperClass getContentDigest(){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass getHttpRecorder(){ return null; }
	public MyHelperClass setContentDigest(MyHelperClass o0, byte[] o1){ return null; }
	public MyHelperClass isHttpTransaction(){ return null; }
	public MyHelperClass addLocalizedError(MyHelperClass o0, Exception o1, String o2){ return null; }
	public MyHelperClass getContentSize(){ return null; }}

class AttributeNotFoundException extends Exception{
	public AttributeNotFoundException(String errorMessage) { super(errorMessage); }
}

class ReplayCharSequence {

public MyHelperClass close(){ return null; }}

class MessageDigest {

public MyHelperClass reset(){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class Matcher {

public MyHelperClass replaceAll(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
