


class c7398604 {

//    @Override
    public Collection doImport() throws Exception {
        MyHelperClass progress = new MyHelperClass();
        progress.initialize(2, "Ściągam autorów amerykańskich");
        String url = "http://pl.wikipedia.org/wiki/Kategoria:Ameryka%C5%84scy_autorzy_fantastyki";
        UrlResource resource = new UrlResource(url);
        InputStream urlInputStream =(InputStream)(Object) resource.getInputStream();
        StringWriter writer = new StringWriter();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(urlInputStream, writer);
//        MyHelperClass progress = new MyHelperClass();
        progress.advance("Parsuję autorów amerykańskich");
        MyHelperClass DocumentBuilderFactory = new MyHelperClass();
        DocumentBuilderFactory factory =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
        DocumentBuilder builder =(DocumentBuilder)(Object) factory.newDocumentBuilder();
        String httpDoc = writer.toString();
        httpDoc = httpDoc.replaceFirst("(?s)<!DOCTYPE.+?>\\n", "");
        httpDoc = httpDoc.replaceAll("(?s)<script.+?</script>", "");
        httpDoc = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\" ?>\n" + httpDoc;
        ByteArrayInputStream byteInputStream = new ByteArrayInputStream(httpDoc.getBytes("UTF-8"));
        Document doc =(Document)(Object) builder.parse(byteInputStream);
        ArrayList authorNames = new ArrayList();
        ArrayList authors = new ArrayList();
        MyHelperClass XPathFactory = new MyHelperClass();
        XPathFactory xpathFactory =(XPathFactory)(Object) XPathFactory.newInstance();
        XPath xpath =(XPath)(Object) xpathFactory.newXPath();
        MyHelperClass XPathConstants = new MyHelperClass();
        NodeList list = (NodeList)(NodeList)(Object) xpath.evaluate("//ul/li/div/div/a", doc, XPathConstants.NODESET);
        for (int i = 0; i < (int)(Object)list.getLength(); i++) {
            String name =(String)(Object) list.item(i).getTextContent();
            MyHelperClass StringUtils = new MyHelperClass();
            if ((boolean)(Object)StringUtils.isNotBlank(name)) {
                authorNames.add(name);
            }
        }
//        MyHelperClass XPathConstants = new MyHelperClass();
        list = (NodeList)(NodeList)(Object) xpath.evaluate("//td/ul/li/a", doc, XPathConstants.NODESET);
        for (int i = 0; i < (int)(Object)list.getLength(); i++) {
            String name =(String)(Object) list.item(i).getTextContent();
            MyHelperClass StringUtils = new MyHelperClass();
            if ((boolean)(Object)StringUtils.isNotBlank(name)) {
                authorNames.add(name);
            }
        }
        for (String name :(String[])(Object) (Object[])(Object)authorNames) {
            int idx = name.lastIndexOf(' ');
            String fname = name.substring(0, idx).trim();
            String lname = name.substring(idx + 1).trim();
            authors.add(new Author(fname, lname));
        }
//        MyHelperClass progress = new MyHelperClass();
        progress.advance("Wykonano");
        return (Collection)(Object)authors;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NODESET;
public MyHelperClass newInstance(){ return null; }
	public MyHelperClass initialize(int o0, String o1){ return null; }
	public MyHelperClass getTextContent(){ return null; }
	public MyHelperClass advance(String o0){ return null; }
	public MyHelperClass isNotBlank(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, StringWriter o1){ return null; }}

class Collection {

}

class IAuthor {

}

class UrlResource {

UrlResource(String o0){}
	UrlResource(){}
	public MyHelperClass getInputStream(){ return null; }}

class InputStream {

}

class StringWriter {

}

class DocumentBuilderFactory {

public MyHelperClass newDocumentBuilder(){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(ByteArrayInputStream o0){ return null; }}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(byte[] o0){}}

class Document {

}

class ArrayList {

public MyHelperClass add(Author o0){ return null; }
	public MyHelperClass add(String o0){ return null; }}

class XPathFactory {

public MyHelperClass newXPath(){ return null; }}

class XPath {

public MyHelperClass evaluate(String o0, Document o1, MyHelperClass o2){ return null; }}

class NodeList {

public MyHelperClass item(int o0){ return null; }
	public MyHelperClass getLength(){ return null; }}

class Author {

Author(String o0, String o1){}
	Author(){}}
