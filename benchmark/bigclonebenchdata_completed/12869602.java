
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c12869602 {
public MyHelperClass Logger;
	public MyHelperClass Level;
	public MyHelperClass assertTrue(boolean o0){ return null; }
	public MyHelperClass assertFalse(String o0, boolean o1){ return null; }

//    @Test
    public void test_validate_tag_getTopAlbums() {
        try {
            MyHelperClass SchemaFactory = new MyHelperClass();
            SchemaFactory factory =(SchemaFactory)(Object) SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
            File schemaLocation = new File("tes.xsd");
            Schema schema =(Schema)(Object) factory.newSchema(schemaLocation);
            Validator validator =(Validator)(Object) schema.newValidator();
            URL url = new URL("http://ws.audioscrobbler.com/2.0/?method=tag.gettopalbums&tag=disco&api_key=b25b959554ed76058ac220b7b2e0a026");
            InputStream inputStream =(InputStream)(Object) url.openStream();
            Source source =(Source)(Object) new StreamSource(inputStream);
            validator.validate(source);
        } catch (UncheckedIOException ex) {
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(GetTopAlbums_Test.class.getName()).log(Level.SEVERE,(Object)(Object) null,(IOException)(Object) ex);
            assertFalse("File not found", true);
        } catch (ArithmeticException ex) {
            Logger.getLogger(GetTopAlbums_Test.class.getName()).log(Level.SEVERE,(Object)(Object) null,(IOException)(Object) ex);
            assertFalse("Schema did not validate", true);
        }
        assertTrue(true);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, Object o1, IOException o2){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, SAXException o2){ return null; }
	public MyHelperClass newInstance(String o0){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }}

class Test {

}

class SchemaFactory {

public MyHelperClass newSchema(File o0){ return null; }}

class File {

File(String o0){}
	File(){}}

class Schema {

public MyHelperClass newValidator(){ return null; }}

class Validator {

public MyHelperClass validate(Source o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class Source {

}

class StreamSource {

StreamSource(){}
	StreamSource(InputStream o0){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class GetTopAlbums_Test {

}
