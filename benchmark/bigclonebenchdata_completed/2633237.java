


class c2633237 {

    public URL rawGetURLfromWebID(String id) {
        try {
            System.out.println("Resolving id" + id);
            String resolve = "/webid/ResolverServlet?wpid=MeetingMachine&method=form&uri=" + id + "&href=_[text/url]";
            String resolver = "http://webid.hpl.hp.com:5190";
            URL url = new URL(resolve + resolver);
            URLConnection c =(URLConnection)(Object) url.openConnection();
            c.setDoOutput(true);
            c.setDoInput(true);
            c.setUseCaches(false);
        } catch (Exception e) {
            MyHelperClass PropertyEventHeap = new MyHelperClass();
            if ((boolean)(Object)PropertyEventHeap.debug) {
//                MyHelperClass PropertyEventHeap = new MyHelperClass();
                PropertyEventHeap.log("rawGetURLfromWebID " + e);
            }
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass debug;
public MyHelperClass log(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }}
