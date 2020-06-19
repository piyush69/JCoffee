import java.io.*;
import java.lang.*;
import java.util.*;



class c968868 {
public MyHelperClass e;

    public Document getDocument(String urlString) {
        Document doc = null;
        URLConnection conn = null;
        InputStream in = null;
        try {
            SAXBuilder sxbuild = new SAXBuilder();
            MyHelperClass Osmolt = new MyHelperClass();
            if ((boolean)(Object)Osmolt.debug) {
                MyHelperClass outputInterface = new MyHelperClass();
                outputInterface.printDebugMessage("ProcessOSM", "url: " + urlString);
                in = new FileInputStream(new File(System.getProperty("user.home") + "/data.osm"));
//                MyHelperClass outputInterface = new MyHelperClass();
                outputInterface.processSetStatus("getting data from " + System.getProperty("user.home") + "/data.osm");
            } else {
                URL url = new URL(urlString);
                MyHelperClass outputInterface = new MyHelperClass();
                outputInterface.printDebugMessage("ProcessOSM", "url: " + urlString);
//                MyHelperClass outputInterface = new MyHelperClass();
                outputInterface.processSetStatus("connecting Server");
                conn =(URLConnection)(Object) url.openConnection();
//                MyHelperClass outputInterface = new MyHelperClass();
                outputInterface.processSetStatus("loading Data");
                in =(InputStream)(Object) conn.getInputStream();
            }
            doc =(Document)(Object) sxbuild.build(in);
//         } catch (java.net.UncheckedIOException e) {
            MyHelperClass outputInterface = new MyHelperClass();
            outputInterface.printError("Unknown Host: " + urlString);
//         } catch (java.net.UncheckedIOException e) {
//            MyHelperClass outputInterface = new MyHelperClass();
            outputInterface.printError("Timeout: Server does not response");
//         } catch (java.net.UncheckedIOException e) {
//            MyHelperClass outputInterface = new MyHelperClass();
            outputInterface.printError("Error Server response: " + e.getMessage());
//         } catch (java.net.UncheckedIOException e) {
//            MyHelperClass outputInterface = new MyHelperClass();
            outputInterface.printError("Error Server response: " + e.getMessage());
        } catch (UncheckedIOException e) {
            MyHelperClass outputInterface = new MyHelperClass();
            outputInterface.printError(e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            MyHelperClass outputInterface = new MyHelperClass();
            outputInterface.printError(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            MyHelperClass outputInterface = new MyHelperClass();
            outputInterface.printError(e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException ioe) {
            }
        }
        return doc;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass debug;
public MyHelperClass printError(String o0){ return null; }
	public MyHelperClass processSetStatus(String o0){ return null; }
	public MyHelperClass getMessage(){ return null; }
	public MyHelperClass printDebugMessage(String o0, String o1){ return null; }}

class Document {

}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class SAXBuilder {

public MyHelperClass build(InputStream o0){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }}

class JDOMException extends Exception{
	public JDOMException(String errorMessage) { super(errorMessage); }
}
