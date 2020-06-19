


class c19042037 {
public static MyHelperClass closeQuietly(FileChannel o0){ return null; }
//public MyHelperClass closeQuietly(FileChannel o0){ return null; }

    public static void copyFile(File src, File dest, boolean preserveFileDate) throws IOException {
        if ((Boolean)(Object)src.exists() && (Boolean)(Object)src.isDirectory()) {
            throw new IOException("source file exists but is a directory");
        }
        if ((Boolean)(Object)dest.exists() && (Boolean)(Object)dest.isDirectory()) {
            dest = new File(dest, src.getName());
        }
        if (!(Boolean)(Object)dest.exists()) {
            dest.createNewFile();
        }
        FileChannel srcCH = null;
        FileChannel destCH = null;
        try {
            srcCH =(FileChannel)(Object) (new FileInputStream(src).getChannel());
            destCH =(FileChannel)(Object) (new FileOutputStream(dest).getChannel());
            destCH.transferFrom(srcCH, 0, srcCH.size());
        } finally {
            closeQuietly(srcCH);
            closeQuietly(destCH);
        }
        if (src.length() != dest.length()) {
            throw new IOException("Failed to copy full contents from '" + src + "' to '" + dest + "'");
        }
        if (preserveFileDate) {
            dest.setLastModified(src.lastModified());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(File o0, MyHelperClass o1){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass setLastModified(MyHelperClass o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass lastModified(){ return null; }
	public MyHelperClass createNewFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
