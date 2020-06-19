
import java.io.UncheckedIOException;


class c1772401 {
public MyHelperClass digestInputStream(MyHelperClass o0){ return null; }
public MyHelperClass writeInputStreamToFile(InputStream o0, String o1){ return null; }
public MyHelperClass warning(String o0){ return null; }
	public MyHelperClass fileExists(String o0){ return null; }

    private void redownloadResource(SchemaResource resource) {
        MyHelperClass _redownloadSet = new MyHelperClass();
        if (_redownloadSet != null) {
//            MyHelperClass _redownloadSet = new MyHelperClass();
            if ((boolean)(Object)_redownloadSet.contains(resource)) return;
//            MyHelperClass _redownloadSet = new MyHelperClass();
            _redownloadSet.add(resource);
        }
        String filename =(String)(Object) resource.getFilename();
        String schemaLocation =(String)(Object) resource.getSchemaLocation();
        String digest = null;
        if (schemaLocation == null || filename == null) return;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try {
            URL url = new URL(schemaLocation);
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            MyHelperClass USER_AGENT = new MyHelperClass();
            conn.addRequestProperty("User-Agent", USER_AGENT);
            conn.addRequestProperty("Accept", "application/xml, text/xml, */*");
            DigestInputStream input =(DigestInputStream)(Object) digestInputStream(conn.getInputStream());
            MyHelperClass IOUtil = new MyHelperClass();
            IOUtil.copyCompletely(input, buffer);
            MyHelperClass HexBin = new MyHelperClass();
            digest =(String)(Object) HexBin.bytesToString(input.getMessageDigest().digest());
        } catch (Exception e) {
            warning("Could not copy remote resource " + schemaLocation + ":" + e.getMessage());
            return;
        }
        if (digest.equals(resource.getSha1()) && (boolean)(Object)fileExists(filename)) {
            warning("Resource " + filename + " is unchanged from " + schemaLocation + ".");
            return;
        }
        try {
            InputStream source =(InputStream)(Object) new ByteArrayInputStream(buffer.toByteArray());
            writeInputStreamToFile(source, filename);
        } catch (UncheckedIOException e) {
            warning("Could not write to file " + filename + " for " + schemaLocation + ":" + e.getMessage());
            return;
        }
        warning("Refreshed " + filename + " from " + schemaLocation);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass bytesToString(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass add(SchemaResource o0){ return null; }
	public MyHelperClass copyCompletely(DigestInputStream o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass contains(SchemaResource o0){ return null; }}

class SchemaResource {

public MyHelperClass getSchemaLocation(){ return null; }
	public MyHelperClass getSha1(){ return null; }
	public MyHelperClass getFilename(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass addRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass addRequestProperty(String o0, MyHelperClass o1){ return null; }}

class DigestInputStream {

public MyHelperClass getMessageDigest(){ return null; }}

class InputStream {

}

class ByteArrayInputStream {

ByteArrayInputStream(MyHelperClass o0){}
	ByteArrayInputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
