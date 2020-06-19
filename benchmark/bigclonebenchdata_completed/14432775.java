
import java.io.UncheckedIOException;


class c14432775 {

    static void copyFile(File in, File outDir, String outFileName) throws IOException {
        FileChannel inChannel =(FileChannel)(Object) (new FileInputStream(in).getChannel());
        outDir.mkdirs();
        File outFile = new File(outDir, outFileName);
        FileChannel outChannel =(FileChannel)(Object) (new FileOutputStream(outFile).getChannel());
        try {
            inChannel.transferTo(0, inChannel.size(), outChannel);
        } catch (UncheckedIOException e) {
            throw e;
        } finally {
            if (inChannel != null) {
                inChannel.close();
            }
            if (outChannel != null) {
                outChannel.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(File o0, String o1){}
	File(){}
	public MyHelperClass mkdirs(){ return null; }}

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
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
