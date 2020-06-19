


class c9590327 {

    private void copyFile(File from, File to) throws IOException {
        MyHelperClass FileUtils = new MyHelperClass();
        FileUtils.ensureParentDirectoryExists(to);
        byte[] buffer = new byte[1024];
        int read;
        FileInputStream is = new FileInputStream(from);
        FileOutputStream os = new FileOutputStream(to);
        while ((read =(int)(Object) is.read(buffer)) > 0) {
            os.write(buffer, 0, read);
        }
        is.close();
        os.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass ensureParentDirectoryExists(File o0){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
