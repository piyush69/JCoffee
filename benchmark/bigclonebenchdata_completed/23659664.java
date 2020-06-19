
import java.io.UncheckedIOException;


class c23659664 {

    private int resourceToString(String aFile, StringBuffer aBuffer) {
        int cols = 0;
        URL url =(URL)(Object) getClass().getResource(aFile);
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = "";
            do {
                line =(String)(Object) in.readLine();
                if (line != null) {
                    if (line.length() > cols) cols = line.length();
                    aBuffer.append(line);
                    aBuffer.append('\n');
                }
            } while (line != null);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return cols;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
