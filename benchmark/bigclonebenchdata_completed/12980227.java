


class c12980227 {

    public void copy(File src, File dest) throws FileNotFoundException, IOException {
        FileInputStream srcStream = new FileInputStream(src);
        FileOutputStream destStream = new FileOutputStream(dest);
        FileChannel srcChannel =(FileChannel)(Object) srcStream.getChannel();
        FileChannel destChannel =(FileChannel)(Object) destStream.getChannel();
        srcChannel.transferTo(0, srcChannel.size(), destChannel);
        destChannel.close();
        srcChannel.close();
        destStream.close();
        srcStream.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}
