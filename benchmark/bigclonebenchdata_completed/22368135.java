


class c22368135 {
public static MyHelperClass b2s(boolean o0){ return null; }
//public MyHelperClass b2s(boolean o0){ return null; }

    private static void testIfModified() throws IOException {
        MyHelperClass url = new MyHelperClass();
        HttpURLConnection c2 = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        c2.setIfModifiedSince(System.currentTimeMillis() + 1000);
        c2.connect();
        int code =(int)(Object) c2.getResponseCode();
        System.out.print("If-Modified-Since     : ");
        boolean supported = (code == 304);
        System.out.println(b2s(supported) + " - " + code + " (" + c2.getResponseMessage() + ")");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpURLConnection {

public MyHelperClass getResponseMessage(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass setIfModifiedSince(long o0){ return null; }}
