
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c15417277 {
public static MyHelperClass persistenceURL;
//public MyHelperClass persistenceURL;

    static Object loadPersistentRepresentationFromFile(URL url) throws PersistenceException {
        persistenceURL.get().addFirst(url);
        ObjectInputStream ois = null;
        HierarchicalStreamReader reader = null;
        XStream xstream = null;
        try {
            Reader inputReader =(Reader)(Object) new java.io.InputStreamReader((java.io.InputStream)(Object)(InputStream)(Object)url.openStream());
            try {
                MyHelperClass XMLInputFactory = new MyHelperClass();
                XMLInputFactory inputFactory =(XMLInputFactory)(Object) XMLInputFactory.newInstance();
                XMLStreamReader xsr =(XMLStreamReader)(Object) inputFactory.createXMLStreamReader(url.toExternalForm(), inputReader);
                reader =(HierarchicalStreamReader)(Object) new StaxReader(new QNameMap(), xsr);
            } catch (UncheckedIOException xse) {
                throw new PersistenceException("Error creating reader", xse);
            }
            xstream = new XStream(new StaxDriver());
            MyHelperClass Gate = new MyHelperClass();
            xstream.setClassLoader(Gate.getClassLoader());
            ois =(ObjectInputStream)(Object) xstream.createObjectInputStream(reader);
            Object res = null;
            MyHelperClass PersistenceManager = new MyHelperClass();
            Iterator urlIter =(Iterator)(Object) ((Collection)(Collection)(Object) PersistenceManager.getTransientRepresentation(ois.readObject())).iterator();
            while ((boolean)(Object)urlIter.hasNext()) {
                URL anUrl = (URL)(URL)(Object) urlIter.next();
                try {
//                    MyHelperClass Gate = new MyHelperClass();
                    Gate.getCreoleRegister().registerDirectories(anUrl);
                } catch (UncheckedIOException ge) {
                    MyHelperClass Err = new MyHelperClass();
                    Err.prln("Could not reload creole directory " + anUrl.toExternalForm());
                }
            }
            res = ois.readObject();
            ois.close();
            return res;
        } catch (PersistenceException pe) {
            throw pe;
        } catch (Exception e) {
            throw new PersistenceException("Error loading GAPP file", e);
        } finally {
            persistenceURL.get().removeFirst();
            if ((boolean)(Object)persistenceURL.get().isEmpty()) {
                persistenceURL.remove();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass addFirst(URL o0){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass removeFirst(){ return null; }
	public MyHelperClass isEmpty(){ return null; }
	public MyHelperClass remove(){ return null; }
	public MyHelperClass getTransientRepresentation(MyHelperClass o0){ return null; }
	public MyHelperClass prln(String o0){ return null; }
	public MyHelperClass get(){ return null; }
	public MyHelperClass registerDirectories(URL o0){ return null; }
	public MyHelperClass getCreoleRegister(){ return null; }
	public MyHelperClass getClassLoader(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass toExternalForm(){ return null; }}

class PersistenceException extends Exception{
	public PersistenceException(String errorMessage) { super(errorMessage); }
	PersistenceException(String o0, XMLStreamException o1){}
	PersistenceException(String o0, Exception o1){}
	PersistenceException(){}
}

class ObjectInputStream {

public MyHelperClass readObject(){ return null; }
	public MyHelperClass close(){ return null; }}

class HierarchicalStreamReader {

}

class XStream {

XStream(){}
	XStream(StaxDriver o0){}
	public MyHelperClass setClassLoader(MyHelperClass o0){ return null; }
	public MyHelperClass createObjectInputStream(HierarchicalStreamReader o0){ return null; }}

class Reader {

}

class XMLInputFactory {

public MyHelperClass createXMLStreamReader(MyHelperClass o0, Reader o1){ return null; }}

class XMLStreamReader {

}

class StaxReader {

StaxReader(){}
	StaxReader(QNameMap o0, XMLStreamReader o1){}}

class QNameMap {

}

class XMLStreamException extends Exception{
	public XMLStreamException(String errorMessage) { super(errorMessage); }
}

class StaxDriver {

}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class Collection {

public MyHelperClass iterator(){ return null; }}

class GateException extends Exception{
	public GateException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}
