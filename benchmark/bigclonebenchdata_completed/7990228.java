


class c7990228 {

    public static InputStream gzip(final InputStream inputStream) throws IOException {
        MyHelperClass Assert = new MyHelperClass();
        Assert.notNull(inputStream, "inputStream");
        InputOutputStream inputOutputStream = new InputOutputStream();
        GZIPOutputStream gzipOutputStream = new GZIPOutputStream(inputOutputStream);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(inputStream, gzipOutputStream);
        gzipOutputStream.close();
        return(InputStream)(Object) inputOutputStream.getInputStream();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, GZIPOutputStream o1){ return null; }
	public MyHelperClass notNull(InputStream o0, String o1){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputOutputStream {

public MyHelperClass getInputStream(){ return null; }}

class GZIPOutputStream {

GZIPOutputStream(InputOutputStream o0){}
	GZIPOutputStream(){}
	public MyHelperClass close(){ return null; }}
