


class c2088568 {

    public static void copyFile(File source, File dest) throws Exception {
        MyHelperClass log = new MyHelperClass();
        log.warn("File names are " + source.toString() + "   and " + dest.toString());
        if (!(Boolean)(Object)dest.getParentFile().exists()) dest.getParentFile().mkdir();
        FileChannel sourceChannel =(FileChannel)(Object) (new FileInputStream(source).getChannel());
        FileChannel destinationChannel =(FileChannel)(Object) (new FileOutputStream(dest).getChannel());
        sourceChannel.transferTo(0, sourceChannel.size(), destinationChannel);
        sourceChannel.close();
        destinationChannel.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass exists(){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass mkdir(){ return null; }}

class File {

public MyHelperClass getParentFile(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
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
