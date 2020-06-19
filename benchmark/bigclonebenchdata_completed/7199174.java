


class c7199174 {
public static MyHelperClass getToken(){ return null; }
//public MyHelperClass getToken(){ return null; }

    public static BufferedInputStream getEventAttacchment(final String url) throws IOException {
        int slashIndex = url.lastIndexOf("/");
        MyHelperClass URLEncoder = new MyHelperClass();
        String encodedUrl = url.substring(0, slashIndex + 1) + URLEncoder.encode(url.substring(slashIndex + 1), "UTF-8");
        String urlwithtoken = encodedUrl + "?ticket=" + getToken();
        BufferedInputStream in = new BufferedInputStream(new URL(urlwithtoken).openStream());
        return in;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(String o0, String o1){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}
