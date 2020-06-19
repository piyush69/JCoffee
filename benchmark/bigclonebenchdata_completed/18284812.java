import java.io.*;
import java.lang.*;
import java.util.*;



class c18284812 {

    protected void discoverRegistryEntries() {
        DataSourceRegistry registry =(DataSourceRegistry)(Object) this;
        try {
            ClassLoader loader = DataSetURI.class.getClassLoader();
            Enumeration<URL> urls;
            if (loader == null) {
                urls =(Enumeration<URL>)(Object) ClassLoader.getSystemResources("META-INF/org.virbo.datasource.DataSourceFactory.extensions");
            } else {
                urls =(Enumeration<URL>)(Object) loader.getResources("META-INF/org.virbo.datasource.DataSourceFactory.extensions");
            }
            while (urls.hasMoreElements()) {
                URL url = urls.nextElement();
                BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
                String s = reader.readLine();
                while (s != null) {
                    s = s.trim();
                    if (s.length() > 0) {
                        String[] ss = s.split("\\s");
                        for (int i = 1; i < ss.length; i++) {
                            if (ss[i].contains(".")) {
                                System.err.println("META-INF/org.virbo.datasource.DataSourceFactory.extensions contains extension that contains period: ");
                                System.err.println(ss[0] + " " + ss[i] + " in " + url);
                                System.err.println("This sometimes happens when extension files are concatenated, so check that all are terminated by end-of-line");
                                System.err.println("");
                                throw new IllegalArgumentException("DataSourceFactory.extensions contains extension that contains period: " + url);
                            }
                            registry.registerExtension(ss[0], ss[i], null);
                        }
                    }
                    s = reader.readLine();
                }
                reader.close();
            }
            if (loader == null) {
                urls =(Enumeration<URL>)(Object) ClassLoader.getSystemResources("META-INF/org.virbo.datasource.DataSourceFactory.mimeTypes");
            } else {
                urls =(Enumeration<URL>)(Object) loader.getResources("META-INF/org.virbo.datasource.DataSourceFactory.mimeTypes");
            }
            while (urls.hasMoreElements()) {
                URL url = urls.nextElement();
                BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
                String s = reader.readLine();
                while (s != null) {
                    s = s.trim();
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
            if (loader == null) {
                urls =(Enumeration<URL>)(Object) ClassLoader.getSystemResources("META-INF/org.virbo.datasource.DataSourceFormat.extensions");
            } else {
                urls =(Enumeration<URL>)(Object) loader.getResources("META-INF/org.virbo.datasource.DataSourceFormat.extensions");
            }
            while (urls.hasMoreElements()) {
                URL url = urls.nextElement();
                BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
                String s = reader.readLine();
                while (s != null) {
                    s = s.trim();
                    if (s.length() > 0) {
                        String[] ss = s.split("\\s");
                        for (int i = 1; i < ss.length; i++) {
                            if (ss[i].contains(".")) {
                                System.err.println("META-INF/org.virbo.datasource.DataSourceFormat.extensions contains extension that contains period: ");
                                System.err.println(ss[0] + " " + ss[i] + " in " + url);
                                System.err.println("This sometimes happens when extension files are concatenated, so check that all are terminated by end-of-line");
                                System.err.println("");
                                throw new IllegalArgumentException("DataSourceFactory.extensions contains extension that contains period: " + url);
                            }
                            registry.registerFormatter(ss[0], ss[i]);
                        }
                    }
                    s = reader.readLine();
                }
                reader.close();
            }
            if (loader == null) {
                urls =(Enumeration<URL>)(Object) ClassLoader.getSystemResources("META-INF/org.virbo.datasource.DataSourceEditorPanel.extensions");
            } else {
                urls =(Enumeration<URL>)(Object) loader.getResources("META-INF/org.virbo.datasource.DataSourceEditorPanel.extensions");
            }
            while (urls.hasMoreElements()) {
                URL url = urls.nextElement();
                BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
                String s = reader.readLine();
                while (s != null) {
                    s = s.trim();
                    if (s.length() > 0) {
                        String[] ss = s.split("\\s");
                        for (int i = 1; i < ss.length; i++) {
                            if (ss[i].contains(".")) {
                                System.err.println("META-INF/org.virbo.datasource.DataSourceEditorPanel.extensions contains extension that contains period: ");
                                System.err.println(ss[0] + " " + ss[i] + " in " + url);
                                System.err.println("This sometimes happens when extension files are concatenated, so check that all are terminated by end-of-line");
                                System.err.println("");
                                throw new IllegalArgumentException("DataSourceFactory.extensions contains extension that contains period: " + url);
                            }
                            registry.registerEditor(ss[0], ss[i]);
                        }
                    }
                    s = reader.readLine();
                }
                reader.close();
            }
            if (loader == null) {
                urls =(Enumeration<URL>)(Object) ClassLoader.getSystemResources("META-INF/org.virbo.datasource.DataSourceFormatEditorPanel.extensions");
            } else {
                urls =(Enumeration<URL>)(Object) loader.getResources("META-INF/org.virbo.datasource.DataSourceFormatEditorPanel.extensions");
            }
            while (urls.hasMoreElements()) {
                URL url = urls.nextElement();
                BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
                String s = reader.readLine();
                while (s != null) {
                    s = s.trim();
                    if (s.length() > 0) {
                        String[] ss = s.split("\\s");
                        for (int i = 1; i < ss.length; i++) {
                            if (ss[i].contains(".")) {
                                System.err.println("META-INF/org.virbo.datasource.DataSourceFormatEditorPanel.extensions contains extension that contains period: ");
                                System.err.println(ss[0] + " " + ss[i] + " in " + url);
                                System.err.println("This sometimes happens when extension files are concatenated, so check that all are terminated by end-of-line");
                                System.err.println("");
                                throw new IllegalArgumentException("DataSourceFactory.extensions contains extension that contains period: " + url);
                            }
                            registry.registerFormatEditor(ss[0], ss[i]);
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
	public MyHelperClass registerMimeType(String o0, String o1){ return null; }
	public MyHelperClass registerExtension(String o0, String o1, Object o2){ return null; }
	public MyHelperClass registerFormatEditor(String o0, String o1){ return null; }
	public MyHelperClass registerEditor(String o0, String o1){ return null; }}

class DataSetURI {

}

class URL {

public MyHelperClass openStream(){ return null; }}
