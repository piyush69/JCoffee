
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c14239158 {

    public Ontology open(String resource_name) {
        Ontology ontology = null;
        try {
            URL url = null;
            if (resource_name.startsWith("jar")) url = new URL(resource_name); else {
                ClassLoader cl = this.getClass().getClassLoader();
                url =(URL)(Object) cl.getResource(resource_name);
            }
            InputStream input_stream;
            if (url != null) {
                JarURLConnection jc = (JarURLConnection)(JarURLConnection)(Object) url.openConnection();
                input_stream =(InputStream)(Object) jc.getInputStream();
            } else input_stream =(InputStream)(Object) new FileInputStream(resource_name);
            ObjectInputStream ois = new ObjectInputStream(input_stream);
            ontology = (Ontology)(Ontology)(Object) ois.readObject();
            ois.close();
        } catch (UncheckedIOException ioe) {
            ioe.printStackTrace();
        } catch (ArithmeticException cnfe) {
            cnfe.printStackTrace();
        }
        return ontology;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Ontology {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class InputStream {

}

class JarURLConnection {

public MyHelperClass getInputStream(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class ObjectInputStream {

ObjectInputStream(){}
	ObjectInputStream(InputStream o0){}
	public MyHelperClass readObject(){ return null; }
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
