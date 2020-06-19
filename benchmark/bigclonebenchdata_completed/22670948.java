
import java.io.UncheckedIOException;


class c22670948 {

    private String writeInputStreamToString(InputStream stream) {
        StringWriter stringWriter = new StringWriter();
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(stream, stringWriter);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        String namespaces = stringWriter.toString().trim();
        return namespaces;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, StringWriter o1){ return null; }}

class InputStream {

}

class StringWriter {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
