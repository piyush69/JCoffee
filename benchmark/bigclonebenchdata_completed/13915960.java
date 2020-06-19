


class c13915960 {

    protected void copyFile(final String sourceFileName, final File path) throws IOException {
        final File source = new File(sourceFileName);
        final File destination = new File(path, source.getName());
        FileChannel srcChannel = null;
        FileChannel dstChannel = null;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(source);
            srcChannel =(FileChannel)(Object) fileInputStream.getChannel();
            fileOutputStream = new FileOutputStream(destination);
            dstChannel =(FileChannel)(Object) fileOutputStream.getChannel();
            dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
        } finally {
            try {
                if (dstChannel != null) {
                    dstChannel.close();
                }
            } catch (Exception exception) {
            }
            try {
                if (srcChannel != null) {
                    srcChannel.close();
                }
            } catch (Exception exception) {
            }
            try {
                fileInputStream.close();
            } catch (Exception exception) {
            }
            try {
                fileOutputStream.close();
            } catch (Exception exception) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(String o0){}
	File(File o0, MyHelperClass o1){}
	public MyHelperClass getName(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}
