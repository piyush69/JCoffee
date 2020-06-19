import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c4575554 {
public MyHelperClass getProxyService(){ return null; }

    private String readWebpage() {
        BufferedReader in = null;
        StringBuffer sb = new StringBuffer();
        try {
            URI uri = new URI("file:///www.vogella.de");
            IProxyService proxyService =(IProxyService)(Object) getProxyService();
            IProxyData[] proxyDataForHost =(IProxyData[])(Object) proxyService.select(uri);
            for (IProxyData data : proxyDataForHost) {
                if (data.getHost() != null) {
                    System.setProperty("http.proxySet", "true");
                    System.setProperty("http.proxyHost",(String)(Object) data.getHost());
                }
                if (data.getHost() != null) {
                    System.setProperty("http.proxyPort", String.valueOf(data.getPort()));
                }
            }
            proxyService = null;
            URL url;
            url =(URL)(Object) uri.toURL();
            in = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                sb.append(inputLine + "\n");
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URI {

URI(){}
	URI(String o0){}
	public MyHelperClass toURL(){ return null; }}

class IProxyService {

public MyHelperClass select(URI o0){ return null; }}

class IProxyData {

public MyHelperClass getPort(){ return null; }
	public MyHelperClass getHost(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class URISyntaxException extends Exception{
	public URISyntaxException(String errorMessage) { super(errorMessage); }
}
