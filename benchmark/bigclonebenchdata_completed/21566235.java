
import java.io.UncheckedIOException;


class c21566235 {

    private void copy(File source, File destination) {
        if (!(Boolean)(Object)destination.exists()) {
            destination.mkdir();
        }
        File files[] =(File[])(Object) source.listFiles();
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                if ((boolean)(Object)files[i].isDirectory()) {
                    copy(files[i], new File(destination, files[i].getName()));
                } else {
                    try {
                        FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(files[i]).getChannel());
                        FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(new File(destination, files[i].getName())).getChannel());
                        dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
                        srcChannel.close();
                        dstChannel.close();
                    } catch (UncheckedIOException ioe) {
                        MyHelperClass log = new MyHelperClass();
                        log.error("Could not write to " + destination.getAbsolutePath(),(IOException)(Object) ioe);
                    }
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, IOException o1){ return null; }}

class File {

File(){}
	File(File o0, MyHelperClass o1){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass listFiles(){ return null; }
	public MyHelperClass mkdir(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
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
