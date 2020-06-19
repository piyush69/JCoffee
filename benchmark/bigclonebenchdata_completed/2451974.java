


class c2451974 {

//    @Override
    public void doHandler(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if ((int)(Object)request.getRequestURI().indexOf("png") != -1) {
            response.setContentType("image/png");
        } else if ((int)(Object)request.getRequestURI().indexOf("gif") != -1) {
            response.setContentType("image/gif");
        } else {
            response.setContentType("image/x-icon");
        }
        BufferedOutputStream bos = new BufferedOutputStream(response.getOutputStream());
        try {
            MyHelperClass configCenter = new MyHelperClass();
            URL url = new URL("http://" + configCenter.getUcoolOnlineIp() + request.getRequestURI());
            BufferedInputStream in = new BufferedInputStream(url.openStream());
            byte[] data = new byte[4096];
            int size =(int)(Object) in.read(data);
            while (size != -1) {
                bos.write(data, 0, size);
                size =(int)(Object) in.read(data);
            }
            in.close();
            bos.flush();
            bos.close();
            in.close();
        } catch (Exception e) {
        }
        bos.flush();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass indexOf(String o0){ return null; }
	public MyHelperClass getUcoolOnlineIp(){ return null; }}

class HttpServletRequest {

public MyHelperClass getRequestURI(){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class BufferedOutputStream {

BufferedOutputStream(){}
	BufferedOutputStream(MyHelperClass o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
