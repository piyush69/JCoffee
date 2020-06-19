
import java.io.UncheckedIOException;


class c23264025 {

    private byte[] download(String URL) {
        byte[] result = null;
        HttpEntity httpEntity = null;
        try {
            HttpGet httpGet = new HttpGet(URL);
            httpGet.addHeader("Accept-Language", "zh-cn,zh,en");
            httpGet.addHeader("Accept-Encoding", "gzip,deflate");
            MyHelperClass httpClient = new MyHelperClass();
            HttpResponse response =(HttpResponse)(Object) httpClient.execute(httpGet);
            if ((int)(Object)response.getStatusLine().getStatusCode() != 200) {
                return null;
            }
            Header header =(Header)(Object) response.getFirstHeader("content-type");
            if (header == null ||(int)(Object) header.getValue().indexOf("text/html") < 0) {
                return null;
            }
            int pos =(int)(Object) header.getValue().indexOf("charset=");
            if (pos >= 0) {
                MyHelperClass detectedEncoding = new MyHelperClass();
                detectedEncoding = header.getValue().substring(pos + 8);
            }
            httpEntity =(HttpEntity)(Object) response.getEntity();
            InputStream in = null;
            in =(InputStream)(Object) httpEntity.getContent();
            header =(Header)(Object) response.getFirstHeader("Content-Encoding");
            if (null != header) {
                if ((int)(Object)header.getValue().indexOf("gzip") >= 0) {
                    in =(InputStream)(Object) new GZIPInputStream(in);
                } else if ((int)(Object)header.getValue().indexOf("deflate") >= 0) {
                    in =(InputStream)(Object) new InflaterInputStream(in, new Inflater(true));
                }
            }
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len =(int)(Object) in.read(buffer)) != -1) {
                out.write(buffer, 0, len);
            }
            result =(byte[])(Object) out.toByteArray();
        } catch (UncheckedIOException ex) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.warn("downloading error,abandon");
            result = null;
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass indexOf(String o0){ return null; }
	public MyHelperClass substring(int o0){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}
	public MyHelperClass addHeader(String o0, String o1){ return null; }}

class HttpResponse {

public MyHelperClass getFirstHeader(String o0){ return null; }
	public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class Header {

public MyHelperClass getValue(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}

class GZIPInputStream {

GZIPInputStream(InputStream o0){}
	GZIPInputStream(){}}

class InflaterInputStream {

InflaterInputStream(InputStream o0, Inflater o1){}
	InflaterInputStream(){}}

class Inflater {

Inflater(){}
	Inflater(boolean o0){}}

class ByteArrayOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass toByteArray(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
