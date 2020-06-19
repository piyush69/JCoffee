


class c2009072 {

    public InputStream openInput(Fragment path) throws IOException {
        int len =(int)(Object) path.words().size();
        MyHelperClass Util = new MyHelperClass();
        String p =(String)(Object) Util.combine("/", path.words().subList(1, len));
        URL url = new URL("http", path.words().get(0), p);
        InputStream result =(InputStream)(Object) url.openStream();
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass subList(int o0, int o1){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass combine(String o0, MyHelperClass o1){ return null; }}

class Fragment {

public MyHelperClass words(){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0, MyHelperClass o1, String o2){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}
