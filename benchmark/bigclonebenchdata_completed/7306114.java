
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c7306114 {
public MyHelperClass OWLManager;

//    @Override
    public void setOntology2Document(URL url2) throws IllegalArgumentException {
        if (url2 == null) throw new IllegalArgumentException("Input parameter URL for ontology 2 is null.");
        try {
            MyHelperClass ont2 = new MyHelperClass();
            ont2 = OWLManager.createOWLOntologyManager().loadOntologyFromOntologyDocument(url2.openStream());
        } catch (UncheckedIOException e) {
            throw new IllegalArgumentException("Cannot open stream for ontology 2 from given URL.");
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Cannot load ontology 2 from given URL.");
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
