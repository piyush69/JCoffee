


class c20180801 {

    public static byte[] readUrl(URL url) throws IOException {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        InputStream is =(InputStream)(Object) url.openStream();
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(is, os);
            return(byte[])(Object) os.toByteArray();
        } finally {
            is.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}
