


class c15634388 {
public MyHelperClass assertEquals(String o0, String o1){ return null; }
	public MyHelperClass assertNotNull(String o0){ return null; }

//    @Test
    public void usingStream() throws IOException, NameNotFoundException {
        URL url = new URL("ftp://ftp.ebi.ac.uk/pub/databases/interpro/entry.list");
        InterproNameHandler handler = new InterproNameHandler(url.openStream());
        String interproName =(String)(Object) handler.getNameById("IPR008255");
        assertNotNull(interproName);
        assertEquals("Pyridine nucleotide-disulphide oxidoreductase, class-II, active site", interproName);
        assertEquals(null,(String)(Object) handler.getNameById("Active_site"));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class NameNotFoundException extends Exception{
	public NameNotFoundException(String errorMessage) { super(errorMessage); }
}

class Test {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InterproNameHandler {

InterproNameHandler(){}
	InterproNameHandler(MyHelperClass o0){}
	public MyHelperClass getNameById(String o0){ return null; }}
