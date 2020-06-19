


class c10463583 {

    public static Document getXHTMLDocument(URL _url) throws IOException {
        final Tidy tidy = new Tidy();
        tidy.setQuiet(true);
        tidy.setShowWarnings(false);
        tidy.setXmlOut(true);
        final BufferedInputStream input_stream = new BufferedInputStream(_url.openStream());
        return(Document)(Object) tidy.parseDOM(input_stream, null);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class Document {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Tidy {

public MyHelperClass setXmlOut(boolean o0){ return null; }
	public MyHelperClass setQuiet(boolean o0){ return null; }
	public MyHelperClass setShowWarnings(boolean o0){ return null; }
	public MyHelperClass parseDOM(BufferedInputStream o0, Object o1){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}}
