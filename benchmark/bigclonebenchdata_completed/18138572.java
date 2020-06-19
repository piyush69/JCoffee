import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c18138572 {

    public static String[] getURLListFromResource(String resourceName, String regExFilter, boolean firstNoEmptyMatched) {
        String[] urlArray;
        Vector<String> urlVector = new Vector<String>();
        try {
            ClassLoader classLoader = MqatMain.class.getClassLoader();
            URLClassLoader urlClassLoader = (URLClassLoader) classLoader;
            Enumeration e = urlClassLoader.findResources(resourceName);
            for (; e.hasMoreElements(); ) {
                URL url = (URL) e.nextElement();
                if ("file".equals(url.getProtocol())) {
                    File file = new File(url.getPath());
                    File[] fileList = file.listFiles();
                    if (fileList != null) {
                        for (int i = 0; i < fileList.length; i++) {
                            String urlStr = fileList[i].toURL().toString();
                            if (urlStr.matches(regExFilter)) {
                                urlVector.add(urlStr);
                            }
                        }
                    }
                } else if ("jar".equals(url.getProtocol())) {
                    JarURLConnection jarConnection = (JarURLConnection) url.openConnection();
                    JarFile jarFile =(JarFile)(Object) jarConnection.getJarFile();
                    Enumeration jarEntries =(Enumeration)(Object) jarFile.entries();
                    for (; jarEntries.hasMoreElements(); ) {
                        JarEntry jarEntry = (JarEntry) jarEntries.nextElement();
                        if (!(Boolean)(Object)jarEntry.isDirectory()) {
                            String urlStr = url.toString().substring(0, url.toString().lastIndexOf('!') + 1);
                            urlStr += "/" + jarEntry;
                            if (urlStr.matches(regExFilter)) {
                                urlVector.add(urlStr);
                            }
                        }
                    }
                }
                if (!urlVector.isEmpty() && firstNoEmptyMatched) {
                    break;
                }
            }
        } catch (Exception ex) {
            MyHelperClass ExceptionHandler = new MyHelperClass();
            ExceptionHandler.handle(ex, ExceptionHandler.NO_VISUAL);
        }
        urlArray = urlVector.toArray(new String[urlVector.size()]);
        return urlArray;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NO_VISUAL;
public MyHelperClass handle(Exception o0, MyHelperClass o1){ return null; }}

class MqatMain {

}

class JarFile {

public MyHelperClass entries(){ return null; }}

class JarEntry {

public MyHelperClass isDirectory(){ return null; }}
