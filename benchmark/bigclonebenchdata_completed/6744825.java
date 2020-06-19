
import java.io.UncheckedIOException;


class c6744825 {

    private static String getTextFromURL(HttpServletRequest req, String urlString) {
        StringBuffer buffer = new StringBuffer();
        if (!urlString.startsWith("http")) {
            String requestURL = req.getRequestURL().toString();
            urlString = requestURL.substring(0, requestURL.lastIndexOf("/")) + urlString;
        }
        try {
            URL url = new URL(urlString);
            BufferedReader input = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = "";
            while ((line =(String)(Object) input.readLine()) != null) {
                buffer.append(line);
                MyHelperClass Constants = new MyHelperClass();
                buffer.append(Constants.LF);
            }
        } catch (UncheckedIOException nf) {
            MyHelperClass log = new MyHelperClass();
            log.error("File not found: " + urlString, nf);
        } catch (Exception e) {
            MyHelperClass log = new MyHelperClass();
            log.error("Exception while reading file: " + urlString, e);
        }
        return buffer.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass LF;
public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass error(String o0, FileNotFoundException o1){ return null; }}

class HttpServletRequest {

public MyHelperClass getRequestURL(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}
