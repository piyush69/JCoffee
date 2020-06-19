


class c1038900 {

    public static SOAPMessage call(SOAPMessage request, URL url) throws IOException, SOAPException {
        URLConnection conn =(URLConnection)(Object) url.openConnection();
        conn.setDoOutput(true);
        conn.setDoInput(true);
        conn.connect();
        request.writeTo(conn.getOutputStream());
        MyHelperClass SOAPConstants = new MyHelperClass();
        MessageFactory mf =(MessageFactory)(Object) MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL);
        return(SOAPMessage)(Object) mf.createMessage(null, conn.getInputStream());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SOAP_1_2_PROTOCOL;
}

class SOAPMessage {

public MyHelperClass writeTo(MyHelperClass o0){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class SOAPException extends Exception{
	public SOAPException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class MessageFactory {

public MyHelperClass createMessage(Object o0, MyHelperClass o1){ return null; }
	public static MyHelperClass newInstance(MyHelperClass o0){ return null; }}
