


class c18423360 {

    protected Ontology loadOntology(String ontologyIri) throws IOException, ParserException, InvalidModelException {
        assert ontologyIri != null;
        URL url = null;
        Ontology ontology = null;
        url = new URL(ontologyIri);
        InputStream is =(InputStream)(Object) url.openStream();
        MyHelperClass parser = new MyHelperClass();
        TopEntity[] identifiable =(TopEntity[])(Object) parser.parse(new InputStreamReader(is));
        if (identifiable.length > 0 &&(Ontology)(Object) identifiable[0] instanceof Ontology) {
            ontology = ((Ontology)(Ontology)(Object) identifiable[0]);
        }
        return ontology;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass parse(InputStreamReader o0){ return null; }}

class Ontology {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ParserException extends Exception{
	public ParserException(String errorMessage) { super(errorMessage); }
}

class InvalidModelException extends Exception{
	public InvalidModelException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class TopEntity {

}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}
