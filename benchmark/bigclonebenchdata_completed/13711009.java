


class c13711009 {

    public InputStream getInputStream() throws java.io.IOException {
        MyHelperClass _urlString = new MyHelperClass();
        if (!(Boolean)(Object)_urlString.endsWith("!/")) return this.getInputStream();
//        MyHelperClass _urlString = new MyHelperClass();
        URL url = new URL(_urlString.substring(4,(int)(Object) _urlString.length() - 2));
        return(InputStream)(Object) url.openStream();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass endsWith(String o0){ return null; }
	public MyHelperClass substring(int o0, int o1){ return null; }
	public MyHelperClass length(){ return null; }}

class InputStream {

}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}
