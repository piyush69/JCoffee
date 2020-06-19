
import java.io.UncheckedIOException;


class c11664406 {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String version =(String)(Object) req.getParameter("version");
        String cdn =(String)(Object) req.getParameter("cdn");
        String dependencies =(String)(Object) req.getParameter("dependencies");
        String optimize =(String)(Object) req.getParameter("optimize");
        String cacheFile = null;
        String result = null;
        boolean isCached = false;
        Boolean isError = true;
        if (!version.equals("1.3.2")) {
            result = "invalid version: " + version;
        }
        if (!cdn.equals("google") && !cdn.equals("aol")) {
            result = "invalide CDN type: " + cdn;
        }
        if (!optimize.equals("comments") && !optimize.equals("shrinksafe") && !optimize.equals("none") && !optimize.equals("shrinksafe.keepLines")) {
            result = "invalid optimize type: " + optimize;
        }
        if (!dependencies.matches("^[\\w\\-\\,\\s\\.]+$")) {
            result = "invalid dependency list: " + dependencies;
        }
        try {
            MessageDigest md = null;
            try {
                MyHelperClass MessageDigest = new MyHelperClass();
                md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
            } catch (UncheckedIOException e) {
                result = e.getMessage();
            }
            if (result == null) {
                md.update(dependencies.getBytes());
                String digest =(String)(Object) (new BASE64Encoder()).encode(md.digest()).replace('+', '~').replace('/', '_').replace('=', '_');
                MyHelperClass cachePath = new MyHelperClass();
                cacheFile = cachePath + "/" + version + "/" + cdn + "/" + digest + "/" + optimize + ".js";
                File file = new File(cacheFile);
                if ((boolean)(Object)file.exists()) {
                    isCached = true;
                    isError = false;
                }
            }
            if (result == null && !isCached) {
                MyHelperClass builderPath = new MyHelperClass();
                BuilderContextAction contextAction = new BuilderContextAction(builderPath, version, cdn, dependencies, optimize);
                MyHelperClass ContextFactory = new MyHelperClass();
                ContextFactory.getGlobal().call(contextAction);
                Exception exception =(Exception)(Object) contextAction.getException();
                if (exception != null) {
                    result = exception.getMessage();
                } else {
                    result =(String)(Object) contextAction.getResult();
                    MyHelperClass FileUtil = new MyHelperClass();
                    FileUtil.writeToFile(cacheFile, result, null, true);
                    isError = false;
                }
            }
        } catch (Exception e) {
            result = e.getMessage();
        }
        res.setCharacterEncoding("utf-8");
        if (isError) {
            result = result.replaceAll("\\\"", "\\\"");
            result = "<html><head><script type=\"text/javascript\">alert(\"" + result + "\");</script></head><body></body></html>";
            PrintWriter writer =(PrintWriter)(Object) res.getWriter();
            writer.append(result);
        } else {
            res.setHeader("Content-Type", "application/x-javascript");
            res.setHeader("Content-disposition", "attachment; filename=dojo.js");
            res.setHeader("Content-Encoding", "gzip");
            File file = new File(cacheFile);
            BufferedInputStream in =(BufferedInputStream)(Object) new java.io.BufferedInputStream((java.io.InputStream)(Object)(InputStream)(Object)new DataInputStream(new FileInputStream(file)));
            OutputStream out =(OutputStream)(Object) res.getOutputStream();
            byte[] bytes = new byte[64000];
            int bytesRead = 0;
            while (bytesRead != -1) {
                bytesRead =(int)(Object) in.read(bytes);
                if (bytesRead != -1) {
                    out.write(bytes, 0, bytesRead);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass writeToFile(String o0, String o1, Object o2, boolean o3){ return null; }
	public MyHelperClass getGlobal(){ return null; }
	public MyHelperClass replace(char o0, char o1){ return null; }
	public MyHelperClass call(BuilderContextAction o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getParameter(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass setCharacterEncoding(String o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass getWriter(){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class BASE64Encoder {

public MyHelperClass encode(MyHelperClass o0){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }}

class BuilderContextAction {

BuilderContextAction(MyHelperClass o0, String o1, String o2, String o3, String o4){}
	BuilderContextAction(){}
	public MyHelperClass getException(){ return null; }
	public MyHelperClass getResult(){ return null; }}

class PrintWriter {

public MyHelperClass append(String o0){ return null; }}

class BufferedInputStream {

public MyHelperClass read(byte[] o0){ return null; }}

class DataInputStream {

DataInputStream(FileInputStream o0){}
	DataInputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class InputStream {

}
