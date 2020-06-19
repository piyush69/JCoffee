
import java.io.UncheckedIOException;


class c10816494 {

//    @Override
    public void sendData(String serverUrl, String fileName, String type, InputStream is) throws IOException {
        ClientSession clientSession = null;
        try {
            MyHelperClass logger = new MyHelperClass();
            if ((boolean)(Object)logger.isDebugEnabled()) {
//                MyHelperClass logger = new MyHelperClass();
                logger.debug("Connecting to " + serverUrl);
            }
            MyHelperClass Connector = new MyHelperClass();
            clientSession = (ClientSession)(ClientSession)(Object) Connector.open(serverUrl);
            HeaderSet hsConnectReply =(HeaderSet)(Object) clientSession.connect(clientSession.createHeaderSet());
            MyHelperClass ResponseCodes = new MyHelperClass();
            if (hsConnectReply.getResponseCode() != ResponseCodes.OBEX_HTTP_OK) {
                throw new IOException("Connect Error " + hsConnectReply.getResponseCode());
            }
            HeaderSet hsOperation =(HeaderSet)(Object) clientSession.createHeaderSet();
            MyHelperClass HeaderSet = new MyHelperClass();
            hsOperation.setHeader(HeaderSet.NAME, fileName);
            if (type != null) {
//                MyHelperClass HeaderSet = new MyHelperClass();
                hsOperation.setHeader(HeaderSet.TYPE, type);
            }
//            MyHelperClass HeaderSet = new MyHelperClass();
            hsOperation.setHeader(HeaderSet.LENGTH,(String)(Object) new Long((long)(Object)is.available()));
            Operation po =(Operation)(Object) clientSession.put(hsOperation);
            OutputStream os =(OutputStream)(Object) po.openOutputStream();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(is, os);
            os.flush();
            os.close();
//            MyHelperClass logger = new MyHelperClass();
            if ((boolean)(Object)logger.isDebugEnabled()) {
//                MyHelperClass logger = new MyHelperClass();
                logger.debug("put responseCode " + po.getResponseCode());
            }
            po.close();
            HeaderSet hsDisconnect =(HeaderSet)(Object) clientSession.disconnect(null);
//            MyHelperClass logger = new MyHelperClass();
            if ((boolean)(Object)logger.isDebugEnabled()) {
//                MyHelperClass logger = new MyHelperClass();
                logger.debug("disconnect responseCode " + hsDisconnect.getResponseCode());
            }
//            MyHelperClass ResponseCodes = new MyHelperClass();
            if (hsDisconnect.getResponseCode() != ResponseCodes.OBEX_HTTP_OK) {
                throw new IOException("Send Error " + hsConnectReply.getResponseCode());
            }
        } finally {
            if (clientSession != null) {
                try {
                    clientSession.close();
                } catch (UncheckedIOException ignore) {
                    MyHelperClass logger = new MyHelperClass();
                    if ((boolean)(Object)logger.isDebugEnabled()) {
//                        MyHelperClass logger = new MyHelperClass();
                        logger.debug("IOException during clientSession.close()",(IOException)(Object) ignore);
                    }
                }
            }
            clientSession = null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NAME;
	public MyHelperClass OBEX_HTTP_OK;
	public MyHelperClass TYPE;
	public MyHelperClass LENGTH;
public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass open(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass debug(String o0, IOException o1){ return null; }}

class InputStream {

public MyHelperClass available(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ClientSession {

public MyHelperClass createHeaderSet(){ return null; }
	public MyHelperClass disconnect(Object o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass put(HeaderSet o0){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }}

class HeaderSet {

public MyHelperClass setHeader(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}

class Operation {

public MyHelperClass close(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass openOutputStream(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}
