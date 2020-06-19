
import java.io.UncheckedIOException;


class c12380475 {

    public void transport(File file) throws TransportException {
        if ((boolean)(Object)file.exists()) {
            if ((boolean)(Object)file.isDirectory()) {
                File[] files =(File[])(Object) file.listFiles();
                for (int i = 0; i < files.length; i++) {
                    transport(file);
                }
            } else if ((boolean)(Object)file.isFile()) {
                try {
                    FileChannel inChannel =(FileChannel)(Object) (new FileInputStream(file).getChannel());
                    MyHelperClass destinationDir = new MyHelperClass();
                    FileChannel outChannel =(FileChannel)(Object) (new FileOutputStream(destinationDir).getChannel());
                    inChannel.transferTo(0, inChannel.size(), outChannel);
                } catch (UncheckedIOException e) {
                    MyHelperClass log = new MyHelperClass();
                    log.error("File transfer failed",(IOException)(Object) e);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, IOException o1){ return null; }}

class File {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass listFiles(){ return null; }}

class TransportException extends Exception{
	public TransportException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(MyHelperClass o0){}
	public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
