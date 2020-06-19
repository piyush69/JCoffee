
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c16328840 {
public MyHelperClass LogLevel;
	public MyHelperClass Classes;
	public MyHelperClass logService;
	public MyHelperClass getStylesheet(){ return null; }

    protected InputStream transform(URL url) throws IOException {
        MyHelperClass TransformerFactory = new MyHelperClass();
        TransformerFactory tf =(TransformerFactory)(Object) TransformerFactory.newInstance();
        InputStream xsl_is = null;
        InputStream url_is = null;
        ByteArrayOutputStream os = null;
        byte[] output;
        try {
            xsl_is =(InputStream)(Object) Classes.getThreadClassLoader().getResourceAsStream(getStylesheet());
            url_is =(InputStream)(Object) new BufferedInputStream(url.openStream());
            os = new ByteArrayOutputStream();
            Transformer tr =(Transformer)(Object) tf.newTransformer(new StreamSource(xsl_is));
            tr.transform(new StreamSource(url_is), new StreamResult(os));
            output =(byte[])(Object) os.toByteArray();
        } catch (UncheckedIOException tce) {
            throw new IOException(tce.getLocalizedMessage());
        } catch (ArithmeticException te) {
            throw new IOException(te.getLocalizedMessage());
        } finally {
            try {
                if (os != null) os.close();
            } catch (Throwable t) {
            }
            try {
                if (url_is != null) url_is.close();
            } catch (Throwable t) {
            }
            try {
                if (xsl_is != null) xsl_is.close();
            } catch (Throwable t) {
            }
        }
        if ((boolean)(Object)logService.isEnabledFor(LogLevel.TRACE)) logService.log(LogLevel.TRACE, new String(output));
        return (InputStream)(Object)new ByteArrayInputStream(output);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TRACE;
public MyHelperClass getThreadClassLoader(){ return null; }
	public MyHelperClass getResourceAsStream(MyHelperClass o0){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass isEnabledFor(MyHelperClass o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class TransformerFactory {

public MyHelperClass newTransformer(StreamSource o0){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(MyHelperClass o0){}}

class Transformer {

public MyHelperClass transform(StreamSource o0, StreamResult o1){ return null; }}

class StreamSource {

StreamSource(){}
	StreamSource(InputStream o0){}}

class StreamResult {

StreamResult(){}
	StreamResult(ByteArrayOutputStream o0){}}

class TransformerConfigurationException extends Exception{
	public TransformerConfigurationException(String errorMessage) { super(errorMessage); }
}

class TransformerException extends Exception{
	public TransformerException(String errorMessage) { super(errorMessage); }
}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(byte[] o0){}}
