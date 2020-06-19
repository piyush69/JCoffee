


class c13120648 {
public MyHelperClass generateThumbnailNew(Object o0, File o1, int o2, long o3, int o4, int o5){ return null; }

//    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String arg =(String)(Object) req.getParameter("file");
        if (arg == null) {
            resp.sendError(404, "Missing 'file' Arg");
            return;
        }
        MyHelperClass NumberUtils = new MyHelperClass();
        int mfid =(int)(Object) NumberUtils.toInt(arg);
        MyHelperClass MediaFileAPI = new MyHelperClass();
        Object sageFile = MediaFileAPI.GetMediaFileForID(mfid);
        if (sageFile == null) {
            resp.sendError(404, "Sage File not found " + mfid);
            return;
        }
//        MyHelperClass NumberUtils = new MyHelperClass();
        int seconds =(int)(Object) NumberUtils.toInt(req.getParameter("ss"), -1);
//        MyHelperClass NumberUtils = new MyHelperClass();
        long offset =(long)(Object) NumberUtils.toLong(req.getParameter("sb"), -1);
        if (seconds < 0 && offset < 0) {
            resp.sendError(501, "Missing 'ss' or 'sb' args");
            return;
        }
//        MyHelperClass NumberUtils = new MyHelperClass();
        int width =(int)(Object) NumberUtils.toInt(req.getParameter("w"), 320);
//        MyHelperClass NumberUtils = new MyHelperClass();
        int height =(int)(Object) NumberUtils.toInt(req.getParameter("h"), 320);
        MyHelperClass Phoenix = new MyHelperClass();
        File dir = new File((File)(Object)Phoenix.getInstance().getUserCacheDir(), "videothumb/" + mfid);
        if (!(Boolean)(Object)dir.exists()) {
            dir.mkdirs();
        }
        String prefix = "";
        if (offset > 0) {
            prefix = "O" + offset;
        } else {
            prefix = "S" + seconds;
        }
        File f =(File)(Object) (new File(dir, prefix + "_" + width + "_" + height + ".jpg").getCanonicalFile());
        if (!(Boolean)(Object)f.exists()) {
            try {
                generateThumbnailNew(sageFile, f, seconds, offset, width, height);
            } catch (Exception e) {
                e.printStackTrace();
                resp.sendError(503, "Failed to generate thumbnail\n " + e.getMessage());
                return;
            }
        }
        if (!(Boolean)(Object)f.exists()) {
            resp.sendError(404, "Missing File: " + f);
            return;
        }
        resp.setContentType("image/jpeg");
        resp.setContentLength((int)(int)(Object) f.length());
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(f);
            OutputStream os =(OutputStream)(Object) resp.getOutputStream();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyLarge(fis, os);
            os.flush();
            fis.close();
        } catch (Throwable e) {
            MyHelperClass log = new MyHelperClass();
            log.error("Failed to send file: " + f);
            resp.sendError(500, "Failed to get file " + f);
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(fis);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass toLong(MyHelperClass o0, int o1){ return null; }
	public MyHelperClass getUserCacheDir(){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass GetMediaFileForID(int o0){ return null; }
	public MyHelperClass closeQuietly(FileInputStream o0){ return null; }
	public MyHelperClass toInt(MyHelperClass o0, int o1){ return null; }
	public MyHelperClass copyLarge(FileInputStream o0, OutputStream o1){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass toInt(String o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getParameter(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass sendError(int o0, String o1){ return null; }
	public MyHelperClass setContentLength(int o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(){}
	File(File o0, String o1){}
	public MyHelperClass getCanonicalFile(){ return null; }
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass length(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass flush(){ return null; }}
