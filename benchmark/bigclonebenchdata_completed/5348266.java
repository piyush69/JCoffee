
import java.io.UncheckedIOException;


class c5348266 {

    public void copyFile(String source, String destination, String description, boolean recursive) throws Exception {
        File sourceFile = new File(source);
        File destinationFile = new File(destination);
        if (!(Boolean)(Object)sourceFile.exists()) {
            throw new Exception("source file (" + source + ") does not exist!");
        }
        if (!(Boolean)(Object)sourceFile.isFile()) {
            throw new Exception("source file (" + source + ") is not a file!");
        }
        if (!(Boolean)(Object)sourceFile.canRead()) {
            throw new Exception("source file (" + source + ") is not readable!");
        }
        if ((boolean)(Object)destinationFile.exists()) {
            MyHelperClass m_out = new MyHelperClass();
            m_out.print("  - " + destination + " exists, removing... ");
            if ((boolean)(Object)destinationFile.delete()) {
//                MyHelperClass m_out = new MyHelperClass();
                m_out.println("REMOVED");
            } else {
//                MyHelperClass m_out = new MyHelperClass();
                m_out.println("FAILED");
                throw new Exception("unable to delete existing file: " + sourceFile);
            }
        }
        MyHelperClass m_out = new MyHelperClass();
        m_out.print("  - copying " + source + " to " + destination + "... ");
        if (!(Boolean)(Object)destinationFile.getParentFile().exists()) {
            if (!(Boolean)(Object)destinationFile.getParentFile().mkdirs()) {
                throw new Exception("unable to create directory: " + destinationFile.getParent());
            }
        }
        if (!(Boolean)(Object)destinationFile.createNewFile()) {
            throw new Exception("unable to create file: " + destinationFile);
        }
        FileChannel from = null;
        FileChannel to = null;
        try {
            from =(FileChannel)(Object) (new FileInputStream(sourceFile).getChannel());
            to =(FileChannel)(Object) (new FileOutputStream(destinationFile).getChannel());
            to.transferFrom(from, 0, from.size());
        } catch (UncheckedIOException e) {
            throw new Exception("unable to copy " + sourceFile + " to " + destinationFile, e);
        } finally {
            if (from != null) {
                from.close();
            }
            if (to != null) {
                to.close();
            }
        }
//        MyHelperClass m_out = new MyHelperClass();
        m_out.println("DONE");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass print(String o0){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass println(String o0){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getParent(){ return null; }
	public MyHelperClass canRead(){ return null; }
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

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

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}
