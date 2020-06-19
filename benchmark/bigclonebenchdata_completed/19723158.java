import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19723158 {
public MyHelperClass CSSConstants;
	public MyHelperClass formatMessage(String o0, Object o1){ return null; }

    protected Scanner createScanner(InputSource source)  throws Throwable {
        MyHelperClass documentURI = new MyHelperClass();
        documentURI = source.getURI();
//        MyHelperClass documentURI = new MyHelperClass();
        if (documentURI == null) {
//            MyHelperClass documentURI = new MyHelperClass();
            documentURI =(MyHelperClass)(Object) "";
        }
        Reader r =(Reader)(Object) source.getCharacterStream();
        if (r != null) {
            return new Scanner(r);
        }
        InputStream is =(InputStream)(Object) source.getByteStream();
        if (is != null) {
            return new Scanner((Readable)(Object)(InputStream)(Object)(Readable)(Object)(InputStream)(Object)(Readable)(Object)is,(java.util.regex.Pattern)(Object)(Pattern)(Object) source.getEncoding());
        }
        String uri =(String)(Object) source.getURI();
        if (uri == null) {
            throw new CSSException((String)(Object)formatMessage("empty.source", null));
        }
        try {
            ParsedURL purl = new ParsedURL(uri);
            is =(InputStream)(Object) purl.openStreamRaw(CSSConstants.CSS_MIME_TYPE);
            return new Scanner((Readable)(Object)(InputStream)(Object)(Readable)(Object)(InputStream)(Object)(Readable)(Object)is,(java.util.regex.Pattern)(Object)(Pattern)(Object) source.getEncoding());
        } catch (IOException e) {
            throw new CSSException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CSS_MIME_TYPE;
}

class InputSource {

public MyHelperClass getEncoding(){ return null; }
	public MyHelperClass getCharacterStream(){ return null; }
	public MyHelperClass getURI(){ return null; }
	public MyHelperClass getByteStream(){ return null; }}

class CSSException extends Exception{
	public CSSException(String errorMessage) { super(errorMessage); }
}

class ParsedURL {

ParsedURL(String o0){}
	ParsedURL(){}
	public MyHelperClass openStreamRaw(MyHelperClass o0){ return null; }}

class Pattern {

}
