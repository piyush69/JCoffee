


class c19251429 {

    private static void addFile(File file, ZipArchiveOutputStream zaos) throws IOException {
        String filename = null;
        filename =(String)(Object) file.getName();
        ZipArchiveEntry zae = new ZipArchiveEntry(filename);
        zae.setSize(file.length());
        zaos.putArchiveEntry(zae);
        FileInputStream fis = new FileInputStream(file);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(fis, zaos);
        zaos.closeArchiveEntry();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(FileInputStream o0, ZipArchiveOutputStream o1){ return null; }}

class File {

public MyHelperClass getName(){ return null; }
	public MyHelperClass length(){ return null; }}

class ZipArchiveOutputStream {

public MyHelperClass closeArchiveEntry(){ return null; }
	public MyHelperClass putArchiveEntry(ZipArchiveEntry o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ZipArchiveEntry {

ZipArchiveEntry(String o0){}
	ZipArchiveEntry(){}
	public MyHelperClass setSize(MyHelperClass o0){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}
