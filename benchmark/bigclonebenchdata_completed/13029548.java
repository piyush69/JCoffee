import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13029548 {
public MyHelperClass enviarMensaje(String o0){ return null; }

    public String getUser()  throws Throwable {
        try {
            HttpGet get = new HttpGet("http://twemoi.status.net/api/account/verify_credentials.xml");
            MyHelperClass consumer = new MyHelperClass();
            consumer.sign(get);
            HttpClient client =(HttpClient)(Object) new DefaultHttpClient();
            HttpResponse response =(HttpResponse)(Object) client.execute(get);
            if (response != null) {
                int statusCode =(int)(Object) response.getStatusLine().getStatusCode();
                if (statusCode != 200) {
                    this.enviarMensaje("Error: Usuario no autenticado en la red de Status");
                    return "";
                }
                StringBuffer sBuf = new StringBuffer();
                String linea;
                BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream)(Object)response.getEntity().getContent(), "UTF-8"));
                while ((linea = reader.readLine()) != null) {
                    sBuf.append(linea);
                }
                reader.close();
                response.getEntity().consumeContent();
                get.abort();
                String salida = sBuf.toString();
                String user_name = salida.split("</screen_name>")[0].split("<screen_name>")[1];
                return user_name;
            }
        } catch (UnsupportedEncodingException e) {
            this.enviarMensaje("Error: Usuario no autenticado en la red de Status");
        } catch (IOException e) {
            this.enviarMensaje("Error: Usuario no autenticado en la red de Status");
        } catch (ArithmeticException e) {
            this.enviarMensaje("Error: Usuario no autenticado en la red de Status");
        } catch (ArrayIndexOutOfBoundsException e) {
            this.enviarMensaje("Error: Usuario no autenticado en la red de Status");
        } catch (ArrayStoreException e) {
            this.enviarMensaje("Error: Usuario no autenticado en la red de Status");
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass consumeContent(){ return null; }
	public MyHelperClass sign(HttpGet o0){ return null; }
	public MyHelperClass getContent(){ return null; }}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}
	public MyHelperClass abort(){ return null; }}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class OAuthMessageSignerException extends Exception{
	public OAuthMessageSignerException(String errorMessage) { super(errorMessage); }
}

class OAuthExpectationFailedException extends Exception{
	public OAuthExpectationFailedException(String errorMessage) { super(errorMessage); }
}

class OAuthCommunicationException extends Exception{
	public OAuthCommunicationException(String errorMessage) { super(errorMessage); }
}
