
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c9195362 {

    public static long copy(File src, File dest) throws UtilException {
        FileChannel srcFc = null;
        FileChannel destFc = null;
        try {
            srcFc =(FileChannel)(Object) (new FileInputStream(src).getChannel());
            destFc =(FileChannel)(Object) (new FileOutputStream(dest).getChannel());
            long srcLength =(long)(Object) srcFc.size();
            srcFc.transferTo(0, srcLength, destFc);
            return srcLength;
        } catch (UncheckedIOException e) {
            throw new UtilException((String)(Object)e);
        } finally {
            try {
                if (srcFc != null) srcFc.close();
                srcFc = null;
            } catch (UncheckedIOException e) {
            }
            try {
                if (destFc != null) destFc.close();
                destFc = null;
            } catch (UncheckedIOException e) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class UtilException extends Exception{
	public UtilException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, long o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
