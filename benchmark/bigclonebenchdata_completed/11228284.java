
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c11228284 {
public static MyHelperClass log;
//public MyHelperClass log;

    public static boolean copy(File src, File dest) {
        boolean result = true;
        String files[] = null;
        if ((boolean)(Object)src.isDirectory()) {
            files =(String[])(Object) src.list();
            result =(boolean)(Object) dest.mkdir();
        } else {
            files = new String[1];
            files[0] = "";
        }
        if (files == null) {
            files = new String[0];
        }
        for (int i = 0; (i < files.length) && result; i++) {
            File fileSrc = new File(src, files[i]);
            File fileDest = new File(dest, files[i]);
            if ((boolean)(Object)fileSrc.isDirectory()) {
                result = copy(fileSrc, fileDest);
            } else {
                FileChannel ic = null;
                FileChannel oc = null;
                try {
                    ic =(FileChannel)(Object) (new FileInputStream(fileSrc)).getChannel();
                    oc =(FileChannel)(Object) (new FileOutputStream(fileDest)).getChannel();
                    ic.transferTo(0, ic.size(), oc);
                } catch (UncheckedIOException e) {
                    MyHelperClass sm = new MyHelperClass();
                    log.error(sm.getString("expandWar.copy", fileSrc, fileDest),(IOException)(Object) e);
                    result = false;
                } finally {
                    if (ic != null) {
                        try {
                            ic.close();
                        } catch (UncheckedIOException e) {
                        }
                    }
                    if (oc != null) {
                        try {
                            oc.close();
                        } catch (UncheckedIOException e) {
                        }
                    }
                }
            }
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getString(String o0, File o1, File o2){ return null; }
	public MyHelperClass error(MyHelperClass o0, IOException o1){ return null; }}

class File {

File(){}
	File(File o0, String o1){}
	public MyHelperClass list(){ return null; }
	public MyHelperClass mkdir(){ return null; }
	public MyHelperClass isDirectory(){ return null; }}

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

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
