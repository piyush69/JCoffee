


class c10385564 {
public MyHelperClass PROPERTIES_FILENAME;
	public MyHelperClass properties;
	public MyHelperClass NAMES_PARAMETER;
	public MyHelperClass getProperties(){ return null; }
	public MyHelperClass readContents(String o0){ return null; }
	public MyHelperClass getName2Query(){ return null; }

    public void SparqlQueryLoaderImpl() throws IOException {
        ClassLoader loader = SparqlQueryLoaderImpl.class.getClassLoader();
        URL url =(URL)(Object) loader.getResource((String)(Object)PROPERTIES_FILENAME);
        InputStream stream =(InputStream)(Object) url.openStream();
        properties.load(stream);
        stream.close();
        String names =(String)(Object) getProperties().getProperty(NAMES_PARAMETER);
        StringTokenizer st = new StringTokenizer(names, ",");
        while ((boolean)(Object)st.hasMoreTokens()) {
            String name =(String)(Object) st.nextToken();
            String value =(String)(Object) readContents(String.format("sparql/%s.sparql", name));
            getName2Query().put(name, value);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getProperty(MyHelperClass o0){ return null; }
	public MyHelperClass load(InputStream o0){ return null; }
	public MyHelperClass put(String o0, String o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class SparqlQueryLoaderImpl {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class StringTokenizer {

StringTokenizer(){}
	StringTokenizer(String o0, String o1){}
	public MyHelperClass nextToken(){ return null; }
	public MyHelperClass hasMoreTokens(){ return null; }}
