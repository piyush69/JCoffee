


class c17956015 {
public MyHelperClass FILE_NAME;
	public MyHelperClass getServletContext(){ return null; }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/jar");
        MyHelperClass BUF_LEN = new MyHelperClass();
        byte[] bufor = new byte[(int)(Object)BUF_LEN];
        ServletContext context =(ServletContext)(Object) getServletContext();
        URL url =(URL)(Object) context.getResource(FILE_NAME);
        InputStream in =(InputStream)(Object) url.openStream();
        OutputStream out =(OutputStream)(Object) response.getOutputStream();
        while ((int)(Object)in.read(bufor) != -1) out.write(bufor);
        in.close();
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HttpServletRequest {

}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ServletContext {

public MyHelperClass getResource(MyHelperClass o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }}
