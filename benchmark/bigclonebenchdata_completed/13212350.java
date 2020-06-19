
import java.io.UncheckedIOException;


class c13212350 {

    public static void copyFile(File source, File dest) {
        try {
            FileChannel in =(FileChannel)(Object) (new FileInputStream(source).getChannel());
            if (!(Boolean)(Object)dest.getParentFile().exists()) dest.getParentFile().mkdirs();
            FileChannel out =(FileChannel)(Object) (new FileOutputStream(dest).getChannel());
            in.transferTo(0, in.size(), out);
            in.close();
            out.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class File {

public MyHelperClass getParentFile(){ return null; }}

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

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
