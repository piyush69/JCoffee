


class c10084530 {

    private InputStream urlToInputStream(URL url) throws IOException {
        URLConnection conn =(URLConnection)(Object) url.openConnection();
        MyHelperClass IE = new MyHelperClass();
        conn.setRequestProperty("User-Agent", IE);
        conn.setRequestProperty("Accept-Encoding", "gzip, deflate");
        conn.connect();
        String encoding =(String)(Object) conn.getContentEncoding();
        if ((encoding != null) && encoding.equalsIgnoreCase("gzip")) return (InputStream)(Object)new GZIPInputStream(conn.getInputStream()); else if ((encoding != null) && encoding.equalsIgnoreCase("deflate")) return (InputStream)(Object)new InflaterInputStream(conn.getInputStream(), new Inflater(true)); else return(InputStream)(Object) conn.getInputStream();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openConnection(){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setRequestProperty(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getContentEncoding(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class GZIPInputStream {

GZIPInputStream(MyHelperClass o0){}
	GZIPInputStream(){}}

class InflaterInputStream {

InflaterInputStream(MyHelperClass o0, Inflater o1){}
	InflaterInputStream(){}}

class Inflater {

Inflater(){}
	Inflater(boolean o0){}}
