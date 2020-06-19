
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c17785594 {
public MyHelperClass buildGildenBoot(String o0, List o1){ return null; }

    public void handler(List gbs, TargetPage target) {
        try {
            URL url = new URL(target.getUrl());
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = null;
            String include = "Top Scorers";
            while ((line =(String)(Object) reader.readLine()) != null) {
                if (line.indexOf(include) != -1) {
                    buildGildenBoot(line, gbs);
                    break;
                }
            }
            reader.close();
        } catch (UncheckedIOException e) {
        } catch (ArithmeticException e) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class List {

}

class GoldenBoot {

}

class TargetPage {

public MyHelperClass getUrl(){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0){}
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

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
