import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c23004478 {
public MyHelperClass interrupted;
	public MyHelperClass data;
	public MyHelperClass logger;
	public MyHelperClass ResponseCodes;
	public MyHelperClass IOUtils;
	public MyHelperClass maxFileSize;
	public MyHelperClass MuleObexRequestHandler;

//    @Override
    public int onPut(Operation operation)  throws Throwable {
        MyHelperClass MuleObexRequestHandler = new MyHelperClass();
        synchronized (MuleObexRequestHandler.connections) {
//            MyHelperClass MuleObexRequestHandler = new MyHelperClass();
            MuleObexRequestHandler.connections++;
            MyHelperClass logger = new MyHelperClass();
            if ((boolean)(Object)logger.isDebugEnabled()) {
//                MyHelperClass MuleObexRequestHandler = new MyHelperClass();
                logger.debug("Connection accepted, total number of connections: " + MuleObexRequestHandler.connections);
            }
        }
        MyHelperClass ResponseCodes = new MyHelperClass();
        int result =(int)(Object) ResponseCodes.OBEX_HTTP_OK;
        try {
            MyHelperClass headers = new MyHelperClass();
            headers = operation.getReceivedHeaders();
            MyHelperClass ObexServer = new MyHelperClass();
            if (!this.maxFileSize.equals(ObexServer.UNLIMMITED_FILE_SIZE)) {
                MyHelperClass HeaderSet = new MyHelperClass();
                Long fileSize = (Long)(Long)(Object) headers.getHeader(HeaderSet.LENGTH);
                if (fileSize == null) {
//                    MyHelperClass ResponseCodes = new MyHelperClass();
                    result =(int)(Object) ResponseCodes.OBEX_HTTP_LENGTH_REQUIRED;
                }
                if (fileSize > (Long)(Object)this.maxFileSize) {
                    result =(int)(Object) ResponseCodes.OBEX_HTTP_REQ_TOO_LARGE;
                }
            }
            if (result != (int)(Object)ResponseCodes.OBEX_HTTP_OK) {
                InputStream in =(InputStream)(Object) operation.openInputStream();
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                IOUtils.copy(in, out);
                in.close();
                out.close();
                data =(MyHelperClass)(Object) out.toByteArray();
                if ((boolean)(Object)interrupted) {
                    data = null;
                    result =(int)(Object) ResponseCodes.OBEX_HTTP_GONE;
                }
            }
            return result;
        } catch (IOException e) {
            return(int)(Object) ResponseCodes.OBEX_HTTP_UNAVAILABLE;
        } finally {
            synchronized (this) {
                this.notify();
            }
            synchronized (MuleObexRequestHandler.connections) {
                MuleObexRequestHandler.connections--;
                if ((boolean)(Object)logger.isDebugEnabled()) {
                    logger.debug("Connection closed, total number of connections: " + MuleObexRequestHandler.connections);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass LENGTH;
	public MyHelperClass OBEX_HTTP_UNAVAILABLE;
	public MyHelperClass OBEX_HTTP_LENGTH_REQUIRED;
	public int connections;
	public MyHelperClass UNLIMMITED_FILE_SIZE;
	public MyHelperClass OBEX_HTTP_OK;
	public MyHelperClass OBEX_HTTP_REQ_TOO_LARGE;
	public MyHelperClass OBEX_HTTP_GONE;
public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass getHeader(MyHelperClass o0){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }}

class Operation {

public MyHelperClass getReceivedHeaders(){ return null; }
	public MyHelperClass openInputStream(){ return null; }}
