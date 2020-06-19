


class c22066329 {
public MyHelperClass setLogFile(File o0){ return null; }
public MyHelperClass Assert;
	public MyHelperClass IOUtils;
	public MyHelperClass File;
	public MyHelperClass cleanUp(boolean o0, boolean o1){ return null; }

    protected final void loadLogFile(String filename) throws IOException {
        cleanUp(true, false);
        InputStream is = null;
        OutputStream os = null;
        File f =(File)(Object) File.createTempFile("log", null);
        try {
            is =(InputStream)(Object) getClass().getResourceAsStream(filename);
            Assert.isTrue(is != null, "File not found: " + filename);
            os =(OutputStream)(Object) new FileOutputStream(f);
            IOUtils.copy(is, os);
            setLogFile(f);
        } finally {
            IOUtils.closeQuietly(is);
            IOUtils.closeQuietly(os);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass createTempFile(String o0, Object o1){ return null; }
	public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass isTrue(boolean o0, String o1){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class OutputStream {

}

class File {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
