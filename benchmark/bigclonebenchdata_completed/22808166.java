import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22808166 {
public MyHelperClass getStringValueOrEmpty(MyHelperClass o0){ return null; }
public MyHelperClass BooleanToken;
	public MyHelperClass ErrorCodes;
	public MyHelperClass loc;

    protected void init() throws Throwable, MXQueryException {
MyHelperClass[] subIters = new MyHelperClass[5];
        String add =(String)(Object) getStringValueOrEmpty(subIters[0]);
        if (add == null) {
            MyHelperClass currentToken = new MyHelperClass();
            currentToken = BooleanToken.FALSE_TOKEN;
            return;
        }
        URI uri;
        MyHelperClass TypeLexicalConstraints = new MyHelperClass();
        if (!(Boolean)(Object)TypeLexicalConstraints.isValidURI(add)) throw new DynamicException(ErrorCodes.F0017_INVALID_ARGUMENT_TO_FN_DOC, "Invalid URI given to fn:doc-available", loc);
        try {
//            MyHelperClass TypeLexicalConstraints = new MyHelperClass();
            if ((boolean)(Object)TypeLexicalConstraints.isAbsoluteURI(add)) {
                uri = new URI(add);
            } else {
                MyHelperClass IOLib = new MyHelperClass();
                uri = new URI((String)(Object)IOLib.convertToAndroid(add));
            }
        } catch (URISyntaxException se) {
            MyHelperClass ErrorCodes = new MyHelperClass();
            throw new DynamicException(ErrorCodes.F0017_INVALID_ARGUMENT_TO_FN_DOC, "Invalid URI given to fn:doc-available", loc);
        }
        if (add.startsWith("http://")) {
            URL url;
            try {
                url = uri.toURL();
            } catch (MalformedURLException e) {
                MyHelperClass ErrorCodes = new MyHelperClass();
                throw new DynamicException(ErrorCodes.F0017_INVALID_ARGUMENT_TO_FN_DOC, "Invalid URI given to fn:doc-available", loc);
            }
            try {
                InputStream in = url.openStream();
                in.close();
            } catch (IOException e) {
                MyHelperClass currentToken = new MyHelperClass();
                currentToken = BooleanToken.FALSE_TOKEN;
                return;
            }
            MyHelperClass currentToken = new MyHelperClass();
            currentToken = BooleanToken.TRUE_TOKEN;
        } else {
            try {
                MyHelperClass MXQuery = new MyHelperClass();
                BufferedReader in = new BufferedReader(new InputStreamReader((InputStream)(Object)MXQuery.getContext().openFileInput(uri.toString())));
                MyHelperClass currentToken = new MyHelperClass();
                currentToken = BooleanToken.TRUE_TOKEN;
            } catch (UncheckedIOException e) {
                MyHelperClass currentToken = new MyHelperClass();
                currentToken = BooleanToken.FALSE_TOKEN;
            } catch (ArithmeticException e) {
                MyHelperClass currentToken = new MyHelperClass();
                currentToken = BooleanToken.FALSE_TOKEN;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass[] subIters;
	public MyHelperClass F0017_INVALID_ARGUMENT_TO_FN_DOC;
	public MyHelperClass FALSE_TOKEN;
	public MyHelperClass TRUE_TOKEN;
public MyHelperClass isAbsoluteURI(String o0){ return null; }
	public MyHelperClass getContext(){ return null; }
	public MyHelperClass convertToAndroid(String o0){ return null; }
	public MyHelperClass openFileInput(String o0){ return null; }
	public MyHelperClass isValidURI(String o0){ return null; }}

class MXQueryException extends Exception{
	public MXQueryException(String errorMessage) { super(errorMessage); }
}

class DynamicException extends Exception{
	public DynamicException(String errorMessage) { super(errorMessage); }
	DynamicException(){}
	DynamicException(MyHelperClass o0, String o1, MyHelperClass o2){}
}
