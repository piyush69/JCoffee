
import java.io.UncheckedIOException;


class c20011285 {

    public static void copy(File sourceFile, File destinationFile) {
        try {
            if (((sourceFile == null) && (destinationFile == null)) || ((sourceFile == null) || (destinationFile == null))) {
                System.out.println("sourceFile & destinationFile is null");
                System.exit(-1);
            }
            if ((boolean)(Object)sourceFile.isDirectory()) {
                File[] tmp =(File[])(Object) sourceFile.listFiles();
                File f;
                for (int i = 0; i < tmp.length; i++) {
                    MyHelperClass File = new MyHelperClass();
                    f = new File((int)(Object)destinationFile.getAbsolutePath() + (int)(Object)File.separator + (int)(Object)tmp[i].getName());
                    f.getParentFile().mkdirs();
                    copy(tmp[i], f);
                }
            } else {
                System.out.println("\nCopy from: " + sourceFile + "\n\n     to: " + destinationFile);
                FileChannel source =(FileChannel)(Object) (new FileInputStream(sourceFile).getChannel());
                FileChannel destination =(FileChannel)(Object) (new FileOutputStream(destinationFile).getChannel());
                destination.transferFrom(source, 0, source.size());
                source.close();
                destination.close();
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
public MyHelperClass mkdirs(){ return null; }}

class File {

File(){}
	File(int o0){}
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass listFiles(){ return null; }
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
