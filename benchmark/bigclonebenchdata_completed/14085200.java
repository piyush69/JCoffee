import java.io.*;
import java.lang.*;
import java.util.*;



class c14085200 {

    private static String getRegistrationClasses() {
        CentralRegistrationClass c = new CentralRegistrationClass();
        String name = c.getClass().getCanonicalName().replace('.', '/').concat(".class");
        try {
            Enumeration<URL> urlEnum =(Enumeration<URL>)(Object) c.getClass().getClassLoader().getResources("META-INF/MANIFEST.MF");
            while (urlEnum.hasMoreElements()) {
                URL url = urlEnum.nextElement();
                String file =(String)(Object) url.getFile();
                JarURLConnection jarConnection = (JarURLConnection)(JarURLConnection)(Object) url.openConnection();
                Manifest mf =(Manifest)(Object) jarConnection.getManifest();
                Attributes attrs = (Attributes)(Attributes)(Object) mf.getAttributes(name);
                if (attrs != null) {
                    String classes =(String)(Object) attrs.getValue("RegistrationClasses");
                    return classes;
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return "";
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class CentralRegistrationClass {

}

class URL {

public MyHelperClass getFile(){ return null; }
	public MyHelperClass openConnection(){ return null; }}

class JarURLConnection {

public MyHelperClass getManifest(){ return null; }}

class Manifest {

public MyHelperClass getAttributes(String o0){ return null; }}

class Attributes {

public MyHelperClass getValue(String o0){ return null; }}
