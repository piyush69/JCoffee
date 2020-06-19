


class c8085496 {
public MyHelperClass TempStorage;
	public MyHelperClass tempFile;
	public MyHelperClass IOUtils;

    public void MemoryBinaryBody(InputStream is) throws IOException {
        TempPath tempPath =(TempPath)(Object) TempStorage.getInstance().getRootTempPath();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        IOUtils.copy(is, out);
        out.close();
        tempFile = out.toByteArray();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass getRootTempPath(){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class TempPath {

}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }
	public MyHelperClass close(){ return null; }}
