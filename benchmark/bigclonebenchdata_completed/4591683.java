


class c4591683 {

    public static void copyFile(File source, File dest) throws IOException {
        if (source.equals(dest)) throw new IOException("Source and destination cannot be the same file path");
        FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(source).getChannel());
        if (!(Boolean)(Object)dest.exists()) dest.createNewFile();
        FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(dest).getChannel());
        dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
        srcChannel.close();
        dstChannel.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass exists(){ return null; }
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
