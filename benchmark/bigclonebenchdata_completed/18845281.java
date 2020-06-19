


class c18845281 {
public static MyHelperClass getURLInputStream(FOUserAgent o0, String o1){ return null; }
//public MyHelperClass getURLInputStream(FOUserAgent o0, String o1){ return null; }

    public static void readFile(FOUserAgent ua, String uri, Writer output, String encoding) throws IOException {
        InputStream in =(InputStream)(Object) getURLInputStream(ua, uri);
        try {
            StringWriter writer = new StringWriter();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(in, writer, encoding);
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(in);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, StringWriter o1, String o2){ return null; }}

class FOUserAgent {

}

class Writer {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class StringWriter {

}
