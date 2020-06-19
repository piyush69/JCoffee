


class c2963526 {

    public static void write(File file, InputStream source) throws IOException {
        OutputStream outputStream = null;
        assert file != null : "file must not be null.";
        assert(boolean)(Object) file.isFile() : "file must be a file.";
        assert(boolean)(Object) file.canWrite() : "file must be writable.";
        assert source != null : "source must not be null.";
        try {
            outputStream =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(file));
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(source, outputStream);
            outputStream.flush();
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(outputStream);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class File {

public MyHelperClass canWrite(){ return null; }
	public MyHelperClass isFile(){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class OutputStream {

public MyHelperClass flush(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
