


class c13669410 {
public MyHelperClass runTest(URL o0, MyHelperClass o1, MyHelperClass o2){ return null; }
public MyHelperClass getDocumentBuilder(){ return null; }

    protected void runTests(URL pBaseURL, String pName, String pHref) throws Exception {
        URL url = new URL(pBaseURL, pHref);
        InputSource isource = new InputSource(url.openStream());
        isource.setSystemId(url.toString());
        Document document =(Document)(Object) getDocumentBuilder().parse(isource);
        NodeList schemas =(NodeList)(Object) document.getElementsByTagNameNS(null, "Schema");
        for (int i = 0; i < (int)(Object)schemas.getLength(); i++) {
            Element schema = (Element)(Element)(Object) schemas.item(i);
            runTest(url, schema.getAttribute("name"), schema.getAttribute("href"));
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass parse(InputSource o0){ return null; }}

class URL {

URL(){}
	URL(URL o0, String o1){}
	public MyHelperClass openStream(){ return null; }}

class InputSource {

InputSource(MyHelperClass o0){}
	InputSource(){}
	public MyHelperClass setSystemId(String o0){ return null; }}

class Document {

public MyHelperClass getElementsByTagNameNS(Object o0, String o1){ return null; }}

class NodeList {

public MyHelperClass item(int o0){ return null; }
	public MyHelperClass getLength(){ return null; }}

class Element {

public MyHelperClass getAttribute(String o0){ return null; }}
