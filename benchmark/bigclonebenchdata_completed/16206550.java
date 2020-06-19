
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c16206550 {

    private String getJSONScoreStringFromNet(URL urladdress) {
        InputStream instream = null;
        BufferedReader read = null;
        try {
            instream =(InputStream)(Object) urladdress.openStream();
            read = new BufferedReader(new InputStreamReader(instream));
            String s = new String("");
            String line = null;
            while ((line =(String)(Object) read.readLine()) != null) {
                s = s + line;
            }
            return s;
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } finally {
            try {
                read.close();
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
