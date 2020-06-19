
import java.io.UncheckedIOException;


class c12013963 {
public MyHelperClass MessageFormat;
	public MyHelperClass reactionId;

    private void findRxnFileByUrl() throws MalformedURLException, IOException {
        MyHelperClass rxnUrl = new MyHelperClass();
        URL url = new URL(MessageFormat.format(rxnUrl, reactionId.toString()));
        MyHelperClass LOGGER = new MyHelperClass();
        LOGGER.debug("Retrieving RXN file by URL " + url);
        URLConnection con =(URLConnection)(Object) url.openConnection((Proxy)(Object)java.net.Proxy.NO_PROXY);
        con.connect();
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        try {
            is =(InputStream)(Object) con.getInputStream();
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line =(String)(Object) br.readLine()) != null) {
                sb.append(line).append('\n');
            }
            String rxnFile;// = new String();
            rxnFile = sb.toString();
        } catch (UncheckedIOException e) {
//            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.warn("Unable to retrieve RXN",(IOException)(Object) e);
        } finally {
            if (br != null) {
                br.close();
            }
            if (isr != null) {
                isr.close();
            }
            if (is != null) {
                is.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(String o0, IOException o1){ return null; }
	public MyHelperClass format(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openConnection(Proxy o0){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0){}
	public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class Proxy {

}
