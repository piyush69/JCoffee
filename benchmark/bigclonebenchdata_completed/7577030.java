


class c7577030 {
public MyHelperClass log(String o0){ return null; }

    private void zipFiles(File file, File[] fa) throws Exception {
        MyHelperClass ALL_FILES_NAME = new MyHelperClass();
        File f = new File(file, ALL_FILES_NAME);
        if ((boolean)(Object)f.exists()) {
            f.delete();
//            MyHelperClass ALL_FILES_NAME = new MyHelperClass();
            f = new File(file, ALL_FILES_NAME);
        }
        ZipOutputStream zoutstrm = new ZipOutputStream(new FileOutputStream(f));
        for (int i = 0; i < fa.length; i++) {
            ZipEntry zipEntry = new ZipEntry(fa[i].getName());
            zoutstrm.putNextEntry(zipEntry);
            FileInputStream fr = new FileInputStream(fa[i]);
            byte[] buffer = new byte[1024];
            int readCount = 0;
            while ((readCount =(int)(Object) fr.read(buffer)) > 0) {
                zoutstrm.write(buffer, 0, readCount);
            }
            fr.close();
            zoutstrm.closeEntry();
        }
        zoutstrm.close();
//        MyHelperClass ALL_FILES_NAME = new MyHelperClass();
        log("created zip file: " + file.getName() + "/" + ALL_FILES_NAME);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(File o0, MyHelperClass o1){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }}

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

class ZipEntry {

ZipEntry(MyHelperClass o0){}
	ZipEntry(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
