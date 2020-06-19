
import java.io.UncheckedIOException;


class c21781575 {

    private String loadSchemas() {
        StringWriter writer = new StringWriter();
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy((InputStream)(Object)CoreOdfValidator.class.getResourceAsStream("schema_list.properties"), writer);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return writer.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, StringWriter o1){ return null; }}

class StringWriter {

}

class CoreOdfValidator {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}
