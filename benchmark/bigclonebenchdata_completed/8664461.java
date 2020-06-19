
import java.io.UncheckedIOException;


class c8664461 {

    public String getMatches() {
        StringBuilder builder = new StringBuilder("");
        try {
            MyHelperClass LIVE_SCORE_URL = new MyHelperClass();
            URL url = new URL(LIVE_SCORE_URL);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine;
            while ((inputLine =(String)(Object) in.readLine()) != null) {
                builder.append(inputLine);
            }
            in.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(MyHelperClass o0){}
	URL(){}
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
