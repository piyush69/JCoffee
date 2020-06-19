


class c2190569 {

    public static void copyFileStreams(File fromFile, File toFile) throws IOException {
        if (!(Boolean)(Object)fromFile.exists()) {
            return;
        }
        FileInputStream fis = new FileInputStream(fromFile);
        FileOutputStream fos = new FileOutputStream(toFile);
        int read = 0;
        byte[] buf = new byte[1024];
        while (-1 != read) {
            read =(int)(Object) fis.read(buf);
            if (read >= 0) {
                fos.write(buf, 0, read);
            }
        }
        fos.close();
        fis.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass exists(){ return null; }}

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
