


class c14439002 {

//    @Override
    public String getURL(String name) {
        String r;
        try {
            MyHelperClass NIFHandler = new MyHelperClass();
            URL url = new URL(NIFHandler.URL_BASE + name.replaceAll(" ", "+"));
            Document d =(Document)(Object) (new SAXBuilder().build(url.openStream()));
            Element e =(Element)(Object) d.getRootElement().descendTo("url");
            r =(String)(Object) e.getText().trim();
        } catch (Throwable t) {
            r = "unknown";
        }
        return r;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass URL_BASE;
public MyHelperClass trim(){ return null; }
	public MyHelperClass descendTo(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class Document {

public MyHelperClass getRootElement(){ return null; }}

class SAXBuilder {

public MyHelperClass build(MyHelperClass o0){ return null; }}

class Element {

public MyHelperClass getText(){ return null; }}
