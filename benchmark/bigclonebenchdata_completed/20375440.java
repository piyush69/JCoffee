


class c20375440 {

    public static void copyFile(File srcFile, File destFile) throws IOException {
        InputStream src =(InputStream)(Object) new FileInputStream(srcFile);
        OutputStream dest =(OutputStream)(Object) new FileOutputStream(destFile);
        byte buffer[] = new byte[1024];
        int read = 1;
        while (read > 0) {
            read =(int)(Object) src.read(buffer);
            if (read > 0) {
                dest.write(buffer, 0, read);
            }
        }
        src.close();
        dest.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
