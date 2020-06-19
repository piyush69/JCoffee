


class c7809093 {

    public static String getContent(HttpUriRequest request) throws Exception {
        StringBuffer sb = new StringBuffer();
        HttpClient client =(HttpClient)(Object) new DefaultHttpClient();
        HttpParams httpParams =(HttpParams)(Object) client.getParams();
        MyHelperClass HttpConnectionParams = new MyHelperClass();
        HttpConnectionParams.setConnectionTimeout(httpParams, 30000);
//        MyHelperClass HttpConnectionParams = new MyHelperClass();
        HttpConnectionParams.setSoTimeout(httpParams, 50000);
        HttpResponse response =(HttpResponse)(Object) client.execute(request);
        HttpEntity entity =(HttpEntity)(Object) response.getEntity();
        if (entity != null) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(entity.getContent(), "UTF-8"), 8192);
            String line = null;
            while ((line =(String)(Object) reader.readLine()) != null) {
                sb.append(line + "\n");
            }
            reader.close();
        }
        return sb.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setSoTimeout(HttpParams o0, int o1){ return null; }
	public MyHelperClass setConnectionTimeout(HttpParams o0, int o1){ return null; }}

class HttpUriRequest {

}

class HttpClient {

public MyHelperClass getParams(){ return null; }
	public MyHelperClass execute(HttpUriRequest o0){ return null; }}

class DefaultHttpClient {

}

class HttpParams {

}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class BufferedReader {

BufferedReader(InputStreamReader o0, int o1){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}
