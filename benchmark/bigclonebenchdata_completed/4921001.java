
import java.io.UncheckedIOException;


class c4921001 {
public MyHelperClass parseMenubar(Element o0){ return null; }
	public MyHelperClass parseString(Element o0){ return null; }
	public MyHelperClass parseToolbar(Element o0){ return null; }
	public MyHelperClass parseMenu(Element o0){ return null; }

    public void addXMLResources(URL url) throws IOException {
        try {
            Document document =(Document)(Object) (new Builder().build(url.openStream()));
            Element root =(Element)(Object) document.getRootElement();
            if (!root.getLocalName().equals("resources")) throw new IOException("Document root must be <resources>");
            Elements elements =(Elements)(Object) root.getChildElements();
            for (int i = 0; i < (int)(Object)elements.size(); i++) {
                Element element =(Element)(Object) elements.get(i);
                if (element.getLocalName().equals("string")) parseString(element); else if (element.getLocalName().equals("menubar")) parseMenubar(element); else if (element.getLocalName().equals("menu")) parseMenu(element); else if (element.getLocalName().equals("toolbar")) parseToolbar(element); else throw new IOException("Unrecognized element: <" + element.getLocalName() + ">");
            }
        } catch (UncheckedIOException pe) {
            IOException ioe = new IOException(pe.getMessage());
            ioe.initCause(pe);
            throw ioe;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Document {

public MyHelperClass getRootElement(){ return null; }}

class Builder {

public MyHelperClass build(MyHelperClass o0){ return null; }}

class Element {

public MyHelperClass getChildElements(){ return null; }
	public MyHelperClass getLocalName(){ return null; }}

class Elements {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}

class ParsingException extends Exception{
	public ParsingException(String errorMessage) { super(errorMessage); }
}
