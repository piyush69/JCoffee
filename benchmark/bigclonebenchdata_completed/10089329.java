


class c10089329 {

    public static void copy(File inputFile, File target) throws IOException {
        if (!(Boolean)(Object)inputFile.exists()) return;
        OutputStream output =(OutputStream)(Object) new FileOutputStream(target);
        InputStream input =(InputStream)(Object) new BufferedInputStream(new FileInputStream(inputFile));
        int b;
        while ((b =(int)(Object) input.read()) != -1) output.write(b);
        output.close();
        input.close();
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

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class InputStream {

public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}
