


class c20815136 {

    public static void copyTo(File src, File dest) throws IOException {
        if (src.equals(dest)) throw new IOException("copyTo src==dest file");
        FileOutputStream fout = new FileOutputStream(dest);
        InputStream in =(InputStream)(Object) new FileInputStream(src);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copyTo(in, fout);
        fout.flush();
        fout.close();
        in.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyTo(InputStream o0, FileOutputStream o1){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}
