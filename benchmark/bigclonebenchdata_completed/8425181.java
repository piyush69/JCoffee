
import java.io.UncheckedIOException;


class c8425181 {

    public String getTemplateString(String templateFilename) {
        MyHelperClass servletContext = new MyHelperClass();
        InputStream is =(InputStream)(Object) servletContext.getResourceAsStream("/resources/" + templateFilename);
        StringWriter writer = new StringWriter();
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(is, writer);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return writer.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, StringWriter o1){ return null; }
	public MyHelperClass getResourceAsStream(String o0){ return null; }}

class InputStream {

}

class StringWriter {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
