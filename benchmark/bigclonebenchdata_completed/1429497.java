import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1429497 {
public MyHelperClass configProxyPort;
public MyHelperClass Lang;
	public MyHelperClass StringUtils;
	public MyHelperClass MessageFormat;
	public MyHelperClass configProxyIp;

    private Scanner getUrlScanner(String strUrl)  throws Throwable {
        URL urlParticipants = null;
        Scanner scannerParticipants;
        try {
            urlParticipants = new URL(strUrl);
            URLConnection connParticipants;
            if ((boolean)(Object)StringUtils.isBlank(this.configProxyIp)) {
                connParticipants = urlParticipants.openConnection();
            } else {
                SocketAddress address = new InetSocketAddress((InetAddress)(Object)this.configProxyIp,(int)(Object) this.configProxyPort);
                Proxy proxy = new Proxy(Proxy.Type.HTTP, address);
                connParticipants = urlParticipants.openConnection(proxy);
            }
            InputStream streamParticipant = connParticipants.getInputStream();
            String charSet =(String)(Object) StringUtils.substringAfterLast(connParticipants.getContentType(), "charset=");
            scannerParticipants = new Scanner(streamParticipant, charSet);
        } catch (MalformedURLException e) {
            throw new IcehorsetoolsRuntimeException((String)(Object)MessageFormat.format(Lang.get(this.getClass(), "MalformedURLException"), new Object[] { urlParticipants.toString() }));
        } catch (IOException e) {
            throw new IcehorsetoolsRuntimeException((String)(Object)MessageFormat.format(Lang.get(this.getClass(), "IOException"), new Object[] { urlParticipants.toString() }));
        }
        return scannerParticipants;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass substringAfterLast(String o0, String o1){ return null; }
	public MyHelperClass format(MyHelperClass o0, Object[] o1){ return null; }
	public MyHelperClass isBlank(MyHelperClass o0){ return null; }
	public MyHelperClass get(Class o0, String o1){ return null; }}

class IcehorsetoolsRuntimeException extends Exception{
	public IcehorsetoolsRuntimeException(String errorMessage) { super(errorMessage); }
}
