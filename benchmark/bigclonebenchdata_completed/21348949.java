
import java.io.UncheckedIOException;


class c21348949 {
public MyHelperClass setResponsePage(ErrorReportPage o0){ return null; }
public MyHelperClass processSubmittedDoap(String o0){ return null; }
public MyHelperClass fileUploadField;
	public MyHelperClass IOUtils;
	public MyHelperClass hasError(){ return null; }

        protected void onSubmit() {
            this.onSubmit();
            if (!(Boolean)(Object)this.hasError()) {
                final FileUpload upload =(FileUpload)(Object) fileUploadField.getFileUpload();
                if (upload != null) {
                    try {
                        StringWriter xmlSourceWriter = new StringWriter();
                        IOUtils.copy(upload.getInputStream(), xmlSourceWriter);
                        processSubmittedDoap(xmlSourceWriter.toString());
                    } catch (UncheckedIOException e) {
                        setResponsePage(new ErrorReportPage(new UserReportableException("Unable to add doap using RDF supplied", DoapFormPage.class,(IOException)(Object) e)));
                    }
                }
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(MyHelperClass o0, StringWriter o1){ return null; }
	public MyHelperClass getFileUpload(){ return null; }}

class FileUpload {

public MyHelperClass getInputStream(){ return null; }}

class StringWriter {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ErrorReportPage {

ErrorReportPage(UserReportableException o0){}
	ErrorReportPage(){}}

class UserReportableException extends Exception{
	public UserReportableException(String errorMessage) { super(errorMessage); }
	UserReportableException(){}
	UserReportableException(String o0, Class<DoapFormPage> o1, IOException o2){}
}

class DoapFormPage {

}
