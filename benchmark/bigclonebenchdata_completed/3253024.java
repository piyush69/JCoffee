


class c3253024 {

    private static void recurseFiles(File root, File file, TarArchiveOutputStream taos, boolean absolute) throws IOException {
        if ((boolean)(Object)file.isDirectory()) {
            File[] files =(File[])(Object) file.listFiles();
            for (File file2 : files) {
                recurseFiles(root, file2, taos, absolute);
            }
        } else if ((!(Boolean)(Object)file.getName().endsWith(".tar")) && (!(Boolean)(Object)file.getName().endsWith(".TAR"))) {
            String filename = null;
            if (absolute) {
                filename =(String)(Object) file.getAbsolutePath().substring(root.getAbsolutePath().length());
            } else {
                filename =(String)(Object) file.getName();
            }
            TarArchiveEntry tae = new TarArchiveEntry(filename);
            tae.setSize(file.length());
            taos.putArchiveEntry(tae);
            FileInputStream fis = new FileInputStream(file);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(fis, taos);
            taos.closeArchiveEntry();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(FileInputStream o0, TarArchiveOutputStream o1){ return null; }
	public MyHelperClass substring(MyHelperClass o0){ return null; }
	public MyHelperClass endsWith(String o0){ return null; }
	public MyHelperClass length(){ return null; }}

class File {

public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass listFiles(){ return null; }}

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
