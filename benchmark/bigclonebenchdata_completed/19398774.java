import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19398774 {
public MyHelperClass sendReply(String o0, Queue o1){ return null; }

    public void onMessage(Message aMessage)  throws Throwable {
        try {
            String urlStr = "http://203.197.20.2:8080/newgenlibctxt/oai2.0?verb=ListRecords&resumptionToken=100_marc";
            java.net.URL url = new java.net.URL(urlStr);
            java.net.URLConnection urlCon = url.openConnection();
            urlCon.setDoInput(true);
            urlCon.connect();
            InputStream is = urlCon.getInputStream();
            SAXBuilder sb = new SAXBuilder();
            Document doc =(Document)(Object) sb.build(is);
            String xmlstr =(String)(Object) (new XMLOutputter()).outputString(doc);
            doc = null;
            sb = null;
            java.util.Vector vec = new java.util.Vector();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            TextMessage tm = (TextMessage)(TextMessage)(Object) aMessage;
            String text = tm.getText() + "processed by: message bean on july 13" + hashCode();
            Queue dest = (Queue) aMessage.getJMSReplyTo();
            sendReply(text, dest);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class TextMessage {

public MyHelperClass getText(){ return null; }}

class Message {

public MyHelperClass getJMSReplyTo(){ return null; }}

class SAXBuilder {

public MyHelperClass build(InputStream o0){ return null; }}

class Document {

}

class XMLOutputter {

public MyHelperClass outputString(Document o0){ return null; }}
