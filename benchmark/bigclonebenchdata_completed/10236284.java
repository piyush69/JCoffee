import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c10236284 {
public MyHelperClass lang;

    public HashSet<String> queryResource(String resourceName, String propertyName) {
        if (resourceName.startsWith("http://dbpedia.org/resource/")) {
            resourceName = resourceName.substring(28);
        }
        try {
            resourceName = resourceName.trim().replace(' ', '_');
            resourceName = URLEncoder.encode(resourceName, "UTF-8");
        } catch (UnsupportedEncodingException exc) {
        }
        MyHelperClass prefix = new MyHelperClass();
        String select = prefix + " SELECT ?hasValue WHERE { { " + "<http://dbpedia.org/resource/" + resourceName + "> " + propertyName + " ?hasValue  } FILTER (lang(?hasValue) = \"" + lang + "\" || !isLiteral(?hasValue))}";
        System.out.println(select);
        HashSet<String> values = new HashSet<String>();
        try {
            MyHelperClass queryBase = new MyHelperClass();
            URL url = new URL(queryBase + URLEncoder.encode(select, "UTF-8"));
            InputStream inStream = url.openStream();
            MyHelperClass docBuild = new MyHelperClass();
            Document doc =(Document)(Object) docBuild.parse(inStream);
            Element table =(Element)(Object) doc.getDocumentElement();
            NodeList rows =(NodeList)(Object) table.getElementsByTagName("tr");
            for (int i = 0; i < (int)(Object)rows.getLength(); i++) {
                Element row = (Element)(Element)(Object) rows.item(i);
                NodeList cols =(NodeList)(Object) row.getElementsByTagName("td");
                if ((int)(Object)cols.getLength() > 0) {
                    Element valElem = (Element)(Element)(Object) cols.item(0);
                    String value =(String)(Object) ((Text)(Text)(Object) valElem.getFirstChild()).getData();
                    if (value.startsWith("http://dbpedia.org/resource/")) {
                        value = value.substring(28).replaceAll("_", " ");
                    } else if (value.startsWith("http://dbpedia.org/ontology/")) {
                        value = value.substring(28).replaceAll("_", " ");
                    } else if (value.startsWith("http://dbpedia.org/class/yago/")) {
                        value = value.substring(30);
                        value = value.split("[\\d]+")[0];
                    }
                    values.add(value);
                }
            }
        } catch (UnsupportedEncodingException exc) {
            exc.printStackTrace();
        } catch (IOException exc) {
            System.err.println("Cannot retrieve record for " + resourceName);
        } catch (UncheckedIOException exc) {
            System.err.println("Cannot parse record for " + resourceName);
        }
        return values;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass parse(InputStream o0){ return null; }}

class Document {

public MyHelperClass getDocumentElement(){ return null; }}

class Element {

public MyHelperClass getFirstChild(){ return null; }
	public MyHelperClass getElementsByTagName(String o0){ return null; }}

class NodeList {

public MyHelperClass item(int o0){ return null; }
	public MyHelperClass getLength(){ return null; }}

class Text {

public MyHelperClass getData(){ return null; }}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}
