


class c15826301 {

    public static int getContentLength(String address) {
        URLConnection conn = null;
        int contentLength = 0;
        try {
            URL url = new URL(address);
            conn =(URLConnection)(Object) url.openConnection();
            contentLength =(int)(Object) conn.getContentLength();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contentLength;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}
