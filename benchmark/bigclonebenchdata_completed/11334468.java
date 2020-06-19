
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c11334468 {
public MyHelperClass matchedLine(String o0){ return null; }

    public final int wordFrequency(String word) {
        MyHelperClass webQuery = new MyHelperClass();
        String replWebQuery =(String)(Object) webQuery.replaceFirst("WORDREPLACE", word);
        try {
            URL url = new URL(replWebQuery);
            String content = url.toString();
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine;
            while ((inputLine =(String)(Object) in.readLine()) != null) {
                MyHelperClass nrResultsPattern = new MyHelperClass();
                if (inputLine.matches((String)(Object)nrResultsPattern)) {
                    int fr =(int)(Object) matchedLine(inputLine);
                    if (fr >= 0) {
                        return fr;
                    }
                }
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return 0;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass replaceFirst(String o0, String o1){ return null; }}

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
