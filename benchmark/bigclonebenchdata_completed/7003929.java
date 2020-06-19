
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c7003929 {
public MyHelperClass fixSpaces(String o0){ return null; }

    public URLConnection openConnection(String string) throws ParserException {
        final String prefix = "file://localhost";
        String resource;
        URL url;
        StringBuffer buffer;
        URLConnection ret;
        try {
            url = new URL(fixSpaces(string));
            ret = openConnection((String)(Object)url);
        } catch (UncheckedIOException murle) {
            try {
                File file = new File(string);
                resource =(String)(Object) file.getCanonicalPath();
                buffer = new StringBuffer(prefix.length() + resource.length());
                buffer.append(prefix);
                if (!resource.startsWith("/")) buffer.append("/");
                buffer.append(resource);
                url = new URL(fixSpaces(buffer.toString()));
                ret = openConnection((String)(Object)url);
            } catch (UncheckedIOException murle2) {
                String msg = "Error in opening a connection to " + string;
                ParserException ex = new ParserException(msg,(IOException)(Object) murle2);
                throw ex;
            } catch (ArithmeticException ioe) {
                String msg = "Error in opening a connection to " + string;
                ParserException ex = new ParserException(msg,(IOException)(Object) ioe);
                throw ex;
            }
        }
        return (ret);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URLConnection {

}

class ParserException extends Exception{
	public ParserException(String errorMessage) { super(errorMessage); }
	ParserException(){}
	ParserException(String o0, IOException o1){}
	ParserException(String o0, MalformedURLException o1){}
}

class URL {

URL(){}
	URL(MyHelperClass o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getCanonicalPath(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
