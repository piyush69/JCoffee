
import java.io.UncheckedIOException;


class c14757691 {
public MyHelperClass URLEncoder;
	public MyHelperClass getCookie(MyHelperClass o0, URLConnection o1){ return null; }

    protected String getCitations(String ticket, String query) throws IOException {
        String urlQuery;
        try {
            MyHelperClass MAX_CITATIONS = new MyHelperClass();
            urlQuery = "http://www.jstor.org/search/BasicResults?hp=" + MAX_CITATIONS + "&si=1&gw=jtx&jtxsi=1&jcpsi=1&artsi=1&Query=" + URLEncoder.encode(query, "UTF-8") + "&wc=on&citationAction=saveAll";
        } catch (UncheckedIOException e) {
            throw new RuntimeException(e);
        }
        URL url = new URL(urlQuery);
        URLConnection conn =(URLConnection)(Object) url.openConnection();
        conn.setRequestProperty("Cookie", ticket);
        MyHelperClass COOKIE_CITATIONS = new MyHelperClass();
        return(String)(Object) getCookie(COOKIE_CITATIONS, conn);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(String o0, String o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class UnsupportedEncodingException extends Exception{
	public UnsupportedEncodingException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }}
