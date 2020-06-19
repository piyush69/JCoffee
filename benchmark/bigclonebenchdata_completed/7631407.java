


class c7631407 {
public static MyHelperClass getNotCacheResource(String o0){ return null; }
//public MyHelperClass getNotCacheResource(String o0){ return null; }

    public static InputStream getNotCacheResourceAsStream(final String fileName) {
        if ((fileName.indexOf("file:") >= 0) || (fileName.indexOf(":/") > 0)) {
            try {
                URL url = new URL(fileName);
                return (InputStream)(Object)new BufferedInputStream(url.openStream());
            } catch (Exception e) {
                return null;
            }
        }
        return (InputStream)(Object)new ByteArrayInputStream(getNotCacheResource(fileName).getData());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getData(){ return null; }}

class InputStream {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}}

class ByteArrayInputStream {

ByteArrayInputStream(MyHelperClass o0){}
	ByteArrayInputStream(){}}
