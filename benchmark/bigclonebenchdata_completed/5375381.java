


class c5375381 {
public MyHelperClass TempStorage;
	public MyHelperClass tempFile;
	public MyHelperClass IOUtils;

    public void TempFileBinaryBody(InputStream is) throws IOException {
        TempPath tempPath =(TempPath)(Object) TempStorage.getInstance().getRootTempPath();
        tempFile = tempPath.createTempFile("attachment", ".bin");
        OutputStream out =(OutputStream)(Object) tempFile.getOutputStream();
        IOUtils.copy(is, out);
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass getRootTempPath(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class TempPath {

public MyHelperClass createTempFile(String o0, String o1){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}
