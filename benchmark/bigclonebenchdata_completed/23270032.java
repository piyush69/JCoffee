import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c23270032 {
public MyHelperClass document;
	public MyHelperClass url;

    public void checkin(Object _document) {
        this.document =(MyHelperClass)(Object) (Document) _document;
        synchronized (url) {
            OutputStream outputStream = null;
            try {
                if ("file".equals(url.getProtocol())) {
                    outputStream = new FileOutputStream((String)(Object)url.getFile());
                } else {
                    URLConnection connection =(URLConnection)(Object) url.openConnection();
                    connection.setDoOutput(true);
                    outputStream = connection.getOutputStream();
                }
                new XMLOutputter("  ", true).output(this.document, outputStream);
                outputStream.flush();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getFile(){ return null; }
	public MyHelperClass getProtocol(){ return null; }}

class Document {

}

class XMLOutputter {

XMLOutputter(String o0, boolean o1){}
	XMLOutputter(){}
	public MyHelperClass output(MyHelperClass o0, OutputStream o1){ return null; }}
