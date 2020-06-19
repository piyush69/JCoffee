import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14347882 {
public MyHelperClass entries;
	public MyHelperClass separator;
	public MyHelperClass isModified;
	public MyHelperClass getURL(){ return null; }

    public void load(boolean isOrdered) throws Throwable, ResourceInstantiationException {
        try {
            MyHelperClass url = new MyHelperClass();
            if (null == url) {
                throw new ResourceInstantiationException("URL not specified (null).");
            }
            BufferedReader listReader;
            MyHelperClass encoding = new MyHelperClass();
            listReader =(BufferedReader)(Object) new BomStrippingInputStreamReader((url).openStream(), encoding);
            String line;
            int linenr = 0;
            while (null != (line = listReader.readLine())) {
                linenr++;
                GazetteerNode node = null;
                try {
                    MyHelperClass separator = new MyHelperClass();
                    node = new GazetteerNode(line, separator, isOrdered);
                } catch (Exception ex) {
                    throw new GateRuntimeException("Could not read gazetteer entry " + linenr + " from URL " + getURL() + ": " + ex.getMessage(), ex);
                }
                entries.add(new GazetteerNode(line, separator, isOrdered));
            }
            listReader.close();
        } catch (Exception x) {
            throw new ResourceInstantiationException(x.getClass() + ":" + x.getMessage());
        }
        isModified =(MyHelperClass)(Object) false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass add(GazetteerNode o0){ return null; }
	public MyHelperClass openStream(){ return null; }}

class ResourceInstantiationException extends Exception{
	public ResourceInstantiationException(String errorMessage) { super(errorMessage); }
}

class BomStrippingInputStreamReader {

BomStrippingInputStreamReader(MyHelperClass o0, MyHelperClass o1){}
	BomStrippingInputStreamReader(){}}

class GazetteerNode {

GazetteerNode(String o0, MyHelperClass o1, boolean o2){}
	GazetteerNode(){}}

class GateRuntimeException extends Exception{
	public GateRuntimeException(String errorMessage) { super(errorMessage); }
	GateRuntimeException(String o0, Exception o1){}
	GateRuntimeException(){}
}
