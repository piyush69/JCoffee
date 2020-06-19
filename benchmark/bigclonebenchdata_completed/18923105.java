


class c18923105 {
public static MyHelperClass readAllBytes(InputStream o0){ return null; }
//public MyHelperClass readAllBytes(InputStream o0){ return null; }

    public static byte[] read(URL url) throws IOException {
        byte[] bytes;
        InputStream is = null;
        try {
            is =(InputStream)(Object) url.openStream();
            bytes =(byte[])(Object) readAllBytes(is);
        } finally {
            if (is != null) {
                is.close();
            }
        }
        return bytes;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}
