


class c21316706 {
public MyHelperClass getDefaultPort(){ return null; }

//    @Override
    protected URLConnection openConnection(URL url, Proxy proxy) throws IOException {
        if ((url == null) || (proxy == null)) {
            MyHelperClass Messages = new MyHelperClass();
            throw new IllegalArgumentException((String)(Object)Messages.getString("luni.1B"));
        }
        return (URLConnection)(Object)new HttpsURLConnectionImpl(url, getDefaultPort(), proxy);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getString(String o0){ return null; }}

class URL {

}

class Proxy {

}

class URLConnection {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpsURLConnectionImpl {

HttpsURLConnectionImpl(){}
	HttpsURLConnectionImpl(URL o0, MyHelperClass o1, Proxy o2){}}
