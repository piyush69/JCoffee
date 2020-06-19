
import java.io.UncheckedIOException;


class c15301724 {

    InputStream openURL(URL url) throws IOException, WrongMIMETypeException {
        InputStream is = null;
        if (url.getProtocol().equals("file")) {
            MyHelperClass debug = new MyHelperClass();
            if ((boolean)(Object)debug) {
                System.out.println("Using direct input stream on file url");
            }
            URLConnection urlc =(URLConnection)(Object) url.openConnection();
            try {
                urlc.connect();
                is =(InputStream)(Object) new DataInputStream(urlc.getInputStream());
            } catch (UncheckedIOException e) {
            }
        } else {
            double start = 0;
            MyHelperClass timing = new MyHelperClass();
            if ((boolean)(Object)timing) {
                MyHelperClass Time = new MyHelperClass();
                start =(double)(Object) Time.getNow();
            }
            ContentNegotiator cn = null;
            cn = new ContentNegotiator(url);
            Object obj = null;
            obj = cn.getContent();
            if (obj != null) {
                byte[] buf = (byte[]) obj;
                is =(InputStream)(Object) new ByteArrayInputStream(buf);
            } else {
                System.err.println("Loader.openURL got null content");
                throw new IOException("Loader.openURL got null content");
            }
//            MyHelperClass timing = new MyHelperClass();
            if ((boolean)(Object)timing) {
                MyHelperClass Time = new MyHelperClass();
                double elapsed =(double)(Object) Time.getNow() - start;
                MyHelperClass numFormat = new MyHelperClass();
                System.out.println("Loader: open and buffer URL in: " + numFormat.format(elapsed, 2) + " seconds");
            }
        }
        return is;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass format(double o0, int o1){ return null; }
	public MyHelperClass getNow(){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getProtocol(){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class WrongMIMETypeException extends Exception{
	public WrongMIMETypeException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class DataInputStream {

DataInputStream(MyHelperClass o0){}
	DataInputStream(){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class ContentNegotiator {

ContentNegotiator(){}
	ContentNegotiator(URL o0){}
	public MyHelperClass getContent(){ return null; }}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(byte[] o0){}}
