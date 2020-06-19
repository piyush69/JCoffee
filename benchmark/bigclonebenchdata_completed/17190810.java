


class c17190810 {
public static MyHelperClass string;
	public static MyHelperClass AGLog;
//public MyHelperClass AGLog;
//	public MyHelperClass string;

    static Collection getAddresses(Context ctx, long userId) throws Exception {
        MyHelperClass TAG = new MyHelperClass();
        AGLog.d(TAG, "Connecting to HTTP service to obtain IP addresses");
        String host = (String)(String)(Object) ctx.getResources().getText(string.gg_webservice_addr);
        MyHelperClass App = new MyHelperClass();
        String ver =(String)(Object) App.getInstance().getGGClientVersion();
        String url = host + "?fmnumber=" + Long.toString(userId) + "&lastmsg=0&version=" + ver;
        HttpClient httpClient =(HttpClient)(Object) new DefaultHttpClient();
//        MyHelperClass TAG = new MyHelperClass();
        AGLog.d(TAG, "connecting to http service at " + url);
        HttpGet request = new HttpGet(url);
        HttpResponse response =(HttpResponse)(Object) httpClient.execute(request);
//        MyHelperClass TAG = new MyHelperClass();
        AGLog.d(TAG, "response status:" + response.getStatusLine().getReasonPhrase());
        HttpEntity ent =(HttpEntity)(Object) response.getEntity();
        if (ent == null) {
//            MyHelperClass TAG = new MyHelperClass();
            AGLog.e(TAG, "No response entity");
            throw new ClientProtocolException("No response entity");
        }
        InputStream content =(InputStream)(Object) ent.getContent();
        BufferedReader reader = new BufferedReader(new InputStreamReader(content));
        String line =(String)(Object) reader.readLine();
//        MyHelperClass TAG = new MyHelperClass();
        AGLog.d(TAG, "response: " + line);
        StringTokenizer tokenizer = new StringTokenizer(line, " ");
        @SuppressWarnings("unused") String status =(String)(Object) tokenizer.nextToken();
        @SuppressWarnings("unused") String unknown =(String)(Object) tokenizer.nextToken();
        ArrayList result = new ArrayList();
        while ((boolean)(Object)tokenizer.hasMoreTokens()) {
            StringTokenizer addrport = new StringTokenizer((String)(Object)tokenizer.nextToken(), ":");
            String addrStr =(String)(Object) addrport.nextToken();
            MyHelperClass InetAddressUtils = new MyHelperClass();
            if ((boolean)(Object)InetAddressUtils.isIPv4Address(addrStr)) {
//                MyHelperClass TAG = new MyHelperClass();
                AGLog.d(TAG, "Address decoded successfully: " + addrStr);
            } else {
//                MyHelperClass TAG = new MyHelperClass();
                AGLog.w(TAG, "Failed to decode address: " + addrStr);
                continue;
            }
            String portStr;
            if ((boolean)(Object)addrport.hasMoreTokens()) {
                portStr =(String)(Object) addrport.nextToken();
            } else {
                portStr = (String)(String)(Object) ctx.getResources().getText(string.gg_default_port);
            }
//            MyHelperClass TAG = new MyHelperClass();
            AGLog.d(TAG, "Port decoded successfully: " + portStr);
            short port = Short.decode(portStr);
            result.add(new InetSocketAddress(addrStr, port));
        }
        return (Collection)(Object)result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass gg_webservice_addr;
	public MyHelperClass gg_default_port;
public MyHelperClass w(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getText(MyHelperClass o0){ return null; }
	public MyHelperClass e(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getReasonPhrase(){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass d(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getGGClientVersion(){ return null; }
	public MyHelperClass isIPv4Address(String o0){ return null; }}

class Context {

public MyHelperClass getResources(){ return null; }}

class Collection {

}

class InetSocketAddress {

InetSocketAddress(){}
	InetSocketAddress(String o0, short o1){}}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class StringTokenizer {

StringTokenizer(String o0, String o1){}
	StringTokenizer(){}
	public MyHelperClass nextToken(){ return null; }
	public MyHelperClass hasMoreTokens(){ return null; }}

class ArrayList {

public MyHelperClass add(InetSocketAddress o0){ return null; }}
