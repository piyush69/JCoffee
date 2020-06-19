


class c18041906 {

    public Location getLocation(String ip) throws Exception {
        URL url = new URL("http://api.hostip.info/?ip=" + ip);
        SAXReader reader = new SAXReader();
        Document doc =(Document)(Object) reader.read(url.openStream());
        System.out.println(doc.asXML());
        Location location = new Location(doc);
        return location;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Location {

Location(Document o0){}
	Location(){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class SAXReader {

public MyHelperClass read(MyHelperClass o0){ return null; }}

class Document {

public MyHelperClass asXML(){ return null; }}
