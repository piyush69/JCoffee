
import java.io.UncheckedIOException;


class c21900384 {
public MyHelperClass addGlobalError(HttpServletRequest o0, Exception o1){ return null; }
	public MyHelperClass addGlobalError(HttpServletRequest o0, String o1){ return null; }

//    @Override
    protected ActionForward executeAction(ActionMapping mapping, ActionForm form, User user, HttpServletRequest request, HttpServletResponse response) throws Exception {
        MyHelperClass ServletRequestUtils = new MyHelperClass();
        long resourceId =(long)(Object) ServletRequestUtils.getLongParameter(request, "resourceId", 0L);
        String attributeIdentifier =(String)(Object) request.getParameter("identifier");
        MyHelperClass StringUtils = new MyHelperClass();
        if (resourceId != 0L && (boolean)(Object)StringUtils.hasText(attributeIdentifier)) {
            try {
                MyHelperClass resourceManager = new MyHelperClass();
                BinaryAttribute binaryAttribute =(BinaryAttribute)(Object) resourceManager.readAttribute(resourceId, attributeIdentifier, user);
                response.addHeader("Content-Disposition", "attachment; filename=\"" + binaryAttribute.getName() + '"');
                String contentType =(String)(Object) binaryAttribute.getContentType();
                if (contentType != null) {
                    if ("application/x-zip-compressed".equalsIgnoreCase(contentType)) {
                        response.setContentType("application/octet-stream");
                    } else {
                        response.setContentType(contentType);
                    }
                } else {
                    response.setContentType("application/octet-stream");
                }
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(binaryAttribute.getInputStream(), response.getOutputStream());
                return null;
            } catch (UncheckedIOException e) {
                addGlobalError(request, "errors.notFound");
            } catch (Exception e) {
                addGlobalError(request, e);
            }
        }
        return(ActionForward)(Object) mapping.getInputForward();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getLongParameter(HttpServletRequest o0, String o1, long o2){ return null; }
	public MyHelperClass hasText(String o0){ return null; }
	public MyHelperClass copy(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass readAttribute(long o0, String o1, User o2){ return null; }}

class ActionMapping {

public MyHelperClass getInputForward(){ return null; }}

class ActionForm {

}

class User {

}

class HttpServletRequest {

public MyHelperClass getParameter(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass addHeader(String o0, String o1){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }}

class ActionForward {

}

class BinaryAttribute {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getContentType(){ return null; }}

class DataRetrievalFailureException extends Exception{
	public DataRetrievalFailureException(String errorMessage) { super(errorMessage); }
}
