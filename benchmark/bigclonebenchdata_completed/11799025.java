import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11799025 {
public MyHelperClass content;
public MyHelperClass IOUtils;
	public MyHelperClass name;
	public MyHelperClass ManagedIOException;
	public MyHelperClass getContent(){ return null; }

//    @Override
    public Document duplicate()  throws Throwable {
        BinaryDocument b = new BinaryDocument(this.name, this.content.getContentType());
        try {
            IOUtils.copy(this.getContent().getInputStream(), this.getContent().getOutputStream());
            return(Document)(Object) b;
        } catch (UncheckedIOException e) {
            throw(Throwable)(Object) ManagedIOException.manage((IOException)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass manage(IOException o0){ return null; }
	public MyHelperClass copy(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass getContentType(){ return null; }}

class Document {

}

class BinaryDocument {

BinaryDocument(){}
	BinaryDocument(MyHelperClass o0, MyHelperClass o1){}}
