import java.io.*;
import java.lang.*;
import java.util.*;



class c21756553 {

    public static List<String> list() throws IOException {
        List<String> providers = new ArrayList<String>();
        Enumeration<URL> urls =(Enumeration<URL>)(Object) ClassLoader.getSystemResources("sentrick.classifiers");
        while (urls.hasMoreElements()) {
            URL url = urls.nextElement();
            String provider = null;
            BufferedReader in = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
            while ((provider = in.readLine()) != null) {
                provider = provider.trim();
                if (provider.length() > 0) providers.add(provider);
            }
            in.close();
        }
        return providers;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}
