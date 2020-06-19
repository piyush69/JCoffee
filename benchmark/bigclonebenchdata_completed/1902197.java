import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1902197 {
public MyHelperClass StoreMessageBundle;
	public MyHelperClass context;
	public MyHelperClass StringHelper;
public MyHelperClass createResourceHandler(String o0, InputStream o1){ return null; }
	public MyHelperClass setUrlConnectionSettings(URLConnection o0){ return null; }

//    @Override
    protected ResourceHandler doGet(final URI resourceUri) throws Throwable, ResourceNotFoundException, ResourceException {
        if (resourceUri.getHost() == null) {
            throw new IllegalStateException((String)(Object)StoreMessageBundle.getMessage("store.uri.http.illegal", resourceUri.toString()));
        }
        try {
            final URL configUrl = resourceUri.toURL();
            final URLConnection urlConnection;
            Proxy httpProxy = null;
            MyHelperClass FileStoreContextBuilder = new MyHelperClass();
            if (!(Boolean)(Object)StringHelper.isEmpty((String)(Object)context.getString(FileStoreContextBuilder.ProxySet))) {
//                MyHelperClass FileStoreContextBuilder = new MyHelperClass();
                if ((boolean)(Object)context.getBoolean(FileStoreContextBuilder.ProxySet)) {
//                    MyHelperClass FileStoreContextBuilder = new MyHelperClass();
                    final String proxyHost =(String)(Object) context.getString(FileStoreContextBuilder.ProxyHost);
//                    MyHelperClass FileStoreContextBuilder = new MyHelperClass();
                    final String proxyPort =(String)(Object) context.getString(FileStoreContextBuilder.ProxyPort);
                    MyHelperClass StringHelper = new MyHelperClass();
                    if (!(Boolean)(Object)StringHelper.isEmpty(proxyHost)) {
//                        MyHelperClass StringHelper = new MyHelperClass();
                        httpProxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyHost, !(Boolean)(Object)StringHelper.isEmpty(proxyPort) ? Integer.parseInt(proxyPort) : 80));
//                        MyHelperClass FileStoreContextBuilder = new MyHelperClass();
                        if (!(Boolean)(Object)StringHelper.isEmpty((String)(Object)context.getString(FileStoreContextBuilder.NonProxyHosts))) {
//                            MyHelperClass FileStoreContextBuilder = new MyHelperClass();
                            System.getProperties().put("http.nonProxyHosts", context.getProperty(FileStoreContextBuilder.NonProxyHosts));
                        }
//                        MyHelperClass FileStoreContextBuilder = new MyHelperClass();
                        if (!(Boolean)(Object)StringHelper.isEmpty((String)(Object)context.getString(FileStoreContextBuilder.ProxyUser)) && !(Boolean)(Object)StringHelper.isEmpty((String)(Object)context.getString(FileStoreContextBuilder.ProxyPassword))) {
                            Authenticator.setDefault(new Authenticator() {

//                                @Override
                                protected PasswordAuthentication getPasswordAuthentication() {
                                    MyHelperClass FileStoreContextBuilder = new MyHelperClass();
                                    MyHelperClass context = new MyHelperClass();
                                    return new PasswordAuthentication((String)(Object)context.getString(FileStoreContextBuilder.ProxyUser),(char[])(Object) context.getString(FileStoreContextBuilder.ProxyPassword).toCharArray());
                                }
                            });
                        }
                    }
                }
            }
            if (httpProxy == null) {
                urlConnection = configUrl.openConnection();
            } else {
                urlConnection = configUrl.openConnection(httpProxy);
            }
            setUrlConnectionSettings(urlConnection);
            urlConnection.connect();
            try {
                return(ResourceHandler)(Object) createResourceHandler(resourceUri.toString(), urlConnection.getInputStream());
            } catch (final FileNotFoundException fnfe) {
                throw new ResourceNotFoundException(resourceUri.toString());
            }
        } catch (final MalformedURLException mure) {
            throw new IllegalStateException((String)(Object)StoreMessageBundle.getMessage("store.uri.malformed", resourceUri.toString()));
        } catch (final ConnectException ce) {
            throw new ResourceException("store.connection.error", ce, resourceUri.toString());
        } catch (final IOException ioe) {
            if ((ResourceException)(Object)ioe instanceof ResourceException) {
                throw (ResourceException)(ResourceException)(Object) ioe;
            } else {
                throw new ResourceException(ioe, resourceUri.toString());
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ProxySet;
	public MyHelperClass ProxyHost;
	public MyHelperClass ProxyUser;
	public MyHelperClass ProxyPort;
	public MyHelperClass NonProxyHosts;
	public MyHelperClass ProxyPassword;
public MyHelperClass getMessage(String o0, String o1){ return null; }
	public MyHelperClass getBoolean(MyHelperClass o0){ return null; }
	public MyHelperClass isEmpty(String o0){ return null; }
	public MyHelperClass getString(MyHelperClass o0){ return null; }
	public MyHelperClass getProperty(MyHelperClass o0){ return null; }
	public MyHelperClass toCharArray(){ return null; }}

class ResourceHandler {

}

class ResourceNotFoundException extends Exception{
	public ResourceNotFoundException(String errorMessage) { super(errorMessage); }
}

class ResourceException extends Exception{
	public ResourceException(String errorMessage) { super(errorMessage); }
	ResourceException(){}
	ResourceException(IOException o0, String o1){}
	ResourceException(String o0, ConnectException o1, String o2){}
}
