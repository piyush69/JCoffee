


class c3778979 {

    public void addURL(String urlSpec) throws IOException {
        URL url = new URL(urlSpec);
        MyHelperClass urls = new MyHelperClass();
        for (int i = 0; i < (int)(Object)urls.size(); i++) {
//            MyHelperClass urls = new MyHelperClass();
            if (((URL)(URL)(Object) urls.elementAt(i)).equals(url)) {
                MyHelperClass Logger = new MyHelperClass();
                Logger.logWarning("Attempt to add an URL twice: " + url);
                return;
            }
        }
        InputStream stream =(InputStream)(Object) url.openStream();
        stream.close();
//        MyHelperClass urls = new MyHelperClass();
        urls.addElement(urlSpec);
        MyHelperClass Logger = new MyHelperClass();
        Logger.logDebug("Added " + url);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass size(){ return null; }
	public MyHelperClass elementAt(int o0){ return null; }
	public MyHelperClass logWarning(String o0){ return null; }
	public MyHelperClass addElement(String o0){ return null; }
	public MyHelperClass logDebug(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}
