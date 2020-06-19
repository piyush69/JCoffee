


class c5632808 {
public MyHelperClass transferStreams(MyHelperClass o0, OutputStream o1){ return null; }
public MyHelperClass setHeaders(HttpServletResponse o0){ return null; }
public MyHelperClass bufferSize;
	public MyHelperClass url;
	public MyHelperClass willDeflate(){ return null; }

//        @Override
        public void respondGet(HttpServletResponse resp) throws IOException {
            setHeaders(resp);
            final OutputStream os;
            if ((boolean)(Object)willDeflate()) {
                resp.setHeader("Content-Encoding", "gzip");
                os =(OutputStream)(Object) new GZIPOutputStream(resp.getOutputStream(), bufferSize);
            } else os =(OutputStream)(Object) resp.getOutputStream();
            transferStreams(url.openStream(), os);
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openStream(){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class OutputStream {

}

class GZIPOutputStream {

GZIPOutputStream(MyHelperClass o0, MyHelperClass o1){}
	GZIPOutputStream(){}}
