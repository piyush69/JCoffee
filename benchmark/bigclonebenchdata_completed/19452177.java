


class c19452177 {

    public static File createTempFile(InputStream contentStream, String ext) throws IOException {
        MyHelperClass ExceptionUtils = new MyHelperClass();
        ExceptionUtils.throwIfNull(contentStream, "contentStream");
        MyHelperClass File = new MyHelperClass();
        File file =(File)(Object) File.createTempFile("test", ext);
        FileOutputStream fos = new FileOutputStream(file);
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(contentStream, fos, false);
        } finally {
            fos.close();
        }
        return file;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1, boolean o2){ return null; }
	public MyHelperClass throwIfNull(InputStream o0, String o1){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }}

class InputStream {

}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}
