


class c9440627 {
public MyHelperClass log;
	public MyHelperClass getServlet(MSServletRequest o0){ return null; }

    protected URLConnection openConnection(URL url) throws IOException {
        MyHelperClass Level = new MyHelperClass();
        log.log(Level.FINE, url.toString());
        MSServletRequest urlManager = new MSServletRequest(url);
        MicroServlet servlet =(MicroServlet)(Object) getServlet(urlManager);
        return ((URLConnection)(Object)new MSConnection(url, servlet, urlManager));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FINE;
public MyHelperClass log(MyHelperClass o0, String o1){ return null; }}

class URL {

}

class URLConnection {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class MSServletRequest {

MSServletRequest(){}
	MSServletRequest(URL o0){}}

class MicroServlet {

}

class MSConnection {

MSConnection(URL o0, MicroServlet o1, MSServletRequest o2){}
	MSConnection(){}}
