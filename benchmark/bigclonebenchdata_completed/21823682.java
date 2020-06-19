import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21823682 {

//    @SuppressWarnings("unchecked")
    protected void displayFreeMarkerResponse(HttpServletRequest request, HttpServletResponse response, String templateName, Map<String, Object> variableMap) throws Throwable, IOException {
        Enumeration<String> attrNameEnum = request.getSession().getAttributeNames();
        String attrName;
        while (attrNameEnum.hasMoreElements()) {
            attrName = attrNameEnum.nextElement();
            MyHelperClass ADMIN4J_SESSION_VARIABLE_PREFIX = new MyHelperClass();
            if (attrName != null && attrName.startsWith((String)(Object)ADMIN4J_SESSION_VARIABLE_PREFIX)) {
                variableMap.put("Session" + attrName, request.getSession().getAttribute(attrName));
            }
        }
        variableMap.put("RequestAdmin4jCurrentUri", request.getRequestURI());
        MyHelperClass FreemarkerUtils = new MyHelperClass();
        Template temp = FreemarkerUtils.createConfiguredTemplate(this.getClass(), templateName);
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        try {
            temp.process(variableMap, new OutputStreamWriter(outStream));
            response.setContentLength(outStream.size());
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(new ByteArrayInputStream(outStream.toByteArray()), response.getOutputStream());
            response.getOutputStream().flush();
            response.getOutputStream().close();
        } catch (Exception e) {
            throw new Admin4jRuntimeException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createConfiguredTemplate(Class o0, String o1){ return null; }}

class HttpServletRequest {

public MyHelperClass getRequestURI(){ return null; }
	public MyHelperClass getSession(){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setContentLength(int o0){ return null; }}

class Template {

public MyHelperClass process(Map<String o0, Object o1, OutputStreamWriter o2){ return null; }}

class Admin4jRuntimeException extends Exception{
	public Admin4jRuntimeException(String errorMessage) { super(errorMessage); }
}
