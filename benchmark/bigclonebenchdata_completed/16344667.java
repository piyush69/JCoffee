
import java.io.UncheckedIOException;


class c16344667 {

    public static String getUrl(String urlString) {
        int retries = 0;
        String result = "";
        while (true) {
            try {
                URL url = new URL(urlString);
                BufferedReader rdr = new BufferedReader(new InputStreamReader(url.openStream()));
                String line =(String)(Object) rdr.readLine();
                while (line != null) {
                    result += line;
                    line =(String)(Object) rdr.readLine();
                }
                return result;
            } catch (UncheckedIOException ex) {
                if (retries == 5) {
                    MyHelperClass logger = new MyHelperClass();
                    logger.debug("Problem getting url content exhausted");
                    return result;
                } else {
                    MyHelperClass logger = new MyHelperClass();
                    logger.debug("Problem getting url content retrying..." + urlString);
                    try {
                        Thread.sleep((int) Math.pow(2.0, retries) * 1000);
                    } catch (InterruptedException e) {
                    }
                    retries++;
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }}

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
