import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1944490 {
public MyHelperClass getLogger(){ return null; }
	public MyHelperClass getEnvironment(){ return null; }
	public MyHelperClass getContext(){ return null; }
	public MyHelperClass getPersistenceProvider(){ return null; }
public MyHelperClass persistenceUnitInfo;

    protected PersistenceUnitInfo getPersistenceUnitInfo()  throws Throwable {
        if (this.persistenceUnitInfo == null) {
            this.persistenceUnitInfo =(MyHelperClass)(Object) new PersistenceUnitInfo() {

                private List<ClassTransformer> transformers;

                private List<String> managedClasses;

                private List<String> mappingFileNames;

                private ClassLoader classLoader;

                public String getPersistenceUnitName() {
                    return "jomc-standalone";
                }

                public String getPersistenceProviderClassName() {
                    return getPersistenceProvider().getClass().getName();
                }

                public PersistenceUnitTransactionType getTransactionType() {
                    MyHelperClass PersistenceUnitTransactionType = new MyHelperClass();
                    return(PersistenceUnitTransactionType)(Object) PersistenceUnitTransactionType.JTA;
                }

                public DataSource getJtaDataSource() {
                    try {
                        return (DataSource)(DataSource)(Object) getContext().lookup(getEnvironment().getJtaDataSourceJndiName());
                    } catch (final ArithmeticException e) {
                        getLogger().fatal((SAXException)(Object)e);
                        throw new RuntimeException(e);
                    }
                }

                public DataSource getNonJtaDataSource() {
                    return null;
                }

                public List<String> getMappingFileNames() {
                    try {
                        if (this.mappingFileNames == null) {
                            this.mappingFileNames = new LinkedList<String>();
                            MyHelperClass DocumentBuilderFactory = new MyHelperClass();
                            final DocumentBuilderFactory factory =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
                            factory.setNamespaceAware(true);
                            factory.setValidating(false);
                            final DocumentBuilder documentBuilder =(DocumentBuilder)(Object) factory.newDocumentBuilder();
                            for (final Enumeration<URL> e = this.getNewTempClassLoader().getResources("META-INF/persistence.xml"); e.hasMoreElements(); ) {
                                final URL url = e.nextElement();
                                final InputStream in = url.openStream();
                                final Document doc =(Document)(Object) documentBuilder.parse(in);
                                in.close();
                                MyHelperClass PERSISTENCE_NS = new MyHelperClass();
                                final NodeList persistenceUnits =(NodeList)(Object) doc.getElementsByTagNameNS(PERSISTENCE_NS, "persistence-unit");
                                for (int i =(int)(Object) persistenceUnits.getLength() - 1; i >= 0; i--) {
                                    final Element persistenceUnit = (Element)(Element)(Object) persistenceUnits.item(i);
//                                    MyHelperClass PERSISTENCE_NS = new MyHelperClass();
                                    final NodeList mappingFiles =(NodeList)(Object) persistenceUnit.getElementsByTagNameNS(PERSISTENCE_NS, "mapping-file");
                                    for (int j =(int)(Object) mappingFiles.getLength() - 1; j >= 0; j--) {
                                        final Element mappingFile = (Element)(Element)(Object) mappingFiles.item(j);
                                        this.mappingFileNames.add((String)(Object)mappingFile.getFirstChild().getNodeValue());
                                    }
                                }
                            }
                        }
                        return this.mappingFileNames;
                    } catch (final ArrayIndexOutOfBoundsException e) {
                        getLogger().fatal((SAXException)(Object)e);
                        throw new RuntimeException(e);
                    } catch (final IOException e) {
                        getLogger().fatal(e);
                        throw new RuntimeException(e);
                    } catch (final ArrayStoreException e) {
                        getLogger().fatal((SAXException)(Object)e);
                        throw new RuntimeException(e);
                    }
                }

                public List<URL> getJarFileUrls() {
                    try {
                        final List<URL> jarFileUrls = new LinkedList<URL>();
                        for (final Enumeration<URL> unitUrls = this.getClassLoader().getResources("META-INF/persistence.xml"); unitUrls.hasMoreElements(); ) {
                            final URL unitUrl = unitUrls.nextElement();
                            final String externalForm = unitUrl.toExternalForm();
                            final String jarUrl = externalForm.substring(0, externalForm.indexOf("META-INF"));
                            jarFileUrls.add(new URL(jarUrl));
                        }
                        return jarFileUrls;
                    } catch (final IOException e) {
                        getLogger().fatal(e);
                        throw new RuntimeException(e.getMessage(), e);
                    }
                }

                public URL getPersistenceUnitRootUrl() {
                    return(URL)(Object) getEnvironment().getJpaRootUrl();
                }

                public List<String> getManagedClassNames() {
                    try {
                        if (this.managedClasses == null) {
                            this.managedClasses = new LinkedList<String>();
                            MyHelperClass DocumentBuilderFactory = new MyHelperClass();
                            final DocumentBuilderFactory factory =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
                            factory.setNamespaceAware(true);
                            factory.setValidating(false);
                            final DocumentBuilder documentBuilder =(DocumentBuilder)(Object) factory.newDocumentBuilder();
                            for (final Enumeration<URL> e = this.getNewTempClassLoader().getResources("META-INF/persistence.xml"); e.hasMoreElements(); ) {
                                final URL url = e.nextElement();
                                final InputStream in = url.openStream();
                                final Document doc =(Document)(Object) documentBuilder.parse(in);
                                in.close();
                                MyHelperClass PERSISTENCE_NS = new MyHelperClass();
                                final NodeList persistenceUnits =(NodeList)(Object) doc.getElementsByTagNameNS(PERSISTENCE_NS, "persistence-unit");
                                for (int i =(int)(Object) persistenceUnits.getLength() - 1; i >= 0; i--) {
                                    final Element persistenceUnit = (Element)(Element)(Object) persistenceUnits.item(i);
//                                    MyHelperClass PERSISTENCE_NS = new MyHelperClass();
                                    final NodeList classes =(NodeList)(Object) persistenceUnit.getElementsByTagNameNS(PERSISTENCE_NS, "class");
                                    for (int j =(int)(Object) classes.getLength() - 1; j >= 0; j--) {
                                        final Element clazz = (Element)(Element)(Object) classes.item(j);
                                        this.managedClasses.add((String)(Object)clazz.getFirstChild().getNodeValue());
                                    }
                                }
                            }
                        }
                        return this.managedClasses;
                    } catch (final ClassCastException e) {
                        getLogger().fatal((SAXException)(Object)e);
                        throw new RuntimeException(e);
                    } catch (final IOException e) {
                        getLogger().fatal(e);
                        throw new RuntimeException(e);
                    } catch (final IllegalArgumentException e) {
                        getLogger().fatal((SAXException)(Object)e);
                        throw new RuntimeException(e);
                    }
                }

                public boolean excludeUnlistedClasses() {
                    return false;
                }

                public Properties getProperties() {
                    return(Properties)(Object) getEnvironment().getProperties();
                }

                public ClassLoader getClassLoader() {
                    if (this.classLoader == null) {
                        this.classLoader = this.getClass().getClassLoader();
                        if (this.classLoader == null) {
                            this.classLoader = ClassLoader.getSystemClassLoader();
                        }
                        this.classLoader = new URLClassLoader(new URL[] {(URL)(Object) getEnvironment().getJpaRootUrl() }, this.classLoader);
                    }
                    return this.classLoader;
                }

                public void addTransformer(final ClassTransformer transformer) {
                    if (this.transformers == null) {
                        this.transformers = new LinkedList<ClassTransformer>();
                    }
                    this.transformers.add(transformer);
                }

                public ClassLoader getNewTempClassLoader() {
                    final List<URL> jarFileUrls = this.getJarFileUrls();
                    jarFileUrls.add((URL)(Object)getEnvironment().getJpaRootUrl());
                    return new URLClassLoader(jarFileUrls.toArray(new URL[jarFileUrls.size()]));
                }
            };
        }
        return(PersistenceUnitInfo)(Object) this.persistenceUnitInfo;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass JTA;
public MyHelperClass fatal(SAXException o0){ return null; }
	public MyHelperClass getProperties(){ return null; }
	public MyHelperClass getNodeValue(){ return null; }
	public MyHelperClass fatal(NamingException o0){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass getJpaRootUrl(){ return null; }
	public MyHelperClass lookup(MyHelperClass o0){ return null; }
	public MyHelperClass fatal(IOException o0){ return null; }
	public MyHelperClass fatal(ParserConfigurationException o0){ return null; }
	public MyHelperClass getJtaDataSourceJndiName(){ return null; }}

class PersistenceUnitInfo {

}

class ClassTransformer {

}

class PersistenceUnitTransactionType {

}

class DataSource {

}

class NamingException extends Exception{
	public NamingException(String errorMessage) { super(errorMessage); }
}

class DocumentBuilderFactory {

public MyHelperClass setNamespaceAware(boolean o0){ return null; }
	public MyHelperClass newDocumentBuilder(){ return null; }
	public MyHelperClass setValidating(boolean o0){ return null; }}

class DocumentBuilder {

public MyHelperClass parse(InputStream o0){ return null; }}

class Document {

public MyHelperClass getElementsByTagNameNS(MyHelperClass o0, String o1){ return null; }}

class NodeList {

public MyHelperClass getLength(){ return null; }
	public MyHelperClass item(int o0){ return null; }}

class Element {

public MyHelperClass getElementsByTagNameNS(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getFirstChild(){ return null; }}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}
