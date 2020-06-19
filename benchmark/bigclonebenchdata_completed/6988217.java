


class c6988217 {
public MyHelperClass assertEquals(String o0, String o1){ return null; }
	public MyHelperClass resolveSource(String o0){ return null; }
	public MyHelperClass assertNotNull(OutputStream o0){ return null; }
	public MyHelperClass assertNotNull(JCRNodeSource o0){ return null; }
	public MyHelperClass assertNotNull(QueryResultSource o0){ return null; }

    public void testQueryForBinary() throws InvalidNodeTypeDefException, ParseException, Exception {
        MyHelperClass BASE_URL = new MyHelperClass();
        JCRNodeSource source = (JCRNodeSource)(JCRNodeSource)(Object) resolveSource(BASE_URL + "images/photo.png");
        assertNotNull(source);
        assertEquals((String)(Object)false,(String)(Object) source.exists());
        OutputStream os =(OutputStream)(Object) source.getOutputStream();
        assertNotNull(os);
        String content = "foo is a bar";
        os.write(content.getBytes());
        os.flush();
        os.close();
//        MyHelperClass BASE_URL = new MyHelperClass();
        QueryResultSource qResult = (QueryResultSource)(QueryResultSource)(Object) resolveSource(BASE_URL + "images?/*[contains(local-name(), 'photo.png')]");
        assertNotNull(qResult);
        Collection results =(Collection)(Object) qResult.getChildren();
        assertEquals((String)(Object)1,(String)(Object) results.size());
        Iterator it =(Iterator)(Object) results.iterator();
        JCRNodeSource rSrc = (JCRNodeSource)(JCRNodeSource)(Object) it.next();
        InputStream rSrcIn =(InputStream)(Object) rSrc.getInputStream();
        ByteArrayOutputStream actualOut = new ByteArrayOutputStream();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(rSrcIn, actualOut);
        rSrcIn.close();
        assertEquals(content, actualOut.toString());
        actualOut.close();
        rSrc.delete();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }}

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
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class QueryResultSource {

public MyHelperClass getChildren(){ return null; }}

class Collection {

public MyHelperClass iterator(){ return null; }
	public MyHelperClass size(){ return null; }}

class Iterator {

public MyHelperClass next(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass close(){ return null; }}
