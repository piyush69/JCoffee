
import java.io.UncheckedIOException;


class c960758 {

    public byte[] getBytesMethod(String url) {
        MyHelperClass logger = new MyHelperClass();
        logger.info("Facebook: @executing facebookGetMethod():" + url);
        byte[] responseBytes = null;
        try {
            HttpGet loginGet = new HttpGet(url);
            loginGet.addHeader("Accept-Encoding", "gzip");
            MyHelperClass httpClient = new MyHelperClass();
            HttpResponse response =(HttpResponse)(Object) httpClient.execute(loginGet);
            HttpEntity entity =(HttpEntity)(Object) response.getEntity();
//            MyHelperClass logger = new MyHelperClass();
            logger.trace("Facebook: getBytesMethod: " + response.getStatusLine());
            if (entity != null) {
                InputStream in =(InputStream)(Object) response.getEntity().getContent();
                if (response.getEntity().getContentEncoding().getValue().equals("gzip")) {
                    in =(InputStream)(Object) new GZIPInputStream(in);
                }
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                byte[] b = new byte[4096];
                int n;
                while ((n =(int)(Object) in.read(b)) != -1) {
                    out.write(b, 0, n);
                }
                responseBytes =(byte[])(Object) out.toByteArray();
                in.close();
                entity.consumeContent();
            }
            int statusCode =(int)(Object) response.getStatusLine().getStatusCode();
            if (statusCode != 200) {
//                MyHelperClass logger = new MyHelperClass();
                logger.warn("Facebook: Error Occured! Status Code = " + statusCode);
                responseBytes = null;
            }
//            MyHelperClass logger = new MyHelperClass();
            logger.info("Facebook: Get Bytes Method done(" + statusCode + "), response bytes length: " + (responseBytes == null ? 0 : responseBytes.length));
        } catch (UncheckedIOException e) {
//            MyHelperClass logger = new MyHelperClass();
            logger.warn("Facebook: ",(IOException)(Object) e);
        }
        return responseBytes;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass trace(String o0){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass warn(String o0, IOException o1){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass getContentEncoding(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getValue(){ return null; }}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}
	public MyHelperClass addHeader(String o0, String o1){ return null; }}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass consumeContent(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class GZIPInputStream {

GZIPInputStream(InputStream o0){}
	GZIPInputStream(){}}

class ByteArrayOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass toByteArray(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
