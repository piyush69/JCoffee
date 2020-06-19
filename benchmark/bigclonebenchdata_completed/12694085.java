import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12694085 {
public MyHelperClass NULL;
public MyHelperClass writeRequest(XmlWriter o0, String o1, Vector o2){ return null; }
public MyHelperClass XmlRpc;
	public MyHelperClass result;
	public MyHelperClass fault;
	public MyHelperClass parse(InputStream o0){ return null; }

        Object execute(String method, Vector params) throws XmlRpcException, IOException {
            boolean fault =(boolean)(Object) NULL; //new boolean();
            fault = false;
            long now = 0;
            MyHelperClass XmlRpc = new MyHelperClass();
            if ((boolean)(Object)XmlRpc.debug) {
                System.err.println("Client calling procedure '" + method + "' with parameters " + params);
                now = System.currentTimeMillis();
            }
            try {
                ByteArrayOutputStream bout = new ByteArrayOutputStream();
                MyHelperClass buffer = new MyHelperClass();
                if (buffer == null) {
//                    MyHelperClass buffer = new MyHelperClass();
                    buffer =(MyHelperClass)(Object) new ByteArrayOutputStream();
                } else {
//                    MyHelperClass buffer = new MyHelperClass();
                    buffer.reset();
                }
//                MyHelperClass buffer = new MyHelperClass();
                XmlWriter writer = new XmlWriter(buffer);
                writeRequest(writer, method, params);
                writer.flush();
//                MyHelperClass buffer = new MyHelperClass();
                byte[] request =(byte[])(Object) buffer.toByteArray();
                MyHelperClass url = new MyHelperClass();
                URLConnection con =(URLConnection)(Object) url.openConnection();
                con.setDoInput(true);
                con.setDoOutput(true);
                con.setUseCaches(false);
                con.setAllowUserInteraction(false);
                con.setRequestProperty("Content-Length", Integer.toString(request.length));
                con.setRequestProperty("Content-Type", "text/xml");
                MyHelperClass auth = new MyHelperClass();
                if (auth != null) {
//                    MyHelperClass auth = new MyHelperClass();
                    con.setRequestProperty("Authorization", "Basic " + auth);
                }
                OutputStream out = con.getOutputStream();
                out.write(request);
                out.flush();
                out.close();
                InputStream in = con.getInputStream();
                parse(in);
            } catch (Exception x) {
                if ((boolean)(Object)XmlRpc.debug) {
                    x.printStackTrace();
                }
                throw new IOException(x.getMessage());
            }
            if ((boolean)(Object)fault) {
                XmlRpcException exception = null;
                try {
                    Hashtable f = (Hashtable)(Hashtable)(Object) result;
                    String faultString = (String) f.get("faultString");
                    int faultCode = Integer.parseInt(f.get("faultCode").toString());
                    exception = new XmlRpcException(faultCode, faultString.trim());
                } catch (Exception x) {
                    throw new XmlRpcException(0, "Invalid fault response");
                }
                throw exception;
            }
            if ((boolean)(Object)XmlRpc.debug) {
                System.err.println("Spent " + (System.currentTimeMillis() - now) + " in request");
            }
            return result;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass debug;
public MyHelperClass openConnection(){ return null; }
	public MyHelperClass reset(){ return null; }
	public MyHelperClass toByteArray(){ return null; }}

class XmlRpcException extends Exception{
	public XmlRpcException(String errorMessage) { super(errorMessage); }
	XmlRpcException(){}
	XmlRpcException(int o0, String o1){}
}

class XmlWriter {

XmlWriter(){}
	XmlWriter(MyHelperClass o0){}
	public MyHelperClass flush(){ return null; }}
