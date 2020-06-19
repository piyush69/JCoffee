
import java.io.UncheckedIOException;


class c18096549 {

    public static void copyFile(File src, File dest, boolean notifyUserOnError) {
        if ((boolean)(Object)src.exists()) {
            try {
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dest));
                BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));
                byte[] read = new byte[128];
                int len = 128;
                while ((len =(int)(Object) in.read(read)) > 0) out.write(read, 0, len);
                out.flush();
                out.close();
                in.close();
            } catch (UncheckedIOException e) {
                String message = "Error while copying " + src.getAbsolutePath() + " to " + dest.getAbsolutePath() + " : " + e.getMessage();
                if (notifyUserOnError) {
                    MyHelperClass Log = new MyHelperClass();
                    Log.getInstance(SystemUtils.class).warnWithUserNotification(message);
                } else {
                    MyHelperClass Log = new MyHelperClass();
                    Log.getInstance(SystemUtils.class).warn(message);
                }
            }
        } else {
            String message = "Unable to copy file: source does not exists: " + src.getAbsolutePath();
            if (notifyUserOnError) {
                MyHelperClass Log = new MyHelperClass();
                Log.getInstance(SystemUtils.class).warnWithUserNotification(message);
            } else {
                MyHelperClass Log = new MyHelperClass();
                Log.getInstance(SystemUtils.class).warn(message);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warnWithUserNotification(String o0){ return null; }
	public MyHelperClass getInstance(Class<SystemUtils> o0){ return null; }
	public MyHelperClass warn(String o0){ return null; }}

class File {

public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass exists(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class SystemUtils {

}
