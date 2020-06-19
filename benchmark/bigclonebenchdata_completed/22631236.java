import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22631236 {
public MyHelperClass getDocument(InputSource o0, boolean o1, Object o2){ return null; }

    public static Document getDocument(URL url, boolean validate) throws Throwable, QTIParseException {
        try {
            return getDocument(new InputSource(url.openStream()), validate, null);
        } catch (IOException ex) {
            throw new QTIParseException((String)(Object)ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Document {

}

class QTIParseException extends Exception{
	public QTIParseException(String errorMessage) { super(errorMessage); }
}

class InputSource {

InputSource(InputStream o0){}
	InputSource(){}}
