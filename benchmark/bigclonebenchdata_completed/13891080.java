


class c13891080 {

    public static void copyFile(File srcFile, File destFile) throws IOException {
        MyHelperClass logger = new MyHelperClass();
        logger.debug("copyFile(srcFile={}, destFile={}) - start", srcFile, destFile);
        FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(srcFile).getChannel());
        FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(destFile).getChannel());
        try {
            dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
        } finally {
            srcChannel.close();
            dstChannel.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0, File o1, File o2){ return null; }}

class File {

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
