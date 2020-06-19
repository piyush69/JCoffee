


class c15909533 {
public MyHelperClass handleRequest(HttpServletRequest o0){ return null; }

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        MyHelperClass HttpUtil = new MyHelperClass();
        HttpClientInfo clientInfo =(HttpClientInfo)(Object) HttpUtil.parseClientInfo((HttpServletRequest) request);
        if (request.getParameter("_debug_") != null) {
            StringBuffer buffer = new StringBuffer();
            Enumeration iter =(Enumeration)(Object) request.getHeaderNames();
            while ((boolean)(Object)iter.hasMoreElements()) {
                String name = (String)(String)(Object) iter.nextElement();
                buffer.append(name + "=" + request.getHeader(name)).append("\n");
            }
            buffer.append("\n");
            iter =(Enumeration)(Object) request.getParameterNames();
            while ((boolean)(Object)iter.hasMoreElements()) {
                String name = (String)(String)(Object) iter.nextElement();
                String value =(String)(Object) request.getParameter(name);
                if (!"ISO-8859-1".equalsIgnoreCase((String)(Object)clientInfo.getPreferCharset())) value = new String(value.getBytes("ISO-8859-1"),(int)(Object) clientInfo.getPreferCharset());
                buffer.append(name).append("=").append(value).append("\n");
            }
            response.setContentType("text/plain; charset=UTF-8");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write(buffer.toString());
            return null;
        }
        Object resultObj = handleRequest(request);
        if (resultObj == null) {
            String requestException = (String)(String)(Object) request.getAttribute("XSMP.handleRequest.Exception");
            if (requestException != null) response.sendError(500, requestException); else response.setContentLength(0);
        } else {
            if (resultObj instanceof DataHandler) {
                response.setContentType((String)(Object)((DataHandler) resultObj).getContentType());
                response.setContentLength((int)(Object)((DataHandler) resultObj).getInputStream().available());
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(((DataHandler) resultObj).getInputStream(), response.getOutputStream());
            } else {
                String temp = resultObj.toString();
                if (temp.startsWith("<") && temp.endsWith(">")) response.setContentType("text/html; charset=" + clientInfo.getPreferCharset()); else response.setContentType("text/plain; charset=" + clientInfo.getPreferCharset());
                byte[] buffer = temp.getBytes((String)(Object)clientInfo.getPreferCharset());
                response.setContentLength(buffer.length);
                response.getOutputStream().write(buffer);
            }
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass copy(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass available(){ return null; }
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass parseClientInfo(HttpServletRequest o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getHeader(String o0){ return null; }
	public MyHelperClass getParameterNames(){ return null; }
	public MyHelperClass getParameter(String o0){ return null; }
	public MyHelperClass getAttribute(String o0){ return null; }
	public MyHelperClass getHeaderNames(){ return null; }}

class HttpServletResponse {

public MyHelperClass setCharacterEncoding(String o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass getWriter(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass sendError(int o0, String o1){ return null; }
	public MyHelperClass setContentLength(int o0){ return null; }}

class ModelAndView {

}

class HttpClientInfo {

public MyHelperClass getPreferCharset(){ return null; }}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class DataHandler {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getContentType(){ return null; }}
