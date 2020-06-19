


class c19307122 {

    public static byte[] sendParamPost(String urlString, String param) {
        try {
            URL url = new URL(urlString + "?" + param);
            HttpURLConnection urlConn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            urlConn.setDoOutput(true);
            urlConn.setDefaultUseCaches(false);
            urlConn.setDoInput(true);
            urlConn.setRequestMethod("POST");
            urlConn.connect();
            OutputStream ops =(OutputStream)(Object) urlConn.getOutputStream();
            ops.close();
            InputStream is =(InputStream)(Object) urlConn.getInputStream();
            byte[] resultBytes = new byte[(int)(Object)urlConn.getContentLength()];
            byte[] tempByte = new byte[1024];
            int length = 0;
            int index = 0;
            while ((length =(int)(Object) is.read(tempByte)) != -1) {
                System.arraycopy(tempByte, 0, resultBytes, index, length);
                index += length;
            }
            is.close();
            return resultBytes;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass setDefaultUseCaches(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getContentLength(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
