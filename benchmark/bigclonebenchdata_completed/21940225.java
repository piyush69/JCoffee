


class c21940225 {

    public void echo(HttpRequest request, HttpResponse response) throws IOException {
        InputStream in =(InputStream)(Object) request.getInputStream();
        if ("gzip".equals(request.getField("Content-Encoding"))) {
            in =(InputStream)(Object) new GZIPInputStream(in);
        }
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(in, response.getOutputStream());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, MyHelperClass o1){ return null; }}

class HttpRequest {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getField(String o0){ return null; }}

class HttpResponse {

public MyHelperClass getOutputStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class GZIPInputStream {

GZIPInputStream(InputStream o0){}
	GZIPInputStream(){}}
