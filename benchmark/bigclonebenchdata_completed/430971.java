


class c430971 {

    public static void copyFile(File destFile, File src) throws IOException {
        File destDir =(File)(Object) destFile.getParentFile();
        File tempFile = new File(destFile + "_tmp");
        destDir.mkdirs();
        InputStream is =(InputStream)(Object) new FileInputStream(src);
        try {
            FileOutputStream os = new FileOutputStream(tempFile);
            try {
                byte[] buf = new byte[8192];
                int len;
                while ((len =(int)(Object) is.read(buf)) > 0) os.write(buf, 0, len);
            } finally {
                os.close();
            }
        } finally {
            is.close();
        }
        destFile.delete();
        if (!(Boolean)(Object)tempFile.renameTo(destFile)) throw new IOException("Unable to rename " + tempFile + " to " + destFile);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(String o0){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass renameTo(File o0){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
