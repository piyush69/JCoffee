


class c21374041 {
public MyHelperClass tempBuffer;

    public void writeToStream(OutputStream out) throws IOException {
        InputStream result = null;
        MyHelperClass tempFile = new MyHelperClass();
        if (tempFile != null) {
//            MyHelperClass tempFile = new MyHelperClass();
            InputStream input =(InputStream)(Object) new BufferedInputStream(new FileInputStream(tempFile));
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(input, out);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(input);
        MyHelperClass tempBuffer = new MyHelperClass();
        } else if (tempBuffer != null) {
            MyHelperClass tempBuffer = new MyHelperClass();
            out.write(tempBuffer);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class OutputStream {

public MyHelperClass write(MyHelperClass o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}}
