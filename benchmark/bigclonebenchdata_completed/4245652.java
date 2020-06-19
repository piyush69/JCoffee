
import java.io.UncheckedIOException;


class c4245652 {

    public InputStream getExportFile() {
        URL url =(URL)(Object) ExportAction.class.getClassLoader().getResource("sysConfig.xml");
        if (url != null) try {
            return(InputStream)(Object) url.openStream();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InputStream {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class ExportAction {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
