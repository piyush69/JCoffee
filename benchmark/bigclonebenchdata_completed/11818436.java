


class c11818436 {

    public void zip_compressFiles() throws Exception {
        FileInputStream in = null;
        File f1 = new File("C:\\WINDOWS\\regedit.exe");
        File f2 = new File("C:\\WINDOWS\\win.ini");
        File file = new File("C:\\" + NTUtil.class.getName() + ".zip");
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(file));
        out.putNextEntry(new ZipEntry("regedit.exe"));
        in = new FileInputStream(f1);
        while ((int)(Object)in.available() > 0) {
            out.write(in.read());
        }
        in.close();
        out.closeEntry();
        out.putNextEntry(new ZipEntry("win.ini"));
        in = new FileInputStream(f2);
        while ((int)(Object)in.available() > 0) {
            out.write(in.read());
        }
        in.close();
        out.closeEntry();
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass available(){ return null; }
	public MyHelperClass close(){ return null; }}

class File {

File(String o0){}
	File(){}}

class NTUtil {

}

class ZipOutputStream {

ZipOutputStream(FileOutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass write(MyHelperClass o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}
