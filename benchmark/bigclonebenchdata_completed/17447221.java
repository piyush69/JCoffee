
import java.io.UncheckedIOException;


class c17447221 {
public MyHelperClass add(LinearNode o0){ return null; }

    public void load() throws ResourceInstantiationException {
        MyHelperClass url = new MyHelperClass();
        if (null == url) {
            throw new ResourceInstantiationException("URL not set (null).");
        }
        try {
            MyHelperClass ENCODING = new MyHelperClass();
            BufferedReader defReader =(BufferedReader)(Object) new BomStrippingInputStreamReader((url).openStream(), ENCODING);
            String line;
            LinearNode node;
            while (null != (line =(String)(Object) defReader.readLine())) {
                node = new LinearNode(line);
                try {
                    this.add(node);
                } catch (UncheckedIOException ex) {
                    throw new ResourceInstantiationException((String)(Object)ex);
                }
            }
            defReader.close();
            boolean isModified;// = new boolean();
            isModified = false;
        } catch (Exception x) {
            throw new ResourceInstantiationException((String)(Object)x);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openStream(){ return null; }}

class ResourceInstantiationException extends Exception{
	public ResourceInstantiationException(String errorMessage) { super(errorMessage); }
}

class BufferedReader {

public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class BomStrippingInputStreamReader {

BomStrippingInputStreamReader(){}
	BomStrippingInputStreamReader(MyHelperClass o0, MyHelperClass o1){}}

class LinearNode {

LinearNode(String o0){}
	LinearNode(){}}

class GateRuntimeException extends Exception{
	public GateRuntimeException(String errorMessage) { super(errorMessage); }
}
