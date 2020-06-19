
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c299251 {
public MyHelperClass port;

    public ArrayList getData() {
        ArrayList data = new ArrayList();
        String line = null;
        URL address = null;
        try {
            MyHelperClass url = new MyHelperClass();
            address = new URL(url);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        URLConnection urlconn = null;
        MyHelperClass useProxy = new MyHelperClass();
        if ((boolean)(Object)useProxy) {
            MyHelperClass ip = new MyHelperClass();
            SocketAddress addr =(SocketAddress)(Object) new InetSocketAddress(ip, Integer.parseInt((String)(Object)port));
            java.net.Proxy httpProxy = new java.net.Proxy(java.net.Proxy.Type.HTTP,(java.net.SocketAddress)(Object) addr);
            try {
                urlconn =(URLConnection)(Object) address.openConnection((Proxy)(Object)httpProxy);
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                urlconn =(URLConnection)(Object) address.openConnection();
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
        }
        try {
            urlconn.connect();
        } catch (UncheckedIOException e) {
            return null;
        }
        BufferedReader buffreader = null;
        try {
            buffreader = new BufferedReader(new InputStreamReader(urlconn.getInputStream()));
        } catch (UncheckedIOException e1) {
            e1.printStackTrace();
        }
        try {
            line =(String)(Object) buffreader.readLine();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        while (line != null) {
            data.add(line);
            try {
                line =(String)(Object) buffreader.readLine();
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
        }
        return data;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ArrayList {

public MyHelperClass add(String o0){ return null; }}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(Proxy o0){ return null; }
	public MyHelperClass openConnection(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class SocketAddress {

}

class InetSocketAddress {

InetSocketAddress(MyHelperClass o0, int o1){}
	InetSocketAddress(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class Proxy {

}
