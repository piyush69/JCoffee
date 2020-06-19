import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12641711 {
public MyHelperClass scanDir(String o0, File o1, Collection<String o2){ return null; }
	public MyHelperClass getAlternativeJarFile(URL o0){ return null; }
	public MyHelperClass supportsDirStream(URL o0){ return null; }

    private void scanURL(String packagePath, Collection<String> componentClassNames, URL url) throws Throwable, IOException {
        URLConnection connection = url.openConnection();
        JarFile jarFile;
        if (connection instanceof JarURLConnection) {
            jarFile = ((JarURLConnection) connection).getJarFile();
        } else {
            jarFile = getAlternativeJarFile(url);
        }
        if (jarFile != null) {
            scanJarFile(packagePath, componentClassNames, jarFile);
        } else if (supportsDirStream(url)) {
            Stack<Queued> queue = new Stack<Queued>();
            queue.push(new Queued(url, packagePath));
            while (!queue.isEmpty()) {
                Queued queued = queue.pop();
                scanDirStream(queued.packagePath, queued.packageURL, componentClassNames, queue);
            }
        } else {
            String packageName = packagePath.replace("/", ".");
            if (packageName.endsWith(".")) {
                packageName = packageName.substring(0, packageName.length() - 1);
            }
            scanDir(packageName, new File(url.getFile()), componentClassNames);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class JarFile {

}

class Queued {

}
