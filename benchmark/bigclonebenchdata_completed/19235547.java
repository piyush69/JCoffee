


class c19235547 {
public MyHelperClass uri;
	public MyHelperClass processNewUri(URLConnection o0){ return null; }

    protected BufferedImage handleRaremapsException() {
        if ((boolean)(Object)uri.startsWith("http://www.raremaps.com/cgi-bin/gallery.pl/detail/")) try {
            MyHelperClass params = new MyHelperClass();
            params.uri = params.uri.replace("cgi-bin/gallery.pl/detail", "maps/medium");
//            MyHelperClass params = new MyHelperClass();
            URL url = new URL(params.uri);
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            return(BufferedImage)(Object) processNewUri(connection);
        } catch (Exception e) {
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass uri;
public MyHelperClass replace(String o0, String o1){ return null; }
	public MyHelperClass startsWith(String o0){ return null; }}

class BufferedImage {

}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

}
