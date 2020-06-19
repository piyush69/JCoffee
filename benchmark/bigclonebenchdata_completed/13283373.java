import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13283373 {
public MyHelperClass NULL;
public MyHelperClass log;
	public MyHelperClass _curModel;

    public synchronized void readModels(Project p, URL url) throws Throwable, IOException {
        Project _proj =(Project)(Object) NULL; //new Project();
        _proj = p;
        log.info("=======================================");
        log.info("== READING MODEL " + url);
        try {
            XMIReader reader = new XMIReader();
            InputSource source = new InputSource(url.openStream());
            source.setSystemId(url.toString());
            MyHelperClass _curModel = new MyHelperClass();
            _curModel = reader.parse(source);
            if ((boolean)(Object)reader.getErrors()) {
                throw new IOException("XMI file " + url.toString() + " could not be parsed.");
            }
            HashMap _UUIDRefs =(HashMap)(Object) NULL; //new HashMap();
            _UUIDRefs = new HashMap((int)(Object)reader.getXMIUUIDToObjectMap());
        } catch (SAXException saxEx) {
            Exception ex = saxEx.getException();
            if (ex == null) {
                saxEx.printStackTrace();
            } else {
                ex.printStackTrace();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        log.info("=======================================");
        try {
            _proj.addModel((MNamespace)(MNamespace)(Object) _curModel);
        } catch (PropertyVetoException ex) {
            System.err.println("An error occurred adding the model to the project!");
            ex.printStackTrace();
        }
        MyHelperClass _curModel = new MyHelperClass();
        Collection ownedElements =(Collection)(Object) _curModel.getOwnedElements();
        Iterator oeIterator = ownedElements.iterator();
        while (oeIterator.hasNext()) {
            MModelElement me = (MModelElement) oeIterator.next();
            if ((MClass)(Object)me instanceof MClass) {
//                MyHelperClass _proj = new MyHelperClass();
                _proj.defineType((MClass)(MClass)(Object) me);
            } else if ((MDataType)(Object)me instanceof MDataType) {
//                MyHelperClass _proj = new MyHelperClass();
                _proj.defineType((MDataType)(MDataType)(Object) me);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getOwnedElements(){ return null; }
	public MyHelperClass info(String o0){ return null; }}

class Project {

public MyHelperClass addModel(MNamespace o0){ return null; }
	public MyHelperClass defineType(MClass o0){ return null; }
	public MyHelperClass defineType(MDataType o0){ return null; }}

class XMIReader {

public MyHelperClass getErrors(){ return null; }
	public MyHelperClass parse(InputSource o0){ return null; }
	public MyHelperClass getXMIUUIDToObjectMap(){ return null; }}

class InputSource {

InputSource(InputStream o0){}
	InputSource(){}
	public MyHelperClass setSystemId(String o0){ return null; }}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class PropertyVetoException extends Exception{
	public PropertyVetoException(String errorMessage) { super(errorMessage); }
}

class MModelElement {

}

class MClass {

}

class MDataType {

}

class MNamespace {

}
