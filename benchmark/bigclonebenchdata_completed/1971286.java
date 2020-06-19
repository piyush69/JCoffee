import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1971286 {
public MyHelperClass parseInputStream(InputStream o0){ return null; }

    public XmlDocument parseLocation(String locationUrl)  throws Throwable {
        URL url = null;
        try {
            url = new URL(locationUrl);
        } catch (MalformedURLException e) {
            throw new XmlBuilderException("could not parse URL " + locationUrl, e);
        }
        try {
            return(XmlDocument)(Object) parseInputStream(url.openStream());
        } catch (IOException e) {
            throw new XmlBuilderException("could not open connection to URL " + locationUrl, e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class XmlDocument {

}

class XmlBuilderException extends Exception{
	public XmlBuilderException(String errorMessage) { super(errorMessage); }
	XmlBuilderException(){}
	XmlBuilderException(String o0, IOException o1){}
	XmlBuilderException(String o0, MalformedURLException o1){}
}
