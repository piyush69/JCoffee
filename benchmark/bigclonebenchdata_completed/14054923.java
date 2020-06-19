


class c14054923 {

    protected Document getRawResults(String urlString, Map args) throws Exception {
        int count = 0;
        Iterator keys =(Iterator)(Object) args.keySet().iterator();
        while ((boolean)(Object)keys.hasNext()) {
            String sep = count++ == 0 ? "?" : "&";
            String name = (String)(String)(Object) keys.next();
            if (args.get(name) != null) {
                urlString += sep + name + "=" + args.get(name);
            }
        }
        URL url = new URL(urlString);
        URLConnection conn =(URLConnection)(Object) url.openConnection();
        conn.connect();
        SAXBuilder builder = new SAXBuilder();
        return(Document)(Object) builder.build(conn.getInputStream());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass iterator(){ return null; }}

class Map {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass keySet(){ return null; }}

class Document {

}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class SAXBuilder {

public MyHelperClass build(MyHelperClass o0){ return null; }}
