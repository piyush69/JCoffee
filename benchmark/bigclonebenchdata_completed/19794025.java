
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19794025 {

    public static int numberofLines(JApplet ja, String filename) {
        int count = 0;
        URL url = null;
        String FileToRead;
        FileToRead = "data/" + filename + ".csv";
        try {
            url = new URL(ja.getCodeBase(), FileToRead);
        } catch (UncheckedIOException e) {
            System.out.println("Malformed URL ");
            ja.stop();
        }
        System.out.println(url.toString());
        try {
            InputStream in =(InputStream)(Object) url.openStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            while ((reader.readLine()) != null) {
                count++;
            }
            in.close();
        } catch (UncheckedIOException e) {
        }
        return count;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class JApplet {

public MyHelperClass stop(){ return null; }
	public MyHelperClass getCodeBase(){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0, String o1){}
	public MyHelperClass openStream(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
