


class c11314012 {

    public static java.io.ByteArrayOutputStream getFileByteStream(URL _url) {
        java.io.ByteArrayOutputStream buffer = new java.io.ByteArrayOutputStream();
        try {
            InputStream input =(InputStream)(Object) _url.openStream();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(input,(ByteArrayOutputStream)(Object) buffer);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(input);
        } catch (Exception err) {
            throw new RuntimeException(err);
        }
        return buffer;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class ByteArrayOutputStream {

}
