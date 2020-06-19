import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10903521 {
public MyHelperClass NULL;
public MyHelperClass context;
	public MyHelperClass GZIPCodec;
	public MyHelperClass StaticBody;
	public MyHelperClass CHARSET;
	public MyHelperClass client;
public MyHelperClass toThrow;
	public MyHelperClass abort(){ return null; }

    private synchronized void awaitResponse() throws Throwable, BOSHException {
        HttpEntity entity = null;
        try {
            MyHelperClass post = new MyHelperClass();
            HttpResponse httpResp =(HttpResponse)(Object) client.execute(post, context);
            entity =(HttpEntity)(Object) httpResp.getEntity();
            MyHelperClass EntityUtils = new MyHelperClass();
            byte[] data =(byte[])(Object) EntityUtils.toByteArray(entity);
            String encoding = entity.getContentEncoding() != null ? entity.getContentEncoding().getValue() : null;
            MyHelperClass ZLIBCodec = new MyHelperClass();
            if ((boolean)(Object)ZLIBCodec.getID().equalsIgnoreCase(encoding)) {
//                MyHelperClass ZLIBCodec = new MyHelperClass();
                data =(byte[])(Object) ZLIBCodec.decode(data);
            MyHelperClass GZIPCodec = new MyHelperClass();
            } else if ((boolean)(Object)GZIPCodec.getID().equalsIgnoreCase(encoding)) {
                MyHelperClass GZIPCodec = new MyHelperClass();
                data =(byte[])(Object) GZIPCodec.decode(data);
            }
            MyHelperClass body = new MyHelperClass();
            body = StaticBody.fromString(new String(data,(int)(Object) CHARSET));
            MyHelperClass statusCode = new MyHelperClass();
            statusCode = httpResp.getStatusLine().getStatusCode();
            boolean sent =(boolean)(Object) NULL; //new boolean();
            sent = true;
        } catch (IOException iox) {
            abort();
            toThrow =(MyHelperClass)(Object) new BOSHException("Could not obtain response", iox);
            throw(Throwable)(Object) (toThrow);
        } catch (RuntimeException ex) {
            abort();
            throw (ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getValue(){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass equalsIgnoreCase(String o0){ return null; }
	public MyHelperClass getID(){ return null; }
	public MyHelperClass toByteArray(HttpEntity o0){ return null; }
	public MyHelperClass fromString(String o0){ return null; }
	public MyHelperClass execute(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass decode(byte[] o0){ return null; }}

class BOSHException extends Exception{
	public BOSHException(String errorMessage) { super(errorMessage); }
	BOSHException(String o0, IOException o1){}
	BOSHException(){}
}

class HttpEntity {

public MyHelperClass getContentEncoding(){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}
