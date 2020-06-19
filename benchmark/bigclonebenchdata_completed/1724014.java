import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1724014 {
public MyHelperClass PrivilegeManager;

    public Component loadComponent(URI uri, URI origuri) throws Throwable, ComponentException {
        MyHelperClass usePrivMan = new MyHelperClass();
        if ((boolean)(Object)usePrivMan) PrivilegeManager.enablePrivilege("UniversalConnect");
        MyHelperClass factory = new MyHelperClass();
        ConzillaRDFModel model =(ConzillaRDFModel)(Object) factory.createModel(origuri, uri);
        RDFParser parser =(RDFParser)(Object) new StanfordImpl();
        java.net.URL url = null;
        try {
            url =(URL)(Object) uri.getJavaURL();
//         } catch (java.net.ArithmeticException e) {
            throw new ComponentException("Invalid URL " + uri + " for component " + origuri + ":\n " + e.getMessage());
        }
        try {
            InputSource source = new InputSource(url.openStream());
            source.setSystemId(origuri.toString());
            parser.parse(source, new ModelConsumer(model));
//            MyHelperClass factory = new MyHelperClass();
            factory.getTotalModel().addModel(model);
//         } catch (org.xml.sax.ArrayIndexOutOfBoundsException se) {
            se.getException().printStackTrace();
            throw new ComponentException("Format error loading URL " + url + " for component " + origuri + ":\n " + se.getMessage());
        } catch (java.io.IOException se) {
            throw new ComponentException("IO error loading URL " + url + " for component " + origuri + ":\n " + se.getMessage());
        } catch (ArrayStoreException se) {
            throw new ComponentException("Model error loading URL " + url + " for component " + origuri + ":\n " + se.getMessage());
        }
        return(Component)(Object) model;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass enablePrivilege(String o0){ return null; }
	public MyHelperClass addModel(ConzillaRDFModel o0){ return null; }
	public MyHelperClass getTotalModel(){ return null; }
	public MyHelperClass createModel(URI o0, URI o1){ return null; }}

class Component {

}

class ComponentException extends Exception{
	public ComponentException(String errorMessage) { super(errorMessage); }
}

class ConzillaRDFModel {

}

class RDFParser {

public MyHelperClass parse(InputSource o0, ModelConsumer o1){ return null; }}

class URI {

public MyHelperClass getJavaURL(){ return null; }}

class InputSource {

InputSource(InputStream o0){}
	InputSource(){}
	public MyHelperClass setSystemId(String o0){ return null; }}

class ModelConsumer {

ModelConsumer(){}
	ModelConsumer(ConzillaRDFModel o0){}}

class StanfordImpl {

}

class ModelException extends Exception{
	public ModelException(String errorMessage) { super(errorMessage); }
}
