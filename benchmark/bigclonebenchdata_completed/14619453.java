import java.io.*;
import java.lang.*;
import java.util.*;



class c14619453 {
public MyHelperClass ClassUtils;

    public Set<String> getAvailableRoles() {
        MyHelperClass availableRoles = new MyHelperClass();
        if (availableRoles == null) {
//            MyHelperClass availableRoles = new MyHelperClass();
            availableRoles =(MyHelperClass)(Object) new HashSet<String>();
            try {
                MyHelperClass ROLE_FILE_LOCATION = new MyHelperClass();
                Enumeration<URL> resources =(Enumeration<URL>)(Object) ClassUtils.getDefaultClassLoader().getResources(ROLE_FILE_LOCATION);
                while (resources.hasMoreElements()) {
                    URL url = resources.nextElement();
                    InputStream is = null;
                    try {
                        URLConnection con =(URLConnection)(Object) url.openConnection();
                        con.setUseCaches(false);
                        is =(InputStream)(Object) con.getInputStream();
                        MyHelperClass IOUtils = new MyHelperClass();
                        List<String> lines =(List<String>)(Object) IOUtils.readLines(is, "ISO-8859-1");
                        if (lines != null) {
                            for (String line : lines) {
//                                MyHelperClass availableRoles = new MyHelperClass();
                                availableRoles.add(line.trim());
                            }
                        }
                    } finally {
                        if (is != null) {
                            is.close();
                        }
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
//        MyHelperClass availableRoles = new MyHelperClass();
        return (Set<String>)(Object)availableRoles;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass readLines(InputStream o0, String o1){ return null; }
	public MyHelperClass getDefaultClassLoader(){ return null; }
	public MyHelperClass add(String o0){ return null; }
	public MyHelperClass getResources(MyHelperClass o0){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}
