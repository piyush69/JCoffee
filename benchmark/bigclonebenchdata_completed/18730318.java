import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18730318 {
public MyHelperClass serialize(Node o0, OutputStream o1){ return null; }

    public boolean write(Node node, LSOutput output) throws Throwable, LSException {
        OutputStream out =(OutputStream)(Object) output.getByteStream();
        try {
            if (out == null) {
                String systemId =(String)(Object) output.getSystemId();
                try {
                    URL url = new URL(systemId);
                    URLConnection connection = url.openConnection();
                    connection.setDoOutput(true);
                    if (connection instanceof HttpURLConnection) {
                        ((HttpURLConnection) connection).setRequestMethod("PUT");
                    }
                    out = connection.getOutputStream();
                } catch (MalformedURLException e) {
                    File file = new File(systemId);
                    out = new FileOutputStream(file);
                }
            }
            serialize(node, out);
            out.flush();
            return true;
        } catch (IOException e) {
            MyHelperClass LSException = new MyHelperClass();
            throw new DomLSException(LSException.SERIALIZE_ERR, e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SERIALIZE_ERR;
}

class Node {

}

class LSOutput {

public MyHelperClass getByteStream(){ return null; }
	public MyHelperClass getSystemId(){ return null; }}

class LSException extends Exception{
	public LSException(String errorMessage) { super(errorMessage); }
}

class DomLSException extends Exception{
	public DomLSException(String errorMessage) { super(errorMessage); }
	DomLSException(MyHelperClass o0, IOException o1){}
	DomLSException(){}
}
