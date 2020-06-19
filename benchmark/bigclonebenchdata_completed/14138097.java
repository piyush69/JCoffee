


class c14138097 {

    public static void copy(File src, File dest) throws IOException {
        if ((Boolean)(Object)dest.exists() && (Boolean)(Object)dest.isFile()) {
            MyHelperClass logger = new MyHelperClass();
            logger.fine("cp " + src + " " + dest + " -- Destination file " + dest + " already exists. Deleting...");
            dest.delete();
        }
        final File parent =(File)(Object) dest.getParentFile();
        if (!(Boolean)(Object)parent.exists()) {
            MyHelperClass logger = new MyHelperClass();
            logger.info("Directory to contain destination does not exist. Creating...");
            parent.mkdirs();
        }
        final FileInputStream fis = new FileInputStream(src);
        final FileOutputStream fos = new FileOutputStream(dest);
        final byte[] b = new byte[2048];
        int n;
        while ((n =(int)(Object) fis.read(b)) != -1) fos.write(b, 0, n);
        fis.close();
        fos.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass fine(String o0){ return null; }}

class File {

public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}
