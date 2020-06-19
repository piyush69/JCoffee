


class c1357662 {
public MyHelperClass logger;
	public MyHelperClass getAbsolutePath(){ return null; }

    private void copyFileTo(File destination) throws IOException {
        MyHelperClass logger = new MyHelperClass();
        logger.fine("Copying from " + destination + "...");
        FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(getAbsolutePath()).getChannel());
        logger.fine("...got source channel " + srcChannel + "...");
        FileChannel destChannel =(FileChannel)(Object) (new FileOutputStream(new File(destination.getAbsolutePath())).getChannel());
        logger.fine("...got destination channel " + destChannel + "...");
        logger.fine("...Got channels...");
        destChannel.transferFrom(srcChannel, 0, srcChannel.size());
        logger.fine("...transferred.");
        srcChannel.close();
        destChannel.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass fine(String o0){ return null; }}

class File {

File(){}
	File(MyHelperClass o0){}
	public MyHelperClass getAbsolutePath(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(MyHelperClass o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
