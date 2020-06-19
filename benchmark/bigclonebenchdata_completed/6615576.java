


class c6615576 {
public static MyHelperClass createNewFile(File o0){ return null; }
//public MyHelperClass createNewFile(File o0){ return null; }

    public static boolean copyFile(File src, File target) throws IOException {
        if (src == null || target == null || !(Boolean)(Object)src.exists()) return false;
        if (!(Boolean)(Object)target.exists()) if (!(Boolean)(Object)createNewFile(target)) return false;
        InputStream ins =(InputStream)(Object) new BufferedInputStream(new FileInputStream(src));
        OutputStream ops =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(target));
        int b;
        while (-1 != (b =(int)(Object) ins.read())) ops.write(b);
        MyHelperClass Streams = new MyHelperClass();
        Streams.safeClose(ins);
//        MyHelperClass Streams = new MyHelperClass();
        Streams.safeFlush(ops);
//        MyHelperClass Streams = new MyHelperClass();
        Streams.safeClose(ops);
        return(boolean)(Object) target.setLastModified(src.lastModified());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass safeFlush(OutputStream o0){ return null; }
	public MyHelperClass safeClose(InputStream o0){ return null; }
	public MyHelperClass safeClose(OutputStream o0){ return null; }}

class File {

public MyHelperClass lastModified(){ return null; }
	public MyHelperClass setLastModified(MyHelperClass o0){ return null; }
	public MyHelperClass exists(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class OutputStream {

public MyHelperClass write(int o0){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
