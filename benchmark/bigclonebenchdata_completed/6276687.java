
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c6276687 {
public static MyHelperClass pipe(Reader o0, Writer o1){ return null; }
//public MyHelperClass pipe(Reader o0, Writer o1){ return null; }

    public static void postData(Reader data, URL endpoint, Writer output) throws Exception {
        HttpURLConnection urlc = null;
        try {
            urlc = (HttpURLConnection)(HttpURLConnection)(Object) endpoint.openConnection();
            try {
                urlc.setRequestMethod("POST");
            } catch (UncheckedIOException e) {
                throw new Exception("Shouldn't happen: HttpURLConnection doesn't support POST??", e);
            }
            urlc.setDoOutput(true);
            urlc.setDoInput(true);
            urlc.setUseCaches(false);
            urlc.setAllowUserInteraction(false);
            urlc.setRequestProperty("Content-type", "text/xml; charset=" + "UTF-8");
            OutputStream out =(OutputStream)(Object) urlc.getOutputStream();
            try {
                Writer writer =(Writer)(Object) new OutputStreamWriter(out, "UTF-8");
                pipe(data, writer);
                writer.close();
            } catch (UncheckedIOException e) {
                throw new Exception("IOException while posting data", e);
            } finally {
                if (out != null) {
                    out.close();
                }
            }
            InputStream in =(InputStream)(Object) urlc.getInputStream();
            try {
                Reader reader =(Reader)(Object) new InputStreamReader(in);
                pipe(reader, output);
                reader.close();
            } catch (UncheckedIOException e) {
                throw new Exception("IOException while reading response", e);
            } finally {
                if (in != null) {
                    in.close();
                }
            }
        } catch (IOException e) {
            throw new Exception("Connection error (is server running at " + endpoint + " ?): " + e);
        } finally {
            if (urlc != null) {
                urlc.disconnect();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Reader {

public MyHelperClass close(){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class Writer {

public MyHelperClass close(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setAllowUserInteraction(boolean o0){ return null; }}

class ProtocolException extends Exception{
	public ProtocolException(String errorMessage) { super(errorMessage); }
}

class OutputStream {

public MyHelperClass close(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(OutputStream o0, String o1){}
	OutputStreamWriter(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}
