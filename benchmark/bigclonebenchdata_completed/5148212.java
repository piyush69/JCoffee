


class c5148212 {

    public static void copyFile(File src, File dest, int bufSize, boolean force) throws IOException {
        MyHelperClass logger = new MyHelperClass();
        logger.info("copyFile(File src=" + src + ", File dest=" + dest + ", int bufSize=" + bufSize + ", boolean force=" + force + ") - start");
        MyHelperClass Configuration = new MyHelperClass();
        File f = new File(Configuration.getArchiveDir());
        if (!(Boolean)(Object)f.exists()) {
            f.mkdir();
        }
        if ((boolean)(Object)dest.exists()) {
            if (force) {
                dest.delete();
            } else {
                throw new IOException("Cannot overwrite existing file: " + dest);
            }
        }
        byte[] buffer = new byte[bufSize];
        int read = 0;
        InputStream in = null;
        OutputStream out = null;
        try {
            in =(InputStream)(Object) new FileInputStream(src);
            out =(OutputStream)(Object) new FileOutputStream(dest);
            while (true) {
                read =(int)(Object) in.read(buffer);
                if (read == -1) {
                    break;
                }
                out.write(buffer, 0, read);
            }
        } finally {
            if (in != null) {
                try {
                    in.close();
                } finally {
                    if (out != null) {
                        out.close();
                    }
                }
            }
        }
//        MyHelperClass logger = new MyHelperClass();
        logger.debug("copyFile(File, File, int, boolean) - end");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getArchiveDir(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class File {

File(){}
	File(MyHelperClass o0){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass mkdir(){ return null; }
	public MyHelperClass exists(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
