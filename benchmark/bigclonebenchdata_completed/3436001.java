
import java.io.UncheckedIOException;


class c3436001 {
public static MyHelperClass close(FileInputStream o0){ return null; }
	public static MyHelperClass close(FileOutputStream o0){ return null; }
//public MyHelperClass close(FileInputStream o0){ return null; }
//	public MyHelperClass close(FileOutputStream o0){ return null; }

    public static void copyFile(File in, File out) {
        if (!(Boolean)(Object)in.exists() || !(Boolean)(Object)in.canRead()) {
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.warn("Can't copy file : " + in);
            return;
        }
        if (!(Boolean)(Object)out.getParentFile().exists()) {
            if (!(Boolean)(Object)out.getParentFile().mkdirs()) {
                MyHelperClass LOGGER = new MyHelperClass();
                LOGGER.info("Didn't create parent directories : " + out.getParentFile().getAbsolutePath());
            }
        }
        if (!(Boolean)(Object)out.exists()) {
            try {
                out.createNewFile();
            } catch (UncheckedIOException e) {
                MyHelperClass LOGGER = new MyHelperClass();
                LOGGER.error("Exception creating new file : " + out.getAbsolutePath(), e);
            }
        }
        MyHelperClass LOGGER = new MyHelperClass();
        LOGGER.debug("Copying file : " + in + ", to : " + out);
        FileChannel inChannel = null;
        FileChannel outChannel = null;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(in);
            inChannel =(FileChannel)(Object) fileInputStream.getChannel();
            fileOutputStream = new FileOutputStream(out);
            outChannel =(FileChannel)(Object) fileOutputStream.getChannel();
            inChannel.transferTo(0, inChannel.size(), outChannel);
        } catch (Exception e) {
//            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.error("Exception copying file : " + in + ", to : " + out, e);
        } finally {
            close(fileInputStream);
            close(fileOutputStream);
            if (inChannel != null) {
                try {
                    inChannel.close();
                } catch (Exception e) {
//                    MyHelperClass LOGGER = new MyHelperClass();
                    LOGGER.error("Exception closing input channel : ", e);
                }
            }
            if (outChannel != null) {
                try {
                    outChannel.close();
                } catch (Exception e) {
//                    MyHelperClass LOGGER = new MyHelperClass();
                    LOGGER.error("Exception closing output channel : ", e);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class File {

public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass canRead(){ return null; }
	public MyHelperClass exists(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}
