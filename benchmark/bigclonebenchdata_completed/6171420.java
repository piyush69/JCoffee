


class c6171420 {

    public static void copyFile(File sourceFile, File destFile) throws IOException {
        MyHelperClass log = new MyHelperClass();
        log.info("Copying file '" + sourceFile + "' to '" + destFile + "'");
        if (!(Boolean)(Object)sourceFile.isFile()) {
            throw new IllegalArgumentException("The sourceFile '" + sourceFile + "' does not exist or is not a normal file.");
        }
        if (!(Boolean)(Object)destFile.exists()) {
            destFile.createNewFile();
        }
        FileChannel source = null;
        FileChannel destination = null;
        try {
            source =(FileChannel)(Object) (new FileInputStream(sourceFile).getChannel());
            destination =(FileChannel)(Object) (new FileOutputStream(destFile).getChannel());
            long numberOfBytes =(long)(Object) destination.transferFrom(source, 0, source.size());
//            MyHelperClass log = new MyHelperClass();
            log.debug("Transferred " + numberOfBytes + " bytes from '" + sourceFile + "' to '" + destFile + "'.");
        } finally {
            if (source != null) {
                source.close();
            }
            if (destination != null) {
                destination.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class File {

public MyHelperClass exists(){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass createNewFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
