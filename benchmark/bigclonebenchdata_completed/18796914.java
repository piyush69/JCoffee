
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c18796914 {

    public String getPloidy(String source) {
        StringBuilder ploidyHtml = new StringBuilder();
        MyHelperClass customParameters = new MyHelperClass();
        String hyperdiploidyUrl =(String)(Object) customParameters.getHyperdiploidyUrl();
        String urlString = hyperdiploidyUrl + "?source=" + source;
        URL url = null;
        try {
            url = new URL(urlString);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = "";
            while ((line =(String)(Object) in.readLine()) != null) {
                ploidyHtml.append(line);
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return ploidyHtml.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getHyperdiploidyUrl(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
