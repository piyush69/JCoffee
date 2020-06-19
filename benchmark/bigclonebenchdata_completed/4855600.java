
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c4855600 {
public MyHelperClass SERVICE_LOG;

    public void schema(final Row row, TestResults testResults) throws Exception {
        String urlString =(String)(Object) row.text(1);
        String schemaBase = null;
        if ((boolean)(Object)row.cellExists(2)) {
            schemaBase =(String)(Object) row.text(2);
        }
        try {
            StreamSource schemaSource;
            MyHelperClass CLASS_PREFIX = new MyHelperClass();
            if (urlString.startsWith((String)(Object)CLASS_PREFIX)) {
//                MyHelperClass CLASS_PREFIX = new MyHelperClass();
                InputStream schema =(InputStream)(Object) XmlValidator.class.getClassLoader().getResourceAsStream(urlString.substring((int)(Object)CLASS_PREFIX.length()));
                schemaSource = new StreamSource(schema);
            } else {
                URL url = new URL(urlString);
                URLConnection urlConnection =(URLConnection)(Object) url.openConnection();
                urlConnection.connect();
                InputStream inputStream =(InputStream)(Object) urlConnection.getInputStream();
                schemaSource = new StreamSource(inputStream);
            }
            MyHelperClass XMLConstants = new MyHelperClass();
            SchemaFactory factory =(SchemaFactory)(Object) SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            if (schemaBase != null) {
                DefaultLSResourceResolver resolver = new DefaultLSResourceResolver(schemaBase);
                factory.setResourceResolver(resolver);
            }
            factory.newSchema((StreamSource)(Object)new URL(urlString));
            Validator validator =(Validator)(Object) factory.newSchema(schemaSource).newValidator();
            MyHelperClass xml = new MyHelperClass();
            StreamSource source = new StreamSource((InputStream)(Object)new StringReader(xml));
            validator.validate(source);
            row.pass(testResults);
        } catch (UncheckedIOException e) {
            SERVICE_LOG.warn("schema error",(IOException)(Object) e);
            throw new FitFailureException(e.getMessage());
        } catch (ArithmeticException e) {
            SERVICE_LOG.warn("schema error",(IOException)(Object) e);
            throw new FitFailureException(e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass W3C_XML_SCHEMA_NS_URI;
public MyHelperClass warn(String o0, IOException o1){ return null; }
	public MyHelperClass newValidator(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass warn(String o0, SAXException o1){ return null; }}

class Row {

public MyHelperClass cellExists(int o0){ return null; }
	public MyHelperClass pass(TestResults o0){ return null; }
	public MyHelperClass text(int o0){ return null; }}

class TestResults {

}

class StreamSource {

StreamSource(){}
	StreamSource(InputStream o0){}}

class InputStream {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class SchemaFactory {

public MyHelperClass setResourceResolver(DefaultLSResourceResolver o0){ return null; }
	public MyHelperClass newSchema(StreamSource o0){ return null; }
	public static MyHelperClass newInstance(MyHelperClass o0){ return null; }}

class DefaultLSResourceResolver {

DefaultLSResourceResolver(String o0){}
	DefaultLSResourceResolver(){}}

class Validator {

public MyHelperClass validate(StreamSource o0){ return null; }}

class StringReader {

StringReader(){}
	StringReader(MyHelperClass o0){}}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class FitFailureException extends Exception{
	public FitFailureException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class XmlValidator {

}
