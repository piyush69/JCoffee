import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13563706 {
public MyHelperClass StatisticsType;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws Throwable, ServletException, IOException {
        String selectedPage =(String)(Object) request.getParameter("SelectedPage");
        Page page = null;
        MyHelperClass PortalRequest = new MyHelperClass();
        PortalRequest portalRequest =(PortalRequest)(Object) PortalRequest.getCurrentRequest();
        if (selectedPage == null) {
            try {
                MyHelperClass Property = new MyHelperClass();
                Property pageProp =(Property)(Object) Property.getProperty("HomePage");
                selectedPage =(String)(Object) pageProp.getValue();
            } catch (UncheckedIOException e) {
                MyHelperClass myLogger = new MyHelperClass();
                myLogger.info("Page could not be found due to an exception");
                response.sendError(response.SC_NOT_FOUND);
                return;
            }
        }
        MyHelperClass myLogger = new MyHelperClass();
        myLogger.info("Handling Page Request for Page " + selectedPage);
        try {
            if (page == null) {
                try {
                    MyHelperClass Page = new MyHelperClass();
                    page =(Page)(Object) Page.getPage(Long.parseLong(selectedPage));
                } catch (NumberFormatException e) {
                    MyHelperClass Page = new MyHelperClass();
                    List<Page> possiblePage =(List<Page>)(Object) Page.findByName(selectedPage);
                    if (possiblePage.size() > 0) {
                        page = possiblePage.get(0);
                    } else {
                        response.sendError(response.SC_NOT_FOUND);
                        return;
                    }
                }
            }
            if (!(Boolean)(Object)page.isVisibleTo(portalRequest.getCurrentUser())) {
                MyHelperClass Property = new MyHelperClass();
                Property pageProp =(Property)(Object) Property.getProperty("HomePage");
                selectedPage =(String)(Object) pageProp.getValue();
                MyHelperClass Page = new MyHelperClass();
                page =(Page)(Object) Page.getPage(Long.parseLong(selectedPage));
            }
            try {
                MyHelperClass Property = new MyHelperClass();
                Property property =(Property)(Object) Property.getProperty("LogPageRequests");
                if (property.getValue().toLowerCase().equals("true")) {
                    String referer =(String)(Object) request.getHeader("Referer");
                    if (referer == null || referer.indexOf((int)(Object)portalRequest.getRequest().getServerName()) > 0) {
                        referer = " ";
                    } else {
                        if (referer.length() >= 200) {
                            referer = referer.substring(0, 198);
                        }
                    }
                    MyHelperClass PageRequest = new MyHelperClass();
                    PageRequest.createRequest(portalRequest.getCurrentHREF(), page, portalRequest.getCurrentUser(), portalRequest.getRequest().getRemoteAddr(), referer);
                }
            } catch (UncheckedIOException e) {
                MyHelperClass Level = new MyHelperClass();
                myLogger.log(Level.WARNING, "Log Page Requests property was not found.",(PersistentModelException)(Object) e);
            }
            if ((boolean)(Object)page.isVisibleTo(portalRequest.getCurrentUser())) {
                HttpSession session =(HttpSession)(Object) request.getSession();
                if (session != null) {
                    RecentlyViewedManager rvm = (RecentlyViewedManager)(RecentlyViewedManager)(Object) session.getAttribute("ipoint.RecentlyViewedManager");
                    if (rvm == null) {
                        rvm = new RecentlyViewedManager();
                    }
                    rvm.add(page);
                    session.setAttribute("ipoint.RecentlyViewedManager", rvm);
                }
                PageCacheEntry entry = null;
                if (!(Boolean)(Object)portalRequest.isPost() && !(Boolean)(Object)page.isEditableBy(portalRequest.getCurrentUser())) {
                    try {
                        int pageCacheTime = 60000;
                        try {
                            MyHelperClass Property = new MyHelperClass();
                            Property pageCacheTimeProperty =(Property)(Object) Property.getProperty("PageCacheTime");
                            pageCacheTime = Integer.parseInt((String)(Object)pageCacheTimeProperty.getValue());
                            pageCacheTime *= 1000;
                        } catch (UncheckedIOException pme) {
//                            MyHelperClass myLogger = new MyHelperClass();
                            myLogger.warning("Ignoring Exception when retrieving PageCacheTime property");
                        } catch (NumberFormatException nfe) {
                        }
                        MyHelperClass PageCacheEntry = new MyHelperClass();
                        entry =(PageCacheEntry)(Object) PageCacheEntry.find(portalRequest.getCurrentHREF(), page, portalRequest.getCurrentUser(), pageCacheTime);
                    } catch (UncheckedIOException e) {
                        MyHelperClass Level = new MyHelperClass();
                        myLogger.log(Level.WARNING, "An error occurred finding a page cache entry",(PersistentModelException)(Object) e);
                    }
                }
                response.setContentType("text/html");
                response.setHeader("Cache-Control", "no-cache");
                boolean processed = false;
                if (entry != null) {
                    String tempFile =(String)(Object) entry.getTempFile();
                    File file = new File(tempFile);
                    if (file.exists() && file.isFile() && file.canRead()) {
                        FileReader reader = new FileReader(file);
                        BufferedReader br = new BufferedReader(reader);
                        PrintWriter out =(PrintWriter)(Object) response.getWriter();
                        out.write("<!-- Starting to output cached page in " + portalRequest.elapsedTime() + " ms -->\n");
                        while (br.ready()) {
                            out.write(br.readLine() + "\n");
                        }
                        out.write("<!-- Cached output produced in " + portalRequest.elapsedTime() + " ms -->\n");
                        reader.close();
                        processed = true;
                        portalRequest.getMBeans().incrementStatistics(StatisticsType.PageTotal, page.getName() + "-" + page.getID(), portalRequest.elapsedTime(), true);
                    } else {
                        entry.delete();
                    }
                }
                if (!processed) {
                    PrintWriter out =(PrintWriter)(Object) response.getWriter();
                    out.write("<!-- Output produced by iPoint Portal -->\n");
                    PageRenderer renderer = new PageRenderer(page);
                    long startTime = System.currentTimeMillis();
                    MyHelperClass ELConstants = new MyHelperClass();
                    request.setAttribute(ELConstants.IPOINT_USER, portalRequest.getCurrentUser());
//                    MyHelperClass ELConstants = new MyHelperClass();
                    request.setAttribute(ELConstants.IPOINT_PAGE, page);
//                    MyHelperClass ELConstants = new MyHelperClass();
                    request.setAttribute(ELConstants.IPOINT_TEMPLATE, page.getTemplate());
//                    MyHelperClass ELConstants = new MyHelperClass();
                    request.setAttribute(ELConstants.IPOINT_PORTAL_PROPERTIES, Property.getPropertiesMap());
//                    MyHelperClass ELConstants = new MyHelperClass();
                    request.setAttribute(ELConstants.IPOINT_USER_PROPERTIES, portalRequest.getCurrentUser().getProperties());
                    renderer.preProcess();
                    portalRequest.getMBeans().incrementStatistics(StatisticsType.PagePreProcess, page.getName() + "-" + page.getID(), System.currentTimeMillis() - startTime, false);
                    long renderStart = System.currentTimeMillis();
                    renderer.render();
                    portalRequest.getMBeans().incrementStatistics(StatisticsType.PageRender, page.getName() + "-" + page.getID(), System.currentTimeMillis() - renderStart, false);
                    portalRequest.getMBeans().incrementStatistics(StatisticsType.PageTotal, page.getName() + "-" + page.getID(), System.currentTimeMillis() - startTime, false);
//                    MyHelperClass PortalRequest = new MyHelperClass();
                    out.write("<!-- output produced in " + PortalRequest.getCurrentRequest().elapsedTime() + " ms -->\n");
                    if (!(Boolean)(Object)page.isEditableBy(portalRequest.getCurrentUser())) {
                        if ((CachingResponseWrapper)(Object)response instanceof CachingResponseWrapper) {
                            CachingResponseWrapper crw = (CachingResponseWrapper)(CachingResponseWrapper)(Object) response;
                            crw.flushBuffer();
                            MyHelperClass Property = new MyHelperClass();
                            Property tempProperty =(Property)(Object) Property.getProperty("UploadLocation");
                            File tempDirectory = new File((String)(Object)tempProperty.getValue());
                            if (tempDirectory.exists() && tempDirectory.canWrite()) {
                                File file = File.createTempFile("iPointPage", ".html", tempDirectory);
                                try {
                                    FileWriter fw = new FileWriter(file);
                                    fw.write((int)(Object)crw.getOutput());
                                    fw.flush();
                                    fw.close();
                                    MyHelperClass PageCacheEntry = new MyHelperClass();
                                    PageCacheEntry.create(portalRequest.getCurrentHREF(), page, portalRequest.getCurrentUser(), file.getAbsolutePath());
                                } catch (IOException e) {
                                }
                            } else {
//                                MyHelperClass myLogger = new MyHelperClass();
                                myLogger.warning("Can not write to directory " + tempProperty.getValue());
                            }
                        }
                    }
                }
            } else {
//                MyHelperClass myLogger = new MyHelperClass();
                myLogger.info("Current User is Forbidden from seeing this Page");
                response.sendError(response.SC_FORBIDDEN);
            }
        } catch (UncheckedIOException e) {
            MyHelperClass Level = new MyHelperClass();
            myLogger.log(Level.INFO, "Unable to find page " + selectedPage,(PersistentModelException)(Object) e);
            response.sendError(response.SC_NOT_FOUND);
        } catch (ArithmeticException pe) {
            pe.printStackTrace();
            throw new ServletException("Error processing the page",(PresentationException)(Object) pe);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PagePreProcess;
	public MyHelperClass PageRender;
	public MyHelperClass INFO;
	public MyHelperClass WARNING;
	public MyHelperClass IPOINT_USER;
	public MyHelperClass IPOINT_USER_PROPERTIES;
	public MyHelperClass IPOINT_PORTAL_PROPERTIES;
	public MyHelperClass PageTotal;
	public MyHelperClass IPOINT_PAGE;
	public MyHelperClass IPOINT_TEMPLATE;
public MyHelperClass create(MyHelperClass o0, Page o1, MyHelperClass o2, String o3){ return null; }
	public MyHelperClass incrementStatistics(MyHelperClass o0, String o1, long o2, boolean o3){ return null; }
	public MyHelperClass getPage(long o0){ return null; }
	public MyHelperClass createRequest(MyHelperClass o0, Page o1, MyHelperClass o2, MyHelperClass o3, String o4){ return null; }
	public MyHelperClass incrementStatistics(MyHelperClass o0, String o1, MyHelperClass o2, boolean o3){ return null; }
	public MyHelperClass find(MyHelperClass o0, Page o1, MyHelperClass o2, int o3){ return null; }
	public MyHelperClass getRemoteAddr(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getServerName(){ return null; }
	public MyHelperClass elapsedTime(){ return null; }
	public MyHelperClass findByName(String o0){ return null; }
	public MyHelperClass getProperty(String o0){ return null; }
	public MyHelperClass toLowerCase(){ return null; }
	public MyHelperClass getCurrentRequest(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, PersistentModelException o2){ return null; }
	public MyHelperClass getProperties(){ return null; }
	public MyHelperClass warning(String o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getSession(){ return null; }
	public MyHelperClass setAttribute(MyHelperClass o0, Page o1){ return null; }
	public MyHelperClass getHeader(String o0){ return null; }
	public MyHelperClass getParameter(String o0){ return null; }
	public MyHelperClass setAttribute(MyHelperClass o0, MyHelperClass o1){ return null; }}

class HttpServletResponse {
public MyHelperClass SC_FORBIDDEN;
	public MyHelperClass SC_NOT_FOUND;
public MyHelperClass getWriter(){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass sendError(MyHelperClass o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
	ServletException(){}
	ServletException(String o0, PresentationException o1){}
}

class Page {

public MyHelperClass getName(){ return null; }
	public MyHelperClass isEditableBy(MyHelperClass o0){ return null; }
	public MyHelperClass isVisibleTo(MyHelperClass o0){ return null; }
	public MyHelperClass getTemplate(){ return null; }
	public MyHelperClass getID(){ return null; }}

class PortalRequest {

public MyHelperClass getMBeans(){ return null; }
	public MyHelperClass getCurrentHREF(){ return null; }
	public MyHelperClass isPost(){ return null; }
	public MyHelperClass elapsedTime(){ return null; }
	public MyHelperClass getRequest(){ return null; }
	public MyHelperClass getCurrentUser(){ return null; }}

class Property {

public static MyHelperClass getPropertiesMap(){ return null; }
	public MyHelperClass getValue(){ return null; }}

class PersistentModelException extends Exception{
	public PersistentModelException(String errorMessage) { super(errorMessage); }
}

class HttpSession {

public MyHelperClass setAttribute(String o0, RecentlyViewedManager o1){ return null; }
	public MyHelperClass getAttribute(String o0){ return null; }}

class RecentlyViewedManager {

public MyHelperClass add(Page o0){ return null; }}

class PageCacheEntry {

public MyHelperClass getTempFile(){ return null; }
	public MyHelperClass delete(){ return null; }}

class PageRenderer {

PageRenderer(){}
	PageRenderer(Page o0){}
	public MyHelperClass render(){ return null; }
	public MyHelperClass preProcess(){ return null; }}

class CachingResponseWrapper {

public MyHelperClass getOutput(){ return null; }
	public MyHelperClass flushBuffer(){ return null; }}

class PresentationException extends Exception{
	public PresentationException(String errorMessage) { super(errorMessage); }
}
