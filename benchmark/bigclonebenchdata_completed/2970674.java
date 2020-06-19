
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c2970674 {

    private void chopFileDisk() throws IOException {
        MyHelperClass logFile = new MyHelperClass();
        File tempFile = new File("" + logFile + ".tmp");
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        long startCopyPos;
        byte readBuffer[] = new byte[2048];
        int readCount;
        long totalBytesRead = 0;
        MyHelperClass reductionRatio = new MyHelperClass();
        if ((int)(Object)reductionRatio > 0 &&(int)(Object) logFile.length() > 0) {
//            MyHelperClass logFile = new MyHelperClass();
            startCopyPos =(int)(Object) logFile.length() / (int)(Object)reductionRatio;
        } else {
            startCopyPos = 0;
        }
        try {
//            MyHelperClass logFile = new MyHelperClass();
            bis = new BufferedInputStream(new FileInputStream(logFile));
            bos = new BufferedOutputStream(new FileOutputStream(tempFile));
            do {
                readCount =(int)(Object) bis.read(readBuffer, 0, readBuffer.length);
                if (readCount > 0) {
                    totalBytesRead += readCount;
                    if (totalBytesRead > startCopyPos) {
                        bos.write(readBuffer, 0, readCount);
                    }
                }
            } while (readCount > 0);
        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (UncheckedIOException ex) {
                }
            }
            if (bis != null) {
                try {
                    bis.close();
                } catch (UncheckedIOException ex) {
                }
            }
        }
        if ((boolean)(Object)tempFile.isFile()) {
//            MyHelperClass logFile = new MyHelperClass();
            if (!(Boolean)(Object)logFile.delete()) {
//                MyHelperClass logFile = new MyHelperClass();
                throw new IOException("Error when attempting to delete the " + logFile + " file.");
            }
//            MyHelperClass logFile = new MyHelperClass();
            if (!(Boolean)(Object)tempFile.renameTo(logFile)) {
//                MyHelperClass logFile = new MyHelperClass();
                throw new IOException("Error when renaming the " + tempFile + " to " + logFile + ".");
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass delete(){ return null; }
	public MyHelperClass length(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}
	public MyHelperClass renameTo(MyHelperClass o0){ return null; }
	public MyHelperClass isFile(){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
