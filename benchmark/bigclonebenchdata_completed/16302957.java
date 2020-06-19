import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16302957 {
public MyHelperClass demandChildElement(Element o0, String o1){ return null; }
	public MyHelperClass parsePackage(Element o0){ return null; }
	public MyHelperClass elaborate(ModelClass o0){ return null; }
	public MyHelperClass parseGeneralization(Element o0){ return null; }
	public MyHelperClass parseAssociation(Element o0, ModelClass o1){ return null; }
public MyHelperClass generalizations;
	public MyHelperClass Adapter;
	public MyHelperClass adapter;
	public MyHelperClass classElements;
	public MyHelperClass model;
	public MyHelperClass qualifiersOnTarget;
	public MyHelperClass associations;
	public MyHelperClass packagePath;
	public MyHelperClass roughMode;

    private void parse(URL url, String description, boolean qualifiersOnTarget) throws Throwable, org.xml.sax.SAXException, java.io.IOException {
        this.qualifiersOnTarget =(MyHelperClass)(Object) qualifiersOnTarget;
        model =(MyHelperClass)(Object) new Model(description);
        if ((boolean)(Object)roughMode) model.setRoughMode(true);
        DOMParser parser = new DOMParser();
        parser.setFeature("http://xml.org/sax/features/validation", false);
        parser.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
        parser.parse(new InputSource(url.openStream()));
        Document doc =(Document)(Object) parser.getDocument();
        Element documentEl =(Element)(Object) doc.getDocumentElement();
        Element contentEl =(Element)(Object) demandChildElement(documentEl, "XMI.content");
        adapter = Adapter.getAdapter(documentEl);
        parsePackage(contentEl);
        if (!(Boolean)(Object)packagePath.isEmpty()) throw new IllegalArgumentException();
        packagePath = null;
        for (Iterator i =(Iterator)(Object) generalizations.iterator(); i.hasNext(); ) parseGeneralization((Element) i.next());
        generalizations = null;
        for (Iterator i =(Iterator)(Object) associations.keySet().iterator(); i.hasNext(); ) {
            Element assoel = (Element) i.next();
            parseAssociation(assoel, (ModelClass)(ModelClass)(Object) (associations.get(assoel)));
        }
        associations = null;
        for (Iterator i =(Iterator)(Object) classElements.keySet().iterator(); i.hasNext(); ) elaborate((ModelClass) (i.next()));
        classElements = null;
        if ((boolean)(Object)roughMode) model.determineAllSupertypes(); else model.flatten();
        url = null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(Element o0){ return null; }
	public MyHelperClass isEmpty(){ return null; }
	public MyHelperClass determineAllSupertypes(){ return null; }
	public MyHelperClass setRoughMode(boolean o0){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass keySet(){ return null; }
	public MyHelperClass getAdapter(Element o0){ return null; }
	public MyHelperClass flatten(){ return null; }}

class Model {

Model(String o0){}
	Model(){}}

class DOMParser {

public MyHelperClass getDocument(){ return null; }
	public MyHelperClass parse(InputSource o0){ return null; }
	public MyHelperClass setFeature(String o0, boolean o1){ return null; }}

class InputSource {

InputSource(){}
	InputSource(InputStream o0){}}

class Document {

public MyHelperClass getDocumentElement(){ return null; }}

class Element {

}

class ModelClass {

}
