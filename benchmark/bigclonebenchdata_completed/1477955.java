
import java.io.UncheckedIOException;


class c1477955 {
public MyHelperClass deleteTempFile(File o0){ return null; }
public MyHelperClass logger;
	public MyHelperClass IOUtils;
	public MyHelperClass createMessageDigest(){ return null; }

    private String copyAndHash(InputStream input, File into) throws IOException {
        MessageDigest digest =(MessageDigest)(Object) createMessageDigest();
        DigestInputStream dis = new DigestInputStream(input, digest);
        IOException ex;
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(into);
            IOUtils.copyLarge(dis, fos);
            byte[] hash =(byte[])(Object) digest.digest();
            Formatter formatter = new Formatter();
            for (byte b : hash) {
                formatter.format("%02x", b);
            }
            return formatter.toString();
        } catch (UncheckedIOException e) {
            ex =(IOException)(Object) e;
        } finally {
            IOUtils.closeQuietly(dis);
            IOUtils.closeQuietly(fos);
        }
        if ((boolean)(Object)logger.isWarnEnabled()) logger.warn("Couldn't retrieve data from input!", ex);
        deleteTempFile(into);
        throw ex;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }
	public MyHelperClass isWarnEnabled(){ return null; }
	public MyHelperClass warn(String o0, IOException o1){ return null; }
	public MyHelperClass closeQuietly(DigestInputStream o0){ return null; }
	public MyHelperClass copyLarge(DigestInputStream o0, FileOutputStream o1){ return null; }}

class InputStream {

}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }}

class DigestInputStream {

DigestInputStream(InputStream o0, MessageDigest o1){}
	DigestInputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class Formatter {

public MyHelperClass format(String o0, byte o1){ return null; }}
