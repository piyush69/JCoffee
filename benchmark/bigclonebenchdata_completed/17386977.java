


class c17386977 {
public MyHelperClass assertEquals(MyHelperClass o0, MyHelperClass o1){ return null; }
public MyHelperClass assertNotNull(InputStream o0){ return null; }

    private void checkUrl(URL url) throws IOException {
        File urlFile = new File(url.getFile());
        MyHelperClass file = new MyHelperClass();
        assertEquals(file.getCanonicalPath(), urlFile.getCanonicalPath());
        System.out.println("Using url " + url);
        InputStream openStream =(InputStream)(Object) url.openStream();
        assertNotNull(openStream);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getCanonicalPath(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass getFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(MyHelperClass o0){}
	File(){}
	public MyHelperClass getCanonicalPath(){ return null; }}

class InputStream {

}
