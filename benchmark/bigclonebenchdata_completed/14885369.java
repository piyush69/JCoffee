


class c14885369 {
public MyHelperClass copyChannel(FileChannel o0, FileChannel o1){ return null; }

    public File copyFile(File in, File out) throws IOException {
        FileChannel inChannel =(FileChannel)(Object) (new FileInputStream(in).getChannel());
        FileChannel outChannel =(FileChannel)(Object) (new FileOutputStream(out).getChannel());
        copyChannel(inChannel, outChannel);
        return out;
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

}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
