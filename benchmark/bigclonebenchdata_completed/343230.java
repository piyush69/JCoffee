import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c343230 {
public MyHelperClass transformer;

        public Source resolve(String href, String base) throws Throwable, TransformerException {
            if (href.endsWith(".txt")) {
                try {
                    URL url = new URL(new URL(base), href);
                    java.io.InputStream in = url.openConnection().getInputStream();
                    java.io.InputStreamReader reader = new java.io.InputStreamReader(in, "iso-8859-1");
                    StringBuffer sb = new StringBuffer();
                    while (true) {
                        int c = reader.read();
                        if (c < 0) break;
                        sb.append((char) c);
                    }
                    TextFragmentValue tree = new TextFragmentValue(sb.toString(), url.toString(), (Controller)(Controller)(Object) transformer);
                    return(Source)(Object) tree.getFirst();
                } catch (Exception err) {
                    throw new TransformerException((String)(Object)err);
                }
            } else {
                return null;
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Source {

}

class TransformerException extends Exception{
	public TransformerException(String errorMessage) { super(errorMessage); }
}

class TextFragmentValue {

TextFragmentValue(String o0, String o1, Controller o2){}
	TextFragmentValue(){}
	public MyHelperClass getFirst(){ return null; }}

class Controller {

}
