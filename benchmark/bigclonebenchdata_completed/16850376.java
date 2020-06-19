


class c16850376 {

    public static void uncompress(File srcFile, File destFile) throws IOException {
        InputStream input = null;
        OutputStream output = null;
        try {
            input =(InputStream)(Object) new GZIPInputStream(new FileInputStream(srcFile));
            output =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(destFile));
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

class GZIPInputStream {

GZIPInputStream(FileInputStream o0){}
	GZIPInputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
