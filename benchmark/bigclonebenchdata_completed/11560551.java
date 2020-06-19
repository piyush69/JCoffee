


class c11560551 {
public static MyHelperClass FileUtils;
//public MyHelperClass FileUtils;

    private static void extract(ZipFile zipFile) throws Exception {
        MyHelperClass WEBKIT_DIR = new MyHelperClass();
        FileUtils.deleteQuietly(WEBKIT_DIR);
//        MyHelperClass WEBKIT_DIR = new MyHelperClass();
        WEBKIT_DIR.mkdirs();
        Enumeration entries =(Enumeration)(Object) zipFile.entries();
        while ((boolean)(Object)entries.hasMoreElements()) {
            ZipEntry entry =(ZipEntry)(Object) entries.nextElement();
            if ((boolean)(Object)entry.isDirectory()) {
//                MyHelperClass WEBKIT_DIR = new MyHelperClass();
                new File(WEBKIT_DIR, entry.getName()).mkdirs();
                continue;
            }
            InputStream inputStream =(InputStream)(Object) zipFile.getInputStream(entry);
//            MyHelperClass WEBKIT_DIR = new MyHelperClass();
            File outputFile = new File(WEBKIT_DIR, entry.getName());
            FileOutputStream outputStream = new FileOutputStream(outputFile);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(inputStream, outputStream);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(inputStream);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(outputStream);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass deleteQuietly(MyHelperClass o0){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class ZipFile {

public MyHelperClass getInputStream(ZipEntry o0){ return null; }
	public MyHelperClass entries(){ return null; }}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class ZipEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class File {

File(MyHelperClass o0, MyHelperClass o1){}
	File(){}
	public MyHelperClass mkdirs(){ return null; }}

class InputStream {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
