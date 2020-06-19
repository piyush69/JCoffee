


class c22726124 {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:9090/node/Insert/" + args[0] + "?address=blah");
        URLConnection conn =(URLConnection)(Object) url.openConnection();
        conn.setDoOutput(true);
        OutputStream os =(OutputStream)(Object) conn.getOutputStream();
        MyHelperClass Conduit = new MyHelperClass();
        Conduit.pump((InputStream)(Object)System.in, os);
//        MyHelperClass Conduit = new MyHelperClass();
        Conduit.pump((InputStream)(Object)conn.getInputStream(),(OutputStream)(Object) System.out);
        System.out.println("done");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass pump(InputStream o0, OutputStream o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class OutputStream {

}

class InputStream {

}
