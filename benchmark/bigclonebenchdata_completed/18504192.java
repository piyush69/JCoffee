


class c18504192 {

    static void copyFile(File in, File out) throws IOException {
        FileChannel source =(FileChannel)(Object) (new FileInputStream(in).getChannel());
        FileChannel destination =(FileChannel)(Object) (new FileOutputStream(out).getChannel());
        source.transferTo(0, source.size(), destination);
        source.close();
        destination.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

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
