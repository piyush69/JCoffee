


class c13260090 {
public static MyHelperClass getComponentXmlFiles(){ return null; }
public static MyHelperClass XML;
	public static MyHelperClass Resources;
//public MyHelperClass XML;
//	public MyHelperClass Resources;
//	public MyHelperClass getComponentXmlFiles(){ return null; }

    public static URL getComponentXmlFileWith(String name) throws Exception {
        List all =(List)(Object) getComponentXmlFiles();
        for (URL url :(URL[])(Object) (Object[])(Object)all) {
            InputStream stream = null;
            try {
                stream =(InputStream)(Object) url.openStream();
                Element root =(Element)(Object) XML.getRootElement(stream);
                for (Element elem :(Element[])(Object) (Object[])(Object)(List)(List)(Object) root.elements()) {
                    String ns =(String)(Object) elem.getNamespace().getURI();
                    if (name.equals(elem.attributeValue("name"))) {
                        return url;
                    }
                }
            } finally {
                Resources.closeStream(stream);
            }
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeStream(InputStream o0){ return null; }
	public MyHelperClass getURI(){ return null; }
	public MyHelperClass getRootElement(InputStream o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class List {

}

class InputStream {

}

class Element {

public MyHelperClass getNamespace(){ return null; }
	public MyHelperClass elements(){ return null; }
	public MyHelperClass attributeValue(String o0){ return null; }}
