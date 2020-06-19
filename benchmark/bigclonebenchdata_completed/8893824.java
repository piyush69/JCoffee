import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8893824 {

    protected static WebServerContent getWebServerContent(HTTPRequest httpRequest)  throws Throwable {
        String parameter =(String)(Object) httpRequest.getResourcePath();
        if (parameter.startsWith("/")) {
            parameter = parameter.substring(1);
        }
        int index = parameter.indexOf('/');
        if (index == -1) {
            return null;
        }
        String type = parameter.substring(0, index);
        parameter = parameter.substring(index + 1);
        if ("class".equals(type)) {
            index = parameter.indexOf('/');
            MyHelperClass ObjectRegistry = new MyHelperClass();
            WebServer webServer = (WebServer)(WebServer)(Object) ObjectRegistry.getInstance().get(Integer.parseInt(parameter.substring(0, index)));
            if (webServer == null) {
                return null;
            }
            parameter = parameter.substring(index + 1);
            index = parameter.indexOf('/');
            String className = parameter.substring(0, index);
            MyHelperClass Utils = new MyHelperClass();
            parameter =(String)(Object) Utils.decodeURL(parameter.substring(index + 1));
            httpRequest =(HTTPRequest)(Object)(HTTPRequest[])(Object) httpRequest.clone();
            try {
                Class<?> clazz = null;
                for (ClassLoader referenceClassLoader :(ClassLoader[])(Object) (Object[])(Object)webServer.referenceClassLoaderList) {
                    try {
                        clazz = Class.forName(className, true, referenceClassLoader);
                        break;
                    } catch (Exception e) {
                    }
                }
                if (clazz == null) {
                    clazz = Class.forName(className);
                }
                Method getWebServerContentMethod =(Method)(Object) clazz.getDeclaredMethod("getWebServerContent", HTTPRequest.class);
                getWebServerContentMethod.setAccessible(true);
                httpRequest.setResourcePath(parameter);
                return (WebServerContent)(WebServerContent)(Object) getWebServerContentMethod.invoke(null, httpRequest);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        if ("classpath".equals(type)) {
            index = parameter.indexOf('/');
            MyHelperClass ObjectRegistry = new MyHelperClass();
            final WebServer webServer = (WebServer)(WebServer)(Object) ObjectRegistry.getInstance().get(Integer.parseInt(parameter.substring(0, index)));
            if (webServer == null) {
                return null;
            }
            parameter = parameter.substring(index + 1);
            final String resourcePath = parameter;
            return new WebServerContent() {

//                @Override
                public String getContentType() {
                    int index = resourcePath.lastIndexOf('.');
                    return getDefaultMimeType(index == -1 ? null : resourcePath.substring(index));
                }

//                @Override
                public InputStream getInputStream() {
                    try {
                        for (ClassLoader referenceClassLoader :(ClassLoader[])(Object) (Object[])(Object)webServer.referenceClassLoaderList) {
                            InputStream in = referenceClassLoader.getResourceAsStream(resourcePath);
                            if (in != null) {
                                return in;
                            }
                        }
                        return WebServer.class.getResourceAsStream('/' + resourcePath);
                    } catch (Exception e) {
                        e.printStackTrace();
                        return null;
                    }
                }
            };
        }
        if ("resource".equals(type)) {
            MyHelperClass Utils = new MyHelperClass();
            parameter =(String)(Object) Utils.decodeURL(parameter);
            index = parameter.indexOf('/');
//            MyHelperClass Utils = new MyHelperClass();
            String codeBase =(String)(Object) Utils.decodeURL(parameter.substring(0, index));
            parameter = parameter.substring(index + 1);
            String resourceURL;
            try {
                URL url = new URL(codeBase);
                int port = url.getPort();
                resourceURL = url.getProtocol() + "://" + url.getHost() + (port != -1 ? ":" + port : "");
                if (parameter.startsWith("/")) {
                    resourceURL += parameter;
                } else {
                    String path = url.getPath();
                    path = path.substring(0, path.lastIndexOf('/') + 1) + parameter;
                    resourceURL += path.startsWith("/") ? path : "/" + path;
                }
            } catch (Exception e) {
//                MyHelperClass Utils = new MyHelperClass();
                File file =(File)(Object) Utils.getLocalFile(new File(codeBase, parameter).getAbsolutePath());
                if (file != null) {
                    resourceURL = new File(codeBase, parameter).toURI().toString();
                } else {
                    resourceURL = codeBase + "/" + parameter;
                }
            }
            final String resourceURL_ = resourceURL;
            return new WebServerContent() {

//                @Override
                public long getContentLength() {
                    File file =(File)(Object) Utils.getLocalFile(resourceURL_);
                    if (file != null) {
                        return file.length();
                    }
                    return this.getContentLength();
                }

//                @Override
                public String getContentType() {
                    int index = resourceURL_.lastIndexOf('.');
                    return getDefaultMimeType(index == -1 ? null : resourceURL_.substring(index));
                }

//                @Override
                public InputStream getInputStream() {
                    String url = resourceURL_;
                    try {
                        return new URL(url).openStream();
                    } catch (Exception e) {
                    }
                    try {
                        return new FileInputStream("/" + url);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return null;
                }
            };
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass decodeURL(String o0){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getLocalFile(String o0){ return null; }
	public MyHelperClass get(int o0){ return null; }}

class HTTPRequest {

public MyHelperClass setResourcePath(String o0){ return null; }
	public MyHelperClass getResourcePath(){ return null; }}

class WebServerContent {

}

class WebServer {
public MyHelperClass referenceClassLoaderList;
}

class Method {

public MyHelperClass setAccessible(boolean o0){ return null; }
	public MyHelperClass invoke(Object o0, HTTPRequest o1){ return null; }}
