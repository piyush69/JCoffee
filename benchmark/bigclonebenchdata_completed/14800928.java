


class c14800928 {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/plain;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        HttpURLConnection httpConn = null;
        byte[] result = null;
        try {
            MyHelperClass HttpUtil = new MyHelperClass();
            byte[] bytes =(byte[])(Object) HttpUtil.getHttpURLReturnData(request);
            if (-1 == bytes.length || 23 > bytes.length) throw new Exception();
            MyHelperClass MsgPrint = new MyHelperClass();
            MsgPrint.showMsg("========byte length" + bytes.length);
            String userTag =(String)(Object) request.getParameter("userTag");
            String isEncrypt =(String)(Object) request.getParameter("isEncrypt");
            MyHelperClass ProtocolContanst = new MyHelperClass();
            URL httpurl = new URL(ProtocolContanst.TRANSFERS_URL + userTag + "&isEncrypt=" + isEncrypt);
            httpConn = (HttpURLConnection)(HttpURLConnection)(Object) httpurl.openConnection();
            httpConn.setDoOutput(true);
            httpConn.setRequestProperty("Content-Length", String.valueOf(bytes.length));
            OutputStream outputStream =(OutputStream)(Object) httpConn.getOutputStream();
            outputStream.write(bytes);
            outputStream.close();
            InputStream is =(InputStream)(Object) httpConn.getInputStream();
            if (0 >= (int)(Object)httpConn.getContentLength()) {
                throw new Exception();
            }
            byte[] resultBytes = new byte[(int)(Object)httpConn.getContentLength()];
            byte[] tempByte = new byte[1024];
            int length = 0;
            int index = 0;
            while ((length =(int)(Object) is.read(tempByte)) != -1) {
                System.arraycopy(tempByte, 0, resultBytes, index, length);
                index += length;
            }
            is.close();
            result = resultBytes;
        } catch (Exception e) {
        }
        ServletOutputStream sos =(ServletOutputStream)(Object) response.getOutputStream();
        if (null != result) {
            response.setContentLength(result.length);
            sos.write(result);
        } else {
            response.setContentLength(26);
            sos.write(new byte[] { 48, 48, 55, -23, 3, 56, 49, 54, 57, 55, 49, 51, 54, 72, 71, 52, 48, 1, 3, 3, 48, 48, 48, 48, 48, 48 });
        }
        sos.flush();
        sos.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TRANSFERS_URL;
public MyHelperClass getHttpURLReturnData(HttpServletRequest o0){ return null; }
	public MyHelperClass showMsg(String o0){ return null; }}

class HttpServletRequest {

public MyHelperClass setCharacterEncoding(String o0){ return null; }
	public MyHelperClass getParameter(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentLength(int o0){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ServletOutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass flush(){ return null; }}
