
import java.io.UncheckedIOException;


class c3667136 {

    public void fileCopy2(File inFile, File outFile) throws Exception {
        try {
            FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(inFile).getChannel());
            FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(outFile).getChannel());
            dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
            srcChannel.close();
            dstChannel.close();
        } catch (UncheckedIOException e) {
            throw new Exception("Could not copy file: " + inFile.getName());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass getName(){ return null; }}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

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
