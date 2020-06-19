


class c13490155 {

    public Document parse(InputSource is) throws SAXException, IOException {
        MyHelperClass ls = new MyHelperClass();
        LSInput input =(LSInput)(Object) ls.createLSInput();
        String systemId =(String)(Object) is.getSystemId();
        InputStream in =(InputStream)(Object) is.getByteStream();
        if (in != null) {
            input.setByteStream(in);
        } else {
            Reader reader =(Reader)(Object) is.getCharacterStream();
            if (reader != null) {
                input.setCharacterStream(reader);
            } else {
                URL url = new URL(systemId);
                input.setByteStream((InputStream)(Object)url.openStream());
            }
        }
        input.setPublicId(is.getPublicId());
        input.setSystemId(systemId);
        input.setEncoding(is.getEncoding());
        MyHelperClass parser = new MyHelperClass();
        return(Document)(Object) parser.parse(input);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createLSInput(){ return null; }
	public MyHelperClass parse(LSInput o0){ return null; }}

class InputSource {

public MyHelperClass getEncoding(){ return null; }
	public MyHelperClass getCharacterStream(){ return null; }
	public MyHelperClass getByteStream(){ return null; }
	public MyHelperClass getPublicId(){ return null; }
	public MyHelperClass getSystemId(){ return null; }}

class Document {

}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class LSInput {

public MyHelperClass setByteStream(InputStream o0){ return null; }
	public MyHelperClass setEncoding(MyHelperClass o0){ return null; }
	public MyHelperClass setSystemId(String o0){ return null; }
	public MyHelperClass setCharacterStream(Reader o0){ return null; }
	public MyHelperClass setPublicId(MyHelperClass o0){ return null; }}

class InputStream {

}

class Reader {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}
