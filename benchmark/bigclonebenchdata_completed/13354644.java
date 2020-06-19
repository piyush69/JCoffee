


class c13354644 {
public MyHelperClass addStructure(TreeSpec o0){ return null; }
	public MyHelperClass addStructure(GraphSpec o0){ return null; }

    public void addUrl(URL url) throws IOException, SAXException {
        InputStream inStream =(InputStream)(Object) url.openStream();
        String path =(String)(Object) url.getPath();
        int slashInx = path.lastIndexOf('/');
        String name = path.substring(slashInx + 1);
        MyHelperClass docBuild = new MyHelperClass();
        Document doc =(Document)(Object) docBuild.parse(inStream);
        Element root =(Element)(Object) doc.getDocumentElement();
        String rootTag =(String)(Object) root.getTagName();
        if (rootTag.equals("graphml")) {
            NodeList graphNodes =(NodeList)(Object) root.getElementsByTagName("graph");
            for (int i = 0; i < (int)(Object)graphNodes.getLength(); i++) {
                Element elem = (Element)(Element)(Object) graphNodes.item(i);
                String graphName =(String)(Object) elem.getAttribute("id");
                if (graphName == null) {
                    graphName = name;
                }
                addStructure(new GraphSpec(graphName));
                MyHelperClass urlRefs = new MyHelperClass();
                urlRefs.put(graphName, url);
            }
        } else if (rootTag.equals("tree")) {
            addStructure(new TreeSpec(name));
            MyHelperClass urlRefs = new MyHelperClass();
            urlRefs.put(name, url);
        } else {
            throw new IllegalArgumentException("Format of " + url + " not understood.");
        }
        inStream.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass parse(InputStream o0){ return null; }
	public MyHelperClass put(String o0, URL o1){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass getPath(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class Document {

public MyHelperClass getDocumentElement(){ return null; }}

class Element {

public MyHelperClass getAttribute(String o0){ return null; }
	public MyHelperClass getElementsByTagName(String o0){ return null; }
	public MyHelperClass getTagName(){ return null; }}

class NodeList {

public MyHelperClass item(int o0){ return null; }
	public MyHelperClass getLength(){ return null; }}

class GraphSpec {

GraphSpec(String o0){}
	GraphSpec(){}}

class TreeSpec {

TreeSpec(String o0){}
	TreeSpec(){}}
