


class c22870704 {

    public static byte[] readHTTPFile(String url, StringBuffer contentType, StringBuffer encoding) {
        try {
            URL u = new URL(url);
            URLConnection urlConn =(URLConnection)(Object) u.openConnection();
            urlConn.setReadTimeout(10 * 1000);
            urlConn.setConnectTimeout(10 * 1000);
            urlConn.setDoInput(true);
            urlConn.setDoOutput(false);
            String status =(String)(Object) urlConn.getHeaderField(null).toLowerCase();
            String location =(String)(Object) urlConn.getHeaderField("Location");
            String cookie =(String)(Object) urlConn.getHeaderField("Set-Cookie");
            int times = 0;
            MyHelperClass HelperStd = new MyHelperClass();
            while ((status.indexOf("http/1.1 3") >= 0 || status.indexOf("http/1.0 3") >= 0) && !(Boolean)(Object)HelperStd.isEmpty(location)) {
//                MyHelperClass HelperStd = new MyHelperClass();
                if (!(Boolean)(Object)HelperStd.isEmpty((String)(Object)urlConn.getHeaderField("Set-Cookie"))) cookie =(String)(Object) urlConn.getHeaderField("Set-Cookie");
                u = new URL(location);
                urlConn =(URLConnection)(Object) u.openConnection();
                urlConn.setReadTimeout(10 * 1000);
                urlConn.setConnectTimeout(10 * 1000);
                urlConn.setDoInput(true);
                urlConn.setDoOutput(false);
                urlConn.setRequestProperty("Cookie", cookie);
                status =(String)(Object) urlConn.getHeaderField(null).toLowerCase();
                location =(String)(Object) urlConn.getHeaderField("Location");
                times++;
                if (times > 10) break;
            }
            System.out.println(urlConn.getHeaderField(null) + ":" + urlConn.getContentLength() + ":" + u);
            if (contentType != null) contentType.append(urlConn.getContentType());
            if (encoding != null) {
                String enc = null, ct =(String)(Object) urlConn.getContentType();
                if (ct != null && ct.indexOf("charset=") > 0) {
                    int a = ct.indexOf("charset=") + "charset=".length();
                    enc = ct.substring(a);
                }
                if (enc == null) enc =(String)(Object) urlConn.getContentEncoding();
                if (enc == null) enc = "ISO-8859-1";
                encoding.append(enc);
            }
            BufferedInputStream in = new BufferedInputStream(urlConn.getInputStream());
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            byte[] b = new byte[1024];
            int read = 0;
            while (read != -1) {
                read =(int)(Object) in.read(b);
                if (read > 0) bout.write(b, 0, read);
            }
            in.close();
            System.out.println(bout.size());
            return(byte[])(Object) bout.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("readHTTPFile:" + e.getMessage() + "," + url);
        }
        return new byte[0];
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isEmpty(String o0){ return null; }
	public MyHelperClass toLowerCase(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setReadTimeout(int o0){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getContentEncoding(){ return null; }
	public MyHelperClass getHeaderField(String o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getHeaderField(Object o0){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass toByteArray(){ return null; }}
