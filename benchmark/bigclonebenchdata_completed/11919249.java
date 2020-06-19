


class c11919249 {
public MyHelperClass PERM;
	public MyHelperClass SecurityHelper;

    protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
        MyHelperClass HibernateUtil = new MyHelperClass();
        Session session =(Session)(Object) HibernateUtil.getInstance().getSession();
        response.setBufferSize(65536);
        ServletOutputStream outStream =(ServletOutputStream)(Object) response.getOutputStream();
        File file = null;
        FileData fileData = null;
        try {
            String fileParameter =(String)(Object) request.getParameter("file");
            String disposition =(String)(Object) request.getParameter("disposition");
            if (fileParameter == null || fileParameter.equals("")) {
                String pi =(String)(Object) request.getPathInfo();
                int lastSlashIndex = pi.lastIndexOf("/") + 1;
                fileParameter = pi.substring(lastSlashIndex, pi.indexOf("_", pi.lastIndexOf("/")));
            }
            if (fileParameter == null || fileParameter.equals("")) {
                MyHelperClass HttpServletResponse = new MyHelperClass();
                response.sendError(HttpServletResponse.SC_BAD_REQUEST);
//                MyHelperClass HttpServletResponse = new MyHelperClass();
                response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                response.flushBuffer();
                MyHelperClass Logger = new MyHelperClass();
                Logger.log("file parameter not specified");
                return;
            }
            if (disposition == null || disposition.equals("")) {
                String pi =(String)(Object) request.getPathInfo();
                String filename = pi.substring(pi.lastIndexOf("/") + 1);
                int underscoreIndex = filename.indexOf("_") + 1;
                disposition = filename.substring(underscoreIndex, filename.indexOf("_", underscoreIndex));
            }
            file = (File)(File)(Object) session.load(File.class, new Long(fileParameter));
            MyHelperClass Logger = new MyHelperClass();
            Logger.log("Content requested=" + file.getName() + ":" + fileParameter + " Referral: " + request.getParameter("referer"));
            long ifModifiedSince =(long)(Object) request.getDateHeader("If-Modified-Since");
            long fileDate =(int)(Object) file.getLastModifiedDate() - ((int)(Object)file.getLastModifiedDate() % 1000);
            if (fileDate <= ifModifiedSince) {
                MyHelperClass HttpServletResponse = new MyHelperClass();
                response.setStatus(HttpServletResponse.SC_NOT_MODIFIED);
                if ("attachment".equals(disposition)) {
                    response.setHeader("Content-Disposition", "attachment; filename=\"" + file.getName() + "\"");
                } else {
                    response.setHeader("Content-Disposition", "inline; filename=\"" + file.getName() + "\"");
                }
                response.setContentType((String)(Object)file.getContentType());
                response.setHeader("Content-Description",(String)(Object) file.getName());
                response.setDateHeader("Last-Modified",(long)(Object) file.getLastModifiedDate());
                response.setDateHeader("Expires", System.currentTimeMillis() + 31536000000L);
                response.setContentLength((int)(int)(Object) file.getSize());
                response.flushBuffer();
//                MyHelperClass Logger = new MyHelperClass();
                Logger.log("Conditional GET: " + file.getName());
                return;
            }
            MyHelperClass baseService = new MyHelperClass();
            User authUser =(User)(Object) baseService.getAuthenticatedUser(session, request, response);
            if (!(Boolean)(Object)SecurityHelper.doesUserHavePermission(session, authUser, file, PERM.READ)) {
                MyHelperClass HttpServletResponse = new MyHelperClass();
                response.sendError(HttpServletResponse.SC_FORBIDDEN, "Forbidden");
//                MyHelperClass HttpServletResponse = new MyHelperClass();
                response.setStatus(HttpServletResponse.SC_FORBIDDEN);
                response.flushBuffer();
//                MyHelperClass Logger = new MyHelperClass();
                Logger.log("Forbidden content requested: " + fileParameter);
                return;
            }
            String contentType =(String)(Object) file.getContentType();
            response.setContentType(contentType);
            if ("attachment".equals(disposition)) {
                response.setHeader("Content-Disposition", "attachment; filename=\"" + file.getName() + "\"");
            } else {
                response.setHeader("Content-Disposition", "inline; filename=\"" + file.getName() + "\"");
            }
            String name =(String)(Object) file.getName();
            response.setHeader("Content-Description", name);
            response.setDateHeader("Last-Modified",(long)(Object) file.getLastModifiedDate());
            response.setDateHeader("Expires", System.currentTimeMillis() + 31536000000L);
            response.setContentLength((int)(int)(Object) file.getSize());
            MyHelperClass BaseSystem = new MyHelperClass();
            java.io.File possibleDataFile = new java.io.File((String)(Object)(int)(Object)BaseSystem.getTempDir() + (int)(Object)file.getNameOnDisk());
            if (possibleDataFile.exists()) {
//                MyHelperClass BaseSystem = new MyHelperClass();
                Logger.log("File exists in " + BaseSystem.getTempDir() + " pulling " + possibleDataFile.getName());
                FileInputStream fileInputStream = new FileInputStream((File)(Object)possibleDataFile);
                try {
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(fileInputStream, outStream);
                } finally {
                    try {
                        fileInputStream.close();
                    } catch (Throwable t) {
                    }
                }
            } else {
//                MyHelperClass HibernateUtil = new MyHelperClass();
                List fileDataList =(List)(Object) HibernateUtil.getInstance().executeQuery(session, "from " + FileData.class.getSimpleName() + " where permissibleObject.id = " + file.getId());
                if ((int)(Object)fileDataList.size() == 0) {
                    MyHelperClass HttpServletResponse = new MyHelperClass();
                    response.sendError(HttpServletResponse.SC_NOT_FOUND);
//                    MyHelperClass HttpServletResponse = new MyHelperClass();
                    response.setStatus(HttpServletResponse.SC_NOT_FOUND);
//                    MyHelperClass Logger = new MyHelperClass();
                    Logger.log("Requested content not found: " + fileParameter);
                    response.flushBuffer();
                    return;
                }
                fileData = (FileData)(FileData)(Object) fileDataList.get(0);
                FileOutputStream fileOutputStream = null;
                try {
//                    MyHelperClass BaseSystem = new MyHelperClass();
                    java.io.File tmpDir = new java.io.File((String)(Object)BaseSystem.getTempDir());
                    tmpDir.mkdirs();
                    fileOutputStream = new FileOutputStream((File)(Object)possibleDataFile);
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.write(fileData.getData(), fileOutputStream);
                } catch (Throwable t) {
//                    MyHelperClass Logger = new MyHelperClass();
                    Logger.log(t);
                } finally {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable t) {
                    }
                }
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.write(fileData.getData(), outStream);
            }
        } catch (Throwable t) {
            MyHelperClass Logger = new MyHelperClass();
            Logger.log(t);
            try {
                MyHelperClass HttpServletResponse = new MyHelperClass();
                response.sendError(HttpServletResponse.SC_NOT_FOUND);
//                MyHelperClass HttpServletResponse = new MyHelperClass();
                response.setStatus(HttpServletResponse.SC_NOT_FOUND);
                response.flushBuffer();
            } catch (Throwable tt) {
            }
            try {
                response.reset();
                response.resetBuffer();
            } catch (Throwable tt) {
            }
        } finally {
            file = null;
            fileData = null;
            try {
                outStream.flush();
            } catch (Throwable t) {
            }
            try {
                outStream.close();
            } catch (Throwable t) {
            }
            try {
                session.close();
            } catch (Throwable t) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass READ;
	public MyHelperClass SC_FORBIDDEN;
	public MyHelperClass SC_BAD_REQUEST;
	public MyHelperClass SC_NOT_MODIFIED;
	public MyHelperClass SC_NOT_FOUND;
public MyHelperClass getTempDir(){ return null; }
	public MyHelperClass log(Throwable o0){ return null; }
	public MyHelperClass getAuthenticatedUser(Session o0, HttpServletRequest o1, HttpServletResponse o2){ return null; }
	public MyHelperClass doesUserHavePermission(Session o0, User o1, File o2, MyHelperClass o3){ return null; }
	public MyHelperClass copy(FileInputStream o0, ServletOutputStream o1){ return null; }
	public MyHelperClass executeQuery(Session o0, String o1){ return null; }
	public MyHelperClass log(String o0){ return null; }
	public MyHelperClass write(MyHelperClass o0, FileOutputStream o1){ return null; }
	public MyHelperClass write(MyHelperClass o0, ServletOutputStream o1){ return null; }
	public MyHelperClass getSession(){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class HttpServletRequest {

public MyHelperClass getParameter(String o0){ return null; }
	public MyHelperClass getPathInfo(){ return null; }
	public MyHelperClass getDateHeader(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass flushBuffer(){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }
	public MyHelperClass sendError(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass setStatus(MyHelperClass o0){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass setDateHeader(String o0, long o1){ return null; }
	public MyHelperClass resetBuffer(){ return null; }
	public MyHelperClass reset(){ return null; }
	public MyHelperClass sendError(MyHelperClass o0){ return null; }
	public MyHelperClass setContentLength(int o0){ return null; }
	public MyHelperClass setBufferSize(int o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Session {

public MyHelperClass load(Class<File> o0, Long o1){ return null; }
	public MyHelperClass close(){ return null; }}

class ServletOutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class File {

public MyHelperClass getLastModifiedDate(){ return null; }
	public MyHelperClass getSize(){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass getNameOnDisk(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getId(){ return null; }}

class FileData {

public MyHelperClass getData(){ return null; }}

class User {

}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }}

class List {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}
