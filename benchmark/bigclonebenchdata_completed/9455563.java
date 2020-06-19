import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9455563 {

    private String[] getPamFiles() throws Throwable, IOException {
        URL url = WorkflowStructure.class.getResource("/de/ibis/permoto/loganalyzer/pam");
        Set<String> result = new LinkedHashSet<String>(8);
        if (url.getProtocol().equals("jar")) {
            URLConnection con = url.openConnection();
            JarURLConnection jarCon = (JarURLConnection) con;
            JarFile jarFile =(JarFile)(Object) jarCon.getJarFile();
            JarEntry jarEntry =(JarEntry)(Object) jarCon.getJarEntry();
            String rootEntryPath = (jarEntry != null ? jarEntry.getName() : "");
            rootEntryPath = rootEntryPath + "/";
            for (Enumeration<JarEntry> entries =(Enumeration<JarEntry>)(Object) jarFile.entries(); entries.hasMoreElements(); ) {
                JarEntry entry = entries.nextElement();
                String entryPath =(String)(Object) entry.getName();
                if (entryPath.startsWith(rootEntryPath)) {
                    if (entryPath.endsWith(".pam")) {
                        result.add("/" + entryPath);
                    }
                }
            }
        } else {
            String rootEntryPath = url.getFile();
            File dir = new File(url.getFile());
            File[] dirContents = dir.listFiles();
            for (int i = 0; i < dirContents.length; i++) {
                File content = dirContents[i];
                if (content.getName().endsWith(".pam")) {
                    String relativePath = content.getAbsolutePath().substring(rootEntryPath.length());
                    result.add("/de/ibis/permoto/loganalyzer/pam/" + relativePath.replace(File.separatorChar, '/'));
                }
            }
        }
        return result.toArray(new String[result.size()]);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class WorkflowStructure {

}

class JarFile {

public MyHelperClass entries(){ return null; }}

class JarEntry {

public MyHelperClass getName(){ return null; }}
