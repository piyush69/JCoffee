


class c20517803 {

    public String execute(HttpServletRequest request, HttpServletResponse response, User user, String parameter) throws Exception {
        MyHelperClass ServletRequestUtils = new MyHelperClass();
        long resourceId =(long)(Object) ServletRequestUtils.getLongParameter(request, "resourceId", 0L);
        MyHelperClass resourceManager = new MyHelperClass();
        BinaryAttribute binaryAttribute =(BinaryAttribute)(Object) resourceManager.readAttribute(resourceId, parameter, user);
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
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getLongParameter(HttpServletRequest o0, String o1, long o2){ return null; }
	public MyHelperClass copy(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass readAttribute(long o0, String o1, User o2){ return null; }}

class HttpServletRequest {

}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass addHeader(String o0, String o1){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }}

class User {

}

class BinaryAttribute {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getContentType(){ return null; }}
