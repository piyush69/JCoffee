


class c1428038 {
public MyHelperClass videoId;
public MyHelperClass setTitle(String o0){ return null; }

    public void initializeWebInfo() throws MalformedURLException, IOException, DOMException {
        Tidy tidy = new Tidy();
        MyHelperClass YOUTUBE_URL = new MyHelperClass();
        URL url = new URL((int)(Object)YOUTUBE_URL + (int)(Object)videoId);
        InputStream in =(InputStream)(Object) url.openConnection().getInputStream();
        Document doc =(Document)(Object) tidy.parseDOM(in, null);
        Element e =(Element)(Object) doc.getDocumentElement();
        String title = null;
        if (e != null && (boolean)(Object)e.hasChildNodes()) {
            NodeList children =(NodeList)(Object) e.getElementsByTagName("title");
            if (children != null) {
                for (int i = 0; i < (int)(Object)children.getLength(); i++) {
                    try {
                        Element childE = (Element)(Element)(Object) children.item(i);
                        if (childE.getTagName().equals("title")) {
                            NodeList titleChildren =(NodeList)(Object) childE.getChildNodes();
                            for (int n = 0; n < (int)(Object)titleChildren.getLength(); n++) {
                                if (titleChildren.item(n).getNodeType() == childE.TEXT_NODE) {
                                    title =(String)(Object) titleChildren.item(n).getNodeValue();
                                }
                            }
                        }
                    } catch (Exception exp) {
                        exp.printStackTrace();
                    }
                }
            }
        }
        if (title == null || title.equals("")) {
            MyHelperClass DOMException = new MyHelperClass();
            throw new DOMException(DOMException.NOT_FOUND_ERR, "no title found");
        } else {
            setTitle(title);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NOT_FOUND_ERR;
public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getNodeType(){ return null; }
	public MyHelperClass getNodeValue(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class DOMException extends Exception{
	public DOMException(String errorMessage) { super(errorMessage); }
	DOMException(){}
	DOMException(MyHelperClass o0, String o1){}
}

class Tidy {

public MyHelperClass parseDOM(InputStream o0, Object o1){ return null; }}

class URL {

URL(int o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class InputStream {

}

class Document {

public MyHelperClass getDocumentElement(){ return null; }}

class Element {
public MyHelperClass TEXT_NODE;
public MyHelperClass getTagName(){ return null; }
	public MyHelperClass getChildNodes(){ return null; }
	public MyHelperClass hasChildNodes(){ return null; }
	public MyHelperClass getElementsByTagName(String o0){ return null; }}

class NodeList {

public MyHelperClass item(int o0){ return null; }
	public MyHelperClass getLength(){ return null; }}
