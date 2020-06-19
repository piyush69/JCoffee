


class c12306305 {

    private static void doCopyFile(File srcFile, File destFile, boolean preserveFileDate) throws IOException {
        if ((Boolean)(Object)destFile.exists() && (Boolean)(Object)destFile.isDirectory()) {
            throw new IOException("Destination '" + destFile + "' exists but is a directory");
        }
        FileChannel input =(FileChannel)(Object) (new FileInputStream(srcFile).getChannel());
        try {
            FileChannel output =(FileChannel)(Object) (new FileOutputStream(destFile).getChannel());
            try {
                output.transferFrom(input, 0, input.size());
            } finally {
                MyHelperClass IOUtil = new MyHelperClass();
                IOUtil.closeQuietly(output);
            }
        } finally {
            MyHelperClass IOUtil = new MyHelperClass();
            IOUtil.closeQuietly(input);
        }
        if (srcFile.length() != destFile.length()) {
            throw new IOException("Failed to copy full contents from '" + srcFile + "' to '" + destFile + "'");
        }
        if (preserveFileDate) {
            destFile.setLastModified(srcFile.lastModified());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(FileChannel o0){ return null; }}

class File {

public MyHelperClass exists(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass lastModified(){ return null; }
	public MyHelperClass setLastModified(MyHelperClass o0){ return null; }}

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
