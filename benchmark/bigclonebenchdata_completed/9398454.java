


class c9398454 {

    private static RemoteFile getRemoteFile(String url) {
        long size = 0;
        String realUrl = "";
        try {
            HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) (new URL(url)).openConnection();
            size =(long)(Object) conn.getContentLength();
            realUrl = conn.getURL().toString();
            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        RemoteFile rf = new RemoteFile(size, realUrl);
        return rf;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class RemoteFile {

RemoteFile(long o0, String o1){}
	RemoteFile(){}}

class HttpURLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass getURL(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}
