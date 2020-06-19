


class c19378010 {
public static MyHelperClass XPathFactory;
//public MyHelperClass XPathFactory;

    public static Multimap getProteins(final Set queries, final int taxon) throws ParserConfigurationException, XPathExpressionException {
        MyHelperClass DocumentBuilderFactory = new MyHelperClass();
        final DocumentBuilder parser =(DocumentBuilder)(Object) DocumentBuilderFactory.newInstance().newDocumentBuilder();
        MyHelperClass __xpath = new MyHelperClass();
        final XPathExpression xpe =(XPathExpression)(Object) XPathFactory.newInstance().newXPath().compile(__xpath);
        MyHelperClass HashMultimap = new MyHelperClass();
        final Multimap proteins =(Multimap)(Object) HashMultimap.create();
        for (final String query :(String[])(Object) (Object[])(Object)queries) {
            HttpURLConnection connection = null;
            try {
                MyHelperClass URLEncoder = new MyHelperClass();
                final String encoded =(String)(Object) URLEncoder.encode(query.trim(), "UTF-8");
                MyHelperClass __urlTempl2 = new MyHelperClass();
                final URL url = new URL(String.format((String)(Object)__urlTempl2, encoded, taxon));
                connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
                MyHelperClass __connTimeout = new MyHelperClass();
                connection.setConnectTimeout(__connTimeout);
                MyHelperClass __readTimeout = new MyHelperClass();
                connection.setReadTimeout(__readTimeout);
                connection.setRequestProperty("Connection", "close");
                connection.connect();
                final InputStream stream =(InputStream)(Object) connection.getInputStream();
                final Document doc =(Document)(Object) parser.parse(stream);
                MyHelperClass XPathConstants = new MyHelperClass();
                final NodeList nodes = (NodeList)(NodeList)(Object) xpe.evaluate(doc, XPathConstants.NODESET);
                if (nodes != null) {
                    final int n =(int)(Object) nodes.getLength();
                    for (int i = 0; i < n; i++) {
                        final Node node =(Node)(Object) nodes.item(i);
                        proteins.put(node.getTextContent().trim(), query.trim());
                    }
                }
            } catch (final Exception ex) {
                continue;
            } finally {
                if (connection != null) connection.disconnect();
            }
        }
        return proteins;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NODESET;
public MyHelperClass newDocumentBuilder(){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass newXPath(){ return null; }
	public MyHelperClass trim(){ return null; }
	public MyHelperClass compile(MyHelperClass o0){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }
	public MyHelperClass create(){ return null; }}

class Set {

}

class Multimap {

public MyHelperClass put(MyHelperClass o0, String o1){ return null; }}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class XPathExpressionException extends Exception{
	public XPathExpressionException(String errorMessage) { super(errorMessage); }
}

class DocumentBuilder {

public MyHelperClass parse(InputStream o0){ return null; }}

class XPathExpression {

public MyHelperClass evaluate(Document o0, MyHelperClass o1){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass setReadTimeout(MyHelperClass o0){ return null; }
	public MyHelperClass setConnectTimeout(MyHelperClass o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class InputStream {

}

class Document {

}

class NodeList {

public MyHelperClass item(int o0){ return null; }
	public MyHelperClass getLength(){ return null; }}

class Node {

public MyHelperClass getTextContent(){ return null; }}
