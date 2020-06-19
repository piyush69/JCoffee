import java.io.*;
import java.lang.*;
import java.util.*;



class c23041340 {

    private HashSet<String> loadSupportedAnnotationTypes(VannitationType baseVannitationType) {
        Enumeration<URL> urls = null;
        try {
            urls =(Enumeration<URL>)(Object) this.getClass().getClassLoader().getResources("META-INF/" + baseVannitationType);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load the annotations we support", e);
        }
        MyHelperClass supportedAnnotationTypes = new MyHelperClass();
        supportedAnnotationTypes.put(baseVannitationType, new HashSet<String>());
        while (urls.hasMoreElements()) {
            URL url = urls.nextElement();
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
                String line;
                while ((line = reader.readLine()) != null) {
//                    MyHelperClass supportedAnnotationTypes = new MyHelperClass();
                    supportedAnnotationTypes.get(baseVannitationType).add(line.trim());
                }
                reader.close();
            } catch (Exception e) {
                throw new RuntimeException("Could not open " + url);
            }
        }
//        MyHelperClass supportedAnnotationTypes = new MyHelperClass();
        return(HashSet<String>)(Object) supportedAnnotationTypes.get(baseVannitationType);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass add(String o0){ return null; }
	public MyHelperClass put(VannitationType o0, HashSet<String> o1){ return null; }
	public MyHelperClass get(VannitationType o0){ return null; }}

class VannitationType {

}

class URL {

public MyHelperClass openStream(){ return null; }}
