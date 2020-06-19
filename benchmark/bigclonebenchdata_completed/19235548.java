import java.io.*;
import java.lang.*;
import java.util.*;



class c19235548 {
public MyHelperClass uri;
	public MyHelperClass processNewUri(URLConnection o0){ return null; }

    protected BufferedImage handleICCException() {
        if ((Boolean)(Object)uri.startsWith("http://vacani.icc.cat") || (Boolean)(Object)uri.startsWith("http://louisdl.louislibraries.org")) try {
            MyHelperClass params = new MyHelperClass();
            params.uri = params.uri.replace("cdm4/item_viewer.php", "cgi-bin/getimage.exe") + "&DMSCALE=3";
//            MyHelperClass params = new MyHelperClass();
            params.uri =(MyHelperClass)(Object) params.uri.replace("/u?", "cgi-bin/getimage.exe?CISOROOT=").replace(",", "&CISOPTR=") + "&DMSCALE=3";
//            MyHelperClass params = new MyHelperClass();
            URL url = new URL((MyHelperClass)(Object)params.uri);
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            return(BufferedImage)(Object) processNewUri(connection);
        } catch (Exception e) {
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public String uri;
public MyHelperClass startsWith(String o0){ return null; }
	public MyHelperClass replace(String o0, String o1){ return null; }}

class BufferedImage {

}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

}
