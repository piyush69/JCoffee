


class c19251426 {

    private static void recurseFiles(File root, File file, ZipArchiveOutputStream zaos, boolean absolute) throws IOException {
        if ((boolean)(Object)file.isDirectory()) {
            File[] files =(File[])(Object) file.listFiles();
            for (File file2 : files) {
                recurseFiles(root, file2, zaos, absolute);
            }
        } else if ((!(Boolean)(Object)file.getName().endsWith(".zip")) && (!(Boolean)(Object)file.getName().endsWith(".ZIP"))) {
            String filename = null;
            if (absolute) {
                filename =(String)(Object) file.getAbsolutePath().substring(root.getAbsolutePath().length());
            } else {
                filename =(String)(Object) file.getName();
            }
            ZipArchiveEntry zae = new ZipArchiveEntry(filename);
            zae.setSize(file.length());
            zaos.putArchiveEntry(zae);
            FileInputStream fis = new FileInputStream(file);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(fis, zaos);
            zaos.closeArchiveEntry();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass substring(MyHelperClass o0){ return null; }
	public MyHelperClass copy(FileInputStream o0, ZipArchiveOutputStream o1){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass endsWith(String o0){ return null; }}

class File {

public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass listFiles(){ return null; }}

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
