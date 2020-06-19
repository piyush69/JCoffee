


class c9819955 {
public MyHelperClass IOUtils;

//    @Override
    public void write(OutputStream output) throws IOException, WebApplicationException {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final GZIPOutputStream gzipOs = new GZIPOutputStream(baos);
        MyHelperClass is = new MyHelperClass();
        IOUtils.copy(is, gzipOs);
        baos.close();
        gzipOs.close();
        output.write(baos.toByteArray());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(MyHelperClass o0, GZIPOutputStream o1){ return null; }}

class OutputStream {

public MyHelperClass write(MyHelperClass o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class WebApplicationException extends Exception{
	public WebApplicationException(String errorMessage) { super(errorMessage); }
}

class ByteArrayOutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass toByteArray(){ return null; }}

class GZIPOutputStream {

GZIPOutputStream(){}
	GZIPOutputStream(ByteArrayOutputStream o0){}
	public MyHelperClass close(){ return null; }}
