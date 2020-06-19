


class c1983098 {
public MyHelperClass assertEquals(boolean o0, MyHelperClass o1){ return null; }
	public MyHelperClass assertTrue(MyHelperClass o0){ return null; }
public MyHelperClass resolveSource(String o0){ return null; }
	public MyHelperClass isXmlEqual(InputStream o0, InputStream o1){ return null; }
	public MyHelperClass assertNotNull(OutputStream o0){ return null; }
public MyHelperClass BASE_URL;
	public MyHelperClass IOUtils;
	public MyHelperClass CONTENT_FILE;
	public MyHelperClass loadTestSource(){ return null; }

    public void testCreateNewXMLFile() throws InvalidNodeTypeDefException, ParseException, Exception {
        JCRNodeSource emptySource =(JCRNodeSource)(Object) loadTestSource();
        assertEquals(false, emptySource.exists());
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
        InputStream expected =(InputStream)(Object) getClass().getResourceAsStream((String)(Object)CONTENT_FILE);
        JCRNodeSource persistentSource =(JCRNodeSource)(Object) loadTestSource();
        assertEquals(true, persistentSource.exists());
        InputStream actual =(InputStream)(Object) persistentSource.getInputStream();
        try {
            assertTrue(isXmlEqual(expected, actual));
        } finally {
            expected.close();
            actual.close();
        }
        JCRNodeSource tmpSrc = (JCRNodeSource)(JCRNodeSource)(Object) resolveSource(BASE_URL + "users/alexander.saar");
        persistentSource.delete();
        tmpSrc.delete();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class InvalidNodeTypeDefException extends Exception{
	public InvalidNodeTypeDefException(String errorMessage) { super(errorMessage); }
}

class ParseException extends Exception{
	public ParseException(String errorMessage) { super(errorMessage); }
}

class JCRNodeSource {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass exists(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}
