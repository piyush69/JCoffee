
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c14096915 {

    public String getWebPage(String url) {
        String content = "";
        URL urlObj = null;
        try {
            urlObj = new URL(url);
        } catch (UncheckedIOException urlEx) {
            urlEx.printStackTrace();
            throw new Error("URL creation failed.");
        }
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(urlObj.openStream()));
            String line;
            while ((line =(String)(Object) reader.readLine()) != null) {
                content += line;
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            throw new Error("Page retrieval failed.");
        }
        return content;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
