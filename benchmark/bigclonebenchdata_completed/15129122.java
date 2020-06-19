


class c15129122 {
public MyHelperClass uc;
	public MyHelperClass responseMessage;
public MyHelperClass url;
	public MyHelperClass logger;

    public void doGet(OutputStream os) throws IOException {
        try {
            HttpURLConnection uc;// = new HttpURLConnection();
            uc = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            MyHelperClass USER_AGENT = new MyHelperClass();
            uc.setRequestProperty("User-Agent", USER_AGENT);
            MyHelperClass READ_TIMEOUT = new MyHelperClass();
            uc.setReadTimeout(READ_TIMEOUT);
//            MyHelperClass uc = new MyHelperClass();
            logger.debug("Connect timeout=" + uc.getConnectTimeout() + " read timeout=" + uc.getReadTimeout() + " u=" + url);
//            MyHelperClass uc = new MyHelperClass();
            InputStream buffer =(InputStream)(Object) new BufferedInputStream(uc.getInputStream());
            int c;
            while ((c =(int)(Object) buffer.read()) != -1) {
                os.write(c);
            }
            MyHelperClass headers = new MyHelperClass();
            headers = uc.getHeaderFields();
            MyHelperClass status = new MyHelperClass();
            status = uc.getResponseCode();
            MyHelperClass responseMessage = new MyHelperClass();
            responseMessage = uc.getResponseMessage();
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        } finally {
            MyHelperClass status = new MyHelperClass();
            if ((int)(Object)status != 200) logger.error("Download failed status: " + status + " " + responseMessage + " for " + url); else logger.debug("HTTP status=" + status + " " + uc.getResponseMessage());
            os.close();
            MyHelperClass uc = new MyHelperClass();
            uc.disconnect();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getConnectTimeout(){ return null; }
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getResponseMessage(){ return null; }
	public MyHelperClass getReadTimeout(){ return null; }
	public MyHelperClass setRequestProperty(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getHeaderFields(){ return null; }
	public MyHelperClass setReadTimeout(MyHelperClass o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}

class OutputStream {

public MyHelperClass write(int o0){ return null; }
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(){ return null; }}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(MyHelperClass o0){}}

class HttpURLConnection {

public MyHelperClass getConnectTimeout(){ return null; }
	public MyHelperClass getResponseMessage(){ return null; }
	public MyHelperClass getReadTimeout(){ return null; }
	public MyHelperClass setRequestProperty(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass getHeaderFields(){ return null; }
	public MyHelperClass setReadTimeout(MyHelperClass o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}
