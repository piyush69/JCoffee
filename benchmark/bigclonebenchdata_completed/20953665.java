


class c20953665 {
public MyHelperClass log(String o0){ return null; }
	public MyHelperClass calcChecksum(File o0, CRC32 o1){ return null; }

    private void packageDestZip(File tmpFile) throws FileNotFoundException, IOException {
        MyHelperClass destfile = new MyHelperClass();
        log("Creating launch profile package " + destfile);
//        MyHelperClass destfile = new MyHelperClass();
        ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(destfile)));
        MyHelperClass RESOURCE_JAR_FILENAME = new MyHelperClass();
        ZipEntry e = new ZipEntry(RESOURCE_JAR_FILENAME);
        MyHelperClass ZipEntry = new MyHelperClass();
        e.setMethod(ZipEntry.STORED);
        e.setSize(tmpFile.length());
        e.setCompressedSize(tmpFile.length());
        e.setCrc(calcChecksum(tmpFile, new CRC32()));
        out.putNextEntry(e);
        InputStream in =(InputStream)(Object) new BufferedInputStream(new FileInputStream(tmpFile));
        int c;
        while ((c =(int)(Object) in.read()) != -1) out.write(c);
        in.close();
        out.closeEntry();
        out.finish();
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass STORED;
}

class File {

public MyHelperClass length(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ZipOutputStream {

ZipOutputStream(){}
	ZipOutputStream(BufferedOutputStream o0){}
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass finish(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(MyHelperClass o0){}
	FileOutputStream(){}}

class ZipEntry {

ZipEntry(){}
	ZipEntry(MyHelperClass o0){}
	public MyHelperClass setSize(MyHelperClass o0){ return null; }
	public MyHelperClass setCompressedSize(MyHelperClass o0){ return null; }
	public MyHelperClass setCrc(MyHelperClass o0){ return null; }
	public MyHelperClass setMethod(MyHelperClass o0){ return null; }}

class CRC32 {

}

class InputStream {

public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}
