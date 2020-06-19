
import java.io.UncheckedIOException;


class c23206 {

    public static BufferedReader getUserInfoStream(String name) throws IOException {
        BufferedReader in;
        try {
            URL url = new URL("http://www.spoj.pl/users/" + name.toLowerCase() + "/");
            in = new BufferedReader(new InputStreamReader(url.openStream()));
        } catch (UncheckedIOException e) {
            in = null;
            throw e;
        }
        return in;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
