import java.io.*;
import java.lang.*;
import java.util.*;



class c15890129 {

    public File getAppHome() {
        MyHelperClass appHome = new MyHelperClass();
        if (appHome == null) {
            if (System.getProperty("app.home") != null) {
//                MyHelperClass appHome = new MyHelperClass();
                appHome =(MyHelperClass)(Object) new File(System.getProperty("app.home"));
            }
//            MyHelperClass appHome = new MyHelperClass();
            if (appHome == null) {
                URL url =(URL)(Object) Main.class.getClassLoader().getResource("com/hs/mail/container/Main.class");
                if (url != null) {
                    try {
                        JarURLConnection jarConnection = (JarURLConnection)(JarURLConnection)(Object) url.openConnection();
                        url =(URL)(Object) jarConnection.getJarFileURL();
                        URI baseURI =(URI)(Object) (new URI(url.toString()).resolve(".."));
//                        MyHelperClass appHome = new MyHelperClass();
                        appHome =(MyHelperClass)(Object) (new File((String)(Object)baseURI).getCanonicalFile());
//                        MyHelperClass appHome = new MyHelperClass();
                        System.setProperty("app.home",(String)(Object) appHome.getAbsolutePath());
                    } catch (Exception ignored) {
                    }
                }
            }
//            MyHelperClass appHome = new MyHelperClass();
            if (appHome == null) {
//                MyHelperClass appHome = new MyHelperClass();
                appHome =(MyHelperClass)(Object) new File("../.");
//                MyHelperClass appHome = new MyHelperClass();
                System.setProperty("app.home",(String)(Object) appHome.getAbsolutePath());
            }
        }
//        MyHelperClass appHome = new MyHelperClass();
        return (File)(Object)appHome;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getAbsolutePath(){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class Main {

}

class JarURLConnection {

public MyHelperClass getJarFileURL(){ return null; }}

class URI {

URI(){}
	URI(String o0){}
	public MyHelperClass resolve(String o0){ return null; }}
