


class c13422847 {
public MyHelperClass view;
	public MyHelperClass buildRaceTree(Element o0){ return null; }

    private void createTree(DefaultMutableTreeNode top) throws MalformedURLException, ParserConfigurationException, SAXException, IOException {
        InputStream stream;
        MyHelperClass SHIPS_URL = new MyHelperClass();
        URL url = new URL((int)(Object)SHIPS_URL + (int)(Object)view.getBaseurl());
        try {
            stream =(InputStream)(Object) url.openStream();
        } catch (Exception e) {
            stream =(InputStream)(Object) getClass().getResourceAsStream("ships.xml");
        }
        MyHelperClass DocumentBuilderFactory = new MyHelperClass();
        DocumentBuilderFactory factory =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
        DocumentBuilder parser =(DocumentBuilder)(Object) factory.newDocumentBuilder();
        Document doc =(Document)(Object) parser.parse(stream);
        NodeList races =(NodeList)(Object) doc.getElementsByTagName("race");
        for (int i = 0; i < (int)(Object)races.getLength(); i++) {
            Element race = (Element)(Element)(Object) races.item(i);
            top.add(buildRaceTree(race));
        }
        top.setUserObject("Ships");
        MyHelperClass view = new MyHelperClass();
        view.getShipTree().repaint();
//        MyHelperClass view = new MyHelperClass();
        view.getShipTree().expandRow(0);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass expandRow(int o0){ return null; }
	public MyHelperClass repaint(){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass getBaseurl(){ return null; }
	public MyHelperClass getShipTree(){ return null; }}

class DefaultMutableTreeNode {

public MyHelperClass add(MyHelperClass o0){ return null; }
	public MyHelperClass setUserObject(String o0){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class URL {

URL(int o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class DocumentBuilderFactory {

public MyHelperClass newDocumentBuilder(){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(InputStream o0){ return null; }}

class Document {

public MyHelperClass getElementsByTagName(String o0){ return null; }}

class NodeList {

public MyHelperClass item(int o0){ return null; }
	public MyHelperClass getLength(){ return null; }}

class Element {

}
