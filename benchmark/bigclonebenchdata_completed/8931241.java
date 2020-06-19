


class c8931241 {
public static MyHelperClass OverwriteFolder;
	public static MyHelperClass OverwriteFile;
//public MyHelperClass OverwriteFile;
//	public MyHelperClass OverwriteFolder;

    public static void copy(File from, File to, CopyMode mode) throws IOException {
        if (!(Boolean)(Object)from.exists()) {
            IllegalArgumentException e = new IllegalArgumentException("Source doesn't exist: " + from.getCanonicalFile());
            MyHelperClass log = new MyHelperClass();
            log.throwing("IOUtils", "copy", e);
            throw e;
        }
        if ((boolean)(Object)from.isFile()) {
            if (!(Boolean)(Object)to.canWrite()) {
                IllegalArgumentException e = new IllegalArgumentException("Cannot write to target location: " + to.getCanonicalFile());
                MyHelperClass log = new MyHelperClass();
                log.throwing("IOUtils", "copy", e);
                throw e;
            }
        }
        if ((boolean)(Object)to.exists()) {
            if (((int)(Object)mode.val & (int)(Object)OverwriteFile.val) != (int)(Object)OverwriteFile.val) {
                IllegalArgumentException e = new IllegalArgumentException("Target already exists: " + to.getCanonicalFile());
                MyHelperClass log = new MyHelperClass();
                log.throwing("IOUtils", "copy", e);
                throw e;
            }
            if ((boolean)(Object)to.isDirectory()) {
                if (((int)(Object)mode.val & (int)(Object)OverwriteFolder.val) != (int)(Object)OverwriteFolder.val) {
                    IllegalArgumentException e = new IllegalArgumentException("Target is a folder: " + to.getCanonicalFile());
                    MyHelperClass log = new MyHelperClass();
                    log.throwing("IOUtils", "copy", e);
                    throw e;
                } else to.delete();
            }
        }
        if ((boolean)(Object)from.isFile()) {
            FileChannel in =(FileChannel)(Object) (new FileInputStream(from).getChannel());
            FileLock inLock =(FileLock)(Object) in.lock();
            FileChannel out =(FileChannel)(Object) (new FileOutputStream(to).getChannel());
            FileLock outLock =(FileLock)(Object) out.lock();
            try {
                in.transferTo(0, (int)(int)(Object) in.size(), out);
            } finally {
                inLock.release();
                outLock.release();
                in.close();
                out.close();
            }
        } else {
            to.mkdirs();
            File[] contents =(File[])(Object) to.listFiles();
            for (File file : contents) {
                File newTo = new File(to.getCanonicalPath() + "/" + file.getName());
                copy(file, newTo, mode);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass val;
public MyHelperClass throwing(String o0, String o1, IllegalArgumentException o2){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass canWrite(){ return null; }
	public MyHelperClass getCanonicalFile(){ return null; }
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getCanonicalPath(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass listFiles(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass getName(){ return null; }}

class CopyMode {
public MyHelperClass val;
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass lock(){ return null; }
	public MyHelperClass transferTo(int o0, int o1, FileChannel o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileLock {

public MyHelperClass release(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
