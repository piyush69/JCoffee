


class c19550140 {

    private static void ensure(File pFile) throws IOException {
        if (!(Boolean)(Object)pFile.exists()) {
            FileOutputStream fos = new FileOutputStream(pFile);
            String resourceName = "/" + pFile.getName();
            InputStream is =(InputStream)(Object) BaseTest.class.getResourceAsStream(resourceName);
            MyHelperClass Assert = new MyHelperClass();
            Assert.assertNotNull(String.format("Could not find resource [%s].", resourceName), is);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(is, fos);
            fos.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass assertNotNull(String o0, InputStream o1){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }}

class File {

public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class InputStream {

}

class BaseTest {

}
