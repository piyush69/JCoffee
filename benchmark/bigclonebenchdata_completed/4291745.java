
import java.io.UncheckedIOException;


class c4291745 {
public MyHelperClass getCodeBase(){ return null; }

    private String[] readFile(String filename) {
        final Vector buf = new Vector();
        try {
            final URL url = new URL(getCodeBase(), filename);
            final InputStream in =(InputStream)(Object) url.openStream();
            BufferedReader dis = new BufferedReader(new InputStreamReader(in));
            String line;
            while ((line =(String)(Object) dis.readLine()) != null) {
                buf.add(line);
            }
            in.close();
        } catch (UncheckedIOException e) {
            System.out.println("catch: " + e);
            return null;
        }
        return(String[])(Object) buf.toArray(new String[0]);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Vector {

public MyHelperClass toArray(String[] o0){ return null; }
	public MyHelperClass add(String o0){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0, String o1){}
	public MyHelperClass openStream(){ return null; }}

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
