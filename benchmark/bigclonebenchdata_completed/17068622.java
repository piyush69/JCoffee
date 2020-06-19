


class c17068622 {
public static MyHelperClass getAbsFileName(MyHelperClass o0, File o1){ return null; }
//public MyHelperClass getAbsFileName(MyHelperClass o0, File o1){ return null; }

    public static void main(String args[]) throws Exception {
        File file = new File("D:/work/love.txt");
        @SuppressWarnings("unused") ZipFile zipFile = new ZipFile("D:/work/test1.zip");
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("D:/work/test1.zip"));
        zos.setEncoding("GBK");
        ZipEntry entry = null;
        if ((boolean)(Object)file.isDirectory()) {
            MyHelperClass source = new MyHelperClass();
            entry = new ZipEntry(getAbsFileName(source, file) + "/");
        } else {
            MyHelperClass source = new MyHelperClass();
            entry = new ZipEntry(getAbsFileName(source, file));
        }
        entry.setSize(file.length());
        entry.setTime(file.lastModified());
        zos.putNextEntry(entry);
        int readLen = 0;
        byte[] buf = new byte[2048];
        if ((boolean)(Object)file.isFile()) {
            InputStream in =(InputStream)(Object) new BufferedInputStream(new FileInputStream(file));
            while ((readLen =(int)(Object) in.read(buf, 0, 2048)) != -1) {
                zos.write(buf, 0, readLen);
            }
            in.close();
        }
        zos.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(String o0){}
	public MyHelperClass length(){ return null; }
	public MyHelperClass lastModified(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass isFile(){ return null; }}

class ZipFile {

ZipFile(String o0){}
	ZipFile(){}}

class ZipOutputStream {

ZipOutputStream(FileOutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass setEncoding(String o0){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class ZipEntry {

ZipEntry(){}
	ZipEntry(MyHelperClass o0){}
	ZipEntry(String o0){}
	public MyHelperClass setSize(MyHelperClass o0){ return null; }
	public MyHelperClass setTime(MyHelperClass o0){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}
