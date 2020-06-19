


class c5636184 {
public static MyHelperClass lf;
	public static MyHelperClass getHostURL(){ return null; }
//public MyHelperClass lf;
//	public MyHelperClass getHostURL(){ return null; }

    public static Element postMessage() throws Exception {
        final URL theUrl =(URL)(Object) getHostURL();
        lf.debug("url = " + theUrl.toExternalForm());
        final HttpURLConnection urlConn = (HttpURLConnection)(HttpURLConnection)(Object) (theUrl).openConnection();
        urlConn.setRequestMethod("POST");
        urlConn.setDoInput(true);
        urlConn.setDoOutput(true);
        final BufferedOutputStream bos = new BufferedOutputStream(urlConn.getOutputStream());
        final InputStream bis =(InputStream)(Object) urlConn.getInputStream();
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final byte[] buffer = new byte[1024];
        int count = 0;
        while ((count =(int)(Object) bis.read(buffer)) > -1) {
            baos.write(buffer, 0, count);
        }
        final SAXBuilder sb = new SAXBuilder();
        lf.debug("Received XML response from server: " + baos.toString());
        return(Element)(Object) sb.build(new StringReader(baos.toString())).getRootElement();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getRootElement(){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class Element {

}

class URL {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass toExternalForm(){ return null; }}

class HttpURLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(MyHelperClass o0){}
	BufferedOutputStream(){}}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class SAXBuilder {

public MyHelperClass build(StringReader o0){ return null; }}

class StringReader {

StringReader(String o0){}
	StringReader(){}}
