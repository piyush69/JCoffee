


class c19645104 {

    public void write(HttpServletResponse res) throws MalformedURLException, IOException {
        MyHelperClass m_url = new MyHelperClass();
        if (m_url.equals("")) {
            return;
        }
//        MyHelperClass m_url = new MyHelperClass();
        URL url = new URL(m_url);
        URLConnection con =(URLConnection)(Object) url.openConnection();
        con.setUseCaches(false);
        MyHelperClass BUF_SIZE = new MyHelperClass();
        BufferedInputStream in = new BufferedInputStream(con.getInputStream(), BUF_SIZE);
        BufferedOutputStream out = new BufferedOutputStream(res.getOutputStream());
//        MyHelperClass BUF_SIZE = new MyHelperClass();
        byte[] buf = new byte[(int)(Object)BUF_SIZE];
        int size = 0;
        String contentType =(String)(Object) con.getContentType();
        if (contentType != null) {
            res.setContentType(con.getContentType());
        }
        while ((size =(int)(Object) in.read(buf)) > 0) {
            out.write(buf, 0, size);
        }
        out.flush();
        out.close();
        in.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentType(MyHelperClass o0){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getContentType(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0, MyHelperClass o1){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(){}
	BufferedOutputStream(MyHelperClass o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}
