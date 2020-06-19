


class c7631406 {
public static MyHelperClass getResource(String o0){ return null; }
//public MyHelperClass getResource(String o0){ return null; }

    public static InputStream getResourceAsStream(final String fileName) {
        if ((fileName.indexOf("file:") >= 0) || (fileName.indexOf(":/") > 0)) {
            try {
                URL url = new URL(fileName);
                return (InputStream)(Object)new BufferedInputStream(url.openStream());
            } catch (Exception e) {
                return null;
            }
        }
        return (InputStream)(Object)new ByteArrayInputStream(getResource(fileName).getData());
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
