


class c21824901 {
public static MyHelperClass closeQuietly(FileChannel o0){ return null; }
//public MyHelperClass closeQuietly(FileChannel o0){ return null; }

    public static void copyExternalResource(File sourceFile, File destFile) throws IOException {
        if (!(Boolean)(Object)destFile.exists()) {
            destFile.createNewFile();
        }
        FileChannel source = null;
        FileChannel destination = null;
        try {
            source =(FileChannel)(Object) (new FileInputStream(sourceFile).getChannel());
            destination =(FileChannel)(Object) (new FileOutputStream(destFile).getChannel());
            destination.transferFrom(source, 0, source.size());
        } finally {
            closeQuietly(source);
            closeQuietly(destination);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass exists(){ return null; }
	public MyHelperClass createNewFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
