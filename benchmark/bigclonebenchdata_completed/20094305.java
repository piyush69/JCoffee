
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20094305 {

    protected String getPageText(final String url) {
        StringBuilder b = new StringBuilder();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
            String line = null;
            while ((line =(String)(Object) reader.readLine()) != null) {
                b.append(line).append('\n');
            }
        } catch (UncheckedIOException ex) {
            ex.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (UncheckedIOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return b.toString();
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

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
