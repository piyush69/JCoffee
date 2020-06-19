
import java.io.UncheckedIOException;


class c1162514 {

    private LSInput resolveResource(String aPublicId, String aSystemId, String aBaseURI, boolean baseUsed) {
        LSInput lsInput =(LSInput)(Object) new DefaultLSInput();
        lsInput.setPublicId(aPublicId);
        lsInput.setSystemId(aSystemId);
        String base = null;
        try {
            int baseEndPos = -1;
            if (aBaseURI != null) {
                baseEndPos = aBaseURI.lastIndexOf("/");
            }
            if (baseEndPos <= 0) {
                if (baseUsed) {
                    return null;
                } else {
                    MyHelperClass schemaBasePath = new MyHelperClass();
                    return resolveResource(aPublicId, aSystemId, schemaBasePath + "/" + aSystemId, true);
                }
            }
            base = aBaseURI.substring(0, baseEndPos);
            URL url = new URL(base + "/" + aSystemId);
            lsInput.setByteStream(url.openConnection().getInputStream());
            return lsInput;
        } catch (UncheckedIOException e) {
            return resolveResource(aPublicId, aSystemId, base, baseUsed);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInputStream(){ return null; }}

class LSInput {

public MyHelperClass setPublicId(String o0){ return null; }
	public MyHelperClass setSystemId(String o0){ return null; }
	public MyHelperClass setByteStream(MyHelperClass o0){ return null; }}

class DefaultLSInput {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
