import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20805884 {

    public String preProcessHTML(String uri)  throws Throwable {
        final StringBuffer buf = new StringBuffer();
        try {
            HTMLDocument doc = new HTMLDocument() {

                public ParserCallback getReader(int pos) {
                    return new ParserCallback() {

                        public void handleText(char[] data, int pos) {
                            buf.append(data);
                            buf.append('\n');
                        }
                    };
                }
            };
            URL url = new URI(uri).toURL();
            URLConnection conn = url.openConnection();
            Reader rd = new InputStreamReader(conn.getInputStream());
            new ParserDelegator().parse(rd, doc.getReader(0), Boolean.TRUE);
        } catch (MalformedURLException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        } catch (URISyntaxException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        return buf.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HTMLDocument {

public MyHelperClass getReader(int o0){ return null; }}

class ParserDelegator {

public MyHelperClass parse(Reader o0, MyHelperClass o1, Boolean o2){ return null; }}

class ParserCallback {

}
