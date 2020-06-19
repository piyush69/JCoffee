import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c23106635 {

    public Document load(java.net.URL url) throws Throwable, DOMTestLoadException {
        Document doc = null;
        try {
            java.io.InputStream stream = url.openStream();
            MyHelperClass tidyConstructor = new MyHelperClass();
            Object tidyObj = tidyConstructor.newInstance(new Object[0]);
            MyHelperClass parseDOMMethod = new MyHelperClass();
            doc = (Document)(Document)(Object) parseDOMMethod.invoke(tidyObj, new Object[] { stream, null });
        } catch (InvocationTargetException ex) {
            throw new DOMTestLoadException(ex.getTargetException());
        } catch (Exception ex) {
            throw new DOMTestLoadException((String)(Object)ex);
        }
        return doc;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newInstance(Object[] o0){ return null; }
	public MyHelperClass invoke(Object o0, Object[] o1){ return null; }}

class Document {

}

class DOMTestLoadException extends Exception{
	public DOMTestLoadException(String errorMessage) { super(errorMessage); }
}

class InvocationTargetException extends Exception{
	public InvocationTargetException(String errorMessage) { super(errorMessage); }
}
