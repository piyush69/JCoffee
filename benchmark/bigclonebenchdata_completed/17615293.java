


class c17615293 {
public MyHelperClass getRegionMetadata(ByteArrayInputStream o0, DjatokaDecodeParam o1){ return null; }
public MyHelperClass process(InputStream o0, ArrayList o1, DjatokaDecodeParam o2){ return null; }
	public MyHelperClass processUsingTemp(InputStream o0, DjatokaDecodeParam o1){ return null; }

    public BufferedImage process(final InputStream is, DjatokaDecodeParam params) throws DjatokaException {
        MyHelperClass isWindows = new MyHelperClass();
        if ((boolean)(Object)isWindows) return(BufferedImage)(Object) processUsingTemp(is, params);
        ArrayList dims = null;
        if (params.getRegion() != null) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyStream(is, baos);
            dims =(ArrayList)(Object) getRegionMetadata(new ByteArrayInputStream(baos.toByteArray()), params);
            return(BufferedImage)(Object) process((InputStream)(Object)new ByteArrayInputStream(baos.toByteArray()), dims, params);
        } else return(BufferedImage)(Object) process(is, dims, params);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyStream(InputStream o0, ByteArrayOutputStream o1){ return null; }}

class InputStream {

}

class DjatokaDecodeParam {

public MyHelperClass getRegion(){ return null; }}

class BufferedImage {

}

class DjatokaException extends Exception{
	public DjatokaException(String errorMessage) { super(errorMessage); }
}

class ArrayList {

}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}

class ByteArrayInputStream {

ByteArrayInputStream(MyHelperClass o0){}
	ByteArrayInputStream(){}}
