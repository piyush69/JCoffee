


class c11627705 {

    public static void copyFile(File src, File dst) throws IOException {
        InputStream in =(InputStream)(Object) new FileInputStream(src);
        OutputStream out =(OutputStream)(Object) new FileOutputStream(dst);
        byte[] buf = new byte[1024];
        int len;
        while ((len =(int)(Object) in.read(buf)) > 0) out.write(buf, 0, len);
        in.close();
        out.close();
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
