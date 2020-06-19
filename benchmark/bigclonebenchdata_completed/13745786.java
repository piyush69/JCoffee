import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13745786 {
public MyHelperClass proxyPort;
	public MyHelperClass StringUtils;

    private String fetchHtml(URL url) throws Throwable, IOException {
        URLConnection connection;
        MyHelperClass proxyHost = new MyHelperClass();
        if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)StringUtils.isNotBlank(proxyHost) && proxyPort != null) {
//            MyHelperClass proxyHost = new MyHelperClass();
            Proxy proxy = new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)proxyHost, proxyPort));
            connection = url.openConnection(proxy);
        } else {
            connection = url.openConnection();
        }
        Object content =(Object)(Object) connection.getContent();
        if ((InputStream[][])(Object)(InputStream[][])(Object)(InputStream[][])(Object)(InputStream[][])(Object)(InputStream[][])(Object)(InputStream[][])(Object)(InputStream[][])(Object)(InputStream[])(Object)content instanceof InputStream) {
            MyHelperClass IOUtils = new MyHelperClass();
            return IOUtils.toString(InputStream.class.cast(content));
        } else {
            String msg = "Bad content type! " + content.getClass();
            MyHelperClass log = new MyHelperClass();
            log.error(msg);
            throw new IOException(msg);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0){ return null; }
	public MyHelperClass isNotBlank(MyHelperClass o0){ return null; }}

class Object {

public MyHelperClass toString(InputStream o0){ return null; }}
