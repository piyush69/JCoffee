
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c4618237 {

    public static void writeFileToFile(File fin, File fout, boolean append) throws IOException {
        FileChannel inChannel =(FileChannel)(Object) (new FileInputStream(fin).getChannel());
        FileChannel outChannel =(FileChannel)(Object) (new FileOutputStream(fout, append).getChannel());
        try {
            inChannel.transferTo(0, inChannel.size(), outChannel);
        } finally {
            if (inChannel != null) try {
                inChannel.close();
            } catch (UncheckedIOException ex) {
            }
            if (outChannel != null) try {
                outChannel.close();
            } catch (UncheckedIOException ex) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0, boolean o1){}
	public MyHelperClass getChannel(){ return null; }}
