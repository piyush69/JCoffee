import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c22724693 {
public MyHelperClass HttpProtocolParams;
public MyHelperClass createMytemMaster(String o0){ return null; }

    public MytemMaster getMytemMaster(String janCode) throws GaeException {
        HttpClient client =(HttpClient)(Object) new DefaultHttpClient();
        HttpParams httpParams =(HttpParams)(Object) client.getParams();
        MyHelperClass HttpConnectionParams = new MyHelperClass();
        HttpConnectionParams.setSoTimeout(httpParams, 10000);
        MyHelperClass HttpVersion = new MyHelperClass();
        HttpProtocolParams.setVersion(httpParams, HttpVersion.HTTP_1_1);
        BufferedReader reader = null;
        MyHelperClass address = new MyHelperClass();
        StringBuffer request = new StringBuffer((int)(Object)address);
        request.append("api/mytems/show?jan=");
        request.append(janCode);
        try {
            HttpGet httpGet = new HttpGet(request.toString());
            HttpResponse httpResponse =(HttpResponse)(Object) client.execute(httpGet);
            int statusCode =(int)(Object) httpResponse.getStatusLine().getStatusCode();
            MyHelperClass NOT_FOUND = new MyHelperClass();
            if (statusCode == (int)(Object)NOT_FOUND) {
                return null;
            }
            if (statusCode >= 400) {
                throw new GaeException("Status Error = " + Integer.toString(statusCode));
            }
            reader = new BufferedReader(new InputStreamReader((InputStream)(Object)httpResponse.getEntity().getContent(), "UTF-8"));
            StringBuilder builder = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }
            return(MytemMaster)(Object) createMytemMaster(builder.toString());
        } catch (UncheckedIOException e) {
            throw new GaeException((String)(Object)e);
        } catch (ArithmeticException e) {
            throw new GaeException((String)(Object)e);
        } catch (IOException exception) {
            throw new GaeException((String)(Object)exception);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_1_1;
public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass setSoTimeout(HttpParams o0, int o1){ return null; }
	public MyHelperClass getContent(){ return null; }
	public MyHelperClass setVersion(HttpParams o0, MyHelperClass o1){ return null; }}

class MytemMaster {

}

class GaeException extends Exception{
	public GaeException(String errorMessage) { super(errorMessage); }
}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass getParams(){ return null; }}

class DefaultHttpClient {

}

class HttpParams {

}

class HttpGet {

HttpGet(){}
	HttpGet(String o0){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class SocketTimeoutException extends Exception{
	public SocketTimeoutException(String errorMessage) { super(errorMessage); }
}
