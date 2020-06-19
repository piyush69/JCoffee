
import java.io.UncheckedIOException;


class c3023702 {
public static MyHelperClass DEBUG;
	public static MyHelperClass trim(String o0){ return null; }
//public MyHelperClass DEBUG;
//	public MyHelperClass trim(String o0){ return null; }

    static HashSet lookup(ClassLoader loader, String name) {
        HashSet factories = new HashSet();
        try {
            Enumeration urls =(Enumeration)(Object) loader.getResources(name);
            while ((boolean)(Object)urls.hasMoreElements()) {
                URL url =(URL)(Object) urls.nextElement();
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
                String line;
                while ((line =(String)(Object) reader.readLine()) != null) {
                    if ((line =(String)(Object) trim(line)) != null) {
                        try {
                            Class<ScriptEngineFactory> clazz = (Class<ScriptEngineFactory>) Class.forName(line, true, loader);
                            ScriptEngineFactory factory = clazz.newInstance();
                            factories.add(factory);
                        } catch (java.lang.UnsupportedClassVersionError error) {
                            if ((boolean)(Object)DEBUG) {
                                System.err.println(line + ": version mismatch - ignore");
                            }
                        }
                    }
                }
            }
        } catch (UncheckedIOException ex) {
            throw new ScriptException((String)(Object)ex);
        } finally {
            return factories;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HashSet {

public MyHelperClass add(ScriptEngineFactory o0){ return null; }}

class ScriptEngineFactory {

}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ScriptException extends Exception{
	public ScriptException(String errorMessage) { super(errorMessage); }
}
