
import java.io.UncheckedIOException;


class c22421536 {

    private boolean loadSource(URL url) {
        if (url == null) {
            MyHelperClass sourceURL = new MyHelperClass();
            if (sourceURL != null) {
                MyHelperClass sourceCodeLinesList = new MyHelperClass();
                sourceCodeLinesList.clear();
            }
            return false;
        } else {
            MyHelperClass sourceURL = new MyHelperClass();
            if (url.equals(sourceURL)) {
                return true;
            } else {
                MyHelperClass sourceCodeLinesList = new MyHelperClass();
                sourceCodeLinesList.clear();
                try {
                    BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                    String line;
                    while ((line =(String)(Object) br.readLine()) != null) {
//                        MyHelperClass sourceCodeLinesList = new MyHelperClass();
                        sourceCodeLinesList.addElement(line.replaceAll("\t", "   "));
                    }
                    br.close();
                    return true;
                } catch (UncheckedIOException e) {
                    System.err.println("Could not load source at " + url);
                    return false;
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass clear(){ return null; }
	public MyHelperClass addElement(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
