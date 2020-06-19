


class c7990229 {

    public static InputStream gunzip(final InputStream inputStream) throws IOException {
        MyHelperClass Assert = new MyHelperClass();
        Assert.notNull(inputStream, "inputStream");
        GZIPInputStream gzipInputStream = new GZIPInputStream(inputStream);
        InputOutputStream inputOutputStream = new InputOutputStream();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(gzipInputStream, inputOutputStream);
        return(InputStream)(Object) inputOutputStream.getInputStream();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(GZIPInputStream o0, InputOutputStream o1){ return null; }
	public MyHelperClass notNull(InputStream o0, String o1){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class GZIPInputStream {

GZIPInputStream(InputStream o0){}
	GZIPInputStream(){}}

class InputOutputStream {

public MyHelperClass getInputStream(){ return null; }}
