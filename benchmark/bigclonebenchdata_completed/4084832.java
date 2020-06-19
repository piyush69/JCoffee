
import java.io.UncheckedIOException;


class c4084832 {
public MyHelperClass password;
	public MyHelperClass log;
	public MyHelperClass userName;
	public MyHelperClass command;

    public void send() {
        final String urlPath = "/rest/nodes/";
        final String preIsy99Cmd = "/cmd/";
        String urlStr = null;
        DefaultHttpClient httpclient = new DefaultHttpClient();
        try {
            MyHelperClass host = new MyHelperClass();
            httpclient.getCredentialsProvider().setCredentials(new AuthScope(host, 80), new UsernamePasswordCredentials(userName, password));
            StringBuilder urlBuilder = new StringBuilder();
            urlBuilder.append("http://");
//            MyHelperClass host = new MyHelperClass();
            urlBuilder.append(host);
            urlBuilder.append(urlPath);
            MyHelperClass address = new MyHelperClass();
            urlBuilder.append(address);
            urlBuilder.append(preIsy99Cmd);
            MyHelperClass command = new MyHelperClass();
            urlBuilder.append(command);
            MyHelperClass commandParam = new MyHelperClass();
            if (commandParam != null) {
                urlBuilder.append("/");
//                MyHelperClass commandParam = new MyHelperClass();
                urlBuilder.append(commandParam);
                MyHelperClass log = new MyHelperClass();
                log.warn("commandParam  " + urlBuilder.toString());
            }
            urlStr = urlBuilder.toString();
            MyHelperClass log = new MyHelperClass();
            log.debug("send(): URL is " + urlStr);
//            MyHelperClass log = new MyHelperClass();
            log.warn("send(): URL is rest call  " + urlStr);
            HttpGet httpget = new HttpGet(urlStr);
//            MyHelperClass log = new MyHelperClass();
            log.debug("executing request" + httpget.getRequestLine());
            HttpResponse response =(HttpResponse)(Object) httpclient.execute(httpget);
            int responseStatusCode =(int)(Object) response.getStatusLine().getStatusCode();
            if (responseStatusCode != 200) {
//                MyHelperClass log = new MyHelperClass();
                log.error("send(): response status code was " + responseStatusCode);
            }
        } catch (UncheckedIOException e) {
            MyHelperClass address = new MyHelperClass();
            log.error("send(): IOException: address: " + address + "command: " + command,(IOException)(Object) e);
        } finally {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass setCredentials(AuthScope o0, UsernamePasswordCredentials o1){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }}

class DefaultHttpClient {

public MyHelperClass getCredentialsProvider(){ return null; }
	public MyHelperClass execute(HttpGet o0){ return null; }}

class AuthScope {

AuthScope(MyHelperClass o0, int o1){}
	AuthScope(){}}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}
	public MyHelperClass getRequestLine(){ return null; }}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class UsernamePasswordCredentials {

UsernamePasswordCredentials(MyHelperClass o0, MyHelperClass o1){}
	UsernamePasswordCredentials(){}}
