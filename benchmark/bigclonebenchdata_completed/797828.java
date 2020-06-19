
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c797828 {

    public static Set getServices(String url) {
        Set services =(Set)(Object) new HashSet();
        try {
            URL ws_url = new URL(url);
            URLConnection urlConn;
            DataInputStream dis;
            try {
                urlConn =(URLConnection)(Object) ws_url.openConnection();
                urlConn.setDoInput(true);
                urlConn.setUseCaches(false);
                dis = new DataInputStream(urlConn.getInputStream());
                String s;
                int fpos = 0;
                int lpos;
                int lslash;
                String sn;
                while ((s =(String)(Object) dis.readLine()) != null) {
                    if (s.contains("?wsdl")) {
                        fpos = s.indexOf("\"") + 1;
                        lpos = s.indexOf("?");
                        s = s.substring(fpos, lpos);
                        if (s.startsWith("http")) s = s.substring(7);
                        lslash = s.lastIndexOf('/');
                        sn = s.substring(lslash + 1);
                        if (!sn.equals("Version") && !sn.equals("AdminService")) services.add(url + "/" + sn);
                    }
                }
                dis.close();
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
        } catch (UncheckedIOException e1) {
            e1.printStackTrace();
        }
        return services;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Set {

public MyHelperClass add(String o0){ return null; }}

class HashSet {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class DataInputStream {

DataInputStream(MyHelperClass o0){}
	DataInputStream(){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
