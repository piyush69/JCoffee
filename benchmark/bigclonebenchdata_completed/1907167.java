
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1907167 {

    private void sendData(HttpServletResponse response, MediaBean mediaBean) throws IOException {
        MyHelperClass logger = new MyHelperClass();
        if ((boolean)(Object)logger.isInfoEnabled()) logger.info("sendData[" + mediaBean + "]");
        response.setContentLength(mediaBean.getContentLength());
        response.setContentType(mediaBean.getContentType());
        response.addHeader("Last-Modified",(String)(Object) mediaBean.getLastMod());
        response.addHeader("Cache-Control", "must-revalidate");
        response.addHeader("content-disposition", "attachment, filename=" + (new Date()).getTime() + "_" + mediaBean.getFileName());
        byte[] content =(byte[])(Object) mediaBean.getContent();
        InputStream is = null;
        OutputStream os = null;
        try {
            os =(OutputStream)(Object) response.getOutputStream();
            is =(InputStream)(Object) new ByteArrayInputStream(content);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(is, os);
        } catch (UncheckedIOException e) {
//            MyHelperClass logger = new MyHelperClass();
            logger.error((IOException)(Object)e,(IOException)(Object) e);
        } finally {
            if (is != null) try {
                is.close();
            } catch (UncheckedIOException e) {
            }
            if (os != null) try {
                os.close();
            } catch (UncheckedIOException e) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(IOException o0, IOException o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass isInfoEnabled(){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass addHeader(String o0, String o1){ return null; }
	public MyHelperClass setContentType(MyHelperClass o0){ return null; }
	public MyHelperClass setContentLength(MyHelperClass o0){ return null; }}

class MediaBean {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass getFileName(){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getLastMod(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Date {

public MyHelperClass getTime(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(byte[] o0){}}
