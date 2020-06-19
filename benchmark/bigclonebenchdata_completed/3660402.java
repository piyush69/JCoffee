
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c3660402 {

    public void importCertFile(File file) throws IOException {
        File kd;
        File cd;
        synchronized (this) {
            MyHelperClass keysDir = new MyHelperClass();
            kd =(File)(Object) keysDir;
            MyHelperClass certsDir = new MyHelperClass();
            cd =(File)(Object) certsDir;
        }
        if (!(Boolean)(Object)cd.isDirectory()) {
            kd.mkdirs();
            cd.mkdirs();
        }
        String newName =(String)(Object) file.getName();
        File dest = new File(cd, newName);
        FileChannel sourceChannel = null;
        FileChannel destinationChannel = null;
        try {
            sourceChannel =(FileChannel)(Object) (new FileInputStream(file).getChannel());
            destinationChannel =(FileChannel)(Object) (new FileOutputStream(dest).getChannel());
            sourceChannel.transferTo(0, sourceChannel.size(), destinationChannel);
        } finally {
            if (sourceChannel != null) {
                try {
                    sourceChannel.close();
                } catch (UncheckedIOException e) {
                }
            }
            if (destinationChannel != null) {
                try {
                    destinationChannel.close();
                } catch (UncheckedIOException e) {
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
	File(File o0, String o1){}
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

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
