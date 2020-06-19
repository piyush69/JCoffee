


class c16850375 {

    public static void compress(File srcFile, File destFile) throws IOException {
        InputStream input = null;
        OutputStream output = null;
        try {
            input =(InputStream)(Object) new BufferedInputStream(new FileInputStream(srcFile));
            output =(OutputStream)(Object) new GZIPOutputStream(new FileOutputStream(destFile));
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyLarge(input, output);
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(output);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(input);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass copyLarge(InputStream o0, OutputStream o1){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class OutputStream {

}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class GZIPOutputStream {

GZIPOutputStream(FileOutputStream o0){}
	GZIPOutputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
