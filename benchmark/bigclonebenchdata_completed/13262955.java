import java.io.*;
import java.lang.*;
import java.util.*;



class c13262955 {
public MyHelperClass NamedResources;
	public MyHelperClass ClassResource;
	public MyHelperClass isBinary(URL o0){ return null; }
	public MyHelperClass getContentType(URL o0){ return null; }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String servletPath =(String)(Object) req.getServletPath();
        String requestURI =(String)(Object) req.getRequestURI();
        String resource = requestURI.substring(requestURI.indexOf(servletPath) + servletPath.length());
        MyHelperClass resourceDirectory = new MyHelperClass();
        URL url =(URL)(Object) ClassResource.get(resourceDirectory + resource);
        try {
            File file = null;
            JarEntry jarEntry = null;
            JarFile jarFile = null;
            if (!(Boolean)(Object)url.toExternalForm().startsWith("jar:")) {
                file = new File((String)(Object)url.toURI());
            } else {
                jarFile =(JarFile)(Object) ((JarURLConnection)(JarURLConnection)(Object) url.openConnection()).getJarFile();
                String[] jarURL =(String[])(Object) url.toExternalForm().split("!");
                jarEntry =(JarEntry)(Object) jarFile.getJarEntry(jarURL[1].substring(1));
            }
            if (file != null && file.isDirectory()) {
                PrintWriter writer =(PrintWriter)(Object) resp.getWriter();
                resp.setContentType("text/html");
                MyHelperClass DevelUtils = new MyHelperClass();
                DevelUtils.writePageBegin(writer);
//                MyHelperClass DevelUtils = new MyHelperClass();
                DevelUtils.writeTitleAndHeaderEnd(writer, "Makumba resources");
                MyHelperClass SourceViewServlet = new MyHelperClass();
                if ((boolean)(Object)SourceViewServlet.redirected(req, resp, servletPath)) {
                    return;
                }
                String relativeDirectory = file.getName();
//                MyHelperClass resourceDirectory = new MyHelperClass();
                if (file.getAbsolutePath().indexOf((int)(Object)resourceDirectory) != -1) {
//                    MyHelperClass resourceDirectory = new MyHelperClass();
                    relativeDirectory = file.getAbsolutePath().substring(file.getAbsolutePath().indexOf((int)(Object)resourceDirectory));
                }
//                MyHelperClass SourceViewServlet = new MyHelperClass();
                SourceViewServlet.printDirlistingHeader(writer, file.getCanonicalPath(), relativeDirectory);
//                MyHelperClass resourceDirectory = new MyHelperClass();
                if (!(relativeDirectory.equals(resourceDirectory))) {
                    writer.println("<b><a href=\"../\">../</a></b> (up one level)");
                }
//                MyHelperClass SourceViewServlet = new MyHelperClass();
                SourceViewServlet.processDirectory(writer, file, null);
                String[] list = file.list();
                Arrays.sort(list);
                for (int i = 0; i < list.length; i++) {
                    String s = list[i];
                    File f = new File(file.getAbsolutePath() + File.separator + s);
                    if (f.isFile()) {
                        writer.println("<b><a href=\"" + s + "\">" + s + "</a></b>");
                    }
                }
                writer.println("</pre>");
//                MyHelperClass DevelUtils = new MyHelperClass();
                DevelUtils.writePageEnd(writer);
                MyHelperClass dfLastModified = new MyHelperClass();
                resp.setHeader("Last-Modified", dfLastModified.format(new Date()));
                return;
            } else if (jarEntry != null && (boolean)(Object)jarEntry.isDirectory()) {
                Enumeration<JarEntry> entries =(Enumeration<JarEntry>)(Object) jarFile.entries();
                ArrayList<String> files = new ArrayList<String>();
                ArrayList<String> directories = new ArrayList<String>();
                PrintWriter writer =(PrintWriter)(Object) resp.getWriter();
                resp.setContentType("text/html");
                MyHelperClass DevelUtils = new MyHelperClass();
                DevelUtils.writePageBegin(writer);
//                MyHelperClass DevelUtils = new MyHelperClass();
                DevelUtils.writeTitleAndHeaderEnd(writer, "Makumba resources");
                MyHelperClass SourceViewServlet = new MyHelperClass();
                if ((boolean)(Object)SourceViewServlet.redirected(req, resp, servletPath)) {
                    return;
                }
                String relativeDirectory =(String)(Object) jarEntry.getName();
//                MyHelperClass SourceViewServlet = new MyHelperClass();
                SourceViewServlet.printDirlistingHeader(writer,(String)(Object) url.toExternalForm(), relativeDirectory);
//                MyHelperClass resourceDirectory = new MyHelperClass();
                if (!relativeDirectory.equals(resourceDirectory) && !relativeDirectory.equals(resourceDirectory + "/")) {
                    writer.println("<b><a href=\"../\">../</a></b> (up one level)");
                }
                while (entries.hasMoreElements()) {
                    JarEntry entry = (JarEntry) entries.nextElement();
                    if ((boolean)(Object)entry.getName().startsWith(relativeDirectory)) {
                        String s =(String)(Object) entry.getName().substring(relativeDirectory.length());
                        while (s.length() > 0 && s.startsWith("/")) {
                            s = s.substring(1);
                        }
                        if (s.indexOf("/") == -1) {
                            if (s.length() > 0) {
                                files.add(s);
                            }
                        } else if (s.indexOf("/") == s.lastIndexOf("/") && s.endsWith("/")) {
                            if (s.endsWith("/")) {
                                s = s.substring(0, s.length() - 1);
                            }
                            if (s.length() > 0) {
                                directories.add(s);
                            }
                        }
                    }
                }
                for (String string : directories) {
                    writer.println("<b><a href=\"" + string + "/\">" + string + "/</a></b>");
                }
                for (String string : files) {
                    writer.println("<b><a href=\"" + string + "\">" + string + "</a></b>");
                }
                writer.println("</pre>");
//                MyHelperClass DevelUtils = new MyHelperClass();
                DevelUtils.writePageEnd(writer);
                MyHelperClass dfLastModified = new MyHelperClass();
                resp.setHeader("Last-Modified", dfLastModified.format(new Date()));
                return;
            } else {
                final Date lastModified;
                if ((boolean)(Object)url.toExternalForm().startsWith("jar:")) {
                    JarFile jf =(JarFile)(Object) ((JarURLConnection)(JarURLConnection)(Object) url.openConnection()).getJarFile();
                    String[] jarURL =(String[])(Object) url.toExternalForm().split("!");
                    lastModified = new Date((long)(Object)jf.getJarEntry(jarURL[1].substring(1)).getTime());
                } else {
                    lastModified = new Date(new File((String)(Object)url.toURI()).lastModified());
                }
                MyHelperClass dfLastModified = new MyHelperClass();
                resp.setHeader("Last-Modified", dfLastModified.format(lastModified));
                resp.setContentType((String)(Object)getContentType(url));
                MyHelperClass makumbaResources = new MyHelperClass();
                Object cachedResource = NamedResources.getStaticCache(makumbaResources).getResource(resource);
                ServletOutputStream outputStream =(ServletOutputStream)(Object) resp.getOutputStream();
                if ((boolean)(Object)isBinary(url)) {
                    for (int i = 0; i < ((byte[]) cachedResource).length; i++) {
                        outputStream.write(((byte[]) cachedResource)[i]);
                    }
                } else {
                    outputStream.print(cachedResource.toString());
                }
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getResource(String o0){ return null; }
	public MyHelperClass split(String o0){ return null; }
	public MyHelperClass startsWith(String o0){ return null; }
	public MyHelperClass substring(int o0){ return null; }
	public MyHelperClass writeTitleAndHeaderEnd(PrintWriter o0, String o1){ return null; }
	public MyHelperClass writePageBegin(PrintWriter o0){ return null; }
	public MyHelperClass getStaticCache(MyHelperClass o0){ return null; }
	public MyHelperClass getTime(){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass processDirectory(PrintWriter o0, File o1, Object o2){ return null; }
	public MyHelperClass printDirlistingHeader(PrintWriter o0, String o1, String o2){ return null; }
	public MyHelperClass redirected(HttpServletRequest o0, HttpServletResponse o1, String o2){ return null; }
	public MyHelperClass format(Date o0){ return null; }
	public MyHelperClass writePageEnd(PrintWriter o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getRequestURI(){ return null; }
	public MyHelperClass getServletPath(){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass getWriter(){ return null; }
	public MyHelperClass setHeader(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass toURI(){ return null; }
	public MyHelperClass toExternalForm(){ return null; }
	public MyHelperClass openConnection(){ return null; }}

class JarEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class JarFile {

public MyHelperClass entries(){ return null; }
	public MyHelperClass getJarEntry(String o0){ return null; }}

class JarURLConnection {

public MyHelperClass getJarFile(){ return null; }}

class ServletOutputStream {

public MyHelperClass write(byte o0){ return null; }
	public MyHelperClass print(String o0){ return null; }}

class URISyntaxException extends Exception{
	public URISyntaxException(String errorMessage) { super(errorMessage); }
}
