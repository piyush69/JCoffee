import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18099086 {
public MyHelperClass render(HttpServletResponse o0, MyHelperClass o1){ return null; }
public MyHelperClass filter;
	public MyHelperClass renderChart(HttpServletRequest o0, HttpServletResponse o1){ return null; }
public MyHelperClass IOUtils;
	public MyHelperClass getServletContext(){ return null; }

//    @Override
    protected void service(final HttpServletRequest req, final HttpServletResponse res) throws Throwable, ServletException, IOException {
        res.setHeader("X-Generator", "VisualMon");
        String path =(String)(Object) req.getPathInfo();
        if (null == path || "".equals(path)) res.sendRedirect(req.getServletPath() + "/"); else if ("/chart".equals(path)) {
            try {
                res.setHeader("Cache-Control", "private,no-cache,no-store,must-revalidate");
                res.addHeader("Cache-Control", "post-check=0,pre-check=0");
                res.setHeader("Expires", "Sat, 26 Jul 1997 05:00:00 GMT");
                res.setHeader("Pragma", "no-cache");
                res.setDateHeader("Expires", 0);
                renderChart(req, res);
            } catch (InterruptedException e) {
                MyHelperClass log = new MyHelperClass();
                log.info("Chart generation was interrupted", e);
                Thread.currentThread().interrupt();
            }
        } else if (path.startsWith("/log_")) {
            String name = path.substring(5);
            LogProvider provider = null;
            MyHelperClass cfg = new MyHelperClass();
            for (LogProvider prov :(LogProvider[])(Object) (Object[])(Object)cfg.getLogProviders()) {
                if (name.equals(prov.getName())) {
                    provider = prov;
                    break;
                }
            }
            if (null == provider) {
                MyHelperClass log = new MyHelperClass();
                log.error("Log provider with name \"{}\" not found", name);
                MyHelperClass HttpServletResponse = new MyHelperClass();
                res.sendError(HttpServletResponse.SC_NOT_FOUND);
            } else {
                MyHelperClass filter = new MyHelperClass();
                render(res, provider.getLog(filter.getLocale()));
            }
        } else if ("/".equals(path)) {
            List<LogEntry> logs = new ArrayList<LogEntry>();
            MyHelperClass cfg = new MyHelperClass();
            for (LogProvider provider :(LogProvider[])(Object) (Object[])(Object)cfg.getLogProviders()) logs.add(new LogEntry(provider.getName(), provider.getTitle(filter.getLocale())));
            MyHelperClass filter = new MyHelperClass();
            render(res, new ProbeDataList(filter.getSnapshot(), filter.getAlerts(), logs, ResourceBundle.getBundle("de.frostcode.visualmon.stats",(java.util.ResourceBundle.Control)(Object)(Control)(Object) filter.getLocale()).getString("category.empty"), cfg.getDashboardTitle().get(filter.getLocale())));
        } else {
            URL url = Thread.currentThread().getContextClassLoader().getResource(getClass().getPackage().getName().replace('.', '/') + req.getPathInfo());
            if (null == url) {
                MyHelperClass HttpServletResponse = new MyHelperClass();
                res.sendError(HttpServletResponse.SC_NOT_FOUND);
                return;
            }
            res.setDateHeader("Last-Modified", new File(url.getFile()).lastModified());
            MyHelperClass YEAR_IN_SECONDS = new MyHelperClass();
            res.setDateHeader("Expires", new Date().getTime() +(long)(Object) YEAR_IN_SECONDS * 1000L);
//            MyHelperClass YEAR_IN_SECONDS = new MyHelperClass();
            res.setHeader("Cache-Control", "max-age=" + YEAR_IN_SECONDS);
            URLConnection conn = url.openConnection();
            String resourcePath = url.getPath();
            String contentType = conn.getContentType();
            if (resourcePath.endsWith(".xsl")) {
                contentType = "text/xml";
                MyHelperClass ENCODING = new MyHelperClass();
                res.setCharacterEncoding(ENCODING);
            }
            if (contentType == null || "content/unknown".equals(contentType)) {
                if (resourcePath.endsWith(".css")) contentType = "text/css"; else contentType =(String)(Object) getServletContext().getMimeType(resourcePath);
            }
            res.setContentType(contentType);
            res.setContentLength(conn.getContentLength());
            OutputStream out =(OutputStream)(Object) res.getOutputStream();
            IOUtils.copy(conn.getInputStream(), out);
            IOUtils.closeQuietly(conn.getInputStream());
            IOUtils.closeQuietly(out);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_NOT_FOUND;
public MyHelperClass getSnapshot(){ return null; }
	public MyHelperClass getDashboardTitle(){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass info(String o0, InterruptedException o1){ return null; }
	public MyHelperClass get(MyHelperClass o0){ return null; }
	public MyHelperClass error(String o0, String o1){ return null; }
	public MyHelperClass getLogProviders(){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass getLocale(){ return null; }
	public MyHelperClass getMimeType(String o0){ return null; }
	public MyHelperClass getAlerts(){ return null; }}

class HttpServletRequest {

public MyHelperClass getPathInfo(){ return null; }
	public MyHelperClass getServletPath(){ return null; }}

class HttpServletResponse {

public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass setContentLength(int o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass sendRedirect(String o0){ return null; }
	public MyHelperClass setDateHeader(String o0, long o1){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }
	public MyHelperClass setDateHeader(String o0, int o1){ return null; }
	public MyHelperClass addHeader(String o0, String o1){ return null; }
	public MyHelperClass setCharacterEncoding(MyHelperClass o0){ return null; }
	public MyHelperClass sendError(MyHelperClass o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class LogProvider {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getLog(MyHelperClass o0){ return null; }
	public MyHelperClass getTitle(MyHelperClass o0){ return null; }}

class LogEntry {

LogEntry(MyHelperClass o0, MyHelperClass o1){}
	LogEntry(){}}

class ProbeDataList {

ProbeDataList(MyHelperClass o0, MyHelperClass o1, List<LogEntry> o2, String o3, MyHelperClass o4){}
	ProbeDataList(){}}

class Control {

}
