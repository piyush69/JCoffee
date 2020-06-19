
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22948678 {
public MyHelperClass add(MappingNode o0){ return null; }

    public void load() throws ResourceInstantiationException, InvalidFormatException {
        MyHelperClass url = new MyHelperClass();
        if (null == url) {
            throw new ResourceInstantiationException("URL not set (null).");
        }
        try {
            MyHelperClass ENCODING = new MyHelperClass();
            BufferedReader mapReader =(BufferedReader)(Object) new BomStrippingInputStreamReader((url).openStream(), ENCODING);
            String line;
            MappingNode node;
            while (null != (line =(String)(Object) mapReader.readLine())) {
                if (0 != line.trim().length()) {
                    node = new MappingNode(line);
                    this.add(node);
                }
            }
            mapReader.close();
        } catch (UncheckedIOException ife) {
//            MyHelperClass url = new MyHelperClass();
            throw new InvalidFormatException(url, "on load");
        } catch (ArithmeticException ioe) {
            throw new ResourceInstantiationException((String)(Object)ioe);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openStream(){ return null; }}

class ResourceInstantiationException extends Exception{
	public ResourceInstantiationException(String errorMessage) { super(errorMessage); }
}

class InvalidFormatException extends Exception{
	public InvalidFormatException(String errorMessage) { super(errorMessage); }
	InvalidFormatException(){}
	InvalidFormatException(MyHelperClass o0, String o1){}
}

class BufferedReader {

public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class BomStrippingInputStreamReader {

BomStrippingInputStreamReader(){}
	BomStrippingInputStreamReader(MyHelperClass o0, MyHelperClass o1){}}

class MappingNode {

MappingNode(String o0){}
	MappingNode(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
