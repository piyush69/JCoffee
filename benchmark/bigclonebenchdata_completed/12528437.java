import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12528437 {
public static MyHelperClass createBasicAuthenticationSecurityHandler(){ return null; }
public MyHelperClass server;
//	public MyHelperClass createBasicAuthenticationSecurityHandler(){ return null; }

    public static void main(String[] args) throws Throwable, Exception {
        SocketConnector socketConnector = new SocketConnector();
        socketConnector.setPort(6080);
        SslSocketConnector sslSocketConnector = new SslSocketConnector();
        sslSocketConnector.setPort(6443);
        String serverKeystore = MockHttpListenerWithAuthentication.class.getClassLoader().getResource("cert/serverkeystore.jks").getPath();
        sslSocketConnector.setKeystore(serverKeystore);
        sslSocketConnector.setKeyPassword("serverpass");
        String serverTruststore = MockHttpListenerWithAuthentication.class.getClassLoader().getResource("cert/servertruststore.jks").getPath();
        sslSocketConnector.setTruststore(serverTruststore);
        sslSocketConnector.setTrustPassword("serverpass");
        MyHelperClass server = new MyHelperClass();
        server.addConnector(socketConnector);
//        MyHelperClass server = new MyHelperClass();
        server.addConnector(sslSocketConnector);
        SecurityHandler securityHandler =(SecurityHandler)(Object) createBasicAuthenticationSecurityHandler();
        HandlerList handlerList = new HandlerList();
        handlerList.addHandler(securityHandler);
        handlerList.addHandler((SecurityHandler)(Object)new AbstractHandler() {

//            @Override
            public void handle(String s, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, int i) throws IOException, ServletException {
                System.out.println("uri: " + httpServletRequest.getRequestURI());
                System.out.println("queryString: " + httpServletRequest.getQueryString());
                System.out.println("method: " + httpServletRequest.getMethod());
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(httpServletRequest.getInputStream(), baos);
                System.out.println("body: " + baos.toString());
                PrintWriter writer =(PrintWriter)(Object) httpServletResponse.getWriter();
                writer.append("testsvar");
                Random r = new Random();
                for (int j = 0; j < 10; j++) {
                    int value = r.nextInt(Integer.MAX_VALUE);
                    writer.append(value + "");
                }
                System.out.println();
                writer.close();
                MyHelperClass HttpServletResponse = new MyHelperClass();
                httpServletResponse.setStatus(HttpServletResponse.SC_OK);
            }
        });
        server.addHandler(handlerList);
        server.start();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
public MyHelperClass addConnector(SocketConnector o0){ return null; }
	public MyHelperClass copy(MyHelperClass o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass addHandler(HandlerList o0){ return null; }
	public MyHelperClass start(){ return null; }
	public MyHelperClass addConnector(SslSocketConnector o0){ return null; }}

class SocketConnector {

public MyHelperClass setPort(int o0){ return null; }}

class SslSocketConnector {

public MyHelperClass setTrustPassword(String o0){ return null; }
	public MyHelperClass setPort(int o0){ return null; }
	public MyHelperClass setTruststore(String o0){ return null; }
	public MyHelperClass setKeystore(String o0){ return null; }
	public MyHelperClass setKeyPassword(String o0){ return null; }}

class MockHttpListenerWithAuthentication {

}

class SecurityHandler {

}

class HandlerList {

public MyHelperClass addHandler(SecurityHandler o0){ return null; }
	public MyHelperClass addHandler(){ return null; }}

class AbstractHandler {

}

class HttpServletRequest {

public MyHelperClass getRequestURI(){ return null; }
	public MyHelperClass getMethod(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getQueryString(){ return null; }}

class HttpServletResponse {

public MyHelperClass getWriter(){ return null; }
	public MyHelperClass setStatus(MyHelperClass o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}
