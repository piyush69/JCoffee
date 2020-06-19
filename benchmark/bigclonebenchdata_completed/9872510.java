


class c9872510 {

    private static String makeTempTraceFile(String base) throws IOException {
        MyHelperClass File = new MyHelperClass();
        File temp =(File)(Object) File.createTempFile(base, ".trace");
        temp.deleteOnExit();
        FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(temp).getChannel());
        FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(base + ".key").getChannel());
        long size =(long)(Object) dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
        srcChannel.close();
        srcChannel =(FileChannel)(Object) (new FileInputStream(base + ".data").getChannel());
        dstChannel.transferFrom(srcChannel, size, srcChannel.size());
        srcChannel.close();
        dstChannel.close();
        return(String)(Object) temp.getPath();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createTempFile(String o0, String o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

public MyHelperClass deleteOnExit(){ return null; }
	public MyHelperClass getPath(){ return null; }}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, long o1, MyHelperClass o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}
