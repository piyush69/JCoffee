import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c20139125 {

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String realUrl = "http:/" + request.getPathInfo();
        if (request.getQueryString() != null) {
            realUrl += "?" + request.getQueryString();
        }
        URL url = new URL(realUrl);
        URLConnection connection = url.openConnection();
        HttpURLConnection http = null;
        if (connection instanceof HttpURLConnection) {
            http = (HttpURLConnection) connection;
            http.setRequestMethod((String)(Object)request.getMethod());
        }
        boolean hasContent = false;
        Enumeration headers =(Enumeration)(Object) request.getHeaderNames();
        while (headers.hasMoreElements()) {
            String header = (String) headers.nextElement();
            if ("content-type".equals(header.toLowerCase())) hasContent = true;
            Enumeration values =(Enumeration)(Object) request.getHeaders(header);
            while (values.hasMoreElements()) {
                String value = (String) values.nextElement();
                if (value != null) {
                    connection.addRequestProperty(header, value);
                }
            }
        }
        try {
            connection.setDoInput(true);
            if (hasContent) {
                InputStream proxyRequest =(InputStream)(Object) request.getInputStream();
                connection.setDoOutput(true);
                MyHelperClass IO = new MyHelperClass();
                IO.copy(proxyRequest, connection.getOutputStream());
            }
            connection.connect();
        } catch (Exception e) {
            MyHelperClass context = new MyHelperClass();
            context.log("proxy", e);
        }
        InputStream proxyResponse = null;
        int code = 500;
        if (http != null) {
            proxyResponse = http.getErrorStream();
            code = http.getResponseCode();
            response.setStatus(code);
        }
        if (proxyResponse == null) {
            try {
                proxyResponse = connection.getInputStream();
            } catch (Exception e) {
                if (http != null) proxyResponse = http.getErrorStream();
                MyHelperClass context = new MyHelperClass();
                context.log("stream", e);
            }
        }
        int i = 0;
        String header = connection.getHeaderFieldKey(i);
        String value = connection.getHeaderField(i);
        while (header != null || value != null) {
            if (header != null && value != null) {
                response.addHeader(header, value);
            }
            ++i;
            header = connection.getHeaderFieldKey(i);
            value = connection.getHeaderField(i);
        }
        if (proxyResponse != null) {
            MyHelperClass IO = new MyHelperClass();
            IO.copy(proxyResponse,(OutputStream)(Object) response.getOutputStream());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass log(String o0, Exception o1){ return null; }}

class HttpServletRequest {

public MyHelperClass getPathInfo(){ return null; }
	public MyHelperClass getHeaders(String o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getQueryString(){ return null; }
	public MyHelperClass getMethod(){ return null; }
	public MyHelperClass getHeaderNames(){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass addHeader(String o0, String o1){ return null; }
	public MyHelperClass setStatus(int o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}
