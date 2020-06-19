


class c10667866 {

    private Bitmap fetchImage(String urlstr) throws Exception {
        URL url;
        url = new URL(urlstr);
        HttpURLConnection c = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        c.setDoInput(true);
        c.setRequestProperty("User-Agent", "Agent");
        c.connect();
        InputStream is =(InputStream)(Object) c.getInputStream();
        Bitmap img;
        MyHelperClass BitmapFactory = new MyHelperClass();
        img =(Bitmap)(Object) BitmapFactory.decodeStream(is);
        return img;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass decodeStream(InputStream o0){ return null; }}

class Bitmap {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }}

class InputStream {

}
