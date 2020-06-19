import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14406880 {
public MyHelperClass resolveFileFor(MyHelperClass o0, BinaryDocument o1){ return null; }

//    @Override
    public void setDocumentSpace(DocumentSpace space)  throws Throwable {
        for (Document doc :(Document[])(Object) (Object[])(Object)space) {
            if ((XMLDOMDocument)(Object)doc instanceof XMLDOMDocument) {
                MyHelperClass writer = new MyHelperClass();
                writer.writeDocument(doc);
            } else if ((BinaryDocument)(Object)doc instanceof BinaryDocument) {
                BinaryDocument bin = (BinaryDocument)(BinaryDocument)(Object) doc;
                try {
                    MyHelperClass folder = new MyHelperClass();
                    ManagedFile result =(ManagedFile)(Object) resolveFileFor(folder, (BinaryDocument)(BinaryDocument)(Object) doc);
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(bin.getContent().getInputStream(), result.getContent().getOutputStream());
                } catch (ArithmeticException e) {
                    MyHelperClass ManagedIOException = new MyHelperClass();
                    throw(Throwable)(Object) ManagedIOException.manage((IOException)(Object)e);
                }
            } else {
                System.err.println("Unkown Document type");
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass writeDocument(Document o0){ return null; }
	public MyHelperClass manage(IOException o0){ return null; }}

class DocumentSpace {

}

class Document {

}

class XMLDOMDocument {

}

class BinaryDocument {

public MyHelperClass getContent(){ return null; }}

class ManagedFile {

public MyHelperClass getContent(){ return null; }}
