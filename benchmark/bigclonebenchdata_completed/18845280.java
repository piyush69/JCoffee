


class c18845280 {
public static MyHelperClass getURLInputStream(FOUserAgent o0, String o1){ return null; }
//public MyHelperClass getURLInputStream(FOUserAgent o0, String o1){ return null; }

    public static void readFile(FOUserAgent ua, String uri, OutputStream output) throws IOException {
        InputStream in =(InputStream)(Object) getURLInputStream(ua, uri);
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(in, output);
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(in);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class FOUserAgent {

}

class OutputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}
