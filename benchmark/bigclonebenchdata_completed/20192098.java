


class c20192098 {
public MyHelperClass DOMWriter;

    public Object read(InputStream inputStream, Map metadata) throws IOException, ClassNotFoundException {
        MyHelperClass log = new MyHelperClass();
        if ((boolean)(Object)log.isTraceEnabled()) log.trace("Read input stream with metadata=" + metadata);
        MyHelperClass HTTPMetadataConstants = new MyHelperClass();
        Integer resCode = (Integer)(Integer)(Object) metadata.get(HTTPMetadataConstants.RESPONSE_CODE);
//        MyHelperClass HTTPMetadataConstants = new MyHelperClass();
        String resMessage = (String)(String)(Object) metadata.get(HTTPMetadataConstants.RESPONSE_CODE_MESSAGE);
        MyHelperClass validResponseCodes = new MyHelperClass();
        if (resCode != null &&(boolean)(Object) validResponseCodes.contains(resCode) == false) throw new RuntimeException("Invalid HTTP server response [" + resCode + "] - " + resMessage);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(1024);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copyStream(baos, inputStream);
        MyHelperClass charsetEncoding = new MyHelperClass();
        String soapMessage = new String((byte[])(Object)baos.toByteArray(),(int)(Object) charsetEncoding);
        MyHelperClass isTraceEnabled = new MyHelperClass();
        if ((boolean)(Object)isTraceEnabled) {
            MyHelperClass DOMUtils = new MyHelperClass();
            String prettySoapMessage =(String)(Object) DOMWriter.printNode(DOMUtils.parse(soapMessage), true);
//            MyHelperClass log = new MyHelperClass();
            log.trace("Incoming Response SOAPMessage\n" + prettySoapMessage);
        }
        return soapMessage;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass RESPONSE_CODE_MESSAGE;
	public MyHelperClass RESPONSE_CODE;
public MyHelperClass trace(String o0){ return null; }
	public MyHelperClass isTraceEnabled(){ return null; }
	public MyHelperClass printNode(MyHelperClass o0, boolean o1){ return null; }
	public MyHelperClass parse(String o0){ return null; }
	public MyHelperClass contains(Integer o0){ return null; }
	public MyHelperClass copyStream(ByteArrayOutputStream o0, InputStream o1){ return null; }}

class InputStream {

}

class Map {

public MyHelperClass get(MyHelperClass o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ByteArrayOutputStream {

ByteArrayOutputStream(int o0){}
	ByteArrayOutputStream(){}
	public MyHelperClass toByteArray(){ return null; }}
