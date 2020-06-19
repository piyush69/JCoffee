
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c21348951 {
public MyHelperClass setResponsePage(ErrorReportPage o0){ return null; }
public MyHelperClass processSubmittedDoap(String o0){ return null; }
public MyHelperClass logger;
	public MyHelperClass Session;
	public MyHelperClass IOUtils;
	public MyHelperClass hasError(){ return null; }

        protected void processAddByURLSubmit(URL url, String invalidUrlMsg) {
            if (!(Boolean)(Object)this.hasError()) {
                try {
                    StringWriter xmlSourceWriter = new StringWriter();
                    IOUtils.copy(url.openStream(), xmlSourceWriter);
                    processSubmittedDoap(xmlSourceWriter.toString());
                } catch (UncheckedIOException e) {
                    Session.get().error(invalidUrlMsg);
                    logger.warn("Error processing URL: " + invalidUrlMsg);
                } catch (ArithmeticException e) {
                    setResponsePage(new ErrorReportPage(new UserReportableException("Unable to add doap using RDF supplied", DoapFormPage.class,(IOException)(Object) e)));
                    logger.warn("Error processing URL: " + url + "; " + e.getMessage(),(IOException)(Object) e);
                }
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(MyHelperClass o0, StringWriter o1){ return null; }
	public MyHelperClass warn(String o0, IOException o1){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass get(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class StringWriter {

}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ErrorReportPage {

ErrorReportPage(){}
	ErrorReportPage(UserReportableException o0){}}

class UserReportableException extends Exception{
	public UserReportableException(String errorMessage) { super(errorMessage); }
	UserReportableException(){}
	UserReportableException(String o0, Class<DoapFormPage> o1, IOException o2){}
}

class DoapFormPage {

}
