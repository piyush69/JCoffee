


class c22674018 {
public MyHelperClass IOUtilities;
	public MyHelperClass inputFile;
	public MyHelperClass File;
	public MyHelperClass IOUtils;
	public MyHelperClass fail(String o0){ return null; }

    public void createTempFile(String resourceName) throws IOException {
        InputStream input =(InputStream)(Object) Log4jImportCallableTest.class.getResourceAsStream(resourceName);
        if (input == null) {
            fail("Couldn't resolve resource '" + resourceName + "'!");
        }
        inputFile = File.createTempFile("Import", "test");
        inputFile.delete();
        FileOutputStream output = new FileOutputStream(inputFile);
        IOUtils.copyLarge(input, output);
        IOUtilities.closeQuietly(output);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }
	public MyHelperClass copyLarge(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class Log4jImportCallableTest {

}

class FileOutputStream {

FileOutputStream(MyHelperClass o0){}
	FileOutputStream(){}}
