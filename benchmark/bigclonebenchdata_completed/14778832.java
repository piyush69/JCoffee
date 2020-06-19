
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c14778832 {

    private boolean runValidation(PropertyMap map, URL url, URL schema) {
        ValidationDriver vd = new ValidationDriver(map);
        try {
            vd.loadSchema(new InputSource(schema.openStream()));
            return(boolean)(Object) vd.validate(new InputSource(url.openStream()));
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class PropertyMap {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class ValidationDriver {

ValidationDriver(){}
	ValidationDriver(PropertyMap o0){}
	public MyHelperClass loadSchema(InputSource o0){ return null; }
	public MyHelperClass validate(InputSource o0){ return null; }}

class InputSource {

InputSource(){}
	InputSource(MyHelperClass o0){}}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
