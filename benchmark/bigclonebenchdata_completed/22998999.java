


class c22998999 {

    public static void concatFiles(List sourceFiles, File destFile) throws IOException {
        FileOutputStream outFile = new FileOutputStream(destFile);
        FileChannel outChannel =(FileChannel)(Object) outFile.getChannel();
        for (File f :(File[])(Object) (Object[])(Object)sourceFiles) {
            FileInputStream fis = new FileInputStream(f);
            FileChannel channel =(FileChannel)(Object) fis.getChannel();
            channel.transferTo(0, channel.size(), outChannel);
            channel.close();
            fis.close();
        }
        outChannel.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class List {

}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}
