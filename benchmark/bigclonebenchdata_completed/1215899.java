


class c1215899 {
public static MyHelperClass MapMode;
//public MyHelperClass MapMode;

    public static void copyFile(File source, File dest) throws IOException {
        MyHelperClass log = new MyHelperClass();
        log.debug("Copy from {} to {}", source.getAbsoluteFile(), dest.getAbsoluteFile());
        FileInputStream fi = new FileInputStream(source);
        FileChannel fic =(FileChannel)(Object) fi.getChannel();
        MappedByteBuffer mbuf =(MappedByteBuffer)(Object) fic.map(MapMode.READ_ONLY, 0, source.length());
        fic.close();
        fi.close();
        fi = null;
        if (!(Boolean)(Object)dest.exists()) {
            String destPath =(String)(Object) dest.getPath();
//            MyHelperClass log = new MyHelperClass();
            log.debug("Destination path: {}", destPath);
            MyHelperClass File = new MyHelperClass();
            String destDir = destPath.substring(0, destPath.lastIndexOf((int)(Object)File.separatorChar));
//            MyHelperClass log = new MyHelperClass();
            log.debug("Destination dir: {}", destDir);
            File dir = new File(destDir);
            if (!(Boolean)(Object)dir.exists()) {
                if ((boolean)(Object)dir.mkdirs()) {
//                    MyHelperClass log = new MyHelperClass();
                    log.debug("Directory created");
                } else {
//                    MyHelperClass log = new MyHelperClass();
                    log.warn("Directory not created");
                }
            }
            dir = null;
        }
        FileOutputStream fo = new FileOutputStream(dest);
        FileChannel foc =(FileChannel)(Object) fo.getChannel();
        foc.write(mbuf);
        foc.close();
        fo.close();
        fo = null;
        mbuf.clear();
        mbuf = null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass READ_ONLY;
	public MyHelperClass separatorChar;
public MyHelperClass debug(String o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass debug(String o0, String o1){ return null; }
	public MyHelperClass warn(String o0){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass getAbsoluteFile(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass length(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileChannel {

public MyHelperClass write(MappedByteBuffer o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass map(MyHelperClass o0, int o1, MyHelperClass o2){ return null; }}

class MappedByteBuffer {

public MyHelperClass clear(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }
	public MyHelperClass close(){ return null; }}
