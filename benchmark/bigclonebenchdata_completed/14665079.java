


class c14665079 {

    protected File compress(File orig, IWrapCompression wrapper) throws IOException {
        MyHelperClass File = new MyHelperClass();
        File compressed =(File)(Object) File.createTempFile("test.", ".gz");
        FileOutputStream fos = new FileOutputStream(compressed);
        OutputStream wos =(OutputStream)(Object) wrapper.wrap(fos);
        FileInputStream fis = new FileInputStream(orig);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(fis, wos);
//        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.closeQuietly(fis);
//        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.closeQuietly(wos);
        return compressed;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(FileInputStream o0){ return null; }
	public MyHelperClass copy(FileInputStream o0, OutputStream o1){ return null; }
	public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }}

class File {

}

class IWrapCompression {

public MyHelperClass wrap(FileOutputStream o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class OutputStream {

}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}
