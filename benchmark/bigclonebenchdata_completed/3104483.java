
import java.io.UncheckedIOException;


class c3104483 {

//    @Override
    public void writeTo(final TrackRepresentation t, final Class<?> type, final Type genericType, final Annotation[] annotations, final MediaType mediaType, final MultivaluedMap httpHeaders, final OutputStream entityStream) throws WebApplicationException {
        MyHelperClass MediaType = new MyHelperClass();
        if ((boolean)(Object)mediaType.isCompatible(MediaType.APPLICATION_OCTET_STREAM_TYPE)) {
            InputStream is = null;
            try {
                httpHeaders.add("Content-Type", "audio/mp3");
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(is =(InputStream)(Object) t.getInputStream(mediaType), entityStream);
            } catch (final UncheckedIOException e) {
                MyHelperClass LOG = new MyHelperClass();
                LOG.warn("IOException : maybe remote client has disconnected");
            } finally {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(is);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass APPLICATION_OCTET_STREAM_TYPE;
public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass warn(String o0){ return null; }}

class TrackRepresentation {

public MyHelperClass getInputStream(MediaType o0){ return null; }}

class Type {

}

class Annotation {

}

class MediaType {

public MyHelperClass isCompatible(MyHelperClass o0){ return null; }}

class MultivaluedMap {

public MyHelperClass add(String o0, String o1){ return null; }}

class OutputStream {

}

class WebApplicationException extends Exception{
	public WebApplicationException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
