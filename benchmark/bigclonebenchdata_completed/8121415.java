
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c8121415 {
public static MyHelperClass newInternalFile(Context o0, String o1, String o2){ return null; }
public static MyHelperClass AIOUtils;
	public static MyHelperClass log(String o0){ return null; }
//	public MyHelperClass newInternalFile(Context o0, String o1, String o2){ return null; }
//public MyHelperClass AIOUtils;
//	public MyHelperClass log(String o0){ return null; }

    public static File writeInternalFile(Context cx, URL url, String dir, String filename) {
        FileOutputStream fos = null;
        File fi = null;
        try {
            fi =(File)(Object) newInternalFile(cx, dir, filename);
            MyHelperClass FileUtils = new MyHelperClass();
            fos =(FileOutputStream)(Object) FileUtils.openOutputStream(fi);
            MyHelperClass IOUtils = new MyHelperClass();
            int length =(int)(Object) IOUtils.copy(url.openStream(), fos);
            log(length + " bytes copyed.");
        } catch (UncheckedIOException e) {
            AIOUtils.log("",(IOException)(Object) e);
        } finally {
            try {
                fos.close();
            } catch (UncheckedIOException e) {
                AIOUtils.log("",(IOException)(Object) e);
            }
        }
        return fi;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(MyHelperClass o0, FileOutputStream o1){ return null; }
	public MyHelperClass log(String o0, IOException o1){ return null; }
	public MyHelperClass openOutputStream(File o0){ return null; }}

class Context {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class File {

}

class FileOutputStream {

public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
