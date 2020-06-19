
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22254271 {

    private InputStream simpleFetch(final String wwwUri) throws HttpException {
        URL url = null;
        try {
            url = new URL(wwwUri);
        } catch (UncheckedIOException exception) {
            throw new HttpException("what the fuck '" + wwwUri + "'",(IOException)(Object) exception);
        }
        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        } catch (UncheckedIOException exception) {
            throw new HttpException("fetching '" + wwwUri + "' failed",(IOException)(Object) exception);
        }
        connection.setRequestProperty("Accept-Encoding", "gzip");
        InputStream input = null;
        try {
            connection.connect();
            input =(InputStream)(Object) connection.getInputStream();
            if ("gzip".equals(connection.getHeaderField("content-encoding"))) {
                input =(InputStream)(Object) new GZIPInputStream(input);
            }
        } catch (UncheckedIOException exception) {
            throw new HttpException("fetching '" + wwwUri + "' timeout",(IOException)(Object) exception);
        } catch (ArithmeticException exception) {
            throw new HttpException("fetching '" + wwwUri + "' failed",(IOException)(Object) exception);
        }
        return input;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InputStream {

}

class HttpException extends Exception{
	public HttpException(String errorMessage) { super(errorMessage); }
	HttpException(){}
	HttpException(String o0, IOException o1){}
	HttpException(String o0, MalformedURLException o1){}
	HttpException(String o0, SocketTimeoutException o1){}
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getHeaderField(String o0){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass connect(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class GZIPInputStream {

GZIPInputStream(){}
	GZIPInputStream(InputStream o0){}}

class SocketTimeoutException extends Exception{
	public SocketTimeoutException(String errorMessage) { super(errorMessage); }
}
