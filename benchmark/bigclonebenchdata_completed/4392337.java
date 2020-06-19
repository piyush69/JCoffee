
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c4392337 {

//    @Override
    public void execute(Client client, TaskProperties properties, TaskLog taskLog) throws SearchLibException {
        MyHelperClass propUrl = new MyHelperClass();
        String url =(String)(Object) properties.getValue(propUrl);
        URI uri;
        try {
            uri = new URI(url);
        } catch (UncheckedIOException e) {
            throw new SearchLibException((String)(Object)e);
        }
        MyHelperClass propLogin = new MyHelperClass();
        String login =(String)(Object) properties.getValue(propLogin);
        MyHelperClass propPassword = new MyHelperClass();
        String password =(String)(Object) properties.getValue(propPassword);
        MyHelperClass propInstanceId = new MyHelperClass();
        String instanceId =(String)(Object) properties.getValue(propInstanceId);
        HttpParams params =(HttpParams)(Object) new BasicHttpParams();
        HttpProtocolParamBean paramsBean = new HttpProtocolParamBean(params);
        MyHelperClass HttpVersion = new MyHelperClass();
        paramsBean.setVersion(HttpVersion.HTTP_1_1);
        paramsBean.setContentCharset("UTF-8");
        MyHelperClass HttpClientParams = new MyHelperClass();
        HttpClientParams.setRedirecting(params, true);
        DefaultHttpClient httpClient = new DefaultHttpClient(params);
        CredentialsProvider credential =(CredentialsProvider)(Object) httpClient.getCredentialsProvider();
        if (login != null && login.length() > 0 && password != null && password.length() > 0) credential.setCredentials(new AuthScope(uri.getHost(), uri.getPort()), new UsernamePasswordCredentials(login, password)); else credential.clear();
        HttpPost httpPost = new HttpPost(uri);
        MultipartEntity reqEntity = new MultipartEntity();
        new Monitor().writeToPost(reqEntity);
        try {
            reqEntity.addPart("instanceId", new StringBody(instanceId));
        } catch (UncheckedIOException e) {
            throw new SearchLibException((String)(Object)e);
        }
        httpPost.setEntity(reqEntity);
        try {
            HttpResponse httpResponse =(HttpResponse)(Object) httpClient.execute(httpPost);
            HttpEntity resEntity =(HttpEntity)(Object) httpResponse.getEntity();
            StatusLine statusLine =(StatusLine)(Object) httpResponse.getStatusLine();
            MyHelperClass EntityUtils = new MyHelperClass();
            EntityUtils.consume(resEntity);
            if ((int)(Object)statusLine.getStatusCode() != 200) throw new SearchLibException("Wrong code status:" + statusLine.getStatusCode() + " " + statusLine.getReasonPhrase());
            taskLog.setInfo("Monitoring data uploaded");
        } catch (UncheckedIOException e) {
            throw new SearchLibException((String)(Object)e);
        } catch (ArithmeticException e) {
            throw new SearchLibException((String)(Object)e);
        } finally {
            ClientConnectionManager connectionManager =(ClientConnectionManager)(Object) httpClient.getConnectionManager();
            if (connectionManager != null) connectionManager.shutdown();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_1_1;
public MyHelperClass consume(HttpEntity o0){ return null; }
	public MyHelperClass setRedirecting(HttpParams o0, boolean o1){ return null; }}

class Client {

}

class TaskProperties {

public MyHelperClass getValue(MyHelperClass o0){ return null; }}

class TaskLog {

public MyHelperClass setInfo(String o0){ return null; }}

class SearchLibException extends Exception{
	public SearchLibException(String errorMessage) { super(errorMessage); }
}

class URI {

URI(String o0){}
	URI(){}
	public MyHelperClass getPort(){ return null; }
	public MyHelperClass getHost(){ return null; }}

class URISyntaxException extends Exception{
	public URISyntaxException(String errorMessage) { super(errorMessage); }
}

class HttpParams {

}

class BasicHttpParams {

}

class HttpProtocolParamBean {

HttpProtocolParamBean(){}
	HttpProtocolParamBean(HttpParams o0){}
	public MyHelperClass setVersion(MyHelperClass o0){ return null; }
	public MyHelperClass setContentCharset(String o0){ return null; }}

class DefaultHttpClient {

DefaultHttpClient(HttpParams o0){}
	DefaultHttpClient(){}
	public MyHelperClass getCredentialsProvider(){ return null; }
	public MyHelperClass getConnectionManager(){ return null; }
	public MyHelperClass execute(HttpPost o0){ return null; }}

class CredentialsProvider {

public MyHelperClass setCredentials(AuthScope o0, UsernamePasswordCredentials o1){ return null; }
	public MyHelperClass clear(){ return null; }}

class AuthScope {

AuthScope(){}
	AuthScope(MyHelperClass o0, MyHelperClass o1){}}

class UsernamePasswordCredentials {

UsernamePasswordCredentials(){}
	UsernamePasswordCredentials(String o0, String o1){}}

class HttpPost {

HttpPost(){}
	HttpPost(URI o0){}
	public MyHelperClass setEntity(MultipartEntity o0){ return null; }}

class MultipartEntity {

public MyHelperClass addPart(String o0, StringBody o1){ return null; }}

class Monitor {

public MyHelperClass writeToPost(MultipartEntity o0){ return null; }}

class StringBody {

StringBody(String o0){}
	StringBody(){}}

class UnsupportedEncodingException extends Exception{
	public UnsupportedEncodingException(String errorMessage) { super(errorMessage); }
}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

}

class StatusLine {

public MyHelperClass getReasonPhrase(){ return null; }
	public MyHelperClass getStatusCode(){ return null; }}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ClientConnectionManager {

public MyHelperClass shutdown(){ return null; }}
