


class c19944445 {
public MyHelperClass prepareHttpUrlConnection(HttpURLConnection o0){ return null; }

        protected boolean hasOsmTileETag(String eTag) throws IOException {
            URL url;
            MyHelperClass tile = new MyHelperClass();
            url = new URL(tile.getUrl());
            HttpURLConnection urlConn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            prepareHttpUrlConnection(urlConn);
            urlConn.setRequestMethod("HEAD");
            urlConn.setReadTimeout(30000);
            String osmETag =(String)(Object) urlConn.getHeaderField("ETag");
            if (osmETag == null) return true;
            return (osmETag.equals(eTag));
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getUrl(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass getHeaderField(String o0){ return null; }
	public MyHelperClass setReadTimeout(int o0){ return null; }}
