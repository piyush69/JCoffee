
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c10332410 {
public MyHelperClass httpAddress;
	public MyHelperClass EntailmentType;
	public MyHelperClass log;
	public MyHelperClass encode(String o0){ return null; }

    protected EntailmentType invokeHttp(String stuff) {
        String data = encode("theory") + "=" + encode(stuff);
        URL url;
        EntailmentType result =(EntailmentType)(Object) EntailmentType.unkown;
        try {
            url = new URL(httpAddress);
        } catch (UncheckedIOException e) {
            throw new RuntimeException("FOL Reasoner not correclty configured: '" + httpAddress + "' is not an URL");
        }
        log.debug("sending theory to endpoint: " + url);
        try {
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(data);
            wr.flush();
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line =(String)(Object) rd.readLine()) != null) {
                log.debug("resultline: " + line);
                if (line.contains("Proof found")) {
                    result =(EntailmentType)(Object) EntailmentType.entailed;
                }
                if (line.contains("Ran out of time")) {
                    result =(EntailmentType)(Object) EntailmentType.unkown;
                }
                if (line.contains("Completion found")) {
                    result =(EntailmentType)(Object) EntailmentType.notEntailed;
                }
            }
            wr.close();
            rd.close();
        } catch (UncheckedIOException io) {
            throw new RuntimeException("the remote reasoner did not respond:" + io, io);
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass entailed;
	public MyHelperClass unkown;
	public MyHelperClass notEntailed;
public MyHelperClass debug(String o0){ return null; }}

class EntailmentType {

}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(String o0){ return null; }}

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
