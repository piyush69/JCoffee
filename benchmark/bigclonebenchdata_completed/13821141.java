
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c13821141 {

    public static String readUrlText(String urlString) throws IOException {
        URL url = new URL(urlString);
        InputStream stream =(InputStream)(Object) url.openStream();
        StringBuilder buf = new StringBuilder();
        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(stream));
            String str;
            while ((str =(String)(Object) in.readLine()) != null) {
                buf.append(str);
                buf.append(System.getProperty("line.separator"));
            }
        } catch (UncheckedIOException e) {
            System.out.println("Error reading text from URL [" + url + "]: " + e.toString());
            throw e;
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (UncheckedIOException e) {
                    System.out.println("Error closing after reading text from URL [" + url + "]: " + e.toString());
                }
            }
        }
        return buf.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
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
