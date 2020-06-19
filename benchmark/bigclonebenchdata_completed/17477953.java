


class c17477953 {

    public static void createModelZip(String filename, String tempdir, boolean overwrite) throws Exception {
        MyHelperClass FileTools = new MyHelperClass();
        FileTools.checkOutput(filename, overwrite);
        BufferedInputStream origin = null;
        FileOutputStream dest = new FileOutputStream(filename);
        ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(dest));
        int BUFFER = 2048;
        byte data[] = new byte[BUFFER];
        File f = new File(tempdir);
        for (File fs :(File[])(Object) (Object[])(Object)f.listFiles()) {
            FileInputStream fi = new FileInputStream(fs.getAbsolutePath());
            origin = new BufferedInputStream(fi, BUFFER);
            ZipEntry entry = new ZipEntry(fs.getName());
            out.putNextEntry(entry);
            int count;
            while ((count =(int)(Object) origin.read(data, 0, BUFFER)) != -1) out.write(data, 0, count);
            out.closeEntry();
            origin.close();
        }
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass checkOutput(String o0, boolean o1){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0, int o1){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class ZipOutputStream {

ZipOutputStream(){}
	ZipOutputStream(BufferedOutputStream o0){}
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class File {

File(){}
	File(String o0){}
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass listFiles(){ return null; }}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}}

class ZipEntry {

ZipEntry(MyHelperClass o0){}
	ZipEntry(){}}
