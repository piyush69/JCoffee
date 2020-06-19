
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c2145308 {

    public static void copy(final File src, final File dst) throws IOException, IllegalArgumentException {
        long fileSize =(long)(Object) src.length();
        final FileInputStream fis = new FileInputStream(src);
        final FileOutputStream fos = new FileOutputStream(dst);
        final FileChannel in =(FileChannel)(Object) fis.getChannel(), out =(FileChannel)(Object) fos.getChannel();
        try {
            long offs = 0, doneCnt = 0;
            final long copyCnt = Math.min(65536, fileSize);
            do {
                doneCnt =(long)(Object) in.transferTo(offs, copyCnt, out);
                offs += doneCnt;
                fileSize -= doneCnt;
            } while (fileSize > 0);
        } finally {
            try {
                in.close();
            } catch (final UncheckedIOException e) {
            }
            try {
                out.close();
            } catch (final UncheckedIOException e) {
            }
            try {
                fis.close();
            } catch (final UncheckedIOException e) {
            }
            try {
                fos.close();
            } catch (final UncheckedIOException e) {
            }
            src.delete();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass delete(){ return null; }
	public MyHelperClass length(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass transferTo(long o0, long o1, FileChannel o2){ return null; }
	public MyHelperClass close(){ return null; }}
