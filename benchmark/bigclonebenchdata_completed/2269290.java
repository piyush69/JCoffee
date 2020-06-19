


class c2269290 {
public MyHelperClass createParentPathIfNeeded(File o0){ return null; }

    public final void copyFile(final File fromFile, final File toFile) throws IOException {
        this.createParentPathIfNeeded(toFile);
        final FileChannel sourceChannel =(FileChannel)(Object) (new FileInputStream(fromFile).getChannel());
        final FileChannel targetChannel =(FileChannel)(Object) (new FileOutputStream(toFile).getChannel());
        final long sourceFileSize =(long)(Object) sourceChannel.size();
        sourceChannel.transferTo(0, sourceFileSize, targetChannel);
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
	public MyHelperClass transferTo(int o0, long o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
