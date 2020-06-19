


class c16056489 {
public MyHelperClass getMimeType(String o0){ return null; }

    private void streamBinaryData(String urlstr, String format, ServletOutputStream outstr, HttpServletResponse resp) {
        String ErrorStr = null;
        try {
            resp.setContentType(getMimeType(format));
            BufferedInputStream bis = null;
            BufferedOutputStream bos = null;
            try {
                URL url = new URL(urlstr);
                URLConnection urlc =(URLConnection)(Object) url.openConnection();
                int length =(int)(Object) urlc.getContentLength();
                resp.setContentLength(length);
                InputStream in =(InputStream)(Object) urlc.getInputStream();
                bis = new BufferedInputStream(in);
                bos = new BufferedOutputStream(outstr);
                byte[] buff = new byte[length];
                int bytesRead;
                while (-1 != (bytesRead =(int)(Object) bis.read(buff, 0, buff.length))) {
                    bos.write(buff, 0, bytesRead);
                }
            } catch (Exception e) {
                e.printStackTrace();
                ErrorStr = "Error Streaming the Data";
                outstr.print(ErrorStr);
            } finally {
                if (bis != null) {
                    bis.close();
                }
                if (bos != null) {
                    bos.close();
                }
                if (outstr != null) {
                    outstr.flush();
                    outstr.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ServletOutputStream {

public MyHelperClass print(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class HttpServletResponse {

public MyHelperClass setContentLength(int o0){ return null; }
	public MyHelperClass setContentType(MyHelperClass o0){ return null; }}

class BufferedInputStream {

BufferedInputStream(InputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(){}
	BufferedOutputStream(ServletOutputStream o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStream {

}
