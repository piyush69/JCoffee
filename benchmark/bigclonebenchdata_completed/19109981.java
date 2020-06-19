import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19109981 {

    private void startScript(Attributes prop) throws Throwable, SAXException {
        MyHelperClass dialog = new MyHelperClass();
        dialog.beginScript();
        String url =(String)(Object) prop.getValue("src");
        if (url.length() > 0) {
            try {
                BufferedReader r = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
                String buffer;
                while (true) {
                    buffer = r.readLine();
                    if (buffer == null) break;
//                    MyHelperClass dialog = new MyHelperClass();
                    dialog.script +=(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object) buffer + "\n";
                }
                r.close();
//                MyHelperClass dialog = new MyHelperClass();
                dialog.endScript();
            } catch (IOException ioe) {
                System.err.println("[IOError] " + ioe.getMessage());
                System.exit(0);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass script;
public MyHelperClass endScript(){ return null; }
	public MyHelperClass beginScript(){ return null; }}

class Attributes {

public MyHelperClass getValue(String o0){ return null; }}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}
