import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5810755 {

//    @Override
    public Response callService(RemoteCallUrl urlModel) throws Throwable, RemoteCallFailedException {
        String path;
        if (urlModel.getRootPath() != null) path =(int)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object) urlModel.getRootPath() + (int)(Object)urlModel.getServicePath(); else path = urlModel.getServicePath();
        try {
            MyHelperClass HTTP_PROTOCOL = new MyHelperClass();
            URL url = new URL((String)(Object)HTTP_PROTOCOL,(String)(Object) urlModel.getHost(),(int)(Object) urlModel.getPort(), path);
            URLConnection urlConnection = url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine;
            String data = "";
            while ((inputLine = in.readLine()) != null) data += inputLine;
            Response remoteData = new Response(new String(data));
            MyHelperClass Response = new MyHelperClass();
            remoteData.setStatus(urlConnection.getHeaderField((String)(Object)Response.RPC_STATUS_NAME));
            in.close();
            return remoteData;
        } catch (MalformedURLException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Illegal URL. Cannot connect to this remote object", e);
            throw new RemoteCallFailedException("Illegal URL:" + e.getMessage(), e);
        } catch (IOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Cannot read from source. Please check remote object address", e);
            throw new RemoteCallFailedException("Fatal transport error:" + e.getMessage(), e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass RPC_STATUS_NAME;
public MyHelperClass error(String o0, MalformedURLException o1){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }}

class RemoteCallUrl {

public MyHelperClass getRootPath(){ return null; }
	public MyHelperClass getHost(){ return null; }
	public MyHelperClass getServicePath(){ return null; }
	public MyHelperClass getPort(){ return null; }}

class Response {

Response(String o0){}
	Response(){}
	public MyHelperClass setStatus(String o0){ return null; }}

class RemoteCallFailedException extends Exception{
	public RemoteCallFailedException(String errorMessage) { super(errorMessage); }
	RemoteCallFailedException(String o0, IOException o1){}
	RemoteCallFailedException(String o0, MalformedURLException o1){}
	RemoteCallFailedException(){}
}
