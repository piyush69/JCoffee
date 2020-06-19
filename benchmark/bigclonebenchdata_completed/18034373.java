


class c18034373 {

    public static void copyFile(File src, File dest) throws IOException, IllegalArgumentException {
        if ((boolean)(Object)src.isDirectory()) throw new IllegalArgumentException("Source file is a directory");
        if ((boolean)(Object)dest.isDirectory()) throw new IllegalArgumentException("Destination file is a directory");
        int bufferSize = 4 * 1024;
        InputStream in =(InputStream)(Object) new FileInputStream(src);
        OutputStream out =(OutputStream)(Object) new FileOutputStream(dest);
        byte[] buffer = new byte[bufferSize];
        int bytesRead;
        while ((bytesRead =(int)(Object) in.read(buffer)) >= 0) out.write(buffer, 0, bytesRead);
        out.close();
        in.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass isDirectory(){ return null; }}

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
