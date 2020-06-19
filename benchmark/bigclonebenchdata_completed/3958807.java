


class c3958807 {
public MyHelperClass getCargo(){ return null; }
	public MyHelperClass getContentType(HttpServletRequest o0, String o1){ return null; }

        private void loadBinaryStream(String streamName, InputStream streamToLoad, long sz, HttpServletRequest req, HttpServletResponse resp) throws IOException {
            resp.setContentType(getContentType(req, streamName));
            resp.setHeader("Content-Disposition", "inline;filename=" + streamName);
            resp.setContentLength((int) sz);
            OutputStream out =(OutputStream)(Object) resp.getOutputStream();
            BufferedOutputStream bos = new BufferedOutputStream(out, 2048);
            try {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(streamToLoad, bos);
            } finally {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(streamToLoad);
//                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(bos);
            }
            MyHelperClass GWT_ENTRY_POINT_PAGE_PARAM = new MyHelperClass();
            getCargo().put(GWT_ENTRY_POINT_PAGE_PARAM, null);
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass put(MyHelperClass o0, Object o1){ return null; }
	public MyHelperClass copy(InputStream o0, BufferedOutputStream o1){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass closeQuietly(BufferedOutputStream o0){ return null; }}

class InputStream {

}

class HttpServletRequest {

}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentLength(int o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }
	public MyHelperClass setContentType(MyHelperClass o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class OutputStream {

}

class BufferedOutputStream {

BufferedOutputStream(OutputStream o0, int o1){}
	BufferedOutputStream(){}}
