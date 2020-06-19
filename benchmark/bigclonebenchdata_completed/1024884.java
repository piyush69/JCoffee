
import java.io.UncheckedIOException;


class c1024884 {
public MyHelperClass getRequestMethod(){ return null; }

//    @Override
    protected URLConnection openConnection(URL url) throws IOException {
        try {
            final HttpServlet servlet;
            String path =(String)(Object) url.getPath();
            if (path.matches("reg:.+")) {
                String registerName = path.replaceAll("reg:([^/]*)/.*", "$1");
                MyHelperClass register = new MyHelperClass();
                servlet =(HttpServlet)(Object) register.get(registerName);
                if (servlet == null) throw new RuntimeException("No servlet registered with name " + registerName);
            } else {
                String servletClassName = path.replaceAll("([^/]*)/.*", "$1");
                servlet = (HttpServlet) Class.forName(servletClassName).newInstance();
            }
            final MockHttpServletRequest req =(MockHttpServletRequest)(Object) (new MockHttpServletRequest().setMethod("GET"));
            final MockHttpServletResponse resp = new MockHttpServletResponse();
            return (URLConnection)(Object)new HttpURLConnection(url) {

//                @Override
                public int getResponseCode() throws IOException {
                    serviceIfNeeded();
                    return(int)(Object) resp.status;
                }

//                @Override
                public InputStream getInputStream() throws IOException {
                    serviceIfNeeded();
                    if ((int)(Object)resp.status == 500) throw new IOException("Server responded with error 500");
                    byte[] array =(byte[])(Object) resp.out.toByteArray();
                    return (InputStream)(Object)new ByteArrayInputStream(array);
                }

//                @Override
                public InputStream getErrorStream() {
                    try {
                        serviceIfNeeded();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    if ((int)(Object)resp.status != 500) return null;
                    return (InputStream)(Object)new ByteArrayInputStream((byte[])(Object)resp.out.toByteArray());
                }

//                @Override
                public OutputStream getOutputStream() throws IOException {
                    return(OutputStream)(Object) req.tmp;
                }

//                @Override
                public void addRequestProperty(String key, String value) {
                    req.addHeader(key, value);
                }

//                @Override
                public void connect() throws IOException {
                }

//                @Override
                public boolean usingProxy() {
                    return false;
                }

//                @Override
                public void disconnect() {
                }

                private boolean called;

                private void serviceIfNeeded() throws IOException {
                    try {
                        if (!called) {
                            called = true;
                            req.setMethod((String)(Object)getRequestMethod());
                            servlet.service(req, resp);
                        }
                    } catch (UncheckedIOException e) {
                        throw new RuntimeException(e);
                    }
                }
            };
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass toByteArray(){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class URL {

public MyHelperClass getPath(){ return null; }}

class URLConnection {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpServlet {

public MyHelperClass service(MockHttpServletRequest o0, MockHttpServletResponse o1){ return null; }}

class MockHttpServletRequest {
public MyHelperClass tmp;
public MyHelperClass setMethod(String o0){ return null; }
	public MyHelperClass addHeader(String o0, String o1){ return null; }}

class MockHttpServletResponse {
public MyHelperClass out;
	public MyHelperClass status;
}

class HttpURLConnection {

HttpURLConnection(){}
	HttpURLConnection(URL o0){}}

class InputStream {

}

class OutputStream {

}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(byte[] o0){}}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}
