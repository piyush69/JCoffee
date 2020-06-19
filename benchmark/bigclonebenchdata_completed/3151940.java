
import java.io.UncheckedIOException;


class c3151940 {

    String readRss(URL url) {
        String html = "<html><body><h2>No data</h2></body></html>";
        try {
            MyHelperClass mLogger = new MyHelperClass();
            mLogger.info("URL is:" + url.toString());
            BufferedReader inStream = new BufferedReader(new InputStreamReader(url.openStream()), 1024);
            String line;
            StringBuilder rssFeed = new StringBuilder();
            while ((line =(String)(Object) inStream.readLine()) != null) {
                rssFeed.append(line);
            }
            html = rssFeed.toString();
        } catch (UncheckedIOException ex) {
            MyHelperClass mLogger = new MyHelperClass();
            mLogger.warning("Couldn't open an RSS stream");
        }
        return html;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warning(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(InputStreamReader o0, int o1){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
