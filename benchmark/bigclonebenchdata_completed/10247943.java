
import java.io.UncheckedIOException;


class c10247943 {

//    @Override
    public void sendContent(OutputStream out, Range range, Map params, String contentType) throws IOException, NotAuthorizedException, BadRequestException {
        try {
            MyHelperClass vtf = new MyHelperClass();
            if (vtf == null) {
                MyHelperClass LOG = new MyHelperClass();
                LOG.debug("Serializing from database");
                MyHelperClass existDocument = new MyHelperClass();
                existDocument.stream(out);
            } else {
                MyHelperClass LOG = new MyHelperClass();
                LOG.debug("Serializing from buffer");
//                MyHelperClass vtf = new MyHelperClass();
                InputStream is =(InputStream)(Object) vtf.getByteStream();
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(is, out);
                out.flush();
//                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(is);
//                MyHelperClass vtf = new MyHelperClass();
                vtf.delete();
//                MyHelperClass vtf = new MyHelperClass();
                vtf = null;
            }
        } catch (UncheckedIOException e) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.debug(e.getMessage());
            throw new NotAuthorizedException((String)(Object)this);
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(out);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getByteStream(){ return null; }
	public MyHelperClass stream(OutputStream o0){ return null; }
	public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class OutputStream {

public MyHelperClass flush(){ return null; }}

class Range {

}

class Map {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class NotAuthorizedException extends Exception{
	public NotAuthorizedException(String errorMessage) { super(errorMessage); }
}

class BadRequestException extends Exception{
	public BadRequestException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class PermissionDeniedException extends Exception{
	public PermissionDeniedException(String errorMessage) { super(errorMessage); }
}
