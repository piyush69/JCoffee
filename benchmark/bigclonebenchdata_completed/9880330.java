


class c9880330 {

    protected static String stringOfUrl(String addr) throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        URL url = new URL(addr);
        URLConnection c =(URLConnection)(Object) url.openConnection();
        c.setConnectTimeout(2000);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(c.getInputStream(), output);
        return output.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(MyHelperClass o0, ByteArrayOutputStream o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ByteArrayOutputStream {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }}
