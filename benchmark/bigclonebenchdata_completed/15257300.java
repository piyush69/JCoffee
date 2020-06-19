


class c15257300 {

    private String readFile(String urlFileString) throws IOException {
        URL url = new URL(urlFileString);
        MyHelperClass VizDebugUtils = new MyHelperClass();
        VizDebugUtils.debug("url: " + url.toString());
        InputStream stream =(InputStream)(Object) url.openStream();
        Reader reader =(Reader)(Object) new InputStreamReader(stream, "iso-8859-1");
        StringWriter writer = new StringWriter();
        MyHelperClass StreamUtils = new MyHelperClass();
        StreamUtils.transfer(reader, writer);
        stream.close();
        return writer.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass transfer(Reader o0, StringWriter o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class Reader {

}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}}

class StringWriter {

}
