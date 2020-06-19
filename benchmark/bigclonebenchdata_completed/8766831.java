


class c8766831 {

    public static byte[] loadFile(File file) throws IOException {
        BufferedInputStream in = null;
        ByteArrayOutputStream sink = null;
        try {
            in = new BufferedInputStream(new FileInputStream(file));
            sink = new ByteArrayOutputStream();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(in, sink);
            return(byte[])(Object) sink.toByteArray();
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(in);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(sink);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(BufferedInputStream o0){ return null; }
	public MyHelperClass copy(BufferedInputStream o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass closeQuietly(ByteArrayOutputStream o0){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}
