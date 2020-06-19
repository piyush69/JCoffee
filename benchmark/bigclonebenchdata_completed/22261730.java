
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22261730 {

    public static boolean fileCopy(String sFileSrc, String sFileDst) {
        boolean ok = true;
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File fSrc = new File(sFileSrc);
            int len = 32768;
            byte[] buff = new byte[(int) Math.min(len,(int)(Object) fSrc.length())];
            fis = new FileInputStream(fSrc);
            boolean append = false;
            fos = new FileOutputStream(sFileDst, append);
            while (0 < (len =(int)(Object) fis.read(buff))) fos.write(buff, 0, len);
            fos.flush();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            ok = false;
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (UncheckedIOException ex) {
                    ex.printStackTrace();
                    MyHelperClass JdxLog = new MyHelperClass();
                    JdxLog.logError((IOException)(Object)ex);
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (UncheckedIOException ex) {
                    ex.printStackTrace();
                    MyHelperClass JdxLog = new MyHelperClass();
                    JdxLog.logError((IOException)(Object)ex);
                }
            }
        }
        return ok;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass logError(IOException o0){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(String o0, boolean o1){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass length(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
