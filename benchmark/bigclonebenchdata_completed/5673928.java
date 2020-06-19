


class c5673928 {
public MyHelperClass loadImage(Frame o0, InputStream o1, long o2, String o3){ return null; }

    void loadImage(Frame frame, URL url) throws Exception {
        URLConnection conn =(URLConnection)(Object) url.openConnection();
        String mimeType =(String)(Object) conn.getContentType();
        long length =(long)(Object) conn.getContentLength();
        InputStream is =(InputStream)(Object) conn.getInputStream();
        loadImage(frame, is, length, mimeType);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Frame {

}

class URL {

public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getContentType(){ return null; }}

class InputStream {

}
