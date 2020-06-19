


class c4147990 {

    public static void copyFile(File dst, File src, boolean append) throws FileNotFoundException, IOException {
        dst.createNewFile();
        FileChannel in =(FileChannel)(Object) (new FileInputStream(src).getChannel());
        FileChannel out =(FileChannel)(Object) (new FileOutputStream(dst).getChannel());
        long startAt = 0;
        if (append) startAt =(long)(Object) out.size();
        in.transferTo(startAt, in.size(), out);
        out.close();
        in.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass createNewFile(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(long o0, MyHelperClass o1, FileChannel o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
