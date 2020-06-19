
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c14249320 {
public MyHelperClass URI;
	public MyHelperClass getConfiguration(){ return null; }

    @SuppressWarnings("unchecked")
    public void findServiceDescriptionsAsync(FindServiceDescriptionsCallBack callBack) {
        String url;
        boolean url_valid = true;
        URI url_uri =(URI)(Object) getConfiguration().getUri();
        url = url_uri.toString();
        URLConnection urlConn_test;
        try {
            urlConn_test =(URLConnection)(Object) (new URL(url)).openConnection();
        } catch (UncheckedIOException e2) {
            url_valid = false;
            e2.printStackTrace();
            System.out.println("ERROR: Bad Opal service URL entered:" + url);
        } catch (ArithmeticException e2) {
            url_valid = false;
            e2.printStackTrace();
            System.out.println("ERROR: Bad Opal service URL entered:" + url);
        }
        if (url_uri != null && url_valid == true) {
            System.out.println("URL entered: " + url_uri);
            url = url_uri.toString();
            List results =(List)(Object) new ArrayList();
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
                    String hi;
                    while ((s =(String)(Object) dis.readLine()) != null) {
                        if (s.contains("?wsdl")) {
                            fpos = s.indexOf("\"") + 1;
                            lpos = s.indexOf("?");
                            s = s.substring(fpos, lpos);
                            if (s.startsWith("http")) s = s.substring(7);
                            lslash = s.lastIndexOf('/');
                            sn = s.substring(lslash + 1);
                            hi = s.substring(0, lslash);
                            hi = hi.replace('/', '_');
                            if (!sn.equals("Version") && !sn.equals("AdminService")) {
                                ExampleServiceDesc service = new ExampleServiceDesc();
                                s = sn + "_from_" + hi;
                                service.setExampleString(s);
                                service.setExampleUri(URI.create(url));
                                results.add(service);
                            }
                        }
                    }
                    dis.close();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
            } catch (UncheckedIOException e1) {
                e1.printStackTrace();
            }
            callBack.partialResults(results);
            callBack.finished();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getUri(){ return null; }
	public MyHelperClass create(String o0){ return null; }}

class FindServiceDescriptionsCallBack {

public MyHelperClass finished(){ return null; }
	public MyHelperClass partialResults(List o0){ return null; }}

class URI {

}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class List {

public MyHelperClass add(ExampleServiceDesc o0){ return null; }}

class ServiceDescription {

}

class ArrayList {

}

class DataInputStream {

DataInputStream(){}
	DataInputStream(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class ExampleServiceDesc {

public MyHelperClass setExampleUri(MyHelperClass o0){ return null; }
	public MyHelperClass setExampleString(String o0){ return null; }}
