
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c3357695 {

    public void readCatalog(Catalog catalog, String fileUrl) throws MalformedURLException, IOException, CatalogException {
        URL url = null;
        try {
            url = new URL(fileUrl);
        } catch (UncheckedIOException e) {
            url = new URL("file:///" + fileUrl);
        }
        MyHelperClass debug = new MyHelperClass();
        debug = catalog.getCatalogManager().debug;
        try {
            URLConnection urlCon =(URLConnection)(Object) url.openConnection();
            readCatalog(catalog,(String)(Object) urlCon.getInputStream());
        } catch (UncheckedIOException e) {
            catalog.getCatalogManager().debug.message(1, "Failed to load catalog, file not found", url.toString());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass debug;
public MyHelperClass message(int o0, String o1, String o2){ return null; }}

class Catalog {

public MyHelperClass getCatalogManager(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class CatalogException extends Exception{
	public CatalogException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}
