import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2287075 {

    public void serveResource(HTTPResource resource, HttpServletRequest request, HttpServletResponse response) throws Throwable, IOException {
        JavaScriptResource jsr = (JavaScriptResource)(JavaScriptResource)(Object) resource;
        response.setContentType("text/javascript");
        if (jsr.getScriptText() != null) {
            PrintWriter pw =(PrintWriter)(Object) response.getWriter();
            pw.println(jsr.getScriptText());
        } else if (jsr.getResourceName() != null) {
            MyHelperClass ClassLoaderUtil = new MyHelperClass();
            URL url =(URL)(Object) ClassLoaderUtil.getResource(jsr.getResourceName());
            MyHelperClass IOUtil = new MyHelperClass();
            IOUtil.copyData(response.getOutputStream(), url.openStream());
        } else {
            throw new IOException("No Javascript to Serve");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyData(MyHelperClass o0, InputStream o1){ return null; }
	public MyHelperClass getResource(MyHelperClass o0){ return null; }}

class HTTPResource {

}

class HttpServletRequest {

}

class HttpServletResponse {

public MyHelperClass getWriter(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }}

class JavaScriptResource {

public MyHelperClass getResourceName(){ return null; }
	public MyHelperClass getScriptText(){ return null; }}
