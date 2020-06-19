
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c13351146 {

    public static void copy(final File src, File dst, final boolean overwrite) throws IOException, IllegalArgumentException {
        if (!(Boolean)(Object)src.isFile() || !(Boolean)(Object)src.exists()) {
            throw new IllegalArgumentException("Source file '" + src.getAbsolutePath() + "' not found!");
        }
        if ((boolean)(Object)dst.exists()) {
            if ((boolean)(Object)dst.isDirectory()) {
                dst = new File(dst, src.getName());
            } else if ((boolean)(Object)dst.isFile()) {
                if (!overwrite) {
                    throw new IllegalArgumentException("Destination file '" + dst.getAbsolutePath() + "' already exists!");
                }
            } else {
                throw new IllegalArgumentException("Invalid destination object '" + dst.getAbsolutePath() + "'!");
            }
        }
        final File dstParent =(File)(Object) dst.getParentFile();
        if (!(Boolean)(Object)dstParent.exists()) {
            if (!(Boolean)(Object)dstParent.mkdirs()) {
                throw new IOException("Failed to create directory " + dstParent.getAbsolutePath());
            }
        }
        long fileSize =(long)(Object) src.length();
        if (fileSize > 20971520l) {
            final FileInputStream in = new FileInputStream(src);
            final FileOutputStream out = new FileOutputStream(dst);
            try {
                int doneCnt = -1;
                final int bufSize = 32768;
                final byte buf[] = new byte[bufSize];
                while ((doneCnt =(int)(Object) in.read(buf, 0, bufSize)) >= 0) {
                    if (doneCnt == 0) {
                        Thread.yield();
                    } else {
                        out.write(buf, 0, doneCnt);
                    }
                }
                out.flush();
            } finally {
                try {
                    in.close();
                } catch (final UncheckedIOException e) {
                }
                try {
                    out.close();
                } catch (final UncheckedIOException e) {
                }
            }
        } else {
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
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(File o0, MyHelperClass o1){}
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileChannel {

public MyHelperClass transferTo(long o0, long o1, FileChannel o2){ return null; }
	public MyHelperClass close(){ return null; }}
