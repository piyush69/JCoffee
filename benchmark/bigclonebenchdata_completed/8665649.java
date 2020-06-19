


class c8665649 {

    private BufferedImage _getImage(String urlStr) throws IOException {
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        conn.connect();
        InputStream in = null;
        try {
            in =(InputStream)(Object) conn.getInputStream();
            MyHelperClass ImageIO = new MyHelperClass();
            return(BufferedImage)(Object) ImageIO.read(in);
        } finally {
            MyHelperClass IOUtilities = new MyHelperClass();
            IOUtilities.close(in);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass close(InputStream o0){ return null; }
	public MyHelperClass read(InputStream o0){ return null; }}

class BufferedImage {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class InputStream {

}
