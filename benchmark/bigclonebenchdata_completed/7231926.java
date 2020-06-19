
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c7231926 {
public static MyHelperClass IDFactory;
//public MyHelperClass IDFactory;

    public static PipeID getPipeIDForService(ServiceDescriptor descriptor) {
        PipeID id = null;
        URI uri =(URI)(Object) descriptor.getUri();
        if (uri != null) {
            try {
                MyHelperClass IDFactory = new MyHelperClass();
                id = (PipeID)(PipeID)(Object) IDFactory.fromURI(uri);
            } catch (UncheckedIOException e) {
                throw new RuntimeException("Error creating id for pipe " + uri, e);
            }
        }
        if (id == null) {
            MessageDigest md = null;
            try {
                MyHelperClass MessageDigest = new MyHelperClass();
                md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            } catch (UncheckedIOException e) {
            }
            String idToHash =(String)(Object) descriptor.getName();
            if (descriptor.getHost() != null) {
                idToHash += descriptor.getHost();
            }
            md.update(idToHash.getBytes());
            MyHelperClass InfrastructurePeerGroupID = new MyHelperClass();
            id =(PipeID)(Object) IDFactory.newPipeID(InfrastructurePeerGroupID, md.digest());
        }
        return id;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass fromURI(URI o0){ return null; }
	public MyHelperClass newPipeID(MyHelperClass o0, MyHelperClass o1){ return null; }}

class ServiceDescriptor {

public MyHelperClass getHost(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getUri(){ return null; }}

class PipeID {

}

class URI {

}

class URISyntaxException extends Exception{
	public URISyntaxException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
