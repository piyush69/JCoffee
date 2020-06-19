


class c2642914 {

    private static void addFileToTarGz(TarArchiveOutputStream taro, String path, String base) throws IOException {
        File f = new File(path);
        String entryName = base + f.getName();
        FileInputStream goIn = new FileInputStream(f);
        TarArchiveEntry tarEntry = new TarArchiveEntry(f, entryName);
        MyHelperClass TarArchiveOutputStream = new MyHelperClass();
        taro.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);
        taro.putArchiveEntry(tarEntry);
        if ((boolean)(Object)f.isFile()) {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(goIn, taro);
            taro.closeArchiveEntry();
        } else {
            taro.closeArchiveEntry();
            File[] children =(File[])(Object) f.listFiles();
            if (children != null) {
                for (File child : children) {
                    addFileToTarGz(taro,(String)(Object) child.getAbsolutePath(), entryName + "/");
                }
            }
        }
        taro.close();
        goIn.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass LONGFILE_GNU;
public MyHelperClass copy(FileInputStream o0, TarArchiveOutputStream o1){ return null; }}

class TarArchiveOutputStream {

public MyHelperClass closeArchiveEntry(){ return null; }
	public MyHelperClass setLongFileMode(MyHelperClass o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass putArchiveEntry(TarArchiveEntry o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(){}
	File(String o0){}
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass listFiles(){ return null; }
	public MyHelperClass isFile(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }}

class TarArchiveEntry {

TarArchiveEntry(File o0, String o1){}
	TarArchiveEntry(){}}
