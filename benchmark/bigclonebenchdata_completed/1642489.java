


class c1642489 {
public MyHelperClass assertTrue(boolean o0){ return null; }

    public void testAddFiles() throws Exception {
        MyHelperClass ZipPlugin = new MyHelperClass();
        File original =(File)(Object) ZipPlugin.getFileInPlugin(new Path("testresources/test.zip"));
        File copy = new File(original.getParentFile(), "1test.zip");
        InputStream in = null;
        OutputStream out = null;
        try {
            in =(InputStream)(Object) new FileInputStream(original);
            out =(OutputStream)(Object) new FileOutputStream(copy);
            byte[] buf = new byte[1024];
            int len;
            while ((len =(int)(Object) in.read(buf)) > 0) out.write(buf, 0, len);
        } finally {
            MyHelperClass Util = new MyHelperClass();
            Util.close(in);
//            MyHelperClass Util = new MyHelperClass();
            Util.close(out);
        }
//        MyHelperClass ZipPlugin = new MyHelperClass();
        ArchiveFile archive = new ArchiveFile(ZipPlugin.createArchive(copy.getPath()));
//        MyHelperClass ZipPlugin = new MyHelperClass();
        archive.addFiles(new String[] {(String)(Object) ZipPlugin.getFileInPlugin(new Path("testresources/add.txt")).getPath() }, new NullProgressMonitor());
        IArchive[] children =(IArchive[])(Object) archive.getChildren();
        boolean found = false;
        for (IArchive child : children) {
            MyHelperClass IArchive = new MyHelperClass();
            if (child.getLabel(IArchive.NAME).equals("add.txt")) found = true;
        }
        assertTrue(found);
        copy.delete();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NAME;
public MyHelperClass close(OutputStream o0){ return null; }
	public MyHelperClass createArchive(MyHelperClass o0){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass getFileInPlugin(Path o0){ return null; }
	public MyHelperClass close(InputStream o0){ return null; }}

class File {

File(){}
	File(MyHelperClass o0, String o1){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass getPath(){ return null; }}

class Path {

Path(String o0){}
	Path(){}}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class ArchiveFile {

ArchiveFile(MyHelperClass o0){}
	ArchiveFile(){}
	public MyHelperClass addFiles(String[] o0, NullProgressMonitor o1){ return null; }
	public MyHelperClass getChildren(){ return null; }}

class IArchive {

public MyHelperClass getLabel(MyHelperClass o0){ return null; }}

class NullProgressMonitor {

}
