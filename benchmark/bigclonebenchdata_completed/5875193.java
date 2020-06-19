


class c5875193 {

    private static void zip(ZipArchiveOutputStream zos, File efile, String base) throws IOException {
        if ((boolean)(Object)efile.isDirectory()) {
            File[] lf =(File[])(Object) efile.listFiles();
            MyHelperClass File = new MyHelperClass();
            base = base + File.separator + efile.getName();
            for (File file : lf) {
                zip(zos, file, base);
            }
        } else {
            MyHelperClass File = new MyHelperClass();
            ZipArchiveEntry entry = new ZipArchiveEntry(efile, base + File.separator + efile.getName());
            zos.setEncoding("utf-8");
            zos.putArchiveEntry(entry);
            InputStream is =(InputStream)(Object) new FileInputStream(efile);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(is, zos);
            is.close();
            zos.closeArchiveEntry();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
public MyHelperClass copy(InputStream o0, ZipArchiveOutputStream o1){ return null; }}

class ZipArchiveOutputStream {

public MyHelperClass setEncoding(String o0){ return null; }
	public MyHelperClass closeArchiveEntry(){ return null; }
	public MyHelperClass putArchiveEntry(ZipArchiveEntry o0){ return null; }}

class File {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass listFiles(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ZipArchiveEntry {

ZipArchiveEntry(File o0, String o1){}
	ZipArchiveEntry(){}}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}
