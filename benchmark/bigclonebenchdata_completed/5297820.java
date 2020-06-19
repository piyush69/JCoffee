


class c5297820 {

    public static void copyFile(File src, File dst) throws IOException {
        FileChannel from =(FileChannel)(Object) (new FileInputStream(src).getChannel());
        FileChannel to =(FileChannel)(Object) (new FileOutputStream(dst).getChannel());
        from.transferTo(0, src.length(), to);
        from.close();
        to.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass length(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

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
