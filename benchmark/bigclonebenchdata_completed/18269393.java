
import java.io.UncheckedIOException;


class c18269393 {

    public static File getClassLoaderFile(String filename) throws IOException {
        Resource resource =(Resource)(Object) new ClassPathResource(filename);
        try {
            return(File)(Object) resource.getFile();
        } catch (UncheckedIOException e) {
        }
        InputStream is = null;
        FileOutputStream os = null;
        try {
            MyHelperClass RandomStringUtils = new MyHelperClass();
            String tempFilename =(String)(Object) RandomStringUtils.randomAlphanumeric(20);
            MyHelperClass File = new MyHelperClass();
            File file =(File)(Object) File.createTempFile(tempFilename, null);
            is =(InputStream)(Object) resource.getInputStream();
            os = new FileOutputStream(file);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(is, os);
            return file;
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(is);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(os);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass createTempFile(String o0, Object o1){ return null; }
	public MyHelperClass randomAlphanumeric(int o0){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Resource {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getFile(){ return null; }}

class ClassPathResource {

ClassPathResource(String o0){}
	ClassPathResource(){}}

class InputStream {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
