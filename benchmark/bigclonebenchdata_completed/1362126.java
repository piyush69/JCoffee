


class c1362126 {

    public InputStream resolve(String uri) throws SAJException {
        try {
            URI url = new URI(uri);
            InputStream stream =(InputStream)(Object) url.toURL().openStream();
            if (stream == null) throw new SAJException("URI " + uri + " can't be resolved");
            return stream;
        } catch (SAJException e) {
            throw e;
        } catch (Exception e) {
            throw new SAJException("Invalid uri to resolve " + uri, e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class SAJException extends Exception{
	public SAJException(String errorMessage) { super(errorMessage); }
	SAJException(){}
	SAJException(String o0, Exception o1){}
}

class URI {

URI(String o0){}
	URI(){}
	public MyHelperClass toURL(){ return null; }}
