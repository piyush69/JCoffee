import java.io.*;
import java.lang.*;
import java.util.*;



class c20519261 {
public MyHelperClass FreqAnalysisPlugin;
	public MyHelperClass logError(IOException o0){ return null; }
	public MyHelperClass logError(UnsupportedEncodingException o0){ return null; }
	public MyHelperClass getFilename(String o0){ return null; }

    public String readReferenceText(final String ident) throws NoContentException {
        try {
            String name =(String)(Object) getFilename(ident);
            URL url = new URL(FreqAnalysisPlugin.getDefault().getBundle().getEntry("/"), name);
            InputStream in =(InputStream)(Object) url.openStream();
            InputStreamReader isr = new InputStreamReader(in, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            StringBuffer buffer = new StringBuffer();
            String line = br.readLine();
            while (null != line) {
                buffer.append(line + "\n");
                line = br.readLine();
            }
            return buffer.toString();
        } catch (UncheckedIOException muEx) {
            logError((IOException)(Object)muEx);
        } catch (UnsupportedEncodingException ueEx) {
            logError(ueEx);
        } catch (IOException ioEx) {
            logError(ioEx);
        }
        throw new NoContentException("Unable to find or read reference text.");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getBundle(){ return null; }
	public MyHelperClass getEntry(String o0){ return null; }
	public MyHelperClass getDefault(){ return null; }}

class NoContentException extends Exception{
	public NoContentException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(MyHelperClass o0, String o1){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
