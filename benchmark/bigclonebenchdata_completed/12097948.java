
import java.io.UncheckedIOException;


class c12097948 {
public MyHelperClass getLines(InputStream o0){ return null; }
public MyHelperClass StringUtils;
	public MyHelperClass constraints;

    public void AsciiParser(String systemID) throws GridBagException {
        String id = systemID;
        if (id.endsWith(".xml")) {
            id =(String)(Object) StringUtils.replace(id, ".xml", ".gbc");
        }
        ClassLoader loader = this.getClass().getClassLoader();
        URL url =(URL)(Object) loader.getResource(id);
        if (url == null) {
            throw new GridBagException("Cannot located resource : \"" + systemID + "\".");
        }
        try {
            InputStream inStream =(InputStream)(Object) url.openStream();
            constraints = getLines(inStream);
            inStream.close();
        } catch (UncheckedIOException ie1) {
            throw new GridBagException("Cannot read from resource " + id);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass replace(String o0, String o1, String o2){ return null; }}

class GridBagException extends Exception{
	public GridBagException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
