


class c6424937 {
public MyHelperClass memoryOutputStream;
	public MyHelperClass outputFile;
	public MyHelperClass IOUtils;
	public MyHelperClass isInMemory(){ return null; }

    public void writeTo(OutputStream out) throws IOException {
        MyHelperClass closed = new MyHelperClass();
        if (!(Boolean)(Object)closed) {
            throw new IOException("Stream not closed");
        }
        if ((boolean)(Object)isInMemory()) {
            memoryOutputStream.writeTo(out);
        } else {
            FileInputStream fis = new FileInputStream(outputFile);
            try {
                IOUtils.copy(fis, out);
            } finally {
                IOUtils.closeQuietly(fis);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass writeTo(OutputStream o0){ return null; }
	public MyHelperClass copy(FileInputStream o0, OutputStream o1){ return null; }
	public MyHelperClass closeQuietly(FileInputStream o0){ return null; }}

class OutputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}}
