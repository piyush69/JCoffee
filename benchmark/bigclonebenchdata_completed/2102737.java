


class c2102737 {

    private String getContents(Server server, String uri) throws TechnicalException {
        try {
            MyHelperClass PORT = new MyHelperClass();
            URL url = new URL("http://localhost:" + PORT + uri);
            MyHelperClass StreamUtils = new MyHelperClass();
            return(String)(Object) StreamUtils.getStreamContent(url.openStream());
        } catch (Exception e) {
            e.printStackTrace();
            throw new TechnicalException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getStreamContent(MyHelperClass o0){ return null; }}

class Server {

}

class TechnicalException extends Exception{
	public TechnicalException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}
