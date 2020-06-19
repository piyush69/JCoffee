


class c8075980 {
public MyHelperClass tryOpenConnection(String o0){ return null; }

    public byte[] getDataAsByteArray(String url) {
        try {
            byte[] dat = null;
            URLConnection urlc;
            if (!url.toUpperCase().startsWith("HTTP://") && !url.toUpperCase().startsWith("HTTPS://")) {
                urlc =(URLConnection)(Object) tryOpenConnection(url);
            } else {
                urlc =(URLConnection)(Object) (new URL(url).openConnection());
            }
            urlc.setUseCaches(false);
            urlc.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            urlc.setRequestProperty("User-Agent", "Mozilla/5.0 (X11; U; Linux x86_64; en-GB; rv:1.9.1.9) Gecko/20100414 Iceweasel/3.5.9 (like Firefox/3.5.9)");
            urlc.setRequestProperty("Accept-Encoding", "gzip");
            InputStream is =(InputStream)(Object) urlc.getInputStream();
            int len =(int)(Object) urlc.getContentLength();
            if (len < 0) {
                ByteArrayOutputStream bao = new ByteArrayOutputStream();
                byte[] buf = new byte[4096];
                for (; ; ) {
                    int nb =(int)(Object) is.read(buf);
                    if (nb <= 0) break;
                    bao.write(buf, 0, nb);
                }
                dat =(byte[])(Object) bao.toByteArray();
                bao.close();
            } else {
                dat = new byte[len];
                int i = 0;
                while (i < len) {
                    int n =(int)(Object) is.read(dat, i, len - i);
                    if (n <= 0) break;
                    i += n;
                }
            }
            is.close();
            return dat;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass toByteArray(){ return null; }
	public MyHelperClass close(){ return null; }}
