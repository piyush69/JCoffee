


class c3298293 {

    public static InputStream download_file(String sessionid, String key) {
        String urlString = "https://s2.cloud.cm/rpc/raw?c=Storage&m=download_file&key=" + key;
        try {
            URL url = new URL(urlString);
            MyHelperClass Log = new MyHelperClass();
            Log.d("current running function name:", "download_file");
            HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            conn.setRequestProperty("Cookie", "PHPSESSID=" + sessionid);
            conn.setRequestMethod("POST");
            conn.setDoInput(true);
            InputStream is =(InputStream)(Object) conn.getInputStream();
//            MyHelperClass Log = new MyHelperClass();
            Log.d("size of the picture file", "" + is.available());
            return is;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass d(String o0, String o1){ return null; }}

class InputStream {

public MyHelperClass available(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }}
