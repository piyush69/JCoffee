import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17083224 {

    public List<String> extractUrlList(String url) throws Throwable, IOException, XPathExpressionException {
        LinkedList<String> list = new LinkedList<String>();
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        Tidy tidy = new Tidy();
        tidy.setErrout(new NullPrintWriter());
        Document doc =(Document)(Object) tidy.parseDOM(conn.getInputStream(), null);
        int len = conn.getContentLength();
        if (len <= 0) len = 32000;
        ByteArrayOutputStream bout = new ByteArrayOutputStream(len);
        PrintStream ps = new PrintStream(bout);
        tidy.pprint(doc, ps);
        ps.flush();
        String content = bout.toString();
        MyHelperClass Pattern = new MyHelperClass();
        Pattern p =(Pattern)(Object) Pattern.compile("(http://[\\w\\\\\\./=&?;-]+)");
        Matcher m =(Matcher)(Object) p.matcher(content);
        while ((boolean)(Object)m.find()) {
            list.add((String)(Object)m.group());
        }
        return list;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass compile(String o0){ return null; }}

class XPathExpressionException extends Exception{
	public XPathExpressionException(String errorMessage) { super(errorMessage); }
}

class Tidy {

public MyHelperClass pprint(Document o0, PrintStream o1){ return null; }
	public MyHelperClass setErrout(NullPrintWriter o0){ return null; }
	public MyHelperClass parseDOM(InputStream o0, Object o1){ return null; }}

class NullPrintWriter {

}

class Document {

}

class Pattern {

public MyHelperClass matcher(String o0){ return null; }}

class Matcher {

public MyHelperClass find(){ return null; }
	public MyHelperClass group(){ return null; }}
