


class c15115748 {

    public void render(final HttpServletRequest request, final HttpServletResponse response, InputStream inputStream, final Throwable t, final String contentType, final String encoding) throws Exception {
        if (contentType != null) {
            response.setContentType(contentType);
        }
        if (encoding != null) {
            response.setCharacterEncoding(encoding);
        }
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(inputStream, response.getOutputStream());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, MyHelperClass o1){ return null; }}

class HttpServletRequest {

}

class HttpServletResponse {

public MyHelperClass setCharacterEncoding(String o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }}

class InputStream {

}
