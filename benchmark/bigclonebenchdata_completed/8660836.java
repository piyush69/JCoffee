


class c8660836 {

    public void transform(String style, String spec, OutputStream out) throws IOException {
        MyHelperClass rootURL = new MyHelperClass();
        URL url = new URL(rootURL, spec);
        InputStream in =(InputStream)(Object) new PatchXMLSymbolsStream(new StripDoctypeStream(url.openStream()));
        transform(style,(String)(Object) in, out);
        in.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class OutputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(){}
	URL(MyHelperClass o0, String o1){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class PatchXMLSymbolsStream {

PatchXMLSymbolsStream(StripDoctypeStream o0){}
	PatchXMLSymbolsStream(){}}

class StripDoctypeStream {

StripDoctypeStream(MyHelperClass o0){}
	StripDoctypeStream(){}}
