import java.io.*;
import java.lang.*;
import java.util.*;



class c2467280 {

    private static void discoverRegisteryEntries(DataSourceRegistry registry) {
        try {
            Enumeration<URL> urls =(Enumeration<URL>)(Object) DataSetURL.class.getClassLoader().getResources("META-INF/org.virbo.datasource.DataSourceFactory.extensions");
            while (urls.hasMoreElements()) {
                URL url = urls.nextElement();
                BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
                String s = reader.readLine().trim();
                while (s != null) {
                    if (s.length() > 0) {
                        String[] ss = s.split("\\s");
                        for (int i = 1; i < ss.length; i++) {
                            registry.registerExtension(ss[0], ss[i], null);
                        }
                    }
                    s = reader.readLine();
                }
                reader.close();
            }
            urls =(Enumeration<URL>)(Object) DataSetURL.class.getClassLoader().getResources("META-INF/org.virbo.datasource.DataSourceFactory.mimeTypes");
            while (urls.hasMoreElements()) {
                URL url = urls.nextElement();
                BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
                String s = reader.readLine().trim();
                while (s != null) {
                    if (s.length() > 0) {
                        String[] ss = s.split("\\s");
                        for (int i = 1; i < ss.length; i++) {
                            registry.registerMimeType(ss[0], ss[i]);
                        }
                    }
                    s = reader.readLine();
                }
                reader.close();
            }
            urls =(Enumeration<URL>)(Object) DataSetURL.class.getClassLoader().getResources("META-INF/org.virbo.datasource.DataSourceFormat.extensions");
            while (urls.hasMoreElements()) {
                URL url = urls.nextElement();
                BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
                String s = reader.readLine().trim();
                while (s != null) {
                    if (s.length() > 0) {
                        String[] ss = s.split("\\s");
                        for (int i = 1; i < ss.length; i++) {
                            registry.registerFormatter(ss[0], ss[i]);
                        }
                    }
                    s = reader.readLine();
                }
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class DataSourceRegistry {

public MyHelperClass registerFormatter(String o0, String o1){ return null; }
	public MyHelperClass registerExtension(String o0, String o1, Object o2){ return null; }
	public MyHelperClass registerMimeType(String o0, String o1){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class DataSetURL {

}
