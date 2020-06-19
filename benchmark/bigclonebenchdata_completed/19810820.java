


class c19810820 {

    public static void copyFileChannel(File src, File dst, boolean preserveModificationTime) throws IOException {
        FileChannel inputChannel = null;
        FileChannel outputChannel = null;
        long length = 0;
        try {
            inputChannel =(FileChannel)(Object) (new FileInputStream(src).getChannel());
            length =(long)(Object) inputChannel.size();
            outputChannel =(FileChannel)(Object) (new FileOutputStream(dst).getChannel());
            long total = 0;
            while (total < length) {
                total += (long)(Object)inputChannel.transferTo(0, length, outputChannel);
            }
            if (preserveModificationTime) {
                dst.setLastModified(src.lastModified());
            }
        } finally {
            if (inputChannel != null) {
                inputChannel.close();
            }
            if (outputChannel != null) {
                outputChannel.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass lastModified(){ return null; }
	public MyHelperClass setLastModified(MyHelperClass o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass close(){ return null; }
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
