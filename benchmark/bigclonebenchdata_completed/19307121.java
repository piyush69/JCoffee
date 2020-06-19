


class c19307121 {

    public static byte[] sendSmsRequest(String url, String param) {
        byte[] bytes = null;
        try {
            URL httpurl = new URL(url);
            HttpURLConnection httpConn = (HttpURLConnection)(HttpURLConnection)(Object) httpurl.openConnection();
            httpConn.setRequestProperty("Accept-Language", "zh-CN");
            httpConn.setDoOutput(true);
            httpConn.setDoInput(true);
            PrintWriter out = new PrintWriter(httpConn.getOutputStream());
            out.print(param);
            out.flush();
            out.close();
            InputStream ism =(InputStream)(Object) httpConn.getInputStream();
            bytes = new byte[(int)(Object)httpConn.getContentLength()];
            ism.read(bytes);
            ism.close();
            MyHelperClass MsgPrint = new MyHelperClass();
            MsgPrint.showByteArray("result", bytes);
        } catch (Exception e) {
            return new byte[] { 0, 0, 0, 0 };
        }
        return bytes;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass showByteArray(String o0, byte[] o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class PrintWriter {

PrintWriter(){}
	PrintWriter(MyHelperClass o0){}
	public MyHelperClass print(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
