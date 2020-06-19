import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c12198266 {

    private DataSource loadSingleDataSource(ClassLoader contextLoader, URL url) throws IOException, DataSourceException {
        URI datasourceURI;
        OWLOntology datasourceOntology = null;
        URL baseURL = new URL(url.toString().replace("META-INF/artifact.properties", ""));
        Properties properties = new Properties();
        properties.load((Reader)(Object)url.openStream());
        String fileName = properties.get("db").toString() + ".owl";
        String pkg = properties.get("package").toString();
        MyHelperClass URI = new MyHelperClass();
        datasourceURI =(URI)(Object) URI.create("http://" + properties.get("host").toString() + "/" + fileName);
        Set<Class> beans = new HashSet<Class>();
        if (baseURL.toString().startsWith("jar") && baseURL.toString().endsWith("!/")) {
            JarURLConnection jarConn = (JarURLConnection)(JarURLConnection)(Object) baseURL.openConnection();
            Enumeration<JarEntry> entries =(Enumeration<JarEntry>)(Object) jarConn.getJarFile().entries();
            while (entries.hasMoreElements()) {
                JarEntry next = entries.nextElement();
                if ((Boolean)(Object)next.getName().startsWith(pkg.replace('.', '/')) && (Boolean)(Object)next.getName().endsWith(".class")) {
                    String fullClassName =(String)(Object) next.getName().replace('/', '.').replace((char)(Object)".class",(char)(Object) "");
                    try {
                        beans.add(contextLoader.loadClass(fullClassName));
                    } catch (ClassNotFoundException e) {
                        throw new DataSourceException("Unable to locate " + fullClassName + ".class", e);
                    }
                } else if (next.getName().equals(fileName)) {
                    String resName =(String)(Object) next.getName();
                    URL owl =(URL)(Object) contextLoader.getResource(resName);
                    try {
                        MyHelperClass OWLManager = new MyHelperClass();
                        datasourceOntology =(OWLOntology)(Object) OWLManager.createOWLOntologyManager().loadOntologyFromPhysicalURI(owl.toURI());
                    } catch (UncheckedIOException e) {
                        throw new DataSourceException("Bad syntax converting url -> uri: " + owl.toString(),(URISyntaxException)(Object) e);
                    } catch (ArithmeticException e) {
                        throw new DataSourceException("Couldn't create ontology from " + owl.toString(),(URISyntaxException)(Object) e);
                    }
                }
            }
            if (beans.size() == 0) {
                throw new DataSourceException("Failed to load beans for the datasource at " + url);
            }
            if (datasourceOntology == null) {
                throw new DataSourceException("The datasource at " + url + " contains no ontology, or the ontology could not be loaded");
            }
            return (DataSource)(Object)new BeanModelDataSource(datasourceURI, datasourceOntology);
        } else {
            throw new DataSourceException("Unable to create a datasource, cannot load classes with the " + "given URL protocol (" + baseURL + ")");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass entries(){ return null; }
	public MyHelperClass startsWith(String o0){ return null; }
	public MyHelperClass loadOntologyFromPhysicalURI(MyHelperClass o0){ return null; }
	public MyHelperClass replace(char o0, char o1){ return null; }
	public MyHelperClass create(String o0){ return null; }
	public MyHelperClass endsWith(String o0){ return null; }
	public MyHelperClass createOWLOntologyManager(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass toURI(){ return null; }
	public MyHelperClass openConnection(){ return null; }}

class DataSource {

}

class DataSourceException extends Exception{
	public DataSourceException(String errorMessage) { super(errorMessage); }
	DataSourceException(String o0, URISyntaxException o1){}
	DataSourceException(String o0, ClassNotFoundException o1){}
	DataSourceException(String o0, OWLOntologyCreationException o1){}
	DataSourceException(){}
}

class URI {

}

class OWLOntology {

}

class JarURLConnection {

public MyHelperClass getJarFile(){ return null; }}

class JarEntry {

public MyHelperClass getName(){ return null; }}

class URISyntaxException extends Exception{
	public URISyntaxException(String errorMessage) { super(errorMessage); }
}

class OWLOntologyCreationException extends Exception{
	public OWLOntologyCreationException(String errorMessage) { super(errorMessage); }
}

class BeanModelDataSource {

BeanModelDataSource(){}
	BeanModelDataSource(URI o0, OWLOntology o1){}}
