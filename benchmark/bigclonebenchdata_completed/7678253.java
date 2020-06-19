
import java.io.UncheckedIOException;


class c7678253 {

    protected void copyFile(File sourceFile, File targetFile) throws FileNotFoundException, IOException {
        FileChannel inChannel = null;
        FileChannel outChannel = null;
        try {
            inChannel =(FileChannel)(Object) (new FileInputStream(sourceFile).getChannel());
            outChannel =(FileChannel)(Object) (new FileOutputStream(targetFile).getChannel());
            inChannel.transferTo(0, inChannel.size(), outChannel);
        } finally {
            try {
                if (inChannel != null) {
                    inChannel.close();
                }
                if (outChannel != null) {
                    outChannel.close();
                }
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
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
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
