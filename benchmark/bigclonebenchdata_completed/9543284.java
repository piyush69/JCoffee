
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c9543284 {
public static MyHelperClass copyBuffer;
//public MyHelperClass copyBuffer;

    public static final void copyFile(String srcFilename, String dstFilename) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        FileChannel ifc = null;
        FileChannel ofc = null;
        copyBuffer.clear();
        try {
            fis = new FileInputStream(srcFilename);
            ifc =(FileChannel)(Object) fis.getChannel();
            fos = new FileOutputStream(dstFilename);
            ofc =(FileChannel)(Object) fos.getChannel();
            int sz = (int)(int)(Object) ifc.size();
            int n = 0;
            while (n < sz) {
                MyHelperClass Util = new MyHelperClass();
                if ((int)(Object)ifc.read(Util.copyBuffer) < 0) {
                    break;
                }
                copyBuffer.flip();
//                MyHelperClass Util = new MyHelperClass();
                n += (int)(Object)ofc.write(Util.copyBuffer);
                copyBuffer.compact();
            }
        } finally {
            try {
                if (ifc != null) {
                    ifc.close();
                } else if (fis != null) {
                    fis.close();
                }
            } catch (UncheckedIOException exc) {
            }
            try {
                if (ofc != null) {
                    ofc.close();
                } else if (fos != null) {
                    fos.close();
                }
            } catch (UncheckedIOException exc) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass copyBuffer;
public MyHelperClass compact(){ return null; }
	public MyHelperClass clear(){ return null; }
	public MyHelperClass flip(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass read(MyHelperClass o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass write(MyHelperClass o0){ return null; }}
