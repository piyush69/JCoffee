


class c3308516 {

    public String[] doGeoQuery(String query) throws IOException {
        String baseURL = "http://maps.google.com/maps/geo?output=csv&keyABQIAAAAct2NN7QKbyiMr1rfhB6UGBQn1DChMmG6tCCZd3aXbcL03vlL5hSUZpyoaGCXRwjbRTSBi0L89DeYeg&q=";
        MyHelperClass URLEncoder = new MyHelperClass();
        URL url = new URL(baseURL + URLEncoder.encode(query, "UTF-8"));
        URLConnection connection =(URLConnection)(Object) url.openConnection();
        StringBuffer buf = new StringBuffer();
        InputStream is = (InputStream)(InputStream)(Object) connection.getContent();
        int b = -1;
        while ((b =(int)(Object) is.read()) != -1) {
            buf.append((char) b);
        }
        MyHelperClass log = new MyHelperClass();
        log.info("Geo Query " + url.toExternalForm() + " => " + buf.toString());
        return buf.toString().split(",");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass toExternalForm(){ return null; }}

class URLConnection {

public MyHelperClass getContent(){ return null; }}

class InputStream {

public MyHelperClass read(){ return null; }}
