
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1115284 {
public MyHelperClass parseFeedandPersist(String o0, HttpServletResponse o1){ return null; }

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        resp.getWriter().println("Getting feed...");
        String googleFeed = "http://news.google.com/news?ned=us&topic=h&output=rss";
        String totalFeed = "";
        try {
            URL url = new URL(googleFeed);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = null;
            while ((line =(String)(Object) reader.readLine()) != null) {
                totalFeed += line;
            }
            reader.close();
            parseFeedandPersist(totalFeed, resp);
        } catch (UncheckedIOException e) {
        } catch (ArithmeticException e) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass println(String o0){ return null; }}

class HttpServletRequest {

}

class HttpServletResponse {

public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass getWriter(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
