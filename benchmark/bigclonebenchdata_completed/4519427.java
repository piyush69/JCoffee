import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4519427 {

    private Document post(String location, String content) throws Throwable, ApplicationException {
        Document doc = null;
        try {
            URL url = new URL(location);
            HttpURLConnection uc = (HttpURLConnection) url.openConnection();
            uc.setRequestMethod("POST");
            uc.setRequestProperty("Content-Type", "application/xml");
            uc.setRequestProperty("X-POST_DATA_FORMAT", "xml");
            uc.setDoOutput(true);
            OutputStreamWriter out = new OutputStreamWriter(uc.getOutputStream());
            out.write("<request>");
            MyHelperClass configuration = new MyHelperClass();
            out.write("<token>" + configuration.getBackpackPassword() + "</token>");
            if (content != null) {
                out.write("<item><content>" + content + "</content></item>");
            }
            out.write("</request>");
            out.close();
            MyHelperClass XmlUtils = new MyHelperClass();
            doc =(Document)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) XmlUtils.readDocumentFromInputStream(uc.getInputStream());
//            MyHelperClass XmlUtils = new MyHelperClass();
            System.out.println(XmlUtils.toString(doc));
        } catch (IOException e) {
            e.printStackTrace();
            throw new ApplicationException((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)e);
        }
        return doc;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getBackpackPassword(){ return null; }
	public MyHelperClass readDocumentFromInputStream(InputStream o0){ return null; }}

class Document {

}

class ApplicationException extends Exception{
	public ApplicationException(String errorMessage) { super(errorMessage); }
}

class Object {

public MyHelperClass toString(Document o0){ return null; }}
