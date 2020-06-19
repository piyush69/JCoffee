


class c8075981 {
public MyHelperClass Charset;
	public MyHelperClass tryOpenConnection(String o0){ return null; }

    public char[] getDataAsCharArray(String url) {
        try {
            char[] dat = null;
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
            BufferedReader reader = new BufferedReader(new InputStreamReader(is, Charset.defaultCharset()));
            int len =(int)(Object) urlc.getContentLength();
            dat = new char[len];
            int i = 0;
            int c;
            while ((c =(int)(Object) reader.read()) != -1) {
                char character = (char) c;
                dat[i] = character;
                i++;
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

public MyHelperClass defaultCharset(){ return null; }}

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

public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass read(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0, MyHelperClass o1){}}
