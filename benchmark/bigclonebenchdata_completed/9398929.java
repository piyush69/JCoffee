


class c9398929 {
public MyHelperClass assertNotNull(String o0, URL o1){ return null; }
	public MyHelperClass assertNotNull(String o0, InputStream o1){ return null; }

//    @Test
    public void testGetResource_FileOutsideOfClasspath() throws Exception {
        MyHelperClass File = new MyHelperClass();
        File temp =(File)(Object) File.createTempFile("dozerfiletest", ".txt");
        temp.deleteOnExit();
        String resourceName = "file:" + temp.getAbsolutePath();
        MyHelperClass loader = new MyHelperClass();
        URL url =(URL)(Object) loader.getResource(resourceName);
        assertNotNull("URL should not be null", url);
        InputStream is =(InputStream)(Object) url.openStream();
        assertNotNull("input stream should not be null", is);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getResource(String o0){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }}

class Test {

}

class File {

public MyHelperClass deleteOnExit(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

}
