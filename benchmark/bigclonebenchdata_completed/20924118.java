


class c20924118 {

    public static void zip() throws Exception {
        System.out.println("zip()");
        ZipOutputStream zipout = new ZipOutputStream(new FileOutputStream(new File("/zip/myzip.zip")));
        ZipEntry entry = new ZipEntry("asdf.script");
        zipout.putNextEntry(entry);
        MyHelperClass BLOCKSIZE = new MyHelperClass();
        byte buffer[] = new byte[(int)(Object)BLOCKSIZE];
        FileInputStream in = new FileInputStream(new File("/zip/asdf.script"));
//        MyHelperClass BLOCKSIZE = new MyHelperClass();
        for (int length; (length =(int)(Object) in.read(buffer, 0, BLOCKSIZE)) != -1; ) zipout.write(buffer, 0, length);
        in.close();
        zipout.closeEntry();
        zipout.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ZipOutputStream {

ZipOutputStream(FileOutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class File {

File(String o0){}
	File(){}}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(byte[] o0, int o1, MyHelperClass o2){ return null; }}
