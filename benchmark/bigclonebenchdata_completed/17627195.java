import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17627195 {
public MyHelperClass document;
	public MyHelperClass url;
	public MyHelperClass doReload(URLConnection o0){ return null; }

    public Document getContentAsDocument()  throws Throwable {
        synchronized (this.url) {
            URLConnection connection =(URLConnection)(Object) this.url.openConnection();
            if ((boolean)(Object)doReload(connection)) {
                InputSource inputSource = new InputSource(connection.getInputStream());
                DocumentBuilderFactory factory =(DocumentBuilderFactory)(Object) new DocumentBuilderFactoryImpl();
                this.document = factory.newDocumentBuilder().parse(inputSource);
            }
            return(Document)(Object) this.document;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass parse(InputSource o0){ return null; }}

class Document {

}

class InputSource {

InputSource(){}
	InputSource(InputStream o0){}}

class DocumentBuilderFactory {

public MyHelperClass newDocumentBuilder(){ return null; }}

class DocumentBuilderFactoryImpl {

}
