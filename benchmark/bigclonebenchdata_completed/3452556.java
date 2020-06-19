


class c3452556 {

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        MyHelperClass Git = new MyHelperClass();
        Git git =(Git)(Object) Git.getCurrent(req.getSession());
        GitComponentReader gitReader =(GitComponentReader)(Object) git.getComponentReader("warpinjector");
        String id =(String)(Object) req.getParameter("id");
        GitElement element =(GitElement)(Object) gitReader.getElement(id);
        String path = (String)(String)(Object) element.getAttribute("targetdir");
        File folder = new File(path);
        MyHelperClass helper = new MyHelperClass();
        PrintWriter out =(PrintWriter)(Object) helper.getPrintWriter(resp);
        MessageBundle messageBundle = new MessageBundle("net.sf.warpcore.cms/servlets/InjectorServletMessages");
        Locale locale =(Locale)(Object) req.getLocale();
//        MyHelperClass helper = new MyHelperClass();
        helper.header(out, messageBundle, locale);
        if (git.getUser() == null) {
//            MyHelperClass helper = new MyHelperClass();
            helper.notLoggedIn(out, messageBundle, locale);
        } else {
            try {
                MultiPartRequest request = new MultiPartRequest(req);
                FileInfo info =(FileInfo)(Object) request.getFileInfo("userfile");
                File file =(File)(Object) info.getFile();
                out.println("tempfile found: " + file.getPath() + "<br>");
                String fileName =(String)(Object) info.getFileName();
                File target = new File(folder, fileName);
                out.println("copying tempfile to: " + target.getPath() + "<br>");
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(target);
                byte buf[] = new byte[1024];
                int n;
                while ((n =(int)(Object) fis.read(buf)) > 0) fos.write(buf, 0, n);
                fis.close();
                fos.close();
                out.println("copy successful - deleting old tempfile<br>");
                out.println("deletion result. " + file.delete() + "<p>");
                out.println((String)(Object)messageBundle.getMessage("Done. The file {0} has been uploaded", new String[] { "'" + fileName + "'" }, locale));
                out.println("<p><a href=\"" + req.getRequestURI() + "?id=" + req.getParameter("id") + "\">" + messageBundle.getMessage("Click here to import another file.", locale) + "</a>");
            } catch (Exception ex) {
                out.println((String)(Object)messageBundle.getMessage("An error occured: {0}", new String[] { ex.getMessage() }, locale));
            }
        }
//        MyHelperClass helper = new MyHelperClass();
        helper.footer(out);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass footer(PrintWriter o0){ return null; }
	public MyHelperClass header(PrintWriter o0, MessageBundle o1, Locale o2){ return null; }
	public MyHelperClass notLoggedIn(PrintWriter o0, MessageBundle o1, Locale o2){ return null; }
	public MyHelperClass getCurrent(MyHelperClass o0){ return null; }
	public MyHelperClass getPrintWriter(HttpServletResponse o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getParameter(String o0){ return null; }
	public MyHelperClass getLocale(){ return null; }
	public MyHelperClass getRequestURI(){ return null; }
	public MyHelperClass getSession(){ return null; }}

class HttpServletResponse {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class Git {

public MyHelperClass getUser(){ return null; }
	public MyHelperClass getComponentReader(String o0){ return null; }}

class GitComponentReader {

public MyHelperClass getElement(String o0){ return null; }}

class GitElement {

public MyHelperClass getAttribute(String o0){ return null; }}

class File {

File(){}
	File(String o0){}
	File(File o0, String o1){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getPath(){ return null; }}

class PrintWriter {

public MyHelperClass println(String o0){ return null; }}

class MessageBundle {

MessageBundle(String o0){}
	MessageBundle(){}
	public MyHelperClass getMessage(String o0, Locale o1){ return null; }
	public MyHelperClass getMessage(String o0, String[] o1, Locale o2){ return null; }}

class Locale {

}

class MultiPartRequest {

MultiPartRequest(){}
	MultiPartRequest(HttpServletRequest o0){}
	public MyHelperClass getFileInfo(String o0){ return null; }}

class FileInfo {

public MyHelperClass getFileName(){ return null; }
	public MyHelperClass getFile(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
