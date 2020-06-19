
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c21214234 {
public MyHelperClass logger;

    private PluginInfo loadPluginInfo(URL filename) throws PluginNotFoundException {
        if (filename == null) return null;
        BufferedReader in = null;
        InputStream is = null;
        String mainClass = null;
        String u = filename.toString();
        PluginInfo pi = new PluginInfo();
        URL url;
        try {
            url = new URL("jar:" + u + "!/");
        } catch (UncheckedIOException mue) {
            throw new PluginNotFoundException((String)(Object)mue);
        }
        pi.setURL(filename);
        HashMap names = new HashMap();
        boolean seemsOK = false;
        for (int tries = 0; (tries <= 5) && (!seemsOK); tries++) {
            try {
                JarURLConnection jarConnection = (JarURLConnection)(JarURLConnection)(Object) url.openConnection();
                jarConnection.setUseCaches(false);
                JarFile jf =(JarFile)(Object) jarConnection.getJarFile();
                is =(InputStream)(Object) jf.getInputStream(jf.getJarEntry("META-INF/MANIFEST.MF"));
                in = new BufferedReader(new InputStreamReader(is));
                String line;
                while ((line =(String)(Object) in.readLine()) != null) {
                    if (line.startsWith("Frostplugin-Main-Class: ")) {
                        mainClass = line.substring("Frostplugin-Main-Class: ".length()).trim();
                        pi.setMainClass(mainClass);
                        MyHelperClass Level = new MyHelperClass();
                        logger.log(Level.SEVERE, "Found plugin main class " + mainClass + " from manifest");
                    }
                }
                is =(InputStream)(Object) jf.getInputStream(jf.getJarEntry("pluginname.properties"));
                in = new BufferedReader(new InputStreamReader(is));
                while ((line =(String)(Object) in.readLine()) != null) {
                    if (line.startsWith("#")) {
                        continue;
                    }
                    if (line.length() == 0) {
                        continue;
                    }
                    String[] sa = line.split("=", 2);
                    names.put(sa[0], sa[1]);
                    pi.setPluginNames(names);
                }
                seemsOK = true;
            } catch (Exception e) {
                if (tries >= 5) throw new PluginNotFoundException("Initialization error:" + filename, e);
                try {
                    Thread.sleep(100);
                } catch (Exception ee) {
                }
            } finally {
                try {
                    if (is != null) is.close();
                    if (in != null) in.close();
                } catch (UncheckedIOException ioe) {
                }
            }
        }
        return pi;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, String o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class PluginInfo {

public MyHelperClass setPluginNames(HashMap o0){ return null; }
	public MyHelperClass setURL(URL o0){ return null; }
	public MyHelperClass setMainClass(String o0){ return null; }}

class PluginNotFoundException extends Exception{
	public PluginNotFoundException(String errorMessage) { super(errorMessage); }
	PluginNotFoundException(String o0, Exception o1){}
	PluginNotFoundException(){}
}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class HashMap {

public MyHelperClass put(String o0, String o1){ return null; }}

class JarURLConnection {

public MyHelperClass getJarFile(){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }}

class JarFile {

public MyHelperClass getInputStream(MyHelperClass o0){ return null; }
	public MyHelperClass getJarEntry(String o0){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
