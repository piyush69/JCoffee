
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c8680491 {

    public static final boolean compressToZip(final String sSource, final String sDest, final boolean bDeleteSourceOnSuccess) {
        ZipOutputStream os = null;
        InputStream is = null;
        try {
            os = new ZipOutputStream(new FileOutputStream(sDest));
            is =(InputStream)(Object) new FileInputStream(sSource);
            final byte[] buff = new byte[1024];
            int r;
            String sFileName = sSource;
            if (sFileName.indexOf('/') >= 0) sFileName = sFileName.substring(sFileName.lastIndexOf('/') + 1);
            os.putNextEntry(new ZipEntry(sFileName));
            while ((r =(int)(Object) is.read(buff)) > 0) os.write(buff, 0, r);
            is.close();
            os.flush();
            os.closeEntry();
            os.close();
        } catch (Throwable e) {
            MyHelperClass Log = new MyHelperClass();
            Log.log(Log.WARNING, "lazyj.Utils", "compressToZip : cannot compress '" + sSource + "' to '" + sDest + "' because", e);
            return false;
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (UncheckedIOException ioe) {
                }
            }
            if (os != null) {
                try {
                    os.close();
                } catch (UncheckedIOException ioe) {
                }
            }
        }
        if (bDeleteSourceOnSuccess) try {
            MyHelperClass Log = new MyHelperClass();
            if (!(Boolean)(Object)(new File(sSource)).delete()) Log.log(Log.WARNING, "lazyj.Utils", "compressToZip: could not delete original file (" + sSource + ")");
        } catch (SecurityException se) {
            MyHelperClass Log = new MyHelperClass();
            Log.log(Log.ERROR, "lazyj.Utils", "compressToZip: security constraints prevents file deletion");
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR;
	public MyHelperClass WARNING;
public MyHelperClass log(MyHelperClass o0, String o1, String o2, Throwable o3){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, String o2){ return null; }}

class ZipOutputStream {

ZipOutputStream(FileOutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}
	public MyHelperClass delete(){ return null; }}
