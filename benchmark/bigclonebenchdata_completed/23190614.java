


class c23190614 {

    public void _jspService(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException, ServletException {
        PageContext pageContext = null;
        HttpSession session = null;
        ServletContext application = null;
        ServletConfig config = null;
        JspWriter out = null;
        Object page = this;
        JspWriter _jspx_out = null;
        PageContext _jspx_page_context = null;
        try {
            response.setContentType("text/html;charset=UTF-8");
            MyHelperClass _jspxFactory = new MyHelperClass();
            pageContext =(PageContext)(Object) _jspxFactory.getPageContext(this, request, response, null, true, 8192, true);
            _jspx_page_context = pageContext;
            application =(ServletContext)(Object) pageContext.getServletContext();
            config =(ServletConfig)(Object) pageContext.getServletConfig();
            session =(HttpSession)(Object) pageContext.getSession();
            out =(JspWriter)(Object) pageContext.getOut();
            _jspx_out = out;
            ResourceInjector _jspx_resourceInjector;// = new ResourceInjector();
            _jspx_resourceInjector = (ResourceInjector)(ResourceInjector)(Object) application.getAttribute("com.sun.appserv.jsp.resource.injector");
            out.write("\n");
            out.write("\n");
            out.write("\n");
            String username = "test";
            String password = "test";
            int providerId = 1;
            if (request.getParameter("providerId") != null) providerId = Integer.parseInt((String)(Object)request.getParameter("providerId"));
            String thisPageContextAddress = "http://localhost:8080/" + request.getContextPath();
            String thisPageServingAddress = thisPageContextAddress + "/index.jsp";
            String token = "";
            String token_timeout = (String)(String)(Object) request.getParameter("token_timeout");
            String referer =(String)(Object) request.getHeader("Referer");
            if (token_timeout != null && token_timeout.equals("true")) {
                System.out.println("token timeout for referer" + referer);
                if (referer != null) {
                    if (request.getSession().getServletContext().getAttribute("token_timeout_processing_lock") == null) {
                        request.getSession().getServletContext().setAttribute("token_timeout_processing_lock", true);
                        byte[] buff = null;
                        BufferedInputStream bis = null;
                        URL url = new URL(thisPageContextAddress + "/ServerAdminServlet?action=login&username=" + username + "&password=" + password);
                        URLConnection urlc =(URLConnection)(Object) url.openConnection();
                        int length =(int)(Object) urlc.getContentLength();
                        InputStream in =(InputStream)(Object) urlc.getInputStream();
                        buff = new byte[length];
                        int bytesRead = 0;
                        while (bytesRead < length) {
                            bytesRead += (int)(Object)in.read(buff, bytesRead, in.available());
                        }
                        token = new String(buff);
                        token = token.replaceAll("[\\r\\f]", "");
                        token = token.trim();
                        request.getSession().getServletContext().setAttribute("token", token);
                        out.println(token);
                        request.getSession().getServletContext().removeAttribute("token_timeout_processing_lock");
                    } else out.println("token_timeout_processing_lock");
                }
            } else {
                if (request.getSession().getServletContext().getAttribute("token") == null || request.getSession().getServletContext().getAttribute("token").equals("")) {
                    byte[] buff = null;
                    BufferedInputStream bis = null;
                    URL url = new URL(thisPageContextAddress + "/ServerAdminServlet?action=login&username=" + username + "&password=" + password);
                    URLConnection urlc =(URLConnection)(Object) url.openConnection();
                    int length =(int)(Object) urlc.getContentLength();
                    InputStream in =(InputStream)(Object) urlc.getInputStream();
                    buff = new byte[length];
                    int bytesRead = 0;
                    while (bytesRead < length) {
                        bytesRead += (int)(Object)in.read(buff, bytesRead, in.available());
                    }
                    token = new String(buff);
                    token = token.replaceAll("[\\r\\f]", "");
                    token = token.trim();
                    request.getSession().getServletContext().setAttribute("token", token);
                }
                out.write("<html>\n");
                out.write("  <head>\n");
                out.write("    <title>AJAX test </title>\n");
                out.write("    <script type=\"text/javascript\" src=\"OpenLayers-2.8/OpenLayers.js\"></script>\n");
                out.write("    <script type=\"text/javascript\">\n");
                out.write("\n");
                out.write("        function init(){\n");
                out.write("\n");
                out.write("            var token = \"");
                out.print(request.getSession().getServletContext().getAttribute("token"));
                out.write("\";\n");
                out.write("\n");
                out.write("            var options = {\n");
                out.write("                            maxExtent: new OpenLayers.Bounds(-600, -300, 0, 400),\n");
                out.write("                            maxResolution: 4.77730, minRezolution: 78271.517, numZoomLevels: 15, units: 'm'\n");
                out.write("                          }\n");
                out.write("\n");
                out.write("\n");
                out.write("            var map = new OpenLayers.Map('map', options);\n");
                out.write("            var layer = new OpenLayers.Layer.TMS(\"TMS\", \"/WebGISTileServer/TMSServletProxy/\" + token + \"/7/\",\n");
                out.write("                                                { layername: 'TMS', type: 'png' });\n");
                out.write("            map.addLayer(layer);\n");
                out.write("            map.addControl(new OpenLayers.Control.MousePosition());\n");
                out.write("            map.setCenter(new OpenLayers.LonLat(-300, 120), 4);\n");
                out.write("        }\n");
                out.write("    </script>\n");
                out.write("  </head>\n");
                out.write("  <body onload=\"init()\">\n");
                out.write("      <H1>TeleAtlas map with TMS</H1>\n");
                out.write("      <div id=\"map\" style=\"width:100%; height:90%\"></div>\n");
                out.write("  </body>\n");
                out.write("</html>");
            }
        } catch (Throwable t) {
            if (!(t instanceof SkipPageException)) {
                out = _jspx_out;
                if (out != null &&(int)(Object) out.getBufferSize() != 0) out.clearBuffer();
                if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
            }
        } finally {
            MyHelperClass _jspxFactory = new MyHelperClass();
            _jspxFactory.releasePageContext(_jspx_page_context);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setAttribute(String o0, boolean o1){ return null; }
	public MyHelperClass removeAttribute(String o0){ return null; }
	public MyHelperClass getAttribute(String o0){ return null; }
	public MyHelperClass getServletContext(){ return null; }
	public MyHelperClass releasePageContext(PageContext o0){ return null; }
	public MyHelperClass setAttribute(String o0, String o1){ return null; }
	public MyHelperClass getPageContext(c23190614 o0, HttpServletRequest o1, HttpServletResponse o2, Object o3, boolean o4, int o5, boolean o6){ return null; }}

class HttpServletRequest {

public MyHelperClass getSession(){ return null; }
	public MyHelperClass getHeader(String o0){ return null; }
	public MyHelperClass getParameter(String o0){ return null; }
	public MyHelperClass getContextPath(){ return null; }}

class HttpServletResponse {

public MyHelperClass setContentType(String o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class PageContext {

public MyHelperClass getSession(){ return null; }
	public MyHelperClass getOut(){ return null; }
	public MyHelperClass getServletContext(){ return null; }
	public MyHelperClass getServletConfig(){ return null; }
	public MyHelperClass handlePageException(Throwable o0){ return null; }}

class HttpSession {

}

class ServletContext {

public MyHelperClass getAttribute(String o0){ return null; }}

class ServletConfig {

}

class JspWriter {

public MyHelperClass getBufferSize(){ return null; }
	public MyHelperClass println(String o0){ return null; }
	public MyHelperClass clearBuffer(){ return null; }
	public MyHelperClass print(MyHelperClass o0){ return null; }
	public MyHelperClass write(String o0){ return null; }}

class BufferedInputStream {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass available(){ return null; }
	public MyHelperClass read(byte[] o0, int o1, MyHelperClass o2){ return null; }}

class SkipPageException extends Exception{
	public SkipPageException(String errorMessage) { super(errorMessage); }
}

class ResourceInjector {

}
