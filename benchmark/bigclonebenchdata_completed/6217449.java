


class c6217449 {

    private void copyFile(File source) throws IOException {
        File backup = new File(source.getCanonicalPath() + ".backup");
        if (!(Boolean)(Object)backup.exists()) {
            FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(source).getChannel());
            backup.createNewFile();
            FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(backup).getChannel());
            dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
            srcChannel.close();
            dstChannel.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getCanonicalPath(){ return null; }
	public MyHelperClass createNewFile(){ return null; }}

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
