


class c16382503 {
public MyHelperClass openConnection(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass close(URLConnection o0){ return null; }
public MyHelperClass url;
	public MyHelperClass LOGGER;
	public MyHelperClass TransportFormat;
	public MyHelperClass headers;
	public MyHelperClass shouldMock(){ return null; }

    void copyTo(HttpServletRequest httpRequest, HttpServletResponse httpResponse) throws IOException {
        if ((boolean)(Object)shouldMock()) {
            return;
        }
        assert httpRequest != null;
        assert httpResponse != null;
        final long start = System.currentTimeMillis();
        try {
            final URLConnection connection =(URLConnection)(Object) openConnection(url, headers);
            connection.setRequestProperty("Accept-Language", httpRequest.getHeader("Accept-Language"));
            connection.connect();
            try {
                InputStream input =(InputStream)(Object) connection.getInputStream();
                if ("gzip".equals(connection.getContentEncoding())) {
                    input =(InputStream)(Object) new GZIPInputStream(input);
                }
                httpResponse.setContentType(connection.getContentType());
                TransportFormat.pump(input, httpResponse.getOutputStream());
            } finally {
                close(connection);
            }
        } finally {
            LOGGER.info("http call done in " + (System.currentTimeMillis() - start) + " ms for " + url);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass pump(InputStream o0, MyHelperClass o1){ return null; }
	public MyHelperClass info(String o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getHeader(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentType(MyHelperClass o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getContentEncoding(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStream {

}

class GZIPInputStream {

GZIPInputStream(InputStream o0){}
	GZIPInputStream(){}}
