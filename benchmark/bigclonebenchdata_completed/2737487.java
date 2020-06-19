


class c2737487 {

    public static void copy(File src, File dest) throws IOException {
        OutputStream stream =(OutputStream)(Object) new FileOutputStream(dest);
        FileInputStream fis = new FileInputStream(src);
        byte[] buffer = new byte[16384];
        while ((int)(Object)fis.available() != 0) {
            int read =(int)(Object) fis.read(buffer);
            stream.write(buffer, 0, read);
        }
        stream.flush();
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

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass available(){ return null; }}
