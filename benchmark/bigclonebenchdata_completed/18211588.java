
import java.io.UncheckedIOException;


class c18211588 {

    public static boolean copyTextFile(File src, File dst) {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dst));
            byte[] buf = new byte[1024];
            int readsize = 0;
            while ((readsize =(int)(Object) bis.read(buf)) != -1) {
                bos.write(buf, 0, readsize);
            }
            bos.flush();
            bos.close();
            bis.close();
        } catch (UncheckedIOException e) {
            MyHelperClass ServerConsoleServlet = new MyHelperClass();
            ServerConsoleServlet.printSystemLog(e.toString() + " " + e.getMessage(), ServerConsoleServlet.LOG_ERROR);
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass LOG_ERROR;
public MyHelperClass printSystemLog(String o0, MyHelperClass o1){ return null; }}

class File {

}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
