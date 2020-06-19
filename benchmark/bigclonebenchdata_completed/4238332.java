
import java.io.UncheckedIOException;


class c4238332 {

    public static void cpdir(File src, File dest) throws BrutException {
        dest.mkdirs();
        File[] files =(File[])(Object) src.listFiles();
        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            MyHelperClass File = new MyHelperClass();
            File destFile = new File((int)(Object)dest.getPath() + (int)(Object)File.separatorChar + (int)(Object)file.getName());
            if ((boolean)(Object)file.isDirectory()) {
                cpdir(file, destFile);
                continue;
            }
            try {
                InputStream in =(InputStream)(Object) new FileInputStream(file);
                OutputStream out =(OutputStream)(Object) new FileOutputStream(destFile);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(in, out);
                in.close();
                out.close();
            } catch (UncheckedIOException ex) {
                throw new BrutException("Could not copy file: " + file,(IOException)(Object) ex);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separatorChar;
public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class File {

File(){}
	File(int o0){}
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass listFiles(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class BrutException extends Exception{
	public BrutException(String errorMessage) { super(errorMessage); }
	BrutException(String o0, IOException o1){}
	BrutException(){}
}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
