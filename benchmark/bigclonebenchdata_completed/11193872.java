import java.io.*;
import java.lang.*;
import java.util.*;



class c11193872 {

    private static <T> Collection<T> loadFromServices(Class<T> interf) throws Exception {
        ClassLoader classLoader = DSServiceLoader.class.getClassLoader();
        Enumeration<URL> e =(Enumeration<URL>)(Object) classLoader.getResources("META-INF/services/" + interf.getName());
        Collection<T> services = new ArrayList<T>();
        while (e.hasMoreElements()) {
            URL url = e.nextElement();
            InputStream is =(InputStream)(Object) url.openStream();
            try {
                BufferedReader r = new BufferedReader(new InputStreamReader(is, "UTF-8"));
                while (true) {
                    String line = r.readLine();
                    if (line == null) {
                        break;
                    }
                    int comment = line.indexOf('#');
                    if (comment >= 0) {
                        line = line.substring(0, comment);
                    }
                    String name = line.trim();
                    if (name.length() == 0) {
                        continue;
                    }
                    Class<?> clz = Class.forName(name, true, classLoader);
                    Class<? extends T> impl = clz.asSubclass(interf);
                    Constructor ctor =(Constructor)(Object) impl.getConstructor();
                    T svc =(T)(Object) ctor.newInstance();
                    services.add(svc);
                }
            } finally {
                is.close();
            }
        }
        return services;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class DSServiceLoader {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class Constructor {

public MyHelperClass newInstance(){ return null; }}
