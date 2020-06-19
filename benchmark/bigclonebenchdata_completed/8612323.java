


class c8612323 {
public MyHelperClass getCharacterDataFromElement(Element o0){ return null; }
public MyHelperClass DocumentBuilderFactory;
	public MyHelperClass list;

    public void ProductListByCatHandler(int cathegory, int langId) {
        try {
            URL url = new URL("http://eiffel.itba.edu.ar/hci/service/Catalog.groovy?method=GetProductListByCategory&category_id=" + cathegory + "&language_id=" + langId);
            URLConnection urlc =(URLConnection)(Object) url.openConnection();
            urlc.setDoOutput(false);
            urlc.setAllowUserInteraction(false);
            BufferedReader br = new BufferedReader(new InputStreamReader(urlc.getInputStream()));
            String str;
            StringBuffer sb = new StringBuffer();
            while ((str =(String)(Object) br.readLine()) != null) {
                sb.append(str);
                sb.append("\n");
            }
            br.close();
            String response = sb.toString();
            if (response == null) {
                return;
            }
            DocumentBuilderFactory dbf =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
            DocumentBuilder db =(DocumentBuilder)(Object) dbf.newDocumentBuilder();
            InputSource is = new InputSource();
            is.setCharacterStream(new StringReader(response));
            Document dom =(Document)(Object) db.parse(is);
            NodeList nl =(NodeList)(Object) dom.getElementsByTagName("product");
            for (int i = 0; i < (int)(Object)nl.getLength(); i++) {
                Element nodes = (Element)(Element)(Object) nl.item(i);
                String id = nodes.getAttribute("id").toString();
                NodeList name =(NodeList)(Object) nodes.getElementsByTagName("name");
                NodeList rank2 =(NodeList)(Object) nodes.getElementsByTagName("sales_rank");
                NodeList price =(NodeList)(Object) nodes.getElementsByTagName("price");
                NodeList url2 =(NodeList)(Object) nodes.getElementsByTagName("image_url");
                String nameS =(String)(Object) getCharacterDataFromElement((Element)(Element)(Object) name.item(0));
                String rank2S =(String)(Object) getCharacterDataFromElement((Element)(Element)(Object) rank2.item(0));
                String priceS =(String)(Object) getCharacterDataFromElement((Element)(Element)(Object) price.item(0));
                String url2S =(String)(Object) getCharacterDataFromElement((Element)(Element)(Object) url2.item(0));
                list.add(new ProductShort(id, nameS, rank2S, priceS, url2S));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newInstance(){ return null; }
	public MyHelperClass add(ProductShort o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setAllowUserInteraction(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class DocumentBuilderFactory {

public MyHelperClass newDocumentBuilder(){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(InputSource o0){ return null; }}

class InputSource {

public MyHelperClass setCharacterStream(StringReader o0){ return null; }}

class StringReader {

StringReader(String o0){}
	StringReader(){}}

class Document {

public MyHelperClass getElementsByTagName(String o0){ return null; }}

class NodeList {

public MyHelperClass item(int o0){ return null; }
	public MyHelperClass getLength(){ return null; }}

class Element {

public MyHelperClass getElementsByTagName(String o0){ return null; }
	public MyHelperClass getAttribute(String o0){ return null; }}

class ProductShort {

ProductShort(){}
	ProductShort(String o0, String o1, String o2, String o3, String o4){}}
