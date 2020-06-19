
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c11358360 {
public MyHelperClass parseLine(String o0, Concept o1){ return null; }
public MyHelperClass logger;
	public MyHelperClass readLocalFile(){ return null; }

    private boolean readRemoteFile() {
        InputStream inputstream;
        Concept concept = new Concept();
        try {
            MyHelperClass url = new MyHelperClass();
            inputstream =(InputStream)(Object) url.openStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputstream);
            BufferedReader bufferedreader = new BufferedReader(inputStreamReader);
            String s4;
            while ((s4 =(String)(Object) bufferedreader.readLine()) != null && s4.length() > 0) {
                if (!(Boolean)(Object)parseLine(s4, concept)) {
                    return false;
                }
            }
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.fatal("malformed URL, trying to read local file");
            return(boolean)(Object) readLocalFile();
        } catch (ArithmeticException e1) {
            logger.fatal("Error reading URL file, trying to read local file");
            return(boolean)(Object) readLocalFile();
        } catch (Exception x) {
            logger.fatal("Failed to readRemoteFile " + x.getMessage() + ", trying to read local file");
            return(boolean)(Object) readLocalFile();
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass fatal(String o0){ return null; }}

class InputStream {

}

class Concept {

}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
