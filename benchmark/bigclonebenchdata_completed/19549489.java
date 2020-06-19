


class c19549489 {

    public static void copy(File sourceFile, File destinationFile) throws IOException {
        FileChannel sourceFileChannel =(FileChannel)(Object) (new FileInputStream(sourceFile)).getChannel();
        FileChannel destinationFileChannel =(FileChannel)(Object) (new FileOutputStream(destinationFile)).getChannel();
        sourceFileChannel.transferTo(0, sourceFile.length(), destinationFileChannel);
        sourceFileChannel.close();
        destinationFileChannel.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass length(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}
