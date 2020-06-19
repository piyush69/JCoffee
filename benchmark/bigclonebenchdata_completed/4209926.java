import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c4209926 {

    public static void proxyRequest(IPageContext context, Writer writer, String proxyPath) throws IOException {
        URLConnection connection = new URL(proxyPath).openConnection();
        connection.setDoInput(true);
        connection.setDoOutput(false);
        connection.setUseCaches(false);
        connection.setRequestProperty("Content-Type", "text/html; charset=UTF-8");
        connection.setReadTimeout(30000);
        connection.setConnectTimeout(5000);
        Enumeration<String> e =(Enumeration<String>)(Object) context.httpRequest().getHeaderNames();
        while (e.hasMoreElements()) {
            String name = e.nextElement();
            if (name.equalsIgnoreCase("HOST") || name.equalsIgnoreCase("Accept-Encoding") || name.equalsIgnoreCase("Authorization")) continue;
            Enumeration<String> headers =(Enumeration<String>)(Object) context.httpRequest().getHeaders(name);
            while (headers.hasMoreElements()) {
                String header = headers.nextElement();
                connection.setRequestProperty(name, header);
            }
        }
        if (connection instanceof HttpURLConnection) {
            HttpURLConnection httpConnection = (HttpURLConnection) connection;
            httpConnection.setRequestMethod((String)(Object)context.httpRequest().getMethod());
            if ("POST".equalsIgnoreCase((String)(Object)context.httpRequest().getMethod()) || "PUT".equalsIgnoreCase((String)(Object)context.httpRequest().getMethod())) {
                Enumeration<String> names =(Enumeration<String>)(Object) context.httpRequest().getParameterNames();
                StringBuilder body = new StringBuilder();
                while (names.hasMoreElements()) {
                    String key = names.nextElement();
                    for (String value :(String[])(Object) (Object[])(Object)context.parameters(key)) {
                        if (body.length() > 0) {
                            body.append('&');
                        }
                        try {
                            body.append(key).append("=").append(URLEncoder.encode(value, "UTF-8"));
                        } catch (UnsupportedEncodingException ex) {
                        }
                    }
                }
                if (body.length() > 0) {
                    connection.setDoOutput(true);
                    OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
                    out.write(body.toString());
                    out.close();
                }
            }
        }
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(connection.getInputStream(), writer);
        } catch (IOException ex) {
            writer.write("<span>SSI Error: " + ex.getMessage() + "</span>");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getHeaders(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, Writer o1){ return null; }
	public MyHelperClass getParameterNames(){ return null; }
	public MyHelperClass getMethod(){ return null; }
	public MyHelperClass getHeaderNames(){ return null; }}

class IPageContext {

public MyHelperClass httpRequest(){ return null; }
	public MyHelperClass parameters(String o0){ return null; }}
