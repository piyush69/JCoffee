


class c19251430 {

    public static List unZip(File tarFile, File directory) throws IOException {
        List result =(List)(Object) new ArrayList();
        InputStream inputStream =(InputStream)(Object) new FileInputStream(tarFile);
        ZipArchiveInputStream in = new ZipArchiveInputStream(inputStream);
        ZipArchiveEntry entry =(ZipArchiveEntry)(Object) in.getNextZipEntry();
        while (entry != null) {
            OutputStream out =(OutputStream)(Object) new FileOutputStream(new File(directory, entry.getName()));
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(in, out);
            out.close();
            result.add(entry.getName());
            entry =(ZipArchiveEntry)(Object) in.getNextZipEntry();
        }
        in.close();
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(ZipArchiveInputStream o0, OutputStream o1){ return null; }}

class File {

File(File o0, MyHelperClass o1){}
	File(){}}

class List {

public MyHelperClass add(MyHelperClass o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ArrayList {

}

class InputStream {

}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class ZipArchiveInputStream {

ZipArchiveInputStream(InputStream o0){}
	ZipArchiveInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getNextZipEntry(){ return null; }}

class ZipArchiveEntry {

public MyHelperClass getName(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
