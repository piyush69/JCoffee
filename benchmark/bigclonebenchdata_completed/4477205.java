


class c4477205 {

    private static void copyFile(File srcFile, File destFile, long chunkSize) throws IOException {
        FileInputStream is = null;
        FileOutputStream os = null;
        try {
            is = new FileInputStream(srcFile);
            FileChannel iChannel =(FileChannel)(Object) is.getChannel();
            os = new FileOutputStream(destFile, false);
            FileChannel oChannel =(FileChannel)(Object) os.getChannel();
            long doneBytes = 0L;
            long todoBytes =(long)(Object) srcFile.length();
            while (todoBytes != 0L) {
                long iterationBytes = Math.min(todoBytes, chunkSize);
                long transferredLength =(long)(Object) oChannel.transferFrom(iChannel, doneBytes, iterationBytes);
                if (iterationBytes != transferredLength) {
                    throw new IOException("Error during file transfer: expected " + iterationBytes + " bytes, only " + transferredLength + " bytes copied.");
                }
                doneBytes += transferredLength;
                todoBytes -= transferredLength;
            }
        } finally {
            if (is != null) {
                is.close();
            }
            if (os != null) {
                os.close();
            }
        }
        boolean successTimestampOp =(boolean)(Object) destFile.setLastModified(srcFile.lastModified());
        if (!successTimestampOp) {
            MyHelperClass log = new MyHelperClass();
            log.warn("Could not change timestamp for {}. Index synchronization may be slow.", destFile);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(String o0, File o1){ return null; }}

class File {

public MyHelperClass lastModified(){ return null; }
	public MyHelperClass setLastModified(MyHelperClass o0){ return null; }
	public MyHelperClass length(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0, boolean o1){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, long o1, long o2){ return null; }}
