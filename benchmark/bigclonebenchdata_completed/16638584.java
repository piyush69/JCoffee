


class c16638584 {

    public String getResource(String resourceName) throws IOException {
        MyHelperClass resourceClass = new MyHelperClass();
        InputStream resourceStream =(InputStream)(Object) resourceClass.getResourceAsStream(resourceName);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(2048);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copyAndClose(resourceStream, baos);
        String expected = new String((String)(Object)baos.toByteArray());
        return expected;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyAndClose(InputStream o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass getResourceAsStream(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class ByteArrayOutputStream {

ByteArrayOutputStream(int o0){}
	ByteArrayOutputStream(){}
	public MyHelperClass toByteArray(){ return null; }}
