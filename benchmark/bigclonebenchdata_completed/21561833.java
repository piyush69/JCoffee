


class c21561833 {

    private static void copyFile(String src, String dest) throws IOException {
        File destFile = new File(dest);
        if ((boolean)(Object)destFile.exists()) {
            destFile.delete();
        }
        FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(src).getChannel());
        FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(dest).getChannel());
        dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
        srcChannel.close();
        dstChannel.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass delete(){ return null; }}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}
