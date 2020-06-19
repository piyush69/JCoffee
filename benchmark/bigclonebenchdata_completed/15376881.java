


class c15376881 {
public static MyHelperClass closeIO(FileChannel o0){ return null; }
	public static MyHelperClass closeIO(FileInputStream o0){ return null; }
	public static MyHelperClass closeIO(FileOutputStream o0){ return null; }
//public MyHelperClass closeIO(FileOutputStream o0){ return null; }
//	public MyHelperClass closeIO(FileInputStream o0){ return null; }
//	public MyHelperClass closeIO(FileChannel o0){ return null; }

    public static void copyFile(final File sourceFile, final File destFile) throws IOException {
        if (!(Boolean)(Object)destFile.exists()) {
            destFile.createNewFile();
        }
        FileInputStream inStream = null;
        FileOutputStream outStream = null;
        FileChannel source = null;
        FileChannel destination = null;
        try {
            source =(FileChannel)(Object) (inStream = new FileInputStream(sourceFile)).getChannel();
            destination =(FileChannel)(Object) (outStream = new FileOutputStream(destFile)).getChannel();
            destination.transferFrom(source, 0, source.size());
        } finally {
            closeIO(source);
            closeIO(inStream);
            closeIO(destination);
            closeIO(outStream);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass exists(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }}
