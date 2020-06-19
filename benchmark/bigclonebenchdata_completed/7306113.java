
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c7306113 {
public MyHelperClass OWLManager;

//    @Override
    public void setOntology1Document(URL url1) throws IllegalArgumentException {
        if (url1 == null) throw new IllegalArgumentException("Input parameter URL for ontology 1 is null.");
        try {
            MyHelperClass ont1 = new MyHelperClass();
            ont1 = OWLManager.createOWLOntologyManager().loadOntologyFromOntologyDocument(url1.openStream());
        } catch (UncheckedIOException e) {
            throw new IllegalArgumentException("Cannot open stream for ontology 1 from given URL.");
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Cannot load ontology 1 from given URL.");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createOWLOntologyManager(){ return null; }
	public MyHelperClass loadOntologyFromOntologyDocument(MyHelperClass o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class OWLOntologyCreationException extends Exception{
	public OWLOntologyCreationException(String errorMessage) { super(errorMessage); }
}
