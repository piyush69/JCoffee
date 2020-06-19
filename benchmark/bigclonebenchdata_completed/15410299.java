
import java.io.UncheckedIOException;


class c15410299 {
public MyHelperClass FUNCTION_DELETE;
	public MyHelperClass serviceList;
	public MyHelperClass ServiceDigester;

    public boolean isValid(WizardContext context) {
        MyHelperClass serviceSelection = new MyHelperClass();
        if ((int)(Object)serviceSelection < 0) {
            return false;
        }
//        MyHelperClass serviceSelection = new MyHelperClass();
        ServiceReference selection = (ServiceReference)(ServiceReference)(Object) serviceList.getElementAt(serviceSelection);
        if (selection == null) {
            return false;
        }
        MyHelperClass ServiceWizard = new MyHelperClass();
        String function = (String)(String)(Object) context.getAttribute(ServiceWizard.ATTRIBUTE_FUNCTION);
//        MyHelperClass ServiceWizard = new MyHelperClass();
        context.setAttribute(ServiceWizard.ATTRIBUTE_SERVICE_REFERENCE, selection);
        URL url =(URL)(Object) selection.getResourceURL();
        InputStream inputStream = null;
        try {
            inputStream =(InputStream)(Object) url.openStream();
            InputSource inputSource = new InputSource(inputStream);
            MyHelperClass IsqlToolkit = new MyHelperClass();
            JdbcService service =(JdbcService)(Object) ServiceDigester.parseService(inputSource, IsqlToolkit.getSharedEntityResolver());
//            MyHelperClass ServiceWizard = new MyHelperClass();
            context.setAttribute(ServiceWizard.ATTRIBUTE_SERVICE, service);
            return true;
        } catch (UncheckedIOException error) {
            if (!FUNCTION_DELETE.equals(function)) {
                String loc =(String)(Object) url.toExternalForm();
                MyHelperClass messages = new MyHelperClass();
                String message =(String)(Object) messages.format("SelectServiceStep.failed_to_load_service_from_url", loc);
                context.showErrorDialog(error, message);
            } else {
                return true;
            }
        } catch (Exception error) {
            MyHelperClass messages = new MyHelperClass();
            String message =(String)(Object) messages.format("SelectServiceStep.service_load_error",(String)(Object) url.toExternalForm());
            context.showErrorDialog(error, message);
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ATTRIBUTE_SERVICE_REFERENCE;
	public MyHelperClass ATTRIBUTE_SERVICE;
	public MyHelperClass ATTRIBUTE_FUNCTION;
public MyHelperClass getSharedEntityResolver(){ return null; }
	public MyHelperClass format(String o0, String o1){ return null; }
	public MyHelperClass getElementAt(MyHelperClass o0){ return null; }
	public MyHelperClass parseService(InputSource o0, MyHelperClass o1){ return null; }}

class WizardContext {

public MyHelperClass showErrorDialog(IOException o0, String o1){ return null; }
	public MyHelperClass getAttribute(MyHelperClass o0){ return null; }
	public MyHelperClass setAttribute(MyHelperClass o0, JdbcService o1){ return null; }
	public MyHelperClass showErrorDialog(Exception o0, String o1){ return null; }
	public MyHelperClass setAttribute(MyHelperClass o0, ServiceReference o1){ return null; }}

class ServiceReference {

public MyHelperClass getResourceURL(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass toExternalForm(){ return null; }}

class InputStream {

}

class InputSource {

InputSource(InputStream o0){}
	InputSource(){}}

class JdbcService {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
