
import java.io.UncheckedIOException;


class c5822585 {

    public static void copyFile(final FileInputStream in, final File out) throws IOException {
        final FileChannel inChannel =(FileChannel)(Object) in.getChannel();
        final FileChannel outChannel =(FileChannel)(Object) (new FileOutputStream(out).getChannel());
        try {
            inChannel.transferTo(0, inChannel.size(), outChannel);
        } catch (final UncheckedIOException e) {
            throw e;
        } finally {
            if (inChannel != null) inChannel.close();
            if (outChannel != null) outChannel.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileInputStream {

public MyHelperClass getChannel(){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
