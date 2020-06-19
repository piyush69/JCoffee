import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14689323 {

    public void serveResource(HTTPResource resource, HttpServletRequest request, HttpServletResponse response) throws Throwable, java.io.IOException {
        Image image = (Image)(Image)(Object) resource;
        MyHelperClass log = new MyHelperClass();
        log.debug("Serving: " + image);
        URL url =(URL)(Object) image.getResourceURL();
        int idx = url.toString().lastIndexOf(".");
        String fn = image.getId() + url.toString().substring(idx);
        String cd = "filename=\"" + fn + "\"";
        response.setContentType(image.getContentType());
//        MyHelperClass log = new MyHelperClass();
        log.debug("LOADING: " + url);
        MyHelperClass IOUtil = new MyHelperClass();
        IOUtil.copyData(response.getOutputStream(), url.openStream());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass copyData(MyHelperClass o0, InputStream o1){ return null; }}

class HTTPResource {

}

class HttpServletRequest {

}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentType(MyHelperClass o0){ return null; }}

class Image {

public MyHelperClass getResourceURL(){ return null; }
	public MyHelperClass getId(){ return null; }
	public MyHelperClass getContentType(){ return null; }}
