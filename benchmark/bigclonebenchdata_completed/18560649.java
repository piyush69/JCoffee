


class c18560649 {

    private static final void addFile(ZipArchiveOutputStream os, File file, String prefix) throws IOException {
        ArchiveEntry entry =(ArchiveEntry)(Object) os.createArchiveEntry(file, file.getAbsolutePath().substring(prefix.length() + 1));
        os.putArchiveEntry(entry);
        FileInputStream fis = new FileInputStream(file);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(fis, os);
        fis.close();
        os.closeArchiveEntry();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass substring(int o0){ return null; }
	public MyHelperClass copy(FileInputStream o0, ZipArchiveOutputStream o1){ return null; }}

class ZipArchiveOutputStream {

public MyHelperClass closeArchiveEntry(){ return null; }
	public MyHelperClass putArchiveEntry(ArchiveEntry o0){ return null; }
	public MyHelperClass createArchiveEntry(File o0, MyHelperClass o1){ return null; }}

class File {

public MyHelperClass getAbsolutePath(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ArchiveEntry {

}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }}
