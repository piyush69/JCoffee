
import java.io.UncheckedIOException;


class c4340712 {

    public static Map readDescriptors(URL url) throws IOException, XMLStreamException {
        if (url == null) {
            throw new IllegalArgumentException("url is null");
        }
        InputStream stream =(InputStream)(Object) new BufferedInputStream(url.openStream());
        try {
            return readDescriptors((URL)(Object)stream);
        } finally {
            try {
                stream.close();
            } catch (UncheckedIOException ignored) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class Map {

}

class VariableLengthInteger {

}

class ElementDescriptor {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class XMLStreamException extends Exception{
	public XMLStreamException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}}
