import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1168512 {
public MyHelperClass debug;
public MyHelperClass CatalogException;
	public MyHelperClass newCatalog(){ return null; }

    protected Resolver queryResolver(String resolver, String command, String arg1, String arg2)  throws Throwable {
        InputStream iStream = null;
        String RFC2483 = resolver + "?command=" + command + "&format=tr9401&uri=" + arg1 + "&uri2=" + arg2;
        String line = null;
        try {
            URL url = new URL(RFC2483);
            URLConnection urlCon = url.openConnection();
            urlCon.setUseCaches(false);
            Resolver r = (Resolver)(Resolver)(Object) newCatalog();
            String cType = urlCon.getContentType();
            if (cType.indexOf(";") > 0) {
                cType = cType.substring(0, cType.indexOf(";"));
            }
            r.parseCatalog(cType, urlCon.getInputStream());
            return r;
        } catch (CatalogException cex) {
            if (cex.getExceptionType() == CatalogException.UNPARSEABLE) {
                debug.message(1, "Unparseable catalog: " + RFC2483);
            } else if (cex.getExceptionType() == CatalogException.UNKNOWN_FORMAT) {
                debug.message(1, "Unknown catalog format: " + RFC2483);
            }
            return null;
        } catch (MalformedURLException mue) {
            debug.message(1, "Malformed resolver URL: " + RFC2483);
            return null;
        } catch (IOException ie) {
            debug.message(1, "I/O Exception opening resolver: " + RFC2483);
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass UNKNOWN_FORMAT;
	public MyHelperClass UNPARSEABLE;
public MyHelperClass message(int o0, String o1){ return null; }}

class Resolver {

public MyHelperClass parseCatalog(String o0, InputStream o1){ return null; }}

class CatalogException extends Exception{
	public CatalogException(String errorMessage) { super(errorMessage); }
}
