


class c1010770 {

    public static boolean urlStrIsDir(String urlStr) {
        if (urlStr.endsWith("/")) return true;
        int lastSlash = urlStr.lastIndexOf('/');
        int lastPeriod = urlStr.lastIndexOf('.');
        if (lastPeriod != -1 && (lastSlash == -1 || lastPeriod > lastSlash)) return false;
        String urlStrWithSlash = urlStr + "/";
        try {
            URL url = new URL(urlStrWithSlash);
            InputStream f =(InputStream)(Object) url.openStream();
            f.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}
