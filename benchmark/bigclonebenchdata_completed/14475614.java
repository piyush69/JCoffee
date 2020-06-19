import java.io.*;
import java.lang.*;
import java.util.*;



class c14475614 {

    @SuppressWarnings("unchecked")
    public static <T extends Class> Collection<T> listServices(T serviceType, ClassLoader classLoader) throws IOException, ClassNotFoundException {
        final Collection<T> result = new LinkedHashSet<T>();
        final Enumeration<URL> resouces =(Enumeration<URL>)(Object) classLoader.getResources("META-INF/services/" + serviceType.getName());
        while (resouces.hasMoreElements()) {
            final URL url = resouces.nextElement();
            final BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
            try {
                String line = reader.readLine();
                while (line != null) {
                    if (line.startsWith("#")) {
                    } else if ("".equals(line.trim())) {
                    } else {
                        final T implClass = (T) Class.forName(line, true, classLoader);
                        if (!serviceType.isAssignableFrom(implClass)) {
                            throw new IllegalStateException(String.format("%s: class %s does not implement required interfafce %s", url, implClass, serviceType));
                        }
                        result.add(implClass);
                    }
                    line = reader.readLine();
                }
            } finally {
                reader.close();
            }
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}
