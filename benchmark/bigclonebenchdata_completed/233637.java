
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c233637 {
public MyHelperClass getServletContext(){ return null; }

    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context =(ServletContext)(Object) getServletContext();
        String forw = null;
        try {
            int maxUploadSize = 50000000;
            MultipartRequest multi = new MultipartRequest(request, ".", maxUploadSize);
            String descrizione =(String)(Object) multi.getParameter("text");
            File myFile =(File)(Object) multi.getFile("uploadfile");
            String filePath =(String)(Object) multi.getOriginalFileName("uploadfile");
            String path = "C:\\files\\";
            try {
                FileInputStream inStream = new FileInputStream(myFile);
                FileOutputStream outStream = new FileOutputStream(path + myFile.getName());
                while ((int)(Object)inStream.available() > 0) {
                    outStream.write(inStream.read());
                }
                inStream.close();
                outStream.close();
            } catch (UncheckedIOException fnfe) {
                fnfe.printStackTrace();
            } catch (ArithmeticException ioe) {
                ioe.printStackTrace();
            }
            forw = "../sendDoc.jsp";
            request.setAttribute("contentType",(String)(Object) context.getMimeType(path + myFile.getName()));
            request.setAttribute("text", descrizione);
            request.setAttribute("path", path + myFile.getName());
            request.setAttribute("size", Long.toString((long)(Object)myFile.length()) + " Bytes");
            RequestDispatcher rd =(RequestDispatcher)(Object) request.getRequestDispatcher(forw);
            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HttpServletRequest {

public MyHelperClass setAttribute(String o0, String o1){ return null; }
	public MyHelperClass getRequestDispatcher(String o0){ return null; }}

class HttpServletResponse {

}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ServletContext {

public MyHelperClass getMimeType(String o0){ return null; }}

class MultipartRequest {

MultipartRequest(){}
	MultipartRequest(HttpServletRequest o0, String o1, int o2){}
	public MyHelperClass getFile(String o0){ return null; }
	public MyHelperClass getParameter(String o0){ return null; }
	public MyHelperClass getOriginalFileName(String o0){ return null; }}

class File {

public MyHelperClass length(){ return null; }
	public MyHelperClass getName(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass available(){ return null; }
	public MyHelperClass read(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass write(MyHelperClass o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class RequestDispatcher {

public MyHelperClass forward(HttpServletRequest o0, HttpServletResponse o1){ return null; }}
