import java.io.*;
import java.lang.*;
import java.util.*;



class c19741707 {

    protected BufferedReader getBufferedReader(InputSource input) throws IOException, SAXException {
        BufferedReader br = null;
        if (input.getCharacterStream() != null) {
            br = new BufferedReader((Reader)(Object)input.getCharacterStream());
        } else if (input.getByteStream() != null) {
            br = new BufferedReader(new InputStreamReader((InputStream)(Object)input.getByteStream()));
        } else if (input.getSystemId() != null) {
            URL url = new URL(input.getSystemId());
            br = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
        } else {
            throw new SAXException("Invalid InputSource!");
        }
        return br;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InputSource {

public MyHelperClass getCharacterStream(){ return null; }
	public MyHelperClass getSystemId(){ return null; }
	public MyHelperClass getByteStream(){ return null; }}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openStream(){ return null; }}
