


class c11651293 {

    public void render(final HttpServletRequest request, final HttpServletResponse response, final byte[] bytes, final Throwable t, final String contentType, final String encoding) throws Exception {
        if (contentType != null) {
            response.setContentType(contentType);
        }
        if (encoding != null) {
            response.setCharacterEncoding(encoding);
        }
        response.setContentLength(bytes.length);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(new ByteArrayInputStream(bytes), response.getOutputStream());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(ByteArrayInputStream o0, MyHelperClass o1){ return null; }}

class HttpServletRequest {

}

class HttpServletResponse {

public MyHelperClass setCharacterEncoding(String o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentLength(int o0){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(byte[] o0){}}
