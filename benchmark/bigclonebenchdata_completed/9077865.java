import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9077865 {
public MyHelperClass Lock;
	public MyHelperClass source;
	public MyHelperClass fileURI;
	public MyHelperClass DocumentImpl;
	public MyHelperClass success;
	public MyHelperClass exception;
	public MyHelperClass getJoint(){ return null; }

//    @Override
    public void exec()  throws Throwable {
        MyHelperClass fileURI = new MyHelperClass();
        if (fileURI == null) return;
        InputStream is = null;
        try {
//            MyHelperClass fileURI = new MyHelperClass();
            if ((boolean)(Object)fileURI.toLowerCase().startsWith("dbgp://")) {
//                MyHelperClass fileURI = new MyHelperClass();
                String uri =(String)(Object) fileURI.substring(7);
                if (uri.toLowerCase().startsWith("file/")) {
//                    MyHelperClass fileURI = new MyHelperClass();
                    uri =(String)(Object) fileURI.substring(5);
                    is = new FileInputStream(new File(uri));
                } else {
//                    MyHelperClass fileURI = new MyHelperClass();
                    XmldbURI pathUri =(XmldbURI)(Object) XmldbURI.create(URLDecoder.decode((String)(Object)fileURI.substring(15), "UTF-8"));
                    Database db =(Database)(Object) getJoint().getContext().getDatabase();
                    DBBroker broker = null;
                    try {
                        broker =(DBBroker)(Object) db.getBroker();
                        DocumentImpl resource =(DocumentImpl)(Object) broker.getXMLResource(pathUri, Lock.READ_LOCK);
                        if (resource.getResourceType() == DocumentImpl.BINARY_FILE) {
                            is =(InputStream)(Object) broker.getBinaryResource((BinaryDocument)(BinaryDocument)(Object) resource);
                        } else {
                            return;
                        }
                    } catch (ArithmeticException e) {
                        exception =(MyHelperClass)(Object) e;
                    } finally {
                        db.release(broker);
                    }
                }
            } else {
                URL url = new URL((String)(Object)fileURI);
                URLConnection conn = url.openConnection();
                is = conn.getInputStream();
            }
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buf = new byte[256];
            int c;
            while ((c = is.read(buf)) > -1) {
                baos.write(buf, 0, c);
            }
            source =(MyHelperClass)(Object) baos.toByteArray();
            success =(MyHelperClass)(Object) true;
        } catch (MalformedURLException e) {
            exception =(MyHelperClass)(Object) e;
        } catch (IOException e) {
            exception =(MyHelperClass)(Object) e;
        } catch (ArrayIndexOutOfBoundsException e) {
            exception =(MyHelperClass)(Object) e;
        } finally {
            if (is != null) try {
                is.close();
            } catch (IOException e) {
                if (exception == null) exception =(MyHelperClass)(Object) e;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass READ_LOCK;
	public MyHelperClass BINARY_FILE;
public MyHelperClass getContext(){ return null; }
	public MyHelperClass startsWith(String o0){ return null; }
	public MyHelperClass getDatabase(){ return null; }
	public MyHelperClass substring(int o0){ return null; }
	public MyHelperClass toLowerCase(){ return null; }}

class XmldbURI {

public static MyHelperClass create(String o0){ return null; }}

class Database {

public MyHelperClass release(DBBroker o0){ return null; }
	public MyHelperClass getBroker(){ return null; }}

class DBBroker {

public MyHelperClass getXMLResource(XmldbURI o0, MyHelperClass o1){ return null; }
	public MyHelperClass getBinaryResource(BinaryDocument o0){ return null; }}

class DocumentImpl {

public MyHelperClass getResourceType(){ return null; }}

class BinaryDocument {

}

class EXistException extends Exception{
	public EXistException(String errorMessage) { super(errorMessage); }
}

class PermissionDeniedException extends Exception{
	public PermissionDeniedException(String errorMessage) { super(errorMessage); }
}
