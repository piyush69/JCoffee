import java.io.*;
import java.lang.*;
import java.util.*;



class c14677081 {
public MyHelperClass IOHelper;
	public MyHelperClass LOG;
	public MyHelperClass tokenize(Set<String> o0, String o1){ return null; }

    protected void findPackages(Set<String> packages, ClassLoader classLoader) throws IOException {
        MyHelperClass META_INF_SERVICES = new MyHelperClass();
        Enumeration<URL> resources =(Enumeration<URL>)(Object) classLoader.getResources((String)(Object)META_INF_SERVICES);
        while (resources.hasMoreElements()) {
            URL url = resources.nextElement();
            String path =(String)(Object) url.getPath();
            MyHelperClass visitedURIs = new MyHelperClass();
            if (!(Boolean)(Object)visitedURIs.contains(path)) {
//                MyHelperClass visitedURIs = new MyHelperClass();
                visitedURIs.add(path);
//                MyHelperClass META_INF_SERVICES = new MyHelperClass();
                LOG.debug("Loading file {} to retrieve list of packages, from url: {}", META_INF_SERVICES, url);
                BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
                try {
                    while (true) {
                        String line = reader.readLine();
                        if (line == null) {
                            break;
                        }
                        line = line.trim();
                        if (line.startsWith("#") || line.length() == 0) {
                            continue;
                        }
                        tokenize(packages, line);
                    }
                } finally {
                    IOHelper.close(reader, null, LOG);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass add(String o0){ return null; }
	public MyHelperClass debug(String o0, MyHelperClass o1, URL o2){ return null; }
	public MyHelperClass close(BufferedReader o0, Object o1, MyHelperClass o2){ return null; }
	public MyHelperClass contains(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass getPath(){ return null; }}
