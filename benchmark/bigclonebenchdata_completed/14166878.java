


class c14166878 {

    protected static void writeFileToStream(FileWrapper file, String filename, ZipOutputStream zipStream) throws CausedIOException, IOException {
        InputStream in;
        try {
            in =(InputStream)(Object) file.getInputStream();
        } catch (Exception e) {
            throw new CausedIOException("Could not obtain InputStream for " + filename, e);
        }
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(in, zipStream);
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(in);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, ZipOutputStream o1){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }}

class FileWrapper {

public MyHelperClass getInputStream(){ return null; }}

class ZipOutputStream {

}

class CausedIOException extends Exception{
	public CausedIOException(String errorMessage) { super(errorMessage); }
	CausedIOException(String o0, Exception o1){}
	CausedIOException(){}
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}
