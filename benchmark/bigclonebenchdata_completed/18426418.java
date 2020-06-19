import java.io.*;
import java.lang.*;
import java.util.*;



class c18426418 {
public MyHelperClass resolveClass(URL o0, String o1){ return null; }

    protected void load() throws IOException {
        MyHelperClass classLoaders = new MyHelperClass();
        for (ClassLoader classLoader :(ClassLoader[])(Object) (Object[])(Object)classLoaders) {
            MyHelperClass serviceClass = new MyHelperClass();
            Enumeration<URL> en =(Enumeration<URL>)(Object) classLoader.getResources("META-INF/services/" + serviceClass.getName());
            while (en.hasMoreElements()) {
                URL url = en.nextElement();
                InputStream in =(InputStream)(Object) url.openStream();
                try {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                    try {
                        String line = null;
                        while ((line = reader.readLine()) != null) {
                            if (!line.startsWith("#")) {
                                line = line.trim();
                                MyHelperClass contributions = new MyHelperClass();
                                if (line.length() > 0) contributions.add(resolveClass(url, line));
                            }
                        }
                    } finally {
                        reader.close();
                    }
                } finally {
                    in.close();
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getName(){ return null; }
	public MyHelperClass add(MyHelperClass o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}
