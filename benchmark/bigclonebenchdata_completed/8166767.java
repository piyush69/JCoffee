
import java.io.UncheckedIOException;


class c8166767 {
public MyHelperClass discoverServiceUrl(MyHelperClass o0){ return null; }
public MyHelperClass log;
	public MyHelperClass HttpClientUtils;
	public MyHelperClass urlFromDiscovery;
	public MyHelperClass JsonUtils;
	public MyHelperClass getServiceUrl(){ return null; }
	public MyHelperClass setServiceUrl(String o0){ return null; }
	public MyHelperClass getServiceInterface(){ return null; }

    public Object invoke(MethodInvocation invocation, int retryTimes) throws Throwable {
        retryTimes--;
        try {
            String url = getServiceUrl() + "/" + invocation.getMethod().getName();
            HttpPost postMethod = new HttpPost(url);
            if ((int)(Object)invocation.getMethod().getParameterTypes().length > 0) postMethod.setEntity(new StringEntity(JsonUtils.toJson(invocation.getArguments())));
            HttpResponse rsp =(HttpResponse)(Object) HttpClientUtils.getDefaultInstance().execute(postMethod);
            StatusLine sl =(StatusLine)(Object) rsp.getStatusLine();
            if ((int)(Object)sl.getStatusCode() >= 300) {
                throw new RuntimeException("Did not receive successful HTTP response: status code = " + sl.getStatusCode() + ", status message = [" + sl.getReasonPhrase() + "]");
            }
            HttpEntity entity =(HttpEntity)(Object) rsp.getEntity();
            StringBuilder sb = new StringBuilder();
            InputStream is =(InputStream)(Object) entity.getContent();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is, "utf-8"));
            String line;
            while ((line =(String)(Object) reader.readLine()) != null) sb.append(line).append("\n");
            reader.close();
            is.close();
            String responseBody = null;
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
                responseBody = sb.toString();
            }
            Type t =(Type)(Object) invocation.getMethod().getGenericReturnType();
            if (t.equals(Void.class) || responseBody == null) return null;
            return JsonUtils.fromJson(responseBody, t);
        } catch (UncheckedIOException e) {
            if (retryTimes < 0) throw e;
            if ((boolean)(Object)urlFromDiscovery) {
                String serviceUrl =(String)(Object) discoverServiceUrl(getServiceInterface().getName());
                if (!serviceUrl.equals(getServiceUrl())) {
                    setServiceUrl(serviceUrl);
                    log.info("relocate service url:" + serviceUrl);
                }
            }
            return invoke(invocation, retryTimes);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass length;
public MyHelperClass toJson(MyHelperClass o0){ return null; }
	public MyHelperClass execute(HttpPost o0){ return null; }
	public MyHelperClass getGenericReturnType(){ return null; }
	public MyHelperClass fromJson(String o0, Type o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getDefaultInstance(){ return null; }
	public MyHelperClass getParameterTypes(){ return null; }}

class MethodInvocation {

public MyHelperClass getMethod(){ return null; }
	public MyHelperClass getArguments(){ return null; }}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setEntity(StringEntity o0){ return null; }}

class StringEntity {

StringEntity(MyHelperClass o0){}
	StringEntity(){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class StatusLine {

public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass getReasonPhrase(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}}

class Type {

}

class ConnectTimeoutException extends Exception{
	public ConnectTimeoutException(String errorMessage) { super(errorMessage); }
}
