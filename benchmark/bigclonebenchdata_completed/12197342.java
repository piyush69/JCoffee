import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12197342 {
public MyHelperClass cookieStore;
	public MyHelperClass bannerLbl;
	public MyHelperClass DesktopUtil;
	public MyHelperClass httpClient;

        public void mousePressed(MouseEvent e)  throws Throwable {
            MyHelperClass Cursor = new MyHelperClass();
            bannerLbl.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            HttpContext context =(HttpContext)(Object) new BasicHttpContext();
            MyHelperClass ClientContext = new MyHelperClass();
            context.setAttribute(ClientContext.COOKIE_STORE, cookieStore);
            MyHelperClass bannerURL = new MyHelperClass();
            HttpGet method = new HttpGet(bannerURL);
            try {
                HttpResponse response =(HttpResponse)(Object) httpClient.execute(method, context);
                HttpEntity entity =(HttpEntity)(Object) response.getEntity();
                MyHelperClass ExecutionContext = new MyHelperClass();
                HttpHost host = (HttpHost)(HttpHost)(Object) context.getAttribute(ExecutionContext.HTTP_TARGET_HOST);
//                MyHelperClass ExecutionContext = new MyHelperClass();
                HttpUriRequest request = (HttpUriRequest)(HttpUriRequest)(Object) context.getAttribute(ExecutionContext.HTTP_REQUEST);
                String targetURL =(int)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object) host.toURI() + (int)(Object)request.getURI();
                MyHelperClass bannerLbl = new MyHelperClass();
                DesktopUtil.browseAndWarn(targetURL, bannerLbl);
                MyHelperClass EntityUtils = new MyHelperClass();
                EntityUtils.consume(entity);
            } catch (Exception ex) {
                MyHelperClass NotifyUtil = new MyHelperClass();
                NotifyUtil.error("Banner Error", "Could not open the default web browser.", ex, false);
            } finally {
                method.abort();
            }
//            MyHelperClass Cursor = new MyHelperClass();
            bannerLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_REQUEST;
	public MyHelperClass COOKIE_STORE;
	public MyHelperClass HTTP_TARGET_HOST;
	public MyHelperClass WAIT_CURSOR;
	public MyHelperClass HAND_CURSOR;
public MyHelperClass getPredefinedCursor(MyHelperClass o0){ return null; }
	public MyHelperClass execute(HttpGet o0, HttpContext o1){ return null; }
	public MyHelperClass consume(HttpEntity o0){ return null; }
	public MyHelperClass setCursor(MyHelperClass o0){ return null; }
	public MyHelperClass error(String o0, String o1, Exception o2, boolean o3){ return null; }
	public MyHelperClass browseAndWarn(String o0, MyHelperClass o1){ return null; }}

class MouseEvent {

}

class HttpContext {

public MyHelperClass getAttribute(MyHelperClass o0){ return null; }
	public MyHelperClass setAttribute(MyHelperClass o0, MyHelperClass o1){ return null; }}

class BasicHttpContext {

}

class HttpGet {

HttpGet(MyHelperClass o0){}
	HttpGet(){}
	public MyHelperClass abort(){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

}

class HttpHost {

public MyHelperClass toURI(){ return null; }}

class HttpUriRequest {

public MyHelperClass getURI(){ return null; }}
