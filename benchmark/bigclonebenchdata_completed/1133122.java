import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1133122 {
public MyHelperClass get(){ return null; }
public MyHelperClass get(){ return null; }
//public MyHelperClass get(){ return null; }
//public MyHelperClass get(){ return null; }
//public MyHelperClass get(){ return null; }
//public MyHelperClass get(){ return null; }
//public MyHelperClass get(){ return null; }
//public MyHelperClass get(){ return null; }
public MyHelperClass getResourceLocation(String o0, String o1, Locale o2){ return null; }

    protected Document fetchResource(String method, String parameter, Locale locale, final FloodLimit limit) throws Throwable, IOException, SAXException {
        return getDocument(new CachedPage(getResourceLocation(method, parameter, locale)) {

//            @Override
            protected Reader openConnection(URL url) throws IOException {
                try {
                    if (limit != null) {
                        limit.acquirePermit();
                    }
                    return this.openConnection(url);
                } catch (InterruptedException e) {
                    throw new IOException(e);
                }
            }

            ;
        }.get());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FloodLimit {

public MyHelperClass acquirePermit(){ return null; }}

class Document {

}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class CachedPage {

CachedPage(MyHelperClass o0){}
	CachedPage(){}}
