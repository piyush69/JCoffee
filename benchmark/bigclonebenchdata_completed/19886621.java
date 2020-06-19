
import java.io.UncheckedIOException;


class c19886621 {

    private void doPOST(HttpURLConnection connection, InputStream inputXML) throws MessageServiceException {
        try {
            OutputStream requestStream =(OutputStream)(Object) new BufferedOutputStream(connection.getOutputStream());
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyAndClose(inputXML, requestStream);
            connection.connect();
        } catch (UncheckedIOException e) {
            throw new MessageServiceException(e.getMessage(),(IOException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyAndClose(InputStream o0, OutputStream o1){ return null; }}

class HttpURLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class InputStream {

}

class MessageServiceException extends Exception{
	public MessageServiceException(String errorMessage) { super(errorMessage); }
	MessageServiceException(String o0, IOException o1){}
	MessageServiceException(){}
}

class OutputStream {

}

class BufferedOutputStream {

BufferedOutputStream(MyHelperClass o0){}
	BufferedOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
