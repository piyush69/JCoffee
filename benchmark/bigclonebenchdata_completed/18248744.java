


class c18248744 {
public MyHelperClass getRuntime(){ return null; }

    public InputStream getResource(FCValue name) throws FCException {
        MyHelperClass _factory = new MyHelperClass();
        Element el =(Element)(Object) _factory.getElementWithID(name.getAsString());
        if (el == null) {
            throw new FCException("Could not find resource \"" + name + "\"");
        }
        String urlString =(String)(Object) el.getTextTrim();
        if (!urlString.startsWith("http")) {
            try {
                MyHelperClass log = new MyHelperClass();
                log.debug("Get resource: " + urlString);
                URL url;
                if (urlString.startsWith("file:")) {
                    url = new URL(urlString);
                } else {
                    url =(URL)(Object) getClass().getResource(urlString);
                }
                return(InputStream)(Object) url.openStream();
            } catch (Exception e) {
                throw new FCException("Failed to load resource.", e);
            }
        } else {
            try {
                MyHelperClass FCService = new MyHelperClass();
                FCService http =(FCService)(Object) getRuntime().getServiceFor(FCService.HTTP_DOWNLOAD);
                return(InputStream)(Object) http.perform(new FCValue[] { name }).getAsInputStream();
            } catch (Exception e) {
                throw new FCException("Failed to load resource.", e);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_DOWNLOAD;
public MyHelperClass getElementWithID(MyHelperClass o0){ return null; }
	public MyHelperClass getServiceFor(MyHelperClass o0){ return null; }
	public MyHelperClass getAsInputStream(){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class FCValue {

public MyHelperClass getAsString(){ return null; }}

class InputStream {

}

class FCException extends Exception{
	public FCException(String errorMessage) { super(errorMessage); }
	FCException(String o0, Exception o1){}
	FCException(){}
}

class Element {

public MyHelperClass getTextTrim(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class FCService {

public MyHelperClass perform(FCValue[] o0){ return null; }}
