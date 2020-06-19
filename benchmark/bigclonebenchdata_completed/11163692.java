


class c11163692 {

    public static void transfer(File src, File dest, boolean removeSrc) throws FileNotFoundException, IOException {
        MyHelperClass Log = new MyHelperClass();
        Log.warning("source: " + src);
//        MyHelperClass Log = new MyHelperClass();
        Log.warning("dest: " + dest);
        if (!(Boolean)(Object)src.canRead()) {
            throw new IOException("can not read src file: " + src);
        }
        if (!(Boolean)(Object)dest.getParentFile().isDirectory()) {
            if (!(Boolean)(Object)dest.getParentFile().mkdirs()) {
                throw new IOException("failed to make directories: " + dest.getParent());
            }
        }
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dest);
        FileChannel fcin =(FileChannel)(Object) fis.getChannel();
        FileChannel fcout =(FileChannel)(Object) fos.getChannel();
//        MyHelperClass Log = new MyHelperClass();
        Log.warning("starting transfer from position " + fcin.position() + " to size " + fcin.size());
        fcout.transferFrom(fcin, 0, fcin.size());
//        MyHelperClass Log = new MyHelperClass();
        Log.warning("closing streams and channels");
        fcin.close();
        fcout.close();
        fis.close();
        fos.close();
        if (removeSrc) {
//            MyHelperClass Log = new MyHelperClass();
            Log.warning("deleting file " + src);
            src.delete();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warning(String o0){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class File {

public MyHelperClass getParent(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass canRead(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass position(){ return null; }}
