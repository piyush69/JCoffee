
import java.io.UncheckedIOException;


class c4369694 {
public MyHelperClass printDebugIfEnabled(String o0, URL o1){ return null; }
	public MyHelperClass printError(String o0, IOException o1, boolean o2){ return null; }
public MyHelperClass configurationSource;
	public MyHelperClass properties;
	public MyHelperClass devDebug;
	public MyHelperClass KEY_IMPORT;
	public MyHelperClass printDebugIfEnabled(String o0){ return null; }

    private void loadProperties() throws IOException {
        MyHelperClass properties = new MyHelperClass();
        if (properties == null) {
            return;
        }
        printDebugIfEnabled("Loading properties");
        InputStream inputStream =(InputStream)(Object) configurationSource.openStream();
        Properties newProperties = new Properties();
        try {
            newProperties.load(inputStream);
        } finally {
            inputStream.close();
        }
        String importList =(String)(Object) newProperties.getProperty(KEY_IMPORT);
        if (importList != null) {
            importList = importList.trim();
            if (importList.length() > 0) {
                String[] filesToImport = importList.split(",");
                if (filesToImport != null && filesToImport.length != 0) {
                    String configurationContext =(String)(Object) configurationSource.toExternalForm();
                    int lastSlash = configurationContext.lastIndexOf('/');
                    lastSlash += 1;
                    configurationContext = configurationContext.substring(0, lastSlash);
                    for (int i = 0; i < filesToImport.length; i++) {
                        String filenameToImport = filesToImport[i];
                        URL urlToImport = new URL(configurationContext + filenameToImport);
                        InputStream importStream = null;
                        try {
                            printDebugIfEnabled("Importing file", urlToImport);
                            importStream =(InputStream)(Object) urlToImport.openStream();
                            newProperties.load(importStream);
                        } catch (UncheckedIOException e) {
                            printError("Error importing properties file: " + filenameToImport + "(" + urlToImport + ")",(IOException)(Object) e, true);
                        } finally {
                            if (importStream != null) importStream.close();
                        }
                    }
                }
            }
        }
        if ((boolean)(Object)devDebug) {
//            Set properties = newProperties.entrySet();
            printDebugIfEnabled("_____ Properties List START _____");
            for (Iterator iterator =(Iterator)(Object) properties.iterator();(boolean)(Object) iterator.hasNext(); ) {
                Entry entry = (Entry)(Entry)(Object) iterator.next();
                printDebugIfEnabled((String)(String)(Object) entry.getKey(),(URL)(Object) entry.getValue());
            }
            printDebugIfEnabled("______ Properties List END ______");
        }
        properties.clear();
        properties.putAll(newProperties);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass putAll(Properties o0){ return null; }
	public MyHelperClass toExternalForm(){ return null; }
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass clear(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class Properties {

public MyHelperClass load(InputStream o0){ return null; }
	public MyHelperClass getProperty(MyHelperClass o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class Set {

public MyHelperClass iterator(){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class Entry {

public MyHelperClass getKey(){ return null; }
	public MyHelperClass getValue(){ return null; }}
