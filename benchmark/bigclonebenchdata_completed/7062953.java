import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7062953 {
public MyHelperClass logError(MyHelperClass o0, String o1, String o2, String o3){ return null; }
	public MyHelperClass logInfo(MyHelperClass o0, String o1, URL o2, String o3){ return null; }
	public MyHelperClass logInfo(MyHelperClass o0, String o1, String o2, String o3){ return null; }
	public MyHelperClass logError(MyHelperClass o0, String o1, URL o2, String o3){ return null; }
	public MyHelperClass logInfo(MyHelperClass o0, String o1, String o2){ return null; }
public MyHelperClass loadJar(JarFileInfo o0){ return null; }
public MyHelperClass lstJarFile;
	public MyHelperClass pd;
	public MyHelperClass hsDeleteOnExit;
	public MyHelperClass LogArea;
	public MyHelperClass hmClass;
	public MyHelperClass initLogger(){ return null; }
	public MyHelperClass shutdown(){ return null; }
	public MyHelperClass checkShading(){ return null; }

    public  c7062953(ClassLoader parent)  throws Throwable {
        super(parent);
        initLogger();
        hmClass =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new HashMap<String, Class<?>>();
        lstJarFile =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new ArrayList<JarFileInfo>();
        hsDeleteOnExit =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new HashSet<File>();
        String sUrlTopJar = null;
        pd =(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) getClass().getProtectionDomain();
        CodeSource cs =(CodeSource)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) pd.getCodeSource();
        URL urlTopJar = cs.getLocation();
        String protocol = urlTopJar.getProtocol();
        JarFileInfo jarFileInfo = null;
        if ("http".equals(protocol) || "https".equals(protocol)) {
            try {
                urlTopJar = new URL("jar:" + urlTopJar + "!/");
                JarURLConnection jarCon = (JarURLConnection) urlTopJar.openConnection();
                JarFile jarFile =(JarFile)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) jarCon.getJarFile();
                jarFileInfo = new JarFileInfo(jarFile, jarFile.getName(), null, null);
                logInfo(LogArea.JAR, "Loading from top JAR: '%s' PROTOCOL: '%s'", urlTopJar, protocol);
            } catch (Exception e) {
                logError(LogArea.JAR, "Failure to load HTTP JAR: %s %s", urlTopJar, e.toString());
                return;
            }
        }
        if ("file".equals(protocol)) {
            try {
                sUrlTopJar = URLDecoder.decode(urlTopJar.getFile(), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                logError(LogArea.JAR, "Failure to decode URL: %s %s", urlTopJar, e.toString());
                return;
            }
            File fileJar = new File(sUrlTopJar);
            if (fileJar.isDirectory()) {
                logInfo(LogArea.JAR, "Loading from exploded directory: %s", sUrlTopJar);
                return;
            }
            try {
                jarFileInfo = new JarFileInfo(new JarFile(fileJar), fileJar.getName(), null, null);
                logInfo(LogArea.JAR, "Loading from top JAR: '%s' PROTOCOL: '%s'", sUrlTopJar, protocol);
            } catch (IOException e) {
                logError(LogArea.JAR, "Not a JAR: %s %s", sUrlTopJar, e.toString());
                return;
            }
        }
        try {
            if (jarFileInfo == null) {
                throw new IOException(String.format("Unknown protocol %s", protocol));
            }
            loadJar(jarFileInfo);
        } catch (IOException e) {
            logError(LogArea.JAR, "Not valid URL: %s %s", urlTopJar, e.toString());
            return;
        }
        checkShading();
        Runtime.getRuntime().addShutdownHook(new Thread() {

            public void run() {
                shutdown();
            }
        });
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass JAR;
public MyHelperClass getCodeSource(){ return null; }}

class JarFileInfo {

JarFileInfo(JarFile o0, MyHelperClass o1, Object o2, Object o3){}
	JarFileInfo(JarFile o0, String o1, Object o2, Object o3){}
	JarFileInfo(){}}

class JarFile {

JarFile(){}
	JarFile(File o0){}
	public MyHelperClass getName(){ return null; }}

class Object {

Object(ClassLoader o0){}
	Object(){}}
