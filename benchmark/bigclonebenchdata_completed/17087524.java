import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17087524 {
public MyHelperClass getClassNameListURLsByClassLoader(){ return null; }
	public MyHelperClass acceptClassName(CAP#1 o0, URL o1, String o2){ return null; }
	public MyHelperClass handleIOException(CAP#1 o0, URL o1, IOException o2){ return null; }

    public Map<? extends ClassLoader, Set<String>> getClassNamesByClassLoader() throws Throwable, IOException {
        final Map<? extends ClassLoader, Set<URL>> urlsByClassLoader = getClassNameListURLsByClassLoader();
        final LinkedHashMap<ClassLoader, Set<String>> map = new LinkedHashMap<ClassLoader, Set<String>>(urlsByClassLoader.size());
        final HashSet<String> allNames = new HashSet<String>(map.size());
        for (final Map.Entry<? extends ClassLoader, Set<URL>> e : urlsByClassLoader.entrySet()) {
            LinkedHashSet<String> names = null;
            for (final URL url : e.getValue()) {
                InputStream bin = null;
                try {
                    bin = url.openStream();
                    final LineNumberReader in = new LineNumberReader(new InputStreamReader(bin));
                    for (String line; (line = in.readLine()) != null; ) {
                        line = line.trim();
                        if ((line.length() > 0) && (line.charAt(0) != '#') && allNames.add(line) && acceptClassName(e.getKey(), url, line)) {
                            if (names == null) names = new LinkedHashSet<String>(e.getValue().size());
                            names.add(line);
                        }
                    }
                    in.close();
                    bin = null;
                } catch (IOException ex) {
                    handleIOException(e.getKey(), url, ex);
                } finally {
                    if (bin != null) {
                        try {
                            bin.close();
                        } catch (IOException ex) {
                        }
                    }
                }
            }
            if (names != null) map.put(e.getKey(), names);
        }
        return map;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
