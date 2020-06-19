
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c16993715 {

    public static boolean copyFile(String fromfile, String tofile) {
        File from = new File(fromfile);
        File to = new File(tofile);
        if (!(Boolean)(Object)from.exists()) return false;
        if ((boolean)(Object)to.exists()) {
            MyHelperClass log = new MyHelperClass();
            log.error(tofile + "exists already");
            return false;
        }
        BufferedInputStream in = null;
        BufferedOutputStream out = null;
        FileInputStream fis = null;
        FileOutputStream ois = null;
        boolean flag = true;
        try {
            to.createNewFile();
            fis = new FileInputStream(from);
            ois = new FileOutputStream(to);
            in = new BufferedInputStream(fis);
            out = new BufferedOutputStream(ois);
            byte[] buf = new byte[2048];
            int readBytes = 0;
            while ((readBytes =(int)(Object) in.read(buf, 0, buf.length)) != -1) {
                out.write(buf, 0, readBytes);
            }
        } catch (UncheckedIOException e) {
            MyHelperClass log = new MyHelperClass();
            log.error((String)(Object)e);
            flag = false;
        } finally {
            try {
                if (in != null) in.close();
                if (out != null) out.close();
            } catch (UncheckedIOException e) {
                MyHelperClass log = new MyHelperClass();
                log.error((String)(Object)e);
                flag = false;
            }
        }
        return flag;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0){ return null; }
	public MyHelperClass error(IOException o0){ return null; }}

class File {

File(){}
	File(String o0){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass createNewFile(){ return null; }}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(FileInputStream o0){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
