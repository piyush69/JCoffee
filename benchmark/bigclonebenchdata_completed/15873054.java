


class c15873054 {

    public static final long copyFile(final File srcFile, final File dstFile, final long cpySize) throws IOException {
        if ((null == srcFile) || (null == dstFile)) return (-1L);
        final File dstFolder =(File)(Object) dstFile.getParentFile();
        if ((!(Boolean)(Object)dstFolder.exists()) && (!(Boolean)(Object)dstFolder.mkdirs())) throw new IOException("Failed to created destination folder(s)");
        FileChannel srcChannel = null, dstChannel = null;
        try {
            srcChannel =(FileChannel)(Object) (new FileInputStream(srcFile).getChannel());
            dstChannel =(FileChannel)(Object) (new FileOutputStream(dstFile).getChannel());
            final long srcLen =(long)(Object) srcFile.length(), copyLen =(long)(Object) dstChannel.transferFrom(srcChannel, 0, (cpySize < 0L) ? srcLen : cpySize);
            if ((cpySize < 0L) && (copyLen != srcLen)) return (-2L);
            return copyLen;
        } finally {
            MyHelperClass FileUtil = new MyHelperClass();
            FileUtil.closeAll(srcChannel, dstChannel);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeAll(FileChannel o0, FileChannel o1){ return null; }}

class File {

public MyHelperClass length(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, long o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
