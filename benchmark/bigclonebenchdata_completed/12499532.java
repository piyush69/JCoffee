


class c12499532 {
public MyHelperClass log;
	public MyHelperClass createTempFileInExternallyAccessableDir(){ return null; }

    public File copyLocalFileAsTempFileInExternallyAccessableDir(String localFileRef) throws IOException {
        MyHelperClass log = new MyHelperClass();
        log.debug("copyLocalFileAsTempFileInExternallyAccessableDir");
        File f =(File)(Object) this.createTempFileInExternallyAccessableDir();
        FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(localFileRef).getChannel());
        FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(f).getChannel());
        log.debug("before transferring via FileChannel from src-inputStream: " + localFileRef + " to dest-outputStream: " + f.getAbsolutePath());
        dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
        srcChannel.close();
        dstChannel.close();
        log.debug("copyLocalFileAsTempFileInExternallyAccessableDir returning: " + f.getAbsolutePath());
        return f;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }}

class File {

public MyHelperClass getAbsolutePath(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
