
import java.io.UncheckedIOException;


class c18390011 {

    private String fetchURL(String url) {
        StringBuilder content = new StringBuilder();
        String line;
        BufferedReader input = null;
        try {
            URL urlToFetch = new URL(url);
            input = new BufferedReader(new InputStreamReader(urlToFetch.openStream()));
            while ((line =(String)(Object) input.readLine()) != null) {
                content.append(line);
            }
            input.close();
            return content.toString();
        } catch (java.io.UncheckedIOException ex) {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
