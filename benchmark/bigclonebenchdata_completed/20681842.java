


class c20681842 {
public MyHelperClass assertTrue(MyHelperClass o0){ return null; }
public MyHelperClass assertNotNull(OutputStream o0){ return null; }
public MyHelperClass IOUtils;
	public MyHelperClass CONTENT_FILE;
	public MyHelperClass loadTestSource(){ return null; }

    public void testIsVersioned() throws ServiceException, IOException {
        JCRNodeSource emptySource =(JCRNodeSource)(Object) loadTestSource();
        assertTrue(emptySource.isVersioned());
        OutputStream sourceOut =(OutputStream)(Object) emptySource.getOutputStream();
        assertNotNull(sourceOut);
        InputStream contentIn =(InputStream)(Object) getClass().getResourceAsStream((String)(Object)CONTENT_FILE);
        try {
            IOUtils.copy(contentIn, sourceOut);
            sourceOut.flush();
        } finally {
            sourceOut.close();
            contentIn.close();
        }
        assertTrue(emptySource.isVersioned());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class ServiceException extends Exception{
	public ServiceException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class JCRNodeSource {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass isVersioned(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}
