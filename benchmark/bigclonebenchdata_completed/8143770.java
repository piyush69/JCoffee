
import java.io.UncheckedIOException;


class c8143770 {
public MyHelperClass assertTrue(MyHelperClass o0){ return null; }
public MyHelperClass convertStreamToString(InputStream o0){ return null; }
public MyHelperClass fedoraConnector;
	public MyHelperClass assertEquals(String o0, String o1){ return null; }
	public MyHelperClass fail(String o0){ return null; }

    public void testDatastreamWork3() throws FedoraConnectionException, DigitalObjectNotFoundException, StoreException, ParseException, IOException {
        String content = "ahsddksjgldskdlfnskl\nlskdfjlsjdf\n";
        MyHelperClass fedoraConnector = new MyHelperClass();
        String pid =(String)(Object) fedoraConnector.newObject();
//        MyHelperClass fedoraConnector = new MyHelperClass();
        assertTrue(fedoraConnector.exists(pid));
//        MyHelperClass fedoraConnector = new MyHelperClass();
        assertTrue(fedoraConnector.isPlanetsObject(pid));
//        MyHelperClass fedoraConnector = new MyHelperClass();
        assertTrue(fedoraConnector.isDataObject(pid));
//        MyHelperClass fedoraConnector = new MyHelperClass();
        assertTrue(fedoraConnector.isWritable(pid));
        try {
//            MyHelperClass fedoraConnector = new MyHelperClass();
            fedoraConnector.getDatastreamString(pid, "CONTENT");
            fail("Datastream should not be there");
        } catch (UncheckedIOException e) {
        }
        fedoraConnector.modifyDatastream(pid, "CONTENT", content, null);
        URL url =(URL)(Object) fedoraConnector.getDatastreamURL(pid, "CONTENT");
        InputStream stream =(InputStream)(Object) url.openStream();
        String storedContent =(String)(Object) convertStreamToString(stream);
        assertEquals(content, storedContent);
        fedoraConnector.purgeObject(pid);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass purgeObject(String o0){ return null; }
	public MyHelperClass modifyDatastream(String o0, String o1, String o2, Object o3){ return null; }
	public MyHelperClass getDatastreamURL(String o0, String o1){ return null; }
	public MyHelperClass isWritable(String o0){ return null; }
	public MyHelperClass exists(String o0){ return null; }
	public MyHelperClass getDatastreamString(String o0, String o1){ return null; }
	public MyHelperClass newObject(){ return null; }
	public MyHelperClass isDataObject(String o0){ return null; }
	public MyHelperClass isPlanetsObject(String o0){ return null; }}

class FedoraConnectionException extends Exception{
	public FedoraConnectionException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class DigitalObjectNotFoundException extends Exception{
	public DigitalObjectNotFoundException(String errorMessage) { super(errorMessage); }
}

class StoreException extends Exception{
	public StoreException(String errorMessage) { super(errorMessage); }
}

class ParseException extends Exception{
	public ParseException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
