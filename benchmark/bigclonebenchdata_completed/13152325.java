import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c13152325 {
public MyHelperClass loadAntLib(URL o0, URI o1){ return null; }

    public void loadExistingAntlibs(ClassLoader classLoader) {
        URL antlibUrl;
        URI antlibUri;
        try {
            MyHelperClass antLibsResource = new MyHelperClass();
            Enumeration<URL> resources = classLoader == null ? ClassLoader.getSystemResources((String)(Object)antLibsResource) : classLoader.getResources((String)(Object)antLibsResource);
            while (resources.hasMoreElements()) {
                URL url = resources.nextElement();
                InputStream stream = url.openStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(stream, "UTF-8"));
                for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                    String pkg = line.trim();
                    URI uri = URI.create("antlib:" + pkg);
                    MyHelperClass antLibsResource2root = new MyHelperClass();
                    URI resource2antlib = URI.create(antLibsResource2root + pkg.replace('.', '/') + (pkg.isEmpty() ? "" : "/") + "antlib.xml");
                    MyHelperClass NetUtils = new MyHelperClass();
                    antlibUri =(URI)(Object) NetUtils.resolve(url.toURI(), resource2antlib);
                    try {
                        antlibUrl = antlibUri.toURL();
                    } catch (IllegalArgumentException e) {
                        System.err.println("base uri: " + url);
                        System.err.println("relativepath: " + resource2antlib);
                        System.err.println("target uri: " + antlibUri);
                        throw new RuntimeException(antlibUri.toString(), e);
                    }
                    loadAntLib(antlibUrl, uri);
                }
                reader.close();
                stream.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass resolve(URI o0, URI o1){ return null; }}
