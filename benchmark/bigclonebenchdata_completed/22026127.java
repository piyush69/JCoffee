


class c22026127 {
public static MyHelperClass setDefaultImplementation(){ return null; }
//public MyHelperClass setDefaultImplementation(){ return null; }

    public static GenericDocumentTransformer getTranformer(URL url) throws IOException {
        setDefaultImplementation();
        if ("text/xml".equals(url.openConnection().getContentType()) || "application/xml".equals(url.openConnection().getContentType())) {
            return null;
        } else if ("text/html".equals(url.openConnection().getContentType())) {
            return null;
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getContentType(){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class GenericDocumentTransformer {

}

class GenericDocument {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
