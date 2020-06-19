


class c22190302 {
public MyHelperClass createInputSource(String o0, MyHelperClass o1, boolean o2, MyHelperClass o3){ return null; }
public MyHelperClass XmlReader;
	public MyHelperClass id2resource;
	public MyHelperClass ignoringMIME;
	public MyHelperClass mapResource(String o0){ return null; }
	public MyHelperClass name2uri(String o0){ return null; }

    public InputSource resolveEntity(String name, String uri) throws IOException, SAXException {
        InputSource retval;
        String mappedURI =(String)(Object) name2uri(name);
        InputStream stream;
        if (mappedURI == null && (stream =(InputStream)(Object) mapResource(name)) != null) {
            uri = "java:resource:" + (String)(String)(Object) id2resource.get(name);
            retval = new InputSource(XmlReader.createReader(stream));
        } else {
            URL url;
            URLConnection conn;
            if (mappedURI != null) uri = mappedURI; else if (uri == null) return null;
            url = new URL(uri);
            conn =(URLConnection)(Object) url.openConnection();
            uri = conn.getURL().toString();
            if ((boolean)(Object)ignoringMIME) retval = new InputSource(XmlReader.createReader((InputStream)(Object)conn.getInputStream())); else {
                String contentType =(String)(Object) conn.getContentType();
                retval =(InputSource)(Object) createInputSource(contentType, conn.getInputStream(), false, url.getProtocol());
            }
        }
        retval.setSystemId(uri);
        retval.setPublicId(name);
        return retval;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createReader(InputStream o0){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class InputSource {

InputSource(MyHelperClass o0){}
	InputSource(){}
	public MyHelperClass setPublicId(String o0){ return null; }
	public MyHelperClass setSystemId(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getProtocol(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getURL(){ return null; }
	public MyHelperClass getContentType(){ return null; }}
