


class c11265073 {
public static MyHelperClass FileUtils;
//public MyHelperClass FileUtils;

    public static void zip(File srcDir, File destFile, FileFilter filter) throws IOException {
        ZipOutputStream out = null;
        try {
            out = new ZipOutputStream(new FileOutputStream(destFile));
            MyHelperClass TrueFileFilter = new MyHelperClass();
            Collection files =(Collection)(Object) FileUtils.listFiles(srcDir, TrueFileFilter.TRUE, TrueFileFilter.TRUE);
            for (File f :(File[])(Object) (Object[])(Object)files) {
                if (filter == null || (boolean)(Object)filter.accept(f)) {
                    MyHelperClass FileUtils = new MyHelperClass();
                    FileInputStream in =(FileInputStream)(Object) FileUtils.openInputStream(f);
                    MyHelperClass Util = new MyHelperClass();
                    out.putNextEntry(new ZipEntry(Util.relativePath(srcDir, f).replace('\\', '/')));
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copyLarge(in, out);
                    out.closeEntry();
//                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.closeQuietly(in);
                }
            }
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(out);
        } catch (Throwable t) {
            throw new IOException("Failed to create zip file", t);
        } finally {
            if (out != null) {
                out.flush();
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(out);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TRUE;
public MyHelperClass listFiles(File o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass closeQuietly(ZipOutputStream o0){ return null; }
	public MyHelperClass copyLarge(FileInputStream o0, ZipOutputStream o1){ return null; }
	public MyHelperClass replace(char o0, char o1){ return null; }
	public MyHelperClass relativePath(File o0, File o1){ return null; }
	public MyHelperClass openInputStream(File o0){ return null; }
	public MyHelperClass closeQuietly(FileInputStream o0){ return null; }}

class File {

}

class FileFilter {

public MyHelperClass accept(File o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
	IOException(String o0, Throwable o1){}
	IOException(){}
}

class ZipOutputStream {

ZipOutputStream(FileOutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class Collection {

}

class FileInputStream {

}

class ZipEntry {

ZipEntry(MyHelperClass o0){}
	ZipEntry(){}}
