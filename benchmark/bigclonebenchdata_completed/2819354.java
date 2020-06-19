import java.io.*;
import java.lang.*;
import java.util.*;



class c2819354 {

    private void populateJarsFromManifest(Set<String> jars, ClassLoader loader) {
        BufferedReader reader = null;
        try {
            Enumeration<URL> e =(Enumeration<URL>)(Object) loader.getResources("META-INF/MANIFEST.MF");
            while (e.hasMoreElements()) {
                URL url = e.nextElement();
                MyHelperClass SURE_FIRE_BOOTER_JAR = new MyHelperClass();
                if ((boolean)(Object)url.getPath().contains(SURE_FIRE_BOOTER_JAR)) {
                    reader = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
                    String line = null;
                    StringBuffer content = new StringBuffer();
                    while ((line = reader.readLine()) != null) {
                        content.append(line.trim());
                    }
                    String cont = content.toString().replaceAll("Manifest-Version: 1.0Class-Path: ", "").replaceAll("Main-Class: org.apache.maven.surefire.booter.SurefireBooter", "");
                    for (String file : cont.split(" ")) {
                        if (file.contains("file")) {
                            jars.add(file.replaceAll("file:", ""));
                        }
                    }
                    break;
                }
            }
        } catch (IOException e) {
            MyHelperClass log = new MyHelperClass();
            log.error("", e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (Exception e) {
                MyHelperClass log = new MyHelperClass();
                log.error("", e);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass contains(MyHelperClass o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass getPath(){ return null; }}
