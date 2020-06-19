
import java.io.UncheckedIOException;


class c19347071 {
public static MyHelperClass LOG;
	public static MyHelperClass finalClose(BufferedReader o0){ return null; }
	public static MyHelperClass finalClose(InputStream o0){ return null; }
	public static MyHelperClass finalClose(InputStreamReader o0){ return null; }
//public MyHelperClass LOG;
//	public MyHelperClass finalClose(InputStreamReader o0){ return null; }
//	public MyHelperClass finalClose(BufferedReader o0){ return null; }
//	public MyHelperClass finalClose(InputStream o0){ return null; }

    private static List loadServicesImplementations(final Class ofClass) {
        List result =(List)(Object) new ArrayList();
        String override = System.getProperty(ofClass.getName());
        if (override != null) {
            result.add(override);
        }
        ClassLoader loader = ServiceLib.class.getClassLoader();
        URL url =(URL)(Object) loader.getResource("META-INF/services/" + ofClass.getName());
        if (url == null) {
            return result;
        }
        InputStream inStream = null;
        InputStreamReader reader = null;
        BufferedReader bReader = null;
        try {
            inStream =(InputStream)(Object) url.openStream();
            reader = new InputStreamReader(inStream);
            bReader = new BufferedReader(reader);
            String line;
            while ((line =(String)(Object) bReader.readLine()) != null) {
                if (!line.matches("\\s*(#.*)?")) {
                    result.add(line.trim());
                }
            }
        } catch (UncheckedIOException iox) {
            MyHelperClass Level = new MyHelperClass();
            LOG.log(Level.WARNING, "Could not load services descriptor: " + url.toString(),(IOException)(Object) iox);
        } finally {
            finalClose(bReader);
            finalClose(reader);
            finalClose(inStream);
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass WARNING;
public MyHelperClass log(MyHelperClass o0, String o1, IOException o2){ return null; }}

class List {

public MyHelperClass add(String o0){ return null; }}

class ArrayList {

}

class ServiceLib {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
