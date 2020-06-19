


class c7131421 {
public MyHelperClass readFromDocument(Document o0){ return null; }
public MyHelperClass factory;
	public MyHelperClass getServersURL(){ return null; }

    private void getEventHeapsFromWeb() {
        try {
            URL url =(URL)(Object) getServersURL();
            InputStream in =(InputStream)(Object) url.openStream();
            Document doc =(Document)(Object) factory.newDocumentBuilder().parse(in);
            readFromDocument(doc);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass newDocumentBuilder(){ return null; }
	public MyHelperClass parse(InputStream o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class Document {

}
