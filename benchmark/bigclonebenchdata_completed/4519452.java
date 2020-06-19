


class c4519452 {

    private void copyFile(File s, File d) throws IOException {
        d.getParentFile().mkdirs();
        FileChannel inChannel =(FileChannel)(Object) (new FileInputStream(s).getChannel());
        FileChannel outChannel =(FileChannel)(Object) (new FileOutputStream(d).getChannel());
        int maxCount = (64 * 1024 * 1024) - (32 * 1024);
        long size =(long)(Object) inChannel.size();
        long position = 0;
        while (position < size) {
            position += (long)(Object)inChannel.transferTo(position, maxCount, outChannel);
        }
        inChannel.close();
        outChannel.close();
        d.setLastModified(s.lastModified());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass mkdirs(){ return null; }}

class File {

public MyHelperClass lastModified(){ return null; }
	public MyHelperClass setLastModified(MyHelperClass o0){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(long o0, int o1, FileChannel o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
