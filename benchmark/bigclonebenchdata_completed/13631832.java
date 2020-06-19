import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13631832 {
public MyHelperClass logger;
	public MyHelperClass Level;
	public MyHelperClass resolveIntern(String o0, String o1){ return null; }

//    @Nullable
    public LSInput resolveResource(String type, String namespaceURI, String publicId, String systemId, String baseURI)  throws Throwable {
        MyHelperClass Level = new MyHelperClass();
        if ((boolean)(Object)logger.isLoggable(Level.FINE)) {
            MyHelperClass logger = new MyHelperClass();
            logger.fine("Try to resolve the resource with the public ID: " + publicId + ", system ID: " + systemId + " and baseURI " + baseURI + ".");
        }
        InputSource inputSource = null;
        try {
            inputSource =(InputSource)(Object) resolveIntern(publicId, systemId);
        } catch (ArithmeticException e) {
            logger.log(Level.SEVERE, "",(IOException)(Object) e);
        }
        if (inputSource != null) {
            return(LSInput)(Object) new LSInputSAXWrapper(inputSource);
        }
        if (baseURI != null) {
            String resolved = baseURI.substring(0, baseURI.lastIndexOf('/') + 1) + systemId;
            try {
                URL url = new URL(resolved);
                url.openConnection().connect();
                if ((boolean)(Object)logger.isLoggable(Level.FINE)) {
                    logger.fine("Resolve with help of baseURI to: " + resolved);
                }
                inputSource = new InputSource(resolved);
                return(LSInput)(Object) new LSInputSAXWrapper(inputSource);
            } catch (MalformedURLException e) {
            } catch (IOException e) {
            }
        }
        if ((boolean)(Object)logger.isLoggable(Level.WARNING)) {
            logger.warning("Failed to resolve the resource with the public ID: " + publicId + ", system ID: " + systemId + " and baseURI " + baseURI + ".");
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FINE;
	public MyHelperClass SEVERE;
	public MyHelperClass WARNING;
public MyHelperClass fine(String o0){ return null; }
	public MyHelperClass isLoggable(MyHelperClass o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, IOException o2){ return null; }
	public MyHelperClass warning(String o0){ return null; }}

class LSInput {

}

class Nullable {

}

class InputSource {

InputSource(String o0){}
	InputSource(){}}

class LSInputSAXWrapper {

LSInputSAXWrapper(){}
	LSInputSAXWrapper(InputSource o0){}}
