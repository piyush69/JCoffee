


class c3253027 {

    private static void addFile(File file, TarArchiveOutputStream taos) throws IOException {
        String filename = null;
        filename =(String)(Object) file.getName();
        TarArchiveEntry tae = new TarArchiveEntry(filename);
        tae.setSize(file.length());
        taos.putArchiveEntry(tae);
        FileInputStream fis = new FileInputStream(file);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(fis, taos);
        taos.closeArchiveEntry();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(FileInputStream o0, TarArchiveOutputStream o1){ return null; }}

class File {

public MyHelperClass getName(){ return null; }
	public MyHelperClass length(){ return null; }}

class TarArchiveOutputStream {

public MyHelperClass closeArchiveEntry(){ return null; }
	public MyHelperClass putArchiveEntry(TarArchiveEntry o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class TarArchiveEntry {

TarArchiveEntry(String o0){}
	TarArchiveEntry(){}
	public MyHelperClass setSize(MyHelperClass o0){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}
