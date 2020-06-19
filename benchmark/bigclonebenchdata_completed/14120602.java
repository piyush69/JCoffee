import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14120602 {

    public void startElement(String uri, String tag, String qName, org.xml.sax.Attributes attributes) throws Throwable, SAXException {
        Attributes prop = new Attributes(attributes);
        try {
            if (tag.equals("app")) {
                if (prop == null) {
                    System.err.println("app without properties");
                    return;
                }
                String appname =(String)(Object) prop.getValue("name", "");
                String lookandfeel =(String)(Object) prop.getValue("lookandfeel", "");
                MyHelperClass global = new MyHelperClass();
                global.setAppName(appname);
                if (lookandfeel.length() > 0) {
                    if (lookandfeel.equalsIgnoreCase("Windows")) lookandfeel = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel"; else if (lookandfeel.equalsIgnoreCase("Motif")) lookandfeel = "com.sun.java.swing.plaf.motif.MotifLookAndFeel"; else if (lookandfeel.equalsIgnoreCase("Mac")) lookandfeel = "com.sun.java.swing.plaf.mac.MacLookAndFeel";
                    MyHelperClass UIManager = new MyHelperClass();
                    UIManager.setLookAndFeel(lookandfeel);
                }
            } else if (tag.equals("script")) {
                MyHelperClass global = new MyHelperClass();
                WABClient c = (WABClient)(WABClient)(Object) global;
                c.beginScript();
                String url =(String)(Object) prop.getValue("src");
                if (url.length() > 0) {
                    try {
                        BufferedReader r = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
                        String buffer;
                        while (true) {
                            buffer = r.readLine();
                            if (buffer == null) break;
                            c.script +=(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object) buffer + "\n";
                        }
                        r.close();
                        c.endScript();
                    } catch (IOException ioe) {
                        System.err.println("[IOError] " + ioe.getMessage());
                        System.exit(0);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setLookAndFeel(String o0){ return null; }
	public MyHelperClass setAppName(String o0){ return null; }}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class WABClient {
public MyHelperClass script;
public MyHelperClass endScript(){ return null; }
	public MyHelperClass beginScript(){ return null; }}

class Attributes {

Attributes(org.xml.sax.Attributes o0){}
	Attributes(){}
	public MyHelperClass getValue(String o0, String o1){ return null; }
	public MyHelperClass getValue(String o0){ return null; }}
