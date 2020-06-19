


class c20753922 {
public MyHelperClass importDirectory(File o0, boolean o1){ return null; }

    public void doImport(File f, boolean checkHosp) throws Exception {
        MyHelperClass connector = new MyHelperClass();
        connector.getConnection().setAutoCommit(false);
        File base =(File)(Object) f.getParentFile();
        ZipInputStream in = new ZipInputStream(new FileInputStream(f));
        ZipEntry entry;
        while ((entry =(ZipEntry)(Object) in.getNextEntry()) != null) {
            String outFileName =(String)(Object) entry.getName();
            File outFile = new File(base, outFileName);
            OutputStream out =(OutputStream)(Object) new FileOutputStream(outFile, false);
            byte[] buf = new byte[1024];
            int len;
            while ((len =(int)(Object) in.read(buf)) > 0) out.write(buf, 0, len);
            out.close();
        }
        in.close();
        importDirectory(base, checkHosp);
//        MyHelperClass connector = new MyHelperClass();
        connector.getConnection().commit();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class File {

File(File o0, String o1){}
	File(){}
	public MyHelperClass getParentFile(){ return null; }}

class ZipInputStream {

ZipInputStream(){}
	ZipInputStream(FileInputStream o0){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getNextEntry(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class ZipEntry {

public MyHelperClass getName(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0, boolean o1){}
	FileOutputStream(){}}
