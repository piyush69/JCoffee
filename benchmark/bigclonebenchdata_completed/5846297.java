


class c5846297 {
public MyHelperClass prepareHttpUrlConnection(HttpURLConnection o0){ return null; }

    protected HttpURLConnection loadTileFromOsm(Tile tile) throws IOException {
        URL url;
        url = new URL(tile.getUrl());
        HttpURLConnection urlConn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        prepareHttpUrlConnection(urlConn);
        urlConn.setReadTimeout(30000);
        return urlConn;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Tile {

public MyHelperClass getUrl(){ return null; }}

class HttpURLConnection {

public MyHelperClass setReadTimeout(int o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}
