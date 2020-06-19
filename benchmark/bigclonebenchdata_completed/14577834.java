


class c14577834 {
public MyHelperClass LOGGER;

    private void delay(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        String url = request.getRequestURL().toString();
        MyHelperClass delayed = new MyHelperClass();
        if ((boolean)(Object)delayed.contains(url)) {
//            MyHelperClass delayed = new MyHelperClass();
            delayed.remove(url);
            MyHelperClass MessageFormat = new MyHelperClass();
            LOGGER.info((String)(Object)MessageFormat.format("Loading delayed resource at url = [{0}]", url));
            chain.doFilter(request, response);
        } else {
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.info("Returning resource = [LoaderApplication.swf]");
            InputStream input = null;
            OutputStream output = null;
            try {
                input =(InputStream)(Object) getClass().getResourceAsStream("LoaderApplication.swf");
                output =(OutputStream)(Object) response.getOutputStream();
//                MyHelperClass delayed = new MyHelperClass();
                delayed.add(url);
                response.setHeader("Cache-Control", "no-cache");
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(input, output);
            } finally {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(output);
//                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(input);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass add(String o0){ return null; }
	public MyHelperClass format(String o0, String o1){ return null; }
	public MyHelperClass contains(String o0){ return null; }
	public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass remove(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class HttpServletRequest {

public MyHelperClass getRequestURL(){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class FilterChain {

public MyHelperClass doFilter(HttpServletRequest o0, HttpServletResponse o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class OutputStream {

}
