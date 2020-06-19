


class c11933797 {

    public static void CopyFile(String in, String out) throws Exception {
        FileChannel sourceChannel =(FileChannel)(Object) (new FileInputStream(new File(in)).getChannel());
        FileChannel destinationChannel =(FileChannel)(Object) (new FileOutputStream(new File(out)).getChannel());
        sourceChannel.transferTo(0, sourceChannel.size(), destinationChannel);
        sourceChannel.close();
        destinationChannel.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class File {

File(String o0){}
	File(){}}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
