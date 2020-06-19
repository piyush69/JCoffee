


class c380318 {

    static void conditionalCopyFile(File dst, File src) throws IOException {
        if (dst.equals(src)) return;
        if (!(Boolean)(Object)dst.isFile() ||(int)(Object) dst.lastModified() < (int)(Object)src.lastModified()) {
            System.out.println("Copying " + src);
            InputStream is =(InputStream)(Object) new FileInputStream(src);
            OutputStream os =(OutputStream)(Object) new FileOutputStream(dst);
            byte[] buf = new byte[8192];
            int len;
            while ((len =(int)(Object) is.read(buf)) > 0) os.write(buf, 0, len);
            os.close();
            is.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass lastModified(){ return null; }
	public MyHelperClass isFile(){ return null; }}

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
