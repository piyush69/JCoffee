


class c18924485 {

    public void processExplicitSchemaAndWSDL(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        MyHelperClass configContext = new MyHelperClass();
        HashMap services =(HashMap)(Object) configContext.getAxisConfiguration().getServices();
        String filePart = req.getRequestURL().toString();
        String schema = filePart.substring(filePart.lastIndexOf("/") + 1, filePart.length());
        if ((services != null) && !(Boolean)(Object)services.isEmpty()) {
            Iterator i =(Iterator)(Object) services.values().iterator();
            while ((boolean)(Object)i.hasNext()) {
                AxisService service = (AxisService)(AxisService)(Object) i.next();
                InputStream stream =(InputStream)(Object) service.getClassLoader().getResourceAsStream("META-INF/" + schema);
                if (stream != null) {
                    OutputStream out =(OutputStream)(Object) res.getOutputStream();
                    res.setContentType("text/xml");
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(stream, out, true);
                    return;
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getAxisConfiguration(){ return null; }
	public MyHelperClass getResourceAsStream(String o0){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1, boolean o2){ return null; }
	public MyHelperClass getServices(){ return null; }}

class HttpServletRequest {

public MyHelperClass getRequestURL(){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class HashMap {

public MyHelperClass values(){ return null; }
	public MyHelperClass isEmpty(){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class AxisService {

public MyHelperClass getClassLoader(){ return null; }}

class InputStream {

}

class OutputStream {

}
