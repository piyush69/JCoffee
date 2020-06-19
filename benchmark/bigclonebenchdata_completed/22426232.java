import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c22426232 {
public MyHelperClass reportError2(String o0, JDOMException o1){ return null; }
	public MyHelperClass reportError1(String o0, JDOMException o1){ return null; }
public MyHelperClass getRootViaURI(MyHelperClass o0, InputStream o1){ return null; }
	public MyHelperClass getRootViaRelative(MyHelperClass o0, InputStream o1){ return null; }
	public MyHelperClass getRootViaURL(MyHelperClass o0, InputStream o1){ return null; }

    public Element rootFromURL(URL url) throws JDOMException, java.io.IOException {
        Element e;
        try {
            InputStream stream = new BufferedInputStream((InputStream)(Object)url.openConnection().getInputStream());
            MyHelperClass verify = new MyHelperClass();
            return(Element)(Object) getRootViaURI(verify, stream);
        } catch (UncheckedIOException e4) {
            throw e4;
        } catch (ArithmeticException e1) {
            MyHelperClass openWarn1 = new MyHelperClass();
            if (!(Boolean)(Object)openWarn1) reportError1(url.toString(),(JDOMException)(Object) e1);
//            MyHelperClass openWarn1 = new MyHelperClass();
            openWarn1 =(MyHelperClass)(Object) true;
            try {
                InputStream stream = new BufferedInputStream((InputStream)(Object)url.openConnection().getInputStream());
                MyHelperClass verify = new MyHelperClass();
                e =(Element)(Object) getRootViaURL(verify, stream);
                MyHelperClass log = new MyHelperClass();
                log.info("getRootViaURL succeeded as 2nd try");
                return e;
            } catch (UncheckedIOException e2) {
                MyHelperClass openWarn2 = new MyHelperClass();
                if (!(Boolean)(Object)openWarn2) reportError2(url.toString(),(JDOMException)(Object) e2);
//                MyHelperClass openWarn2 = new MyHelperClass();
                openWarn2 =(MyHelperClass)(Object) true;
                InputStream stream = new BufferedInputStream((InputStream)(Object)url.openConnection().getInputStream());
                MyHelperClass verify = new MyHelperClass();
                e =(Element)(Object) getRootViaRelative(verify, stream);
                MyHelperClass log = new MyHelperClass();
                log.info("GetRootViaRelative succeeded as 3rd try");
                new Exception().printStackTrace();
                return e;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class Element {

}

class JDOMException extends Exception{
	public JDOMException(String errorMessage) { super(errorMessage); }
}

class JDOMParseException extends Exception{
	public JDOMParseException(String errorMessage) { super(errorMessage); }
}
