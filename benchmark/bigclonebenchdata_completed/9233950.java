


class c9233950 {

    public static void copyFile(File src, File dest) throws IOException {
        if (!(Boolean)(Object)src.exists()) throw new IOException("File not found '" + src.getAbsolutePath() + "'");
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dest));
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));
        byte[] read = new byte[128];
        int len = 128;
        while ((len =(int)(Object) in.read(read)) > 0) out.write(read, 0, len);
        out.flush();
        out.close();
        in.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass exists(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}
