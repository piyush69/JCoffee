
import java.io.UncheckedIOException;


class c9938081 {

    public void load(String fileName) {
        BufferedReader bufReader;
        boolean loaded;// = new boolean();
        loaded = false;
        MyHelperClass vector = new MyHelperClass();
        vector.removeAllElements();
        try {
            if (fileName.startsWith("http:")) {
                URL url = new URL(fileName);
                bufReader = new BufferedReader((FileReader)(Object)new InputStreamReader(url.openStream()));
            } else bufReader = new BufferedReader(new FileReader(fileName));
            String inputLine;
            while ((inputLine =(String)(Object) bufReader.readLine()) != null) {
                MyHelperClass listener = new MyHelperClass();
                if (listener != null) listener.handleLine(inputLine); else vector.add(inputLine);
            }
            bufReader.close();
//            MyHelperClass loaded = new MyHelperClass();
            loaded = true;
        } catch (UncheckedIOException e) {
            String errorMsg;// = new String();
            errorMsg = e.getMessage();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass handleLine(String o0){ return null; }
	public MyHelperClass removeAllElements(){ return null; }
	public MyHelperClass add(String o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(FileReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class FileReader {

FileReader(String o0){}
	FileReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
