import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21977773 {
public MyHelperClass NULL;
public MyHelperClass document;
	public MyHelperClass url;
	public MyHelperClass documentDescriptor;
	public MyHelperClass inputStream;
	public MyHelperClass officeApplication;
public MyHelperClass exception;

        public void run()  throws Throwable {
            try {
                MyHelperClass useStream = new MyHelperClass();
                if ((boolean)(Object)useStream || inputStream != null) {
                    InputStream inputStream = null;
                    MyHelperClass url = new MyHelperClass();
                    if (LoadDocumentOperation.this.inputStream != null) inputStream = LoadDocumentOperation.this.inputStream; else inputStream =(InputStream)(Object) url.openStream();
                    MyHelperClass frame = new MyHelperClass();
                    if (frame != null) document = officeApplication.getDocumentService().loadDocument(frame, inputStream, documentDescriptor); else document = officeApplication.getDocumentService().loadDocument(inputStream, documentDescriptor);
                    try {
                        inputStream.close();
                    } catch (Throwable throwable) {
                    }
                } else {
                    MyHelperClass frame = new MyHelperClass();
                    if (frame != null) document = officeApplication.getDocumentService().loadDocument(frame, url.toString(), documentDescriptor); else document = officeApplication.getDocumentService().loadDocument(url.toString(), documentDescriptor);
                }
                boolean done =(boolean)(Object) NULL; //new boolean();
                done = true;
            } catch (Exception exception) {
                this.exception =(MyHelperClass)(Object) exception;
            } catch (ThreadDeath threadDeath) {
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass loadDocument(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass loadDocument(MyHelperClass o0, String o1, MyHelperClass o2){ return null; }
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass loadDocument(MyHelperClass o0, InputStream o1, MyHelperClass o2){ return null; }
	public MyHelperClass loadDocument(InputStream o0, MyHelperClass o1){ return null; }
	public MyHelperClass getDocumentService(){ return null; }}

class LoadDocumentOperation {

}
