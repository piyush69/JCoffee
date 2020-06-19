


class c14807299 {
public MyHelperClass assertNotNull(String o0, String o1){ return null; }

    public void testRetrieve() throws DigitalObjectNotFoundException, URISyntaxException, IOException {
        DigitalObjectManager man =(DigitalObjectManager)(Object) new FedoraObjectManager("fedoraAdmin", "fedoraAdminPass", "http://localhost:7910/fedora");
        DigitalObject r =(DigitalObject)(Object) man.retrieve(new URI("demo:dc2mods.1"));
        String title =(String)(Object) r.getTitle();
        List met =(List)(Object) r.getMetadata();
        InputStream content =(InputStream)(Object) r.getContent().read();
        StringWriter theString = new StringWriter();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(content, theString);
        assertNotNull(theString.toString(), "Content should not be null");
        assertNotNull(title, "The title should be set");
        assertNotNull((String)(Object)met.get(0).getContent(), "There should be some metadata");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass read(){ return null; }
	public MyHelperClass copy(InputStream o0, StringWriter o1){ return null; }}

class DigitalObjectManager {

public MyHelperClass retrieve(URI o0){ return null; }}

class FedoraObjectManager {

FedoraObjectManager(String o0, String o1, String o2){}
	FedoraObjectManager(){}}

class DigitalObject {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass getTitle(){ return null; }
	public MyHelperClass getMetadata(){ return null; }}

class URI {

URI(String o0){}
	URI(){}}

class List {

public MyHelperClass get(int o0){ return null; }}

class Metadata {

}

class InputStream {

}

class StringWriter {

}

class DigitalObjectNotFoundException extends Exception{
	public DigitalObjectNotFoundException(String errorMessage) { super(errorMessage); }
}

class URISyntaxException extends Exception{
	public URISyntaxException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
