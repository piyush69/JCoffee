
import java.io.UncheckedIOException;


class c10288282 {

    public String getMarketInfo() {
        try {
            URL url = new URL("http://api.eve-central.com/api/evemon");
            BufferedReader s = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = "";
            String xml = "";
            while ((line =(String)(Object) s.readLine()) != null) {
                xml += line;
            }
            return xml;
        } catch (UncheckedIOException ex) {
            ex.printStackTrace();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
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
