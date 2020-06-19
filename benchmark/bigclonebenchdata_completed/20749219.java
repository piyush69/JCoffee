


class c20749219 {
public static MyHelperClass getFileName(File o0){ return null; }
	public static MyHelperClass requireFile(File o0){ return null; }
//public MyHelperClass requireFile(File o0){ return null; }
//	public MyHelperClass getFileName(File o0){ return null; }

    public static void copyFile(File from, File to) throws FileNotFoundException, IOException {
        requireFile(from);
        requireFile(to);
        if ((boolean)(Object)to.isDirectory()) {
            to = new File(to, getFileName(from));
        }
        FileChannel sourceChannel =(FileChannel)(Object) (new FileInputStream(from).getChannel());
        FileChannel destinationChannel =(FileChannel)(Object) (new FileOutputStream(to).getChannel());
        destinationChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
        sourceChannel.close();
        destinationChannel.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(File o0, MyHelperClass o1){}
	File(){}
	public MyHelperClass isDirectory(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

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
