import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7875897 {

//    @SuppressWarnings("unchecked")
    protected void handleRequest(HttpServletRequest req, HttpServletResponse resp, boolean isPost) throws Throwable, ServletException, IOException {
        MyHelperClass WebReader = new MyHelperClass();
        HttpClient httpclient = WebReader.getHttpClient();
        try {
            StringBuffer sb = new StringBuffer();
            MyHelperClass targetServer = new MyHelperClass();
            sb.append(targetServer);
            sb.append(req.getRequestURI());
            if (req.getQueryString() != null) {
                sb.append("?" + req.getQueryString());
            }
            HttpRequestBase targetRequest = null;
            if (isPost) {
                HttpPost post = new HttpPost(sb.toString());
                Enumeration<String> paramNames = req.getParameterNames();
                String paramName = null;
                List<NameValuePair> params = new ArrayList<NameValuePair>();
                while (paramNames.hasMoreElements()) {
                    paramName = paramNames.nextElement();
                    params.add(new BasicNameValuePair(paramName, req.getParameterValues(paramName)[0]));
                }
                MyHelperClass HTTP = new MyHelperClass();
                post.setEntity(new UrlEncodedFormEntity(params, HTTP.UTF_8));
                targetRequest =(HttpRequestBase)(Object) post;
            } else {
                System.out.println("GET");
                HttpGet get = new HttpGet(sb.toString());
                targetRequest =(HttpRequestBase)(Object) get;
            }
            HttpResponse targetResponse = httpclient.execute(targetRequest);
            HttpEntity entity = targetResponse.getEntity();
            InputStream input = entity.getContent();
            OutputStream output = resp.getOutputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
            String line = reader.readLine();
            while (line != null) {
                writer.write(line + "\n");
                line = reader.readLine();
            }
            reader.close();
            writer.close();
        } finally {
//            MyHelperClass WebReader = new MyHelperClass();
            WebReader.returnHttpClient(httpclient);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass UTF_8;
public MyHelperClass getHttpClient(){ return null; }
	public MyHelperClass returnHttpClient(HttpClient o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getQueryString(){ return null; }
	public MyHelperClass getRequestURI(){ return null; }
	public MyHelperClass getParameterNames(){ return null; }
	public MyHelperClass getParameterValues(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class HttpClient {

public MyHelperClass execute(HttpRequestBase o0){ return null; }}

class HttpRequestBase {

}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}}

class NameValuePair {

}

class BasicNameValuePair {

}

class UrlEncodedFormEntity {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}
