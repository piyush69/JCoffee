


class c17402775 {

    public String getResourceAsString(String name) throws IOException {
        String content = null;
        MyHelperClass aClass = new MyHelperClass();
        InputStream stream =(InputStream)(Object) aClass.getResourceAsStream(name);
        if (stream != null) {
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyAndClose(stream, buffer);
            content = buffer.toString();
        } else {
            MyHelperClass Assert = new MyHelperClass();
            Assert.fail("Resource not available: " + name);
        }
        return content;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyAndClose(InputStream o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass getResourceAsStream(String o0){ return null; }
	public MyHelperClass fail(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class ByteArrayOutputStream {

}
