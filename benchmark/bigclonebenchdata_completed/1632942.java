
import java.io.UncheckedIOException;


class c1632942 {

    private void copyResource(String resource, File targetDir) {
        InputStream is =(InputStream)(Object) FragmentFileSetTest.class.getResourceAsStream(resource);
        MyHelperClass Assume = new MyHelperClass();
        Assume.assumeNotNull(is);
        int i = resource.lastIndexOf("/");
        String filename;
        if (i == -1) {
            filename = resource;
        } else {
            filename = resource.substring(i + 1);
        }
        try {
            FileOutputStream fos = new FileOutputStream(new File(targetDir, filename));
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(is, fos);
            fos.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            MyHelperClass Assert = new MyHelperClass();
            Assert.fail(e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass fail(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass assumeNotNull(InputStream o0){ return null; }}

class File {

File(File o0, String o1){}
	File(){}}

class InputStream {

}

class FragmentFileSetTest {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
