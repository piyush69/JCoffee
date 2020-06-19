


class c6158845 {
public MyHelperClass NetUtils;
	public MyHelperClass getHead(String o0, String o1){ return null; }

    private void serveRedir(OutputStream os, IRequest req) throws IOException {
        String urlString =(String)(Object) req.getParameter("url");
        URL url = new URL(urlString);
        URLConnection con =(URLConnection)(Object) url.openConnection();
        InputStream is =(InputStream)(Object) new BufferedInputStream(con.getInputStream());
        String ct =(String)(Object) con.getContentType();
        int cl =(int)(Object) con.getContentLength();
        String jsLink = "<script language=\"JavaScript1.2\" src=\"/tddt.js\" type='text/javascript'></script>\n";
        int i;
        String head =(String)(Object) getHead("HTTP/1.0 200 OK", "Content-Type: " + ct + "\nContent-Length: -1");
        os.write(head.getBytes());
        if (ct != null && ct.indexOf("html") != -1) {
            os.write(jsLink.getBytes());
            NetUtils.saveChangeLink(url, os);
        } else {
            int len;
            byte[] b = new byte[1024];
            while ((len =(int)(Object) is.read(b)) >= 0) {
                os.write(b, 0, len);
            }
        }
        os.flush();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass saveChangeLink(URL o0, OutputStream o1){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class IRequest {

public MyHelperClass getParameter(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getContentType(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}}
