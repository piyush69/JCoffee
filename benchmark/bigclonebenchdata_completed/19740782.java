import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19740782 {
public static MyHelperClass e;
//public MyHelperClass e;

    public static void parseRDFXML(String url, StatementHandler handler) throws Throwable, IOException {
        ARP parser = new ARP();
        parser.getHandlers().setStatementHandler(handler);
        URLConnection conn = new URL(url).openConnection();
        String encoding = conn.getContentEncoding();
        InputStream in = null;
        try {
            in = conn.getInputStream();
            if (encoding == null) parser.load(in, url); else parser.load(new InputStreamReader(in, encoding), url);
            in.close();
//         } catch (org.xml.sax.UncheckedIOException e) {
            throw new OntopiaRuntimeException((String)(Object)e);
        } finally {
            if (in != null) in.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setStatementHandler(StatementHandler o0){ return null; }}

class StatementHandler {

}

class ARP {

public MyHelperClass getHandlers(){ return null; }
	public MyHelperClass load(InputStream o0, String o1){ return null; }
	public MyHelperClass load(InputStreamReader o0, String o1){ return null; }}

class OntopiaRuntimeException extends Exception{
	public OntopiaRuntimeException(String errorMessage) { super(errorMessage); }
}
