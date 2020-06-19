


class c11562158 {

    private File writeResourceToFile(String resource) throws IOException {
        MyHelperClass File = new MyHelperClass();
        File tmp =(File)(Object) File.createTempFile("zfppt" + resource, null);
        InputStream res =(InputStream)(Object) Thread.currentThread().getContextClassLoader().getResourceAsStream(resource);
        OutputStream out =(OutputStream)(Object) new FileOutputStream(tmp);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(res, out);
        out.close();
        return tmp;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createTempFile(String o0, Object o1){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
