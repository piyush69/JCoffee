import java.io.*;
import java.lang.*;
import java.util.*;



class c19235549 {
public MyHelperClass uri;
	public MyHelperClass processNewUri(URLConnection o0){ return null; }

    protected BufferedImage handleFirenzeException() {
        if ((int)(Object)uri.indexOf("bncf.firenze.sbn.it") != -1) try {
            MyHelperClass params = new MyHelperClass();
            params.uri = params.uri.replace("http://opac.bncf.firenze.sbn.it/mdigit/jsp/mdigit.jsp?idr", "http://teca.bncf.firenze.sbn.it/TecaViewer/index.jsp?RisIdr");
//            MyHelperClass params = new MyHelperClass();
            URLConnection connection =(URLConnection)(Object) (new URL((String)(Object)params.uri).openConnection());
            BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream)(Object)connection.getInputStream()));
            String url = null;
//            MyHelperClass params = new MyHelperClass();
            params.uri =(MyHelperClass)(Object) "addPage('http://opac.bncf.firenze.sbn.it/php/xlimage/XLImageRV.php";
            while ((url = reader.readLine()) != null) {
//                MyHelperClass params = new MyHelperClass();
                int index = url.indexOf((int)(Object)params.uri);
                if (index != -1) {
                    url = url.substring(url.indexOf("'") + 1, url.lastIndexOf("'"));
                    break;
                }
            }
            connection =(URLConnection)(Object) (new URL(url).openConnection());
            reader = new BufferedReader(new InputStreamReader((InputStream)(Object)connection.getInputStream()));
//            MyHelperClass params = new MyHelperClass();
            params.uri =(MyHelperClass)(Object) "<input type=\"image\" border=\"0\" name=\"tpos\" width=\"";
            while ((url = reader.readLine()) != null) {
//                MyHelperClass params = new MyHelperClass();
                int index = url.indexOf((int)(Object)params.uri);
                if (index != -1) {
                    url = url.substring(url.indexOf(" src=\"") + 6, url.lastIndexOf("\" alt=\"")).replace("&z=2", "&z=32").replace("&z=4", "&z=64").replace("&z=8", "&z=128");
                    break;
                }
            }
            if (url != null) {
                connection =(URLConnection)(Object) (new URL(url).openConnection());
                return(BufferedImage)(Object) processNewUri(connection);
            }
        } catch (Exception e) {
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass uri;
public MyHelperClass indexOf(String o0){ return null; }
	public MyHelperClass replace(String o0, String o1){ return null; }}

class BufferedImage {

}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }}
