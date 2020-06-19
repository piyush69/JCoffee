


class c11021107 {

    private String getResourceAsString(final String name) throws IOException {
        final InputStream is =(InputStream)(Object) JiBXTestCase.class.getResourceAsStream(name);
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copyAndClose(is, baos);
        return baos.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyAndClose(InputStream o0, ByteArrayOutputStream o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class JiBXTestCase {

}

class ByteArrayOutputStream {

}
