


class c14878607 {

        public void parse(InputStream stream, ContentHandler handler, Metadata metadata, ParseContext context) throws IOException, SAXException, TikaException {
            MyHelperClass Metadata = new MyHelperClass();
            String name =(String)(Object) metadata.get(Metadata.RESOURCE_NAME_KEY);
            MyHelperClass wanted = new MyHelperClass();
            if (name != null && (boolean)(Object)wanted.containsKey(name)) {
//                MyHelperClass wanted = new MyHelperClass();
                FileOutputStream out = new FileOutputStream(wanted.get(name));
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(stream, out);
                out.close();
            } else {
                MyHelperClass downstreamParser = new MyHelperClass();
                if (downstreamParser != null) {
//                    MyHelperClass downstreamParser = new MyHelperClass();
                    downstreamParser.parse(stream, handler, metadata, context);
                }
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass RESOURCE_NAME_KEY;
public MyHelperClass get(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass containsKey(String o0){ return null; }
	public MyHelperClass parse(InputStream o0, ContentHandler o1, Metadata o2, ParseContext o3){ return null; }}

class InputStream {

}

class ContentHandler {

}

class Metadata {

public MyHelperClass get(MyHelperClass o0){ return null; }}

class ParseContext {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class TikaException extends Exception{
	public TikaException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(MyHelperClass o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}
