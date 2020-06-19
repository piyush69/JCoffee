


class c1347808 {
public static MyHelperClass print(String o0){ return null; }
//public MyHelperClass print(String o0){ return null; }

    public static void main(String[] args) throws IOException {
        FileOutputStream f = new FileOutputStream("test.zip");
        CheckedOutputStream csum = new CheckedOutputStream(f, new Adler32());
        ZipOutputStream zos = new ZipOutputStream(csum);
        BufferedOutputStream out = new BufferedOutputStream(zos);
        zos.setComment("A test of Java Zipping");
        for (String arg : args) {
            print("Writing file " + arg);
            BufferedReader in = new BufferedReader(new FileReader(arg));
            zos.putNextEntry(new ZipEntry(arg));
            int c;
            while ((c =(int)(Object) in.read()) != -1) out.write(c);
            in.close();
            out.flush();
        }
        out.close();
        print("Checksum: " + csum.getChecksum().getValue());
        print("Reading file");
        FileInputStream fi = new FileInputStream("test.zip");
        CheckedInputStream csumi = new CheckedInputStream(fi, new Adler32());
        ZipInputStream in2 = new ZipInputStream(csumi);
        BufferedInputStream bis = new BufferedInputStream(in2);
        ZipEntry ze;
        while ((ze =(ZipEntry)(Object) in2.getNextEntry()) != null) {
            print("Reading file " + ze);
            int x;
            while ((x =(int)(Object) bis.read()) != -1) System.out.write(x);
        }
        if (args.length == 1) print("Checksum: " + csumi.getChecksum().getValue());
        bis.close();
        ZipFile zf = new ZipFile("test.zip");
        Enumeration e =(Enumeration)(Object) zf.entries();
        while ((boolean)(Object)e.hasMoreElements()) {
            ZipEntry ze2 = (ZipEntry)(ZipEntry)(Object) e.nextElement();
            print("File: " + ze2);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getValue(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class CheckedOutputStream {

CheckedOutputStream(FileOutputStream o0, Adler32 o1){}
	CheckedOutputStream(){}
	public MyHelperClass getChecksum(){ return null; }}

class Adler32 {

}

class ZipOutputStream {

ZipOutputStream(CheckedOutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass setComment(String o0){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(){}
	BufferedOutputStream(ZipOutputStream o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class BufferedReader {

BufferedReader(FileReader o0){}
	BufferedReader(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileReader {

FileReader(String o0){}
	FileReader(){}}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class CheckedInputStream {

CheckedInputStream(FileInputStream o0, Adler32 o1){}
	CheckedInputStream(){}
	public MyHelperClass getChecksum(){ return null; }}

class ZipInputStream {

ZipInputStream(CheckedInputStream o0){}
	ZipInputStream(){}
	public MyHelperClass getNextEntry(){ return null; }}

class BufferedInputStream {

BufferedInputStream(ZipInputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipFile {

ZipFile(String o0){}
	ZipFile(){}
	public MyHelperClass entries(){ return null; }}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}
