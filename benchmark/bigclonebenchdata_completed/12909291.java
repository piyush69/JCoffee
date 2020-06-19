


class c12909291 {
public MyHelperClass getOutputStream(HttpServletResponse o0){ return null; }
	public MyHelperClass getGraphStream(HttpServletRequest o0){ return null; }

    public void render(Map model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        MyHelperClass s_contentType = new MyHelperClass();
        response.setContentType(s_contentType);
        response.setHeader("Cache-control", "no-cache");
        InputStream graphStream =(InputStream)(Object) getGraphStream(request);
        OutputStream out =(OutputStream)(Object) getOutputStream(response);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(graphStream, out);
        out.flush();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class Map {

}

class HttpServletRequest {

}

class HttpServletResponse {

public MyHelperClass setContentType(MyHelperClass o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class InputStream {

}

class OutputStream {

public MyHelperClass flush(){ return null; }}
