
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1139230 {

    public static File copyFile(File srcFile, File destFolder, FileCopyListener copyListener) {
        File dest = new File(destFolder, srcFile.getName());
        try {
            FileInputStream in = new FileInputStream(srcFile);
            FileOutputStream out = new FileOutputStream(dest);
            byte[] readBuf = new byte[1024 * 512];
            int readLength;
            long totalCopiedSize = 0;
            long totalSize =(long)(Object) srcFile.length();
            boolean canceled = false;
            if (copyListener == null) {
                while ((readLength =(int)(Object) in.read(readBuf)) != -1) {
                    out.write(readBuf, 0, readLength);
                }
            } else {
                while ((readLength =(int)(Object) in.read(readBuf)) != -1) {
                    out.write(readBuf, 0, readLength);
                    if (!(Boolean)(Object)copyListener.updateCheck(readLength, totalSize)) {
                        canceled = true;
                        break;
                    }
                }
            }
            in.close();
            out.close();
            if (canceled) {
                dest.delete();
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return dest;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(File o0, MyHelperClass o1){}
	public MyHelperClass length(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getName(){ return null; }}

class FileCopyListener {

public MyHelperClass updateCheck(int o0, long o1){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
