


class c22010538 {

    private byte[] getBytes(String resource) throws IOException {
        InputStream is =(InputStream)(Object) HttpServletFileDownloadTest.class.getResourceAsStream(resource);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(is, out);
//        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.closeQuietly(is);
        return(byte[])(Object) out.toByteArray();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class HttpServletFileDownloadTest {

}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}
